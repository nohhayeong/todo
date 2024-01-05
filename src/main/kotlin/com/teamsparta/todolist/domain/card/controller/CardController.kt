package com.teamsparta.todolist.domain.card.controller

import com.teamsparta.todolist.domain.card.dto.CardResponse
import com.teamsparta.todolist.domain.card.dto.CreateCardRequest
import com.teamsparta.todolist.domain.card.dto.UpdateCardRequest
import com.teamsparta.todolist.domain.card.service.CardService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/cards")
@RestController
class CardController(
    private val cardService: CardService
) {

    @PostMapping
    fun createCard(@RequestBody createCardRequest: CreateCardRequest): ResponseEntity<CardResponse> {
        return ResponseEntity.status(HttpStatus.CREATED).body(cardService.createCard(createCardRequest))
    }

    @GetMapping("/{cardId}")
    fun getCard(@PathVariable cardId: Long): ResponseEntity<CardResponse> {
        return ResponseEntity.status(HttpStatus.OK).body(cardService.getCard(cardId))
    }

    @GetMapping
    fun getCardList(): ResponseEntity<List<CardResponse>> {
        return ResponseEntity.status(HttpStatus.OK).body(cardService.getCardList())
    }

    @PutMapping("/{cardId}")
    fun updateCard(
        @PathVariable cardId: Long,
        @RequestBody updateCardRequest: UpdateCardRequest
    ): ResponseEntity<CardResponse> {
        return ResponseEntity.status(HttpStatus.OK).body(cardService.updateCard(cardId, updateCardRequest))
    }

    @DeleteMapping("/{cardId}")
    fun removeCard(@PathVariable cardId: Long): ResponseEntity<Unit> {
        cardService.deleteCard(cardId)
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build()
    }

}