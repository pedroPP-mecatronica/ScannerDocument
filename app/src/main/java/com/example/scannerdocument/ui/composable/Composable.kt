package com.example.scannerdocument.ui.composable

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.scannerdocument.Message

@Composable
internal fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
internal fun MessageCard(msg: Message) {
    Text(msg.author)
    Text(msg.body)
}