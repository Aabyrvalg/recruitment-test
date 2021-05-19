package com.yufimtsev.dijatest.repository.persistent

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.yufimtsev.dijatest.model.Order
import com.yufimtsev.dijatest.model.OrderItem

@Dao
interface OrderDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertOrders(orders: List<Order>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertOrderItems(orderItems: List<OrderItem>)

    @Query("SELECT * FROM 'order'")
    fun getAllOrders(): List<Order>

    @Query("SELECT * FROM orderItem where orderId is :orderId")
    fun getOrderItems(orderId: Long): List<OrderItem>

    @Query("DELETE FROM 'order'")
    suspend fun deleteAll()

}