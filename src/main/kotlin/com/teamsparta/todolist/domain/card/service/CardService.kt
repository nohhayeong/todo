package com.teamsparta.todolist.domain.card.service

import com.teamsparta.todolist.domain.card.dto.CardResponse
import com.teamsparta.todolist.domain.card.dto.CreateCardRequest
import com.teamsparta.todolist.domain.card.dto.UpdateCardRequest
import org.springframework.stereotype.Service

@Service
class CardService {
    fun createCard(createCardRequest: CreateCardRequest): CardResponse {
        TODO()
    }

    fun getCard(cardId: Long): CardResponse {
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
}