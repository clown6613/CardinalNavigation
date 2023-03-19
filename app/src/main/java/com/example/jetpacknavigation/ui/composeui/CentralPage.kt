package com.example.jetpacknavigation.ui.composeui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CentralPage() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.White)
    ) {
        Text(
            text = "Central",
            modifier = Modifier,
            fontSize = 24.sp
        )
        Spacer(modifier = Modifier.height(45.dp))
        Text(text = "a")

    }
}

@Preview
@Composable
private fun CentralPageView() {
    CentralPage()
}
