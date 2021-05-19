package com.yufimtsev.dijatest.model.converter

import androidx.room.ProvidedTypeConverter
import androidx.room.TypeConverter
import com.google.gson.Gson
import com.yufimtsev.dijatest.model.ShelfMapping

@ProvidedTypeConverter
class ShelfMappingTypeConverter(private val gson: Gson) {

    @TypeConverter
    fun parseShelfMapping(shelfMapping: String): ShelfMapping =
        gson.fromJson(shelfMapping, ShelfMapping::class.java)


    @TypeConverter
    fun serializeShelfMapping(shelfMapping: ShelfMapping): String =
        gson.toJson(shelfMapping)
}