package com.teamsparta.todolist.domain.comment.model

import com.teamsparta.todolist.domain.card.dto.CardResponse
import com.teamsparta.todolist.domain.card.model.Card
import com.teamsparta.todolist.domain.comment.dto.CommentResponse
import jakarta.persistence.*
import org.springframework.data.annotation.CreatedDate
import java.time.LocalDateTime

@Entity
@Table(name = "comment")
class Comment (
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cardId")
    val card:Card,

    @Column(name = "name")
    var name:String,

    @Column(name = "content")
    var content: String,

    @Column(name = "password")
    var password: String,
){
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null
}

fun Comment.toResponse():CommentResponse{
    return CommentResponse(
        id=id!!,
        name=name,
        content = content
    )
}