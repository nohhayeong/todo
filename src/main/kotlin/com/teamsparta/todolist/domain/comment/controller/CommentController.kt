package com.teamsparta.todolist.domain.comment.controller

import com.teamsparta.todolist.domain.card.service.CardService
import com.teamsparta.todolist.domain.comment.dto.CommentResponse
import com.teamsparta.todolist.domain.comment.dto.CreateCommentRequest
import com.teamsparta.todolist.domain.comment.dto.UpdateCommentRequest
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

@RequestMapping("/cards/{cardId}/comments")
@RestController
class CommentController(
    private val cardService: CardService
) {

    @PostMapping
    fun createComment(@PathVariable cardId:Long, @RequestBody createCommentRequest: CreateCommentRequest) : ResponseEntity<CommentResponse>{
        return ResponseEntity
            .status(HttpStatus.CREATED)
            .body(cardService.createComment(cardId, createCommentRequest))
    }

    @PutMapping("/{commentId}")
    fun updateComment(@PathVariable cardId:Long, @PathVariable commentId:Long, @RequestBody updateCommentRequest: UpdateCommentRequest) : ResponseEntity<CommentResponse> {
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(cardService.updateComment(cardId, commentId, updateCommentRequest))
    }

    @DeleteMapping("/{commentId}")
    fun deleteComment(@PathVariable cardId:Long, @PathVariable commentId:Long):ResponseEntity<CommentResponse>{
        cardService.deleteComment(cardId, commentId)
        return ResponseEntity
            .status(HttpStatus.NO_CONTENT)
            .build()
    }

}