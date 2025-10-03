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
        // AFC (solo equipos con logo disponible en res/raw)
        Team(
            id = 1,
            name = "Miami Dolphins",
            conference = Conference.AFC,
            primaryColor = Color(0xFF008E97),
            description = "Los Miami Dolphins son una franquicia de fútbol americano profesional de la NFL, fundada en 1966. Se unieron a la American Football League (AFL) como equipo de expansión y luego se " +
                    "incorporaron a la NFL tras la fusión de ambas ligas en 1970. \n" + "Son conocidos por su temporada perfecta en 1972, donde terminaron invictos con un récord de 17-0, incluyendo el Super Bowl VII. " +
                    "Son el único equipo en la historia de la NFL en lograr una temporada invicta. El nombre \"Dolphins\" fue elegido en un concurso de aficionados. "
        ),
        Team(
            id = 2,
            name = "New England Patriots",
            conference = Conference.AFC,
            primaryColor = Color(0xFF002244),
            description = "Los New England Patriots son una franquicia de fútbol americano profesional de la NFL con sede en Foxborough, Massachusetts, en el área metropolitana del Gran Boston. Son conocidos por ser uno de " +
                    "los equipos más exitosos en la historia de la NFL, especialmente en el siglo XXI."
        ),
        Team(
            id = 3,
            name = "Pittsburgh Steelers",
            conference = Conference.AFC,
            primaryColor = Color(0xFF101820),
            description = "Los Pittsburgh Steelers son una franquicia de fútbol americano profesional de la NFL, con sede en Pittsburgh, Pensilvania."
        ),
        Team(
            id = 4,
            name = "Cincinnati Bengals",
            conference = Conference.AFC,
            primaryColor = Color(0xFFFB4F14),
            description = "Los Cincinnati Bengals son una franquicia de fútbol americano profesional de la NFL, con sede en Cincinnati, Ohio. Fundados en 1968 por Paul Brown, se unieron a la American Football League (AFL) " +
                    "como equipo de expansión antes de la fusión AFL-NFL en 1970."
        ),

        // NFC (solo equipos con logo disponible en res/raw)
        Team(
            id = 5,
            name = "Dallas Cowboys",
            conference = Conference.NFC,
            primaryColor = Color(0xFF041E42),
            description = "Los Dallas Cowboys son una franquicia de fútbol americano profesional de la NFL, con sede en Arlington, Texas. Fundados en 1960, son conocidos como \"America's Team\" debido " +
                    "a su gran base de fanáticos y su éxito histórico."
        ),
        Team(
            id = 6,
            name = "Los Angeles Rams",
            conference = Conference.NFC,
            primaryColor = Color(0xFF003594),
            description = "Los Angeles Rams son una franquicia de fútbol americano profesional de la NFL, con sede en Los Ángeles, California. Fundados en 1936, son uno de los equipos más antiguos " +
                    "de la liga y han tenido varias ubicaciones a lo largo de su historia."
        ),
        Team(
            id = 7,
            name = "New Orleans Saints",
            conference = Conference.NFC,
            primaryColor = Color(0xFFD3BC8D),
            description = "Los New Orleans Saints son una franquicia de fútbol americano profesional de la NFL, con sede en Nueva Orleans, Luisiana. Fundados en 1967, son conocidos por su fuerte conexión con la ciudad y su " +
                    "cultura, especialmente en relación con el jazz y el Mardi Gras."
        ),
        Team(
            id = 8,
            name = "Carolina Panthers",
            conference = Conference.NFC,
            primaryColor = Color(0xFF0085CA),
            description = "Los Carolina Panthers son una franquicia de fútbol americano profesional de la NFL, con sede en Charlotte, Carolina del Norte. Fundados en 1995, son uno de los equipos más jóvenes de la liga."
        )
    )

    fun getTeamsByConference(conference: Conference): List<Team> =
        teams.filter { it.conference == conference }

    fun getTeamById(id: Int): Team? = teams.firstOrNull { it.id == id }

    // Obtiene el id de recurso en raw por nombre mapeado; devuelve 0 si no existe
    fun getTeamLogoRawResId(context: android.content.Context, team: Team): Int {
        val nameToRaw: Map<String, String> = mapOf(
            "Miami Dolphins" to "dolphins_logo",
            "New England Patriots" to "patriots_logo",
            "Pittsburgh Steelers" to "steelers_logo",
            "Cincinnati Bengals" to "bengals_logo",
            "Dallas Cowboys" to "cowboys_logo",
            "Los Angeles Rams" to "rams_logo",
            "New Orleans Saints" to "saints_logo",
            "Carolina Panthers" to "panters_logo"
        )
        val rawName = nameToRaw[team.name] ?: return 0
        return context.resources.getIdentifier(rawName, "raw", context.packageName)
    }
}


