package com.shunsukeshoji.leadersoriginalapp

import java.util.*

data class Post(
    val id: String = UUID.randomUUID().toString(),
    val text: String,
    val userId: String,
    val pictureUrl: String,
    val data: Date = Date()
)