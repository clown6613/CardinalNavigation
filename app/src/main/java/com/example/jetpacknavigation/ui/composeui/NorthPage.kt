package com.example.jetpacknavigation.ui.composeui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun NorthPage(
    onToCentralClick: () -> Unit
) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            modifier = Modifier,
            text = "北",
            fontSize = 50.sp
        )
        Spacer(modifier = Modifier.weight(1f))

        Button(onClick = { onToCentralClick() }) {
            Text(text = "中央へ")
        }
        Spacer(modifier = Modifier.weight(1f))
    }

}

@Preview
@Composable
private fun CentralPageView() {
    NorthPage(
        onToCentralClick = {},
    )
}
