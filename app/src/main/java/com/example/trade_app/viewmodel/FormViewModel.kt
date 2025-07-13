package com.example.trade_app.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.trade_app.network.MyApiService
import com.example.trade_app.network.NetworkChecker
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class FormViewModel @Inject constructor(private val api: MyApiService, private val networkChecker: NetworkChecker) : ViewModel() {
    var name by mutableStateOf("loading")
        private set

    init {
        viewModelScope.launch {
            if(networkChecker.isNetworkAvailable()) {
                val response = api.getGreeting()
                name = "finished"
                if (response.isSuccessful) {
                    name = response.body()?.title ?: ""
                }
            } else {
                name = "no network"
            }
        }
    }
    // Update from UI
    fun onNameChanged(newName: String) {
        name = newName
    }
}