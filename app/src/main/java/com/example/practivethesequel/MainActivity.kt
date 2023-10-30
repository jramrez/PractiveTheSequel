package com.example.practivethesequel

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
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
import androidx.compose.ui.res.painterResource
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
                    RedText("Android")
                }
            }
        }
    }
}

// W = 412 H = 892

@Composable
fun StarTest(modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.white_star_hi)
    Image (
        painter = image,
        contentDescription = null,
        modifier = modifier
            .offset(x = 230.dp, y = 20.dp)
    )
}

@Composable
fun RedText(name: String, modifier: Modifier = Modifier) {
        Surface(color = Color.White) {
            Text(
                text = "$name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name",
                modifier = modifier
                    .size(width = 206.dp, height = 892.dp)
                    .offset(x = 0.dp, y = 0.dp)
                    .background(Color.Red)
            )
        }
}

@Composable
fun BlueText(name: String, modifier: Modifier = Modifier) {
    Surface(color = Color.Transparent) {
        Text(
            text = "$name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name $name",
            modifier = modifier
                .size(width = 412.dp, height = 206.dp)
                .offset(x = 206.dp, y = 0.dp)
                .background(Color.Blue)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PractiveTheSequelTheme {
        RedText("Android")
        BlueText(name = "Android")
        StarTest()
    }
}