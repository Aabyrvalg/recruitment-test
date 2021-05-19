package com.yufimtsev.dijatest.model.converter

import androidx.room.ProvidedTypeConverter
import androidx.room.TypeConverter
import com.google.gson.Gson
import java.util.*

@ProvidedTypeConverter
class DateTypeConverter(private val gson: Gson) {

    @TypeConverter
    fun parseDate(date: String): Date =
        gson.fromJson(date, Date::class.java)


    @TypeConverter
    fun serializeDate(date: Date): String =
        gson.toJson(date)
}