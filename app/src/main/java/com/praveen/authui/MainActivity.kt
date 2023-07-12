package com.praveen.authui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.praveen.authui.navigation.AuthNavigation
import com.praveen.authui.screens.ForgotPasswordScreen
import com.praveen.authui.screens.LoginScreen
import com.praveen.authui.screens.RegisterScreen
import com.praveen.authui.screens.SettingScreen
import com.praveen.authui.ui.theme.AuthUITheme
import com.praveen.authui.ui.theme.BackgroundColor
import com.praveen.authui.ui.theme.PrimaryColor
import com.praveen.authui.ui.theme.PrimaryColor1

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AuthUITheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = BackgroundColor
                ) {
                    AuthNavigation()
                }
            }
        }
    }
}

