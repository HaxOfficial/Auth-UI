package com.praveen.authui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.navigation.NavHostController
import com.praveen.authui.R
import com.praveen.authui.navigation.forgot
import com.praveen.authui.navigation.register
import com.praveen.authui.navigation.setting
import com.praveen.authui.ui.theme.BottomBoxShape
import com.praveen.authui.ui.theme.LightTextColor
import com.praveen.authui.ui.theme.Poppins
import com.praveen.authui.ui.theme.PrimaryColor1
import com.praveen.authui.ui.theme.ReemKufi

@Composable
fun LoginScreen(navHostController: NavHostController) {
    BackgroundImage()
    LoginArea(navHostController)
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginArea(navHostController: NavHostController) {

    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    var isPasswordOpen by remember { mutableStateOf(false) }

    Box(contentAlignment = Alignment.BottomCenter , modifier = Modifier.fillMaxSize()) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = "WELCOME TO MONUMENTAL HABITS",
                fontSize = 28.sp,
                color = Color.White,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)
                    .padding(top = 20.dp),
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                fontFamily = ReemKufi
            )

            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White
                ),
                contentPadding = PaddingValues(horizontal = 20.dp, vertical = 10.dp),
                modifier = Modifier.padding(top = 20.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_google),
                        contentDescription = "",
                        tint = Color.Unspecified,
                        modifier = Modifier.size(26.dp)
                    )

                    Spacer(modifier = Modifier.width(20.dp))

                    Text(text = "Continue with Google", color = PrimaryColor1, fontSize = 16.sp)
                }
            }

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                elevation = CardDefaults.cardElevation(0.dp),
                shape = BottomBoxShape.medium
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(
                        text = "Login with Email",
                        color = LightTextColor,
                        fontFamily = Poppins,
                        fontSize = 12.sp,
                        modifier = Modifier.padding(top = 16.dp)
                    )

                    OutlinedTextField(
                        value = email,
                        onValueChange = { email = it },
                        label = {
                            Text(text = "Email Address", color = PrimaryColor1)
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 20.dp)
                            .padding(top = 10.dp),
                        colors = TextFieldDefaults.outlinedTextFieldColors(
                            unfocusedBorderColor = PrimaryColor1,
                            focusedBorderColor = PrimaryColor1,
                            textColor = PrimaryColor1
                        ),
                        keyboardOptions = KeyboardOptions(
                            keyboardType = KeyboardType.Email
                        ),
                        singleLine = true,
                        leadingIcon = {
                            Icon(
                                painter = painterResource(id = R.drawable.ic_email),
                                contentDescription = "",
                                tint = PrimaryColor1,
                                modifier = Modifier.size(24.dp)
                            )
                        }
                    )


                    OutlinedTextField(
                        value = password,
                        onValueChange = { password = it },
                        label = {
                            Text(text = "Password", color = PrimaryColor1)
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 20.dp)
                            .padding(top = 10.dp),
                        colors = TextFieldDefaults.outlinedTextFieldColors(
                            unfocusedBorderColor = PrimaryColor1,
                            focusedBorderColor = PrimaryColor1,
                            textColor = PrimaryColor1
                        ),
                        keyboardOptions = KeyboardOptions(
                            keyboardType = KeyboardType.Password
                        ),
                        singleLine = true,
                        leadingIcon = {
                            Icon(
                                painter = painterResource(id = R.drawable.ic_password),
                                contentDescription = "",
                                tint = PrimaryColor1,
                                modifier = Modifier.size(24.dp)
                            )
                        },
                        visualTransformation = if (!isPasswordOpen) {
                            PasswordVisualTransformation()
                        } else {
                            VisualTransformation.None
                        },
                        trailingIcon = {
                            IconButton(onClick = { isPasswordOpen = !isPasswordOpen }) {
                                if (!isPasswordOpen) {
                                    Icon(
                                        painter = painterResource(id = R.drawable.ic_eye_open),
                                        contentDescription = "",
                                        tint = PrimaryColor1,
                                        modifier = Modifier.size(24.dp)
                                    )
                                } else {
                                    Icon(
                                        painter = painterResource(id = R.drawable.ic_eye_close),
                                        contentDescription = "",
                                        tint = PrimaryColor1,
                                        modifier = Modifier.size(24.dp)
                                    )
                                }
                            }
                        }
                    )

                    Button(
                        onClick = {
                                  navHostController.navigate(setting)
                        },
                        Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 20.dp)
                            .padding(top = 20.dp), colors = ButtonDefaults.buttonColors(
                            containerColor = PrimaryColor1,
                            contentColor = Color.White
                        ), contentPadding = PaddingValues(vertical = 14.dp)
                    ) {
                        Text(text = "Login", fontFamily = Poppins)
                    }

                    TextButton(onClick = {
                                         navHostController.navigate(forgot)
                    }, contentPadding = PaddingValues(vertical = 0.dp)) {
                        Text(
                            text = "Forgot Password ?",
                            fontFamily = Poppins,
                            fontSize = 12.sp,
                            modifier = Modifier.padding(top = 26.dp)
                        )
                    }

                    TextButton(onClick = {
                                         navHostController.navigate(register)
                    }, contentPadding = PaddingValues(vertical = 0.dp)) {
                        Text(
                            text = "Don't have an account ? Sign Up",
                            color = LightTextColor,
                            fontFamily = Poppins,
                            fontSize = 12.sp
                        )
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                }
            }

        }
    }
}

@Composable
fun BackgroundImage() {
    Box(
        contentAlignment = Alignment.TopCenter
    ) {
        Image(
            painter = painterResource(id = R.drawable.login_illustration),
            contentDescription = "",
            modifier = Modifier.fillMaxWidth()
        )
    }
}
