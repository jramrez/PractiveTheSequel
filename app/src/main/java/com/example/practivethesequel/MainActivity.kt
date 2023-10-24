package com.example.practivethesequel

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
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
                    modifier = Modifier.fillMaxHeight(),
                    color = MaterialTheme.colorScheme.onBackground
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

var testingVar: Int = 0
var testArr = arrayOf(Color.Red, Color.Green, Color.Blue)
var i = 0

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Surface(color = Color.Red) {
        Text(
            text = "Wakey wakey $name! Wakey Wakey! Wakey Wakey! Wakey Wakey!",
            modifier = modifier.size(width = 500.dp, height = 600.dp).padding(horizontal = 2.dp, vertical = 2.dp).offset(y = testingVar.dp)
        )
    }
    testingVar += 50
    i++
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PractiveTheSequelTheme {
        Greeting("Android")

    }
}