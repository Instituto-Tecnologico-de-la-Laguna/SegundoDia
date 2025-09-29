package com.example.segundodia.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.segundodia.R
import com.example.segundodia.data.Conference
import com.example.segundodia.data.NFLRepository
import com.example.segundodia.data.Team

@Composable
fun TeamsView(navController: NavController, conferenceName: String){
    val conference = Conference.valueOf(conferenceName)
    val teams: List<Team> = NFLRepository.getTeamsByConference(conference)
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(12.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ){
            TeamItem(team = teams[0]){ navController.navigate("TeamDetail/${teams[0].id}") }
            TeamItem(team = teams[1]){ navController.navigate("TeamDetail/${teams[1].id}") }
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ){
            TeamItem(team = teams[2]){ navController.navigate("TeamDetail/${teams[2].id}") }
            TeamItem(team = teams[3]){ navController.navigate("TeamDetail/${teams[3].id}") }
        }
    }
}

@Composable
private fun TeamItem(team: Team, onClick: () -> Unit){
    Card(
        modifier = Modifier
            .weight(1f)
            .aspectRatio(1f)
            .clickable { onClick() },
        colors = CardDefaults.cardColors(containerColor = team.primaryColor)
    ){
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ){
            Text(text = team.name, color = Color.White, fontSize = 16.sp, fontWeight = FontWeight.Bold)
        }
    }
}


