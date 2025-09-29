package com.example.segundodia.view

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.weight
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.segundodia.data.Conference

@Composable
fun ConferencesView(navController: NavController){
    Column(modifier = Modifier.fillMaxSize()){
        ConferenceItem(
            title = "Conferencia Americana (AFC)",
            color = Color(0xFFE31837),
            onClick = { navController.navigate("Teams/${Conference.AFC.name}") }
        )
        ConferenceItem(
            title = "Conferencia Nacional (NFC)",
            color = Color(0xFF004C54),
            onClick = { navController.navigate("Teams/${Conference.NFC.name}") }
        )
    }
}

@Composable
private fun ConferenceItem(title: String, color: Color, onClick: () -> Unit){
    Box(
        modifier = Modifier
            .weight(1f)
            .fillMaxSize()
            .background(color)
            .clickable { onClick() },
        contentAlignment = Alignment.Center
    ){
        Text(text = title, color = Color.White, fontSize = 24.sp, fontWeight = FontWeight.Bold)
    }
}


