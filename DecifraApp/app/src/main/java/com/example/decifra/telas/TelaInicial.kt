package com.example.decifra.telas

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.decifra.componentes.LogoDecifra
import com.example.decifra.ui.theme.DecifraTheme
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun TelaInicial(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize()
            .background(Color(0xFFF4E9E0)),

        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {


        LogoDecifra()


        Spacer(modifier = Modifier.height(100.dp))

        Button(
            onClick = {

            },
            modifier = Modifier
                .width(250.dp)
                .height(65.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF58B914),
                contentColor = Color.Black
            ),
            shape = RoundedCornerShape(35.dp)
        ) {
            Text(
                text = "Jogar",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TelaInicialPreview() {
    DecifraTheme {
        TelaInicial()
    }
}