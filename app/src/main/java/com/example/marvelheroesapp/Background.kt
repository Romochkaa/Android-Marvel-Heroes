package com.example.marvelheroesapp

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.Fill

@Composable
fun Background() {
    Canvas(modifier = Modifier.fillMaxSize()) {
        drawRect(
            color = Color(0xFF2B272B),
            size = size
        )

        val path = Path().apply {
            moveTo(size.width, size.height)
            lineTo(size.width * 0f, size.height)
            lineTo(size.width, size.height * 0.4f)
            close()
        }

        drawPath(
            path = path,
            color = Color(0xFF941519),
            style = Fill
        )
    }
}
