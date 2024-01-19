package com.teamsparta.todolist.domain.card.repository

import org.springframework.data.jpa.repository.JpaRepository
import com.teamsparta.todolist.domain.card.model.Card

interface CardRepository : JpaRepository<Card, Long> {
}