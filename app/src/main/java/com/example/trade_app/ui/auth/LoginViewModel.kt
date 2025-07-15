package com.example.trade_app.ui.auth

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.trade_app.model.LoginRequest
import com.example.trade_app.network.MyApiService
import com.example.trade_app.network.NetworkChecker
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(private val api: MyApiService, private val networkChecker: NetworkChecker) : ViewModel() {
    var loginUiState by mutableStateOf<LoginUiState>(LoginUiState.Idle)
        private set
    fun login(email: String, password: String) {
        viewModelScope.launch {
            if(networkChecker.isNetworkAvailable()) {
                val response = api.login(LoginRequest(email, password))
                print(response)
            } else {

            }
        }
    }
}

