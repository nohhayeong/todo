package com.teamsparta.todolist.domain.comment.dto

data class CommentResponse(
    val id: Long,
    val name:String,
    val content:String,
    val password:String
)