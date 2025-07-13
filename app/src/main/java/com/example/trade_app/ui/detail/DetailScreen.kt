package com.example.trade_app.ui.detail

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun DetailScreen(onBack: () -> Unit) {
    Scaffold { paddingValues ->
        Button(onClick = onBack, modifier = Modifier.padding(paddingValues)) {
            Text("Back to Home")
        }
    }
}