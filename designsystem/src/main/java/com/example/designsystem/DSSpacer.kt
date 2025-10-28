package com.example.designsystem

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun DSSpacerSmall() {
    Spacer(Modifier.height(8.dp))
}

@Composable
fun DSSpacerMedium() {
    Spacer(Modifier.height(24.dp))
}

@Composable
fun DSSpacerLarge() {
    Spacer(Modifier.height(75.dp))
}