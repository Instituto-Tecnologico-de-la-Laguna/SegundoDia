package com.example.segundodia.view

import android.annotation.SuppressLint
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.segundodia.components.ActionButton
import com.example.segundodia.components.TitleBar


@Preview(showBackground = true)
@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeView(){
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { TitleBar("Home View") },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = Color.Green
                )
            )
        },
        floatingActionButton = {
            ActionButton()
        }
    ){
        ContentHomeView()
    }
}

