package com.teamsparta.todolist.domain.card.model

import com.teamsparta.todolist.domain.card.dto.CardResponse
import com.teamsparta.todolist.domain.comment.model.Comment
import jakarta.persistence.*
import org.springframework.data.annotation.CreatedDate
import java.time.LocalDateTime

@Entity
@Table(name="card")
class Card (
    @Column(name = "name")
    var name:String,

    @Column(name = "title")
    var title: String,

    @Column(name = "content")
    var content: String,

    @CreatedDate
    @Column(name = "createdAt")
    val createdAt: LocalDateTime = LocalDateTime.now(),

    @Column(name = "isDone")
    var isDone: Boolean = false,

    @OneToMany(mappedBy = "card", fetch = FetchType.LAZY, cascade = [CascadeType.ALL], orphanRemoval = true)
    var comments: MutableList<Comment> = mutableListOf()
){
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

    fun addComment(comment:Comment) {
        comments.add(comment)
    }

    fun removeComment(comment:Comment) {
        comments.remove(comment)
    }
}

fun Card.toResponse(): CardResponse{
    return CardResponse(
        id=id!!,
        title=title,
        content=content,
        name=name,
        isDone=isDone,
        created_at = createdAt
    )
}