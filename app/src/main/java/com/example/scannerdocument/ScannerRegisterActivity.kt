package com.example.scannerdocument

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.designsystem.DSSpacerSmall
import com.example.scannerdocument.ui.theme.ScannerDocumentTheme

internal class ScannerRegisterActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RegisterProducts()
        }
    }

    @Composable
    fun RegisterProducts() {
        ScannerDocumentTheme {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(24.dp),
            ) {
                OutlinedTextField(
                    value = "Nome do produto",
                    onValueChange = { "" },
                    label = { "Nome do Produto" },
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth()
                )

                DSSpacerSmall()

                OutlinedTextField(
                    value = "Categoria",
                    onValueChange = {"Categoria"},
                    label = {"Categoria"},
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth()
                )

                DSSpacerSmall()

                OutlinedTextField(
                    value = "Modelo",
                    onValueChange = {"Ka"},
                    label = {"Modelo"},
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth()
                )

                DSSpacerSmall()
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun RegisterProductsPreview() {
        RegisterProducts()
    }
}