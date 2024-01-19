package com.teamsparta.todolist.domain.card.model

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
    var content: String?=null,

    @CreatedDate
    @Column(name = "createdAt")
    val createdAt: LocalDateTime = LocalDateTime.now(),

    @Column(name = "isDone")
    var isDone: String,

    @OneToMany(mappedBy = "card", fetch = FetchType.LAZY, cascade = [CascadeType.ALL], orphanRemoval = true)
    var comments: MutableList<Comment> = mutableListOf()
){
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null
}