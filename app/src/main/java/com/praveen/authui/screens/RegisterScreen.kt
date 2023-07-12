package com.praveen.authui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.navigation.NavHostController
import com.praveen.authui.R
import com.praveen.authui.navigation.login
import com.praveen.authui.navigation.setting
import com.praveen.authui.ui.theme.BackgroundColor
import com.praveen.authui.ui.theme.InputBoxShape
import com.praveen.authui.ui.theme.PlaceholderColor
import com.praveen.authui.ui.theme.Poppins
import com.praveen.authui.ui.theme.PrimaryColor1
import com.praveen.authui.ui.theme.SecondaryColor
import com.praveen.authui.ui.theme.Shapes

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RegisterScreen(navHostController: NavHostController) {

    var username by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var checkBoxOneState by remember { mutableStateOf(true) }
    var checkBoxTwoState by remember { mutableStateOf(true) }
    var isPasswordOpen by remember { mutableStateOf(false) }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(top = 20.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_register_img),
            contentDescription = "",
            modifier = Modifier.size(160.dp)
        )

        Text(
            text = "CREATE YOUR ACCOUNT",
            textAlign = TextAlign.Center,
            fontFamily = Poppins,
            color = SecondaryColor,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 14.dp),
            fontWeight = FontWeight.ExtraBold,
            fontSize = 16.sp
        )

        TextField(
            value = username, onValueChange = { username = it }, modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
                .padding(top = 20.dp), colors = TextFieldDefaults.textFieldColors(
                textColor = PrimaryColor1,
                containerColor = Color.White,
                cursorColor = PrimaryColor1,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            ),
            shape = InputBoxShape.medium,
            singleLine = true,
            leadingIcon = {
                Row(
                    modifier = Modifier.padding(start = 8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_user),
                        contentDescription = "",
                        tint = PrimaryColor1,
                        modifier = Modifier.size(20.dp)
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Spacer(
                        modifier = Modifier
                            .width(1.dp)
                            .height(24.dp)
                            .background(BackgroundColor)
                    )
                }
            },
            placeholder = {
                Text(text = "Username", color = PlaceholderColor)
            },
            textStyle = TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight.SemiBold,
                fontFamily = Poppins
            )
        )

        TextField(
            value = email, onValueChange = { email = it }, modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
                .padding(top = 20.dp), colors = TextFieldDefaults.textFieldColors(
                textColor = PrimaryColor1,
                containerColor = Color.White,
                cursorColor = PrimaryColor1,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            ),
            shape = InputBoxShape.medium,
            singleLine = true,
            leadingIcon = {
                Row(
                    modifier = Modifier.padding(start = 8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_email_outline),
                        contentDescription = "",
                        tint = PrimaryColor1,
                        modifier = Modifier.size(20.dp)
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Spacer(
                        modifier = Modifier
                            .width(1.dp)
                            .height(24.dp)
                            .background(BackgroundColor)
                    )
                }
            },
            placeholder = {
                Text(text = "Email Address", color = PlaceholderColor)
            },
            textStyle = TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight.SemiBold,
                fontFamily = Poppins
            )
        )


        TextField(
            value = password, onValueChange = { password = it }, modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
                .padding(top = 20.dp), colors = TextFieldDefaults.textFieldColors(
                textColor = PrimaryColor1,
                containerColor = Color.White,
                cursorColor = PrimaryColor1,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            ),
            shape = InputBoxShape.medium,
            singleLine = true,
            leadingIcon = {
                Row(
                    modifier = Modifier.padding(start = 8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_lock),
                        contentDescription = "",
                        tint = PrimaryColor1,
                        modifier = Modifier.size(20.dp)
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Spacer(
                        modifier = Modifier
                            .width(1.dp)
                            .height(24.dp)
                            .background(BackgroundColor)
                    )
                }
            },
            placeholder = {
                Text(text = "Password", color = PlaceholderColor)
            },
            textStyle = TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight.SemiBold,
                fontFamily = Poppins
            ),
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
                            modifier = Modifier.size(20.dp)
                        )
                    } else {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_eye_close),
                            contentDescription = "",
                            tint = PrimaryColor1,
                            modifier = Modifier.size(20.dp)
                        )
                    }
                }
            }
        )


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp)
                .padding(horizontal = 40.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Checkbox(
                checked = checkBoxOneState,
                onCheckedChange = { checkBoxOneState = it },
                colors = CheckboxDefaults.colors(
                    checkedColor = PrimaryColor1,
                    uncheckedColor = SecondaryColor,
                    checkmarkColor = SecondaryColor,
                ),
                modifier = Modifier.clip(shape = Shapes.medium)
            )

            Spacer(modifier = Modifier.width(6.dp))

            Text(
                text = "Login with Email",
                fontFamily = Poppins,
                color = SecondaryColor,
                fontSize = 12.sp
            )

        }


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 40.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Checkbox(
                checked = checkBoxTwoState,
                onCheckedChange = { checkBoxTwoState = it },
                colors = CheckboxDefaults.colors(
                    checkedColor = PrimaryColor1,
                    uncheckedColor = SecondaryColor,
                    checkmarkColor = SecondaryColor,
                ),
                modifier = Modifier.clip(shape = Shapes.medium)
            )

            Spacer(modifier = Modifier.width(6.dp))

            Text(
                text = "Email me about spceial pricing",
                fontFamily = Poppins,
                color = SecondaryColor,
                fontSize = 12.sp
            )

        }

        Button(
            onClick = {
                navHostController.navigate(setting)
            }, colors = ButtonDefaults.buttonColors(
                containerColor = PrimaryColor1
            ), modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
                .padding(top = 20.dp),
            contentPadding = PaddingValues(vertical = 14.dp),
            elevation = ButtonDefaults.buttonElevation(
                defaultElevation = 0.dp
            ),
            shape = RoundedCornerShape(0.dp)
        ) {
            Text(
                text = "Sign Up with Email",
                fontFamily = Poppins,
                color = SecondaryColor,
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold
            )
        }

        SocialMediaSignInButtons()

        TextButton(
            onClick = {
                      navHostController.navigate(login) {
                          popUpTo(login) {
                              saveState = true
                          }
                      }
            }, modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp)
        ) {
            Text(
                text = "Already have an account ? Sign In",
                fontFamily = Poppins,
                color = SecondaryColor,
                fontSize = 12.sp,
                fontWeight = FontWeight.SemiBold
            )
        }

    }
}


@Composable
fun SocialMediaSignInButtons() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 20.dp)
            .padding(horizontal = 20.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Button(
            onClick = {}, colors = ButtonDefaults.buttonColors(
                containerColor = Color.White
            ),
            elevation = ButtonDefaults.buttonElevation(
                defaultElevation = 0.dp
            ),
            modifier = Modifier.clip(shape = Shapes.large),
            contentPadding = PaddingValues(horizontal = 26.dp, vertical = 10.dp),
            shape = RoundedCornerShape(0.dp)
        ) {
            Row {
                Icon(
                    painter = painterResource(id = R.drawable.ic_google),
                    contentDescription = "",
                    modifier = Modifier.size(20.dp),
                    tint = Color.Unspecified
                )

                Spacer(modifier = Modifier.width(10.dp))

                Text(text = "Google", fontFamily = Poppins, color = SecondaryColor)
            }
        }


        Button(
            onClick = {}, colors = ButtonDefaults.buttonColors(
                containerColor = Color.White
            ),
            elevation = ButtonDefaults.buttonElevation(
                defaultElevation = 0.dp
            ),
            modifier = Modifier.clip(shape = Shapes.large),
            contentPadding = PaddingValues(horizontal = 26.dp, vertical = 10.dp),
            shape = RoundedCornerShape(0.dp)
        ) {
            Row {
                Icon(
                    painter = painterResource(id = R.drawable.ic_facebook),
                    contentDescription = "",
                    modifier = Modifier.size(20.dp),
                    tint = Color.Unspecified
                )

                Spacer(modifier = Modifier.width(10.dp))

                Text(text = "Facebook", fontFamily = Poppins, color = SecondaryColor)
            }
        }

    }
}

















