package com.praveen.authui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.praveen.authui.screens.ForgotPasswordScreen
import com.praveen.authui.screens.LoginScreen
import com.praveen.authui.screens.RegisterScreen
import com.praveen.authui.screens.SettingScreen

@Composable
fun AuthNavigation() {
    val navHostController = rememberNavController()

    NavHost(navController = navHostController, startDestination = login) {
        composable(login){
            LoginScreen(navHostController = navHostController)
        }

        composable(register){
            RegisterScreen(navHostController = navHostController)
        }

        composable(forgot){
            ForgotPasswordScreen(navHostController = navHostController)
        }

        composable(setting){
            SettingScreen(navHostController = navHostController)
        }

    }
}

const val login = "login_screen"
const val register = "home_screen"
const val forgot = "forgot_screen"
const val setting = "setting_screen"