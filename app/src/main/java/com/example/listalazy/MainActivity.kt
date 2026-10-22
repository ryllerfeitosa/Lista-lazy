package com.example.listalazy

import android.R.attr.textimport
import androidx.compose.material3.IconButton android.R.attr.textimport android.R.attr.textimport android.R.attr.textimport
import android.os.Bundle android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.listalazy.ui.theme.ListaLazyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ListaLazyTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    GamesScreen(modifier = Modifier)
                }
            }
        }
    }
}

@Composable
fun GamesScreen(modifier: Modifier = Modifier){
    Column(
        modifier = modifier.padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(
            text = "Meus jogos favoritos",
            fontSize = 24.dp,
            fontWeight = FontWeight.Bold
        )
        OutlinedTextField(
            value = "",
            onValueChange = {},
            modifier = Modifier.fillMaxWidth(),
            label = {Text("Nome do studio")},
            trailingIcon = {
                IconButton() { }
            }
        )
    }
}
