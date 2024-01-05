package com.teamsparta.todolist.domain.card.dto

data class UpdateCardRequest(
    val title:String,
    val content:String,
    val name:String,
    val done:Boolean
)
