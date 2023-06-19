package com.example.moneydeskfirebase.feature_moneydesk.presentation.screens.auth

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.IconButton
import androidx.compose.material.OutlinedButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AlternateEmail
import androidx.compose.material.icons.outlined.Visibility
import androidx.compose.material.icons.outlined.VisibilityOff
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.moneydeskfirebase.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignInScreen(
    onSignInClick: () -> Unit,
    onSignUpClick: () -> Unit,
    onForgotClick: () -> Unit
) {
    var login by remember { mutableStateOf("") }
    var pass by remember { mutableStateOf("") }
    var passwordVisibility by remember {  mutableStateOf(false) }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(
            space = 10.dp,
            alignment = Alignment.CenterVertically
        )
    ) {
        OutlinedTextField(
            value = login,
            onValueChange = {login = it},
            label = {Text(text = "Login")},
            placeholder = {Text(text = "Login")},
            leadingIcon = { Icon(Icons.Filled.AlternateEmail, contentDescription = "Login") },
            colors = TextFieldDefaults.outlinedTextFieldColors(
                cursorColor = MaterialTheme.colorScheme.primary,
                focusedLeadingIconColor = MaterialTheme.colorScheme.primary
            )
        )
        OutlinedTextField(
            value = pass,
            onValueChange = {pass = it},
            label = {Text(text = "Password")},
            placeholder = {Text(text = "Password")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            trailingIcon = {
                IconButton(onClick = {
                    passwordVisibility != passwordVisibility
                }){
                    Icon(
                        imageVector = if (passwordVisibility) Icons.Outlined.VisibilityOff else Icons.Outlined.Visibility,
                        contentDescription = if (passwordVisibility) "Show Password" else "Hide Password"
                    )
                }
            },
            colors = TextFieldDefaults.outlinedTextFieldColors(
                cursorColor = MaterialTheme.colorScheme.primary,
                focusedTrailingIconColor = MaterialTheme.colorScheme.primary
            ),
            visualTransformation = if (passwordVisibility) VisualTransformation.None else
                PasswordVisualTransformation()
        )
        OutlinedButton(
            modifier = Modifier.padding(top = 10.dp),
            colors = ButtonDefaults.outlinedButtonColors(
                backgroundColor = MaterialTheme.colorScheme.primary
            ),
            onClick = { onSignInClick() }
        ) {
            Text("Sign In", color = MaterialTheme.colorScheme.onPrimary)
        }
        Spacer(Modifier.height(8.dp))
        Text(
            modifier = Modifier.clickable { onSignUpClick() },
            text = "Sign Up",
            fontWeight = FontWeight.Medium,
            color = MaterialTheme.colorScheme.primary
        )
        Spacer(Modifier.height(8.dp))
        Text(
            modifier = Modifier.clickable { onForgotClick() },
            text = "Forgot Password",
            fontWeight = FontWeight.Medium,
            color = MaterialTheme.colorScheme.primary
        )
    }
}