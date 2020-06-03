package com.shunsukeshoji.leadersoriginalapp

import java.util.*

data class User(
    val id: String = UUID.randomUUID().toString(),
    val name: String,
    val courseName: String,
    val groupId: String
)