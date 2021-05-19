package com.yufimtsev.dijatest.model

data class OrderItems(
    val lineItems: List<OrderItem>,
)

class ShelfMapping: ArrayList<String>()
class Orders: ArrayList<Order>()