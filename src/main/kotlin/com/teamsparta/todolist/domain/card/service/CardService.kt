package com.teamsparta.todolist.domain.card.service

import com.teamsparta.todolist.domain.card.dto.CardNCommentsResponse
import com.teamsparta.todolist.domain.card.dto.CardResponse
import com.teamsparta.todolist.domain.card.dto.CreateCardRequest
import com.teamsparta.todolist.domain.card.dto.UpdateCardRequest
import com.teamsparta.todolist.domain.card.model.Card
import com.teamsparta.todolist.domain.card.model.toResponse
import com.teamsparta.todolist.domain.card.repository.CardRepository
import com.teamsparta.todolist.domain.comment.dto.CommentResponse
import com.teamsparta.todolist.domain.comment.dto.CreateCommentRequest
import com.teamsparta.todolist.domain.comment.dto.UpdateCommentRequest
import com.teamsparta.todolist.domain.comment.model.toResponse
import com.teamsparta.todolist.domain.comment.repository.CommentRepository
import com.teamsparta.todolist.domain.exception.ModelNotFoundException
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class CardService (
    private val cardRepository: CardRepository,
    private val commentRepository: CommentRepository
){
    fun createCard(createCardRequest: CreateCardRequest): CardResponse {
        return cardRepository.save(
            Card(
                name = createCardRequest.name,
                title = createCardRequest.title,
                content = createCardRequest.content
            )
        ).toResponse()
    }

    fun getCard(cardId: Long): CardNCommentsResponse {
        val card = cardRepository.findByIdOrNull(cardId)?: throw ModelNotFoundException("Card", cardId)
        return CardNCommentsResponse(
            card = card.toResponse(),
            comments = commentRepository.findAll().map { it.toResponse() }
        )
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
