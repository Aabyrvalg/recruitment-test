package com.yufimtsev.dijatest.model

import com.google.gson.annotations.SerializedName

enum class OrderStatus {
    @SerializedName("to_pick") TO_PICK,
    @SerializedName("picking") PICKING,
    @SerializedName("packed") PACKED,
    @SerializedName("completed") COMPLETED,
    @SerializedName("cancelled") CANCELLED,
}