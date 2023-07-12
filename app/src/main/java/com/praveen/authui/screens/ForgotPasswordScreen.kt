package com.praveen.authui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.praveen.authui.R
import com.praveen.authui.navigation.login
import com.praveen.authui.ui.theme.BackgroundColor
import com.praveen.authui.ui.theme.InputBoxShape
import com.praveen.authui.ui.theme.Poppins
import com.praveen.authui.ui.theme.PrimaryColor1
import com.praveen.authui.ui.theme.SecondaryColor
import com.praveen.authui.ui.theme.Shapes

@Composable
fun ForgotPasswordScreen(navHostController: NavHostController) {
    ForgotPassword(navHostController)
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ForgotPassword(navHostController: NavHostController) {

    var email by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "FORGOT YOUR PASSWORD?",
            fontFamily = Poppins,
            color = SecondaryColor,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 80.dp),
            fontWeight = FontWeight.ExtraBold,
            fontSize = 16.sp
        )

        Image(
            painter = painterResource(id = R.drawable.ic_forgot_password_illustration),
            contentDescription = "",
            modifier = Modifier.size(240.dp)
        )

        Card(
            colors = CardDefaults.cardColors(
                containerColor = Color.White
            ),
            elevation = CardDefaults.cardElevation(
                defaultElevation = 0.dp
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
        ) {
            Column(
                modifier = Modifier.padding(vertical = 20.dp)
            ) {
                Text(
                    text = "Enter your registered email below to receive password reset instruction",
                    fontFamily = Poppins,
                    color = SecondaryColor,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 10.dp),
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 12.sp
                )
            }

            TextField(
                value = email, onValueChange = { email = it }, modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)
                    .padding(top = 20.dp), colors = TextFieldDefaults.textFieldColors(
                    textColor = PrimaryColor1,
                    containerColor = BackgroundColor,
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
                                .background(
                                    PrimaryColor1
                                )
                        )
                    }
                },
                placeholder = {
                    Text(text = "Email Address", color = Color.Gray)
                },
                textStyle = TextStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight.SemiBold,
                    fontFamily = Poppins
                )
            )


            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = PrimaryColor1
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)
                    .padding(top = 20.dp, bottom = 20.dp),
                contentPadding = PaddingValues(vertical = 14.dp),
                elevation = ButtonDefaults.buttonElevation(
                    defaultElevation = 0.dp,
                    pressedElevation = 2.dp
                ),
                shape = Shapes.medium
            ) {
                Text(
                    text = "Send Reset Link",
                    fontFamily = Poppins,
                    color = SecondaryColor,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold
                )
            }

        }

        TextButton(
            onClick = {
                      navHostController.navigate(login){
                          popUpTo(login){
                              saveState = true
                          }
                      }
            },
            Modifier
                .fillMaxWidth()
                .padding(top = 20.dp)
        ) {
            Text(
                text = "Remember Password ? Login",
                fontFamily = Poppins,
                color = SecondaryColor,
                fontSize = 12.sp,
                fontWeight = FontWeight.SemiBold
            )
        }

    }

}
