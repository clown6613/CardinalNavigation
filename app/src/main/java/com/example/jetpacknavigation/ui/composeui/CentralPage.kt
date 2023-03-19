package com.example.jetpacknavigation.ui.composeui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun CentralPage(
    onToNorthClick: () -> Unit,
    onToEastClick: () -> Unit,
    onToSouthClick: () -> Unit,
    onToWestClick: () -> Unit
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
            text = "中央",
            fontSize = 50.sp
        )
        Spacer(modifier = Modifier.weight(1f))
        Button(onClick = { onToNorthClick() }) {
            Text(text = "北へ")
        }
        Row {
            Button(onClick = { onToWestClick() }) {
                Text(text = "西へ")
            }
            Spacer(modifier = Modifier.weight(1f))
            Button(onClick = { onToEastClick() }) {
                Text(text = "東へ")
            }
        }
        Button(onClick = { onToSouthClick() }) {
            Text(text = "南へ")
        }

        Spacer(modifier = Modifier.weight(1f))
    }

}

@Preview
@Composable
private fun CentralPageView() {
    CentralPage(
        onToNorthClick = {},
        onToEastClick = {},
        onToSouthClick = {},
        onToWestClick = {}
    )
}
