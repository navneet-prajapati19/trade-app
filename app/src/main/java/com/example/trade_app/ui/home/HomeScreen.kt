package com.example.trade_app.ui.home

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.trade_app.viewmodel.FormViewModel

@Composable
fun HomeScreen(onNavigateToDetail: () -> Unit) {
    val viewModel = hiltViewModel<FormViewModel>()
    Scaffold { paddingValues ->
        Button(onClick = onNavigateToDetail, modifier = Modifier.padding(paddingValues)) {
            Text(viewModel.name)
        }
    }
}