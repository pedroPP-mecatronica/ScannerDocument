package com.example.scannerdocument.login.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.designsystem.DSOutlinedTextField
import com.example.designsystem.DSPasswordTextField
import com.example.designsystem.DSSpacerLarge
import com.example.designsystem.DSSpacerMedium
import com.example.designsystem.DSSpacerSmall
import com.example.designsystem.DSTextMedium
import com.example.scannerdocument.di.scannerModules
import com.example.scannerdocument.ui.theme.ScannerDocumentTheme
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext.startKoin

class ScannerLoginActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        startKoin {
            androidContext(this@ScannerLoginActivity)
            modules(scannerModules)
        }

        setContent {
            ScannerDocumentTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LoginScreen()
                }
            }
        }
    }
}

@Composable
fun LoginScreen() {
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize().padding(23.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        DSTextMedium("Cadastro")

        DSSpacerLarge()

        DSOutlinedTextField(value = username, onValueChange = { username = it }, label = "Usuário")

        DSSpacerSmall()

        DSPasswordTextField(password, onValueChange = { password = it }, label = "Senha")

        DSSpacerMedium()

        Button(onClick = { /* ação de login */ }, modifier = Modifier.fillMaxWidth()) {
            Text("Entrar")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    ScannerDocumentTheme {
        LoginScreen()
    }
}