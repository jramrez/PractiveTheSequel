package com.example.practivethesequel

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.practivethesequel.ui.theme.PractiveTheSequelTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PractiveTheSequelTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier
                        .fillMaxSize(),
                    color = MaterialTheme.colorScheme.onBackground
                ) {
                    WakeUp("Android")
                }
            }
        }
    }
}

var testingVar: Int = 0

@Composable
fun WakeUp(name: String, modifier: Modifier = Modifier) {
        Surface(color = Color.Transparent) {
            Text(
                text = "Wakey wakey $name! Wakey Wakey! Wakey Wakey! Wakey Wakey!",
                modifier = modifier
                    .size(width = 412.dp, height = 892.dp)
                    .offset(x = 0.dp, y = 21.dp)
                    .background(Color.Red)
            )
        }
}

@Composable
fun Greet(name: String, modifier: Modifier = Modifier) {
    Surface(color = Color.Green) {
        Text(
            text = "Welcome Welcome Welcome $name",
            modifier = modifier
                .size(width = 412.dp, height = 20.dp)
                .offset(x = 50.dp, y = 0.dp)
                .background(Color.Transparent)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PractiveTheSequelTheme {
        WakeUp("Android")
        Greet(name = "Android")
    }
}