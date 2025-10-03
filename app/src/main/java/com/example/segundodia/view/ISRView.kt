package com.example.segundodia.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardOptions
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.segundodia.R
import com.example.segundodia.components.MainButton
import com.example.segundodia.components.TitleBar
import com.example.segundodia.tax.IsrCalculator

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ISRView(navController: NavController){
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { TitleBar("Cálculo ISR (Mensual)") },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = Color(0xFF00695C)
                )
            )
        }
    ){
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
                .padding(16.dp),
            contentAlignment = Alignment.TopCenter
        ){
            ContentISRView()
        }
    }
}

@Composable
private fun ContentISRView(){
    var salarioInput by remember { mutableStateOf("") }
    var isr by remember { mutableStateOf<Double?>(null) }
    var neto by remember { mutableStateOf<Double?>(null) }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(
            painter = painterResource(id = R.drawable.educacion),
            contentDescription = "Imagen educativa",
            modifier = Modifier
                .fillMaxWidth()
                .height(160.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = salarioInput,
            onValueChange = { value ->
                // Permite vacio o número con punto
                if (value.isEmpty() || value.matches(Regex("^\\d*(\\.\\d{0,2})?$"))) {
                    salarioInput = value
                }
            },
            label = { Text("Salario bruto mensual") },
            singleLine = true,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(12.dp))

        MainButton(
            name = "Calcular",
            backColor = Color(0xFF00695C),
            color = Color.White
        ){
            val salario = salarioInput.toDoubleOrNull() ?: 0.0
            val calculadoIsr = IsrCalculator.calculateMonthlyIsr(salario)
            val calculadoNeto = IsrCalculator.calculateMonthlyNet(salario)
            isr = calculadoIsr
            neto = calculadoNeto
        }

        Spacer(modifier = Modifier.height(20.dp))

        if (isr != null && neto != null){
            Text(text = "ISR: ${"$"}${String.format("%,.2f", isr)}")
            Spacer(modifier = Modifier.height(6.dp))
            Text(text = "Salario neto: ${"$"}${String.format("%,.2f", neto)}")
        }
    }
}


