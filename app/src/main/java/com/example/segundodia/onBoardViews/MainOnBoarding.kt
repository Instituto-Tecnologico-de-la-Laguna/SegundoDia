package com.example.segundodia.onBoardViews

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.navigation.NavController
import com.example.segundodia.R
import com.example.segundodia.data.PageData
import com.example.segundodia.dataStore.StoreBoarding
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.rememberPagerState
import com.google.accompanist.pager.PagerState

@OptIn(ExperimentalPagerApi::class,
    ExperimentalFoundationApi::class)
//, store: StoreBoarding
@Composable
fun MainOnBoarding(navController: NavController){
    val items=ArrayList<PageData>()

    items.add(
        PageData(
            image= R.raw.car_wash,
            titulo="Primer Titulo",
            descripcion="Descripcion 1"
        )
    )

    items.add(
        PageData(
            image=R.raw.clean,
            titulo="Segunda Imagen",
            descripcion = "Esta es la segunda descripcion"
        )
    )
    items.add(
        PageData(
            image=R.raw.desinfectar,
            titulo = "Tercera imagen",
            descripcion = "Esta es la tercera imagen de la descripcion"
        )
    )
    val pagerState  = rememberPagerState(
        pageCount=items.size,
        initialOffscreenLimit =2,
        infiniteLoop=false,
        initialPage=0
    )
    OnBoardingPager(
        item=items,pagerState = pagerState,modifier= Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(Color.White),
        navController
    )

}