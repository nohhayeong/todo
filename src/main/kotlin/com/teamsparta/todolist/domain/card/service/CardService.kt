package com.teamsparta.todolist.domain.card.service

import com.teamsparta.todolist.domain.card.dto.CardNCommentsResponse
import com.teamsparta.todolist.domain.card.dto.CardResponse
import com.teamsparta.todolist.domain.card.dto.CreateCardRequest
import com.teamsparta.todolist.domain.card.dto.UpdateCardRequest
import com.teamsparta.todolist.domain.comment.dto.CommentResponse
import com.teamsparta.todolist.domain.comment.dto.CreateCommentRequest
import com.teamsparta.todolist.domain.comment.dto.UpdateCommentRequest
import org.springframework.stereotype.Service

@Service
class CardService {
    fun createCard(createCardRequest: CreateCardRequest): CardResponse {
        TODO()
    }

    fun getCard(cardId: Long): CardNCommentsResponse {
        TODO()
    }

    fun getCardList(): List<CardResponse> {
        TODO()
    }

    fun updateCard(cardId: Long, updateCardRequest: UpdateCardRequest): CardResponse {
        TODO()
    }

    fun deleteCard(cardId: Long) {
        TODO()
    }

    //comments
    fun createComment(cardId: Long, createCommentRequest: CreateCommentRequest): CommentResponse {
        TODO()
    }

    fun updateComment(cardId: Long, commentId: Long, updateCommentRequest: UpdateCommentRequest): CommentResponse {
        TODO()
    }

    fun deleteComment(cardId: Long, commentId: Long) {
        TODO()
    }
}