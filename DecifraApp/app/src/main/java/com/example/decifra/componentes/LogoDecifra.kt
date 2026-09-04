package com.example.decifra.componentes

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun LogoDecifra() {

    Row(
        horizontalArrangement = Arrangement.spacedBy(5.dp)
    ) {

        LetraLogo("D", Color(0xFF827875))
        LetraLogo("E", Color(0xFF827875))
        LetraLogo("C", Color(0xFF827875))
        LetraLogo("I", Color(0xFFFFC800))
        LetraLogo("F", Color(0xFF827875))
        LetraLogo("R", Color(0xFF55B91A))
        LetraLogo("A", Color(0xFF827875))

    }
}