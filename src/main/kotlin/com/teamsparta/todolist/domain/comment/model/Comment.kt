package com.teamsparta.todolist.domain.comment.model

import com.teamsparta.todolist.domain.card.model.Card
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