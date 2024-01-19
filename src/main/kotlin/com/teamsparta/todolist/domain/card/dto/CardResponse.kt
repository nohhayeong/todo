package com.teamsparta.todolist.domain.card.dto

import java.time.LocalDateTime

data class CardResponse(
    val id: Long,
    val title: String,
    val content:String,
    val name:String,
    val created_at: LocalDateTime,
    val isDone:Boolean
)
