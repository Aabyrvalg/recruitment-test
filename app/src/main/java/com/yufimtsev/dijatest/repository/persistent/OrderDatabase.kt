package com.yufimtsev.dijatest.repository.persistent

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.yufimtsev.dijatest.model.converter.DateTypeConverter
import com.yufimtsev.dijatest.model.Order
import com.yufimtsev.dijatest.model.OrderItem
import com.yufimtsev.dijatest.model.converter.ShelfMappingTypeConverter

@Database(entities = [Order::class, OrderItem::class], version = 1)
@TypeConverters(ShelfMappingTypeConverter::class, DateTypeConverter::class)
abstract class OrderDatabase : RoomDatabase() {
    abstract fun orderDao(): OrderDao
}