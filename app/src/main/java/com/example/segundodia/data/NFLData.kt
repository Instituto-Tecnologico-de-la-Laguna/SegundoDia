package com.example.segundodia.data

import androidx.compose.ui.graphics.Color

enum class Conference {
    AFC, NFC
}

data class Team(
    val id: Int,
    val name: String,
    val conference: Conference,
    val primaryColor: Color,
    val description: String
)

object NFLRepository {
    val teams: List<Team> = listOf(
        // AFC
        Team(
            id = 1,
            name = "Kansas City Chiefs",
            conference = Conference.AFC,
            primaryColor = Color(0xFFE31837),
            description = "Equipo de la AFC Oeste, múltiples campeonatos recientes."
        ),
        Team(
            id = 2,
            name = "Buffalo Bills",
            conference = Conference.AFC,
            primaryColor = Color(0xFF00338D),
            description = "AFC Este, ofensiva potente y defensiva sólida."
        ),
        Team(
            id = 3,
            name = "Baltimore Ravens",
            conference = Conference.AFC,
            primaryColor = Color(0xFF241773),
            description = "AFC Norte, defensa tradicionalmente fuerte."
        ),
        Team(
            id = 4,
            name = "Cincinnati Bengals",
            conference = Conference.AFC,
            primaryColor = Color(0xFFFB4F14),
            description = "AFC Norte, ataque aéreo explosivo."
        ),

        // NFC
        Team(
            id = 5,
            name = "San Francisco 49ers",
            conference = Conference.NFC,
            primaryColor = Color(0xFFAA0000),
            description = "NFC Oeste, cinco campeonatos del Super Bowl."
        ),
        Team(
            id = 6,
            name = "Philadelphia Eagles",
            conference = Conference.NFC,
            primaryColor = Color(0xFF004C54),
            description = "NFC Este, juego físico y creativo."
        ),
        Team(
            id = 7,
            name = "Dallas Cowboys",
            conference = Conference.NFC,
            primaryColor = Color(0xFF041E42),
            description = "NFC Este, franquicia histórica 'America's Team'."
        ),
        Team(
            id = 8,
            name = "Detroit Lions",
            conference = Conference.NFC,
            primaryColor = Color(0xFF0076B6),
            description = "NFC Norte, reconstrucción reciente con identidad ofensiva."
        )
    )

    fun getTeamsByConference(conference: Conference): List<Team> =
        teams.filter { it.conference == conference }

    fun getTeamById(id: Int): Team? = teams.firstOrNull { it.id == id }
}


