package com.teamsparta.todolist.domain.card.dto

import com.teamsparta.todolist.domain.comment.dto.CommentResponse

data class CardNCommentsResponse(
    val card: CardResponse,
    val comments: List<CommentResponse>
)
