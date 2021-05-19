package com.yufimtsev.dijatest.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import java.util.*

@Entity
data class Order(
    @PrimaryKey
    @SerializedName("order_display_id")
    val id: Long,

    val createdAt: Date,
    val storeName: String,
    val numberOfItems: Long,
    val status: OrderStatus,
)