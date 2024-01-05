package com.teamsparta.todolist.domain.card.dto

data class CardResponse(
    val id: Long,
    val title: String,
    val content:String,
    val name:String,
    val date:String,
    val done:Boolean
)
