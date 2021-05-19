package com.yufimtsev.dijatest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.room.Room
import androidx.room.withTransaction
import com.google.gson.FieldNamingPolicy
import com.google.gson.GsonBuilder
import com.yufimtsev.dijatest.model.*
import com.yufimtsev.dijatest.model.converter.DateTypeConverter
import com.yufimtsev.dijatest.model.converter.ShelfMappingTypeConverter
import com.yufimtsev.dijatest.repository.persistent.OrderDatabase
import kotlinx.coroutines.runBlocking

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gson = GsonBuilder()
            .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
            .create()

        val room = Room
            .databaseBuilder(applicationContext, OrderDatabase::class.java, "orders.db")
            .addTypeConverter(ShelfMappingTypeConverter(gson))
            .addTypeConverter(DateTypeConverter(gson))
            .build()

        val ordersJson = assets.open("order-1943.json").bufferedReader().readText()
        val orderDetails = gson.fromJson(ordersJson, Order::class.java)
        val orderItems = gson.fromJson(ordersJson, OrderItems::class.java).lineItems.map {
            it.copy(orderId = orderDetails.id)
        }

        runBlocking {

            room.withTransaction {
                room.orderDao().apply {
                    insertOrders(listOf(orderDetails))
                    insertOrderItems(orderItems)
                }
            }

            room.withTransaction {
                room.orderDao().apply {
                    val allOrders = getAllOrders()
                    Log.d("ORDER", gson.toJson(allOrders))
                    allOrders.forEach { order ->
                        getOrderItems(order.id).forEach { item ->
                            Log.d("ITEM", gson.toJson(item))
                        }
                    }
                }
            }
        }
    }
}