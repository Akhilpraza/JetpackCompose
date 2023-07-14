package com.example.composedemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.composedemo.ui.theme.ComposeDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Text(text = "Hello Akhil")
            // Say()
        }
    }
}

//**********Preview and Composable function**************

@Preview(showBackground = true, widthDp = 200, heightDp = 100, name = "Hoello Massage")
@Composable
private fun PreviewFunction() {
    SayFunction(name = "HI Akil")
}

@Preview(
    showBackground = true,
    widthDp = 200,
    heightDp = 100,
    name = "Hoello Massage",
    showSystemUi = true
)
@Composable
fun Say(name: String = "Raj") {
    Text(text = "Hello $name")
}


@Composable
fun SayFunction(name: String) {
    Text(text = "Hello $name")
}