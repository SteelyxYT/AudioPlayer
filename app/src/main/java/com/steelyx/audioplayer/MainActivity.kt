package com.steelyx.audioplayer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.steelyx.audioplayer.ui.theme.AudioPlayerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AudioPlayerTheme {
                MainFrame()
            }
        }
    }
}


fun skip(){

}

@Composable
fun MainFrame() {
    Surface (color = Color.LightGray) {
        Column {
            Text(text = "Music Name", Modifier.padding(horizontal = 43.dp))
            val image = painterResource(R.drawable.ic_launcher_foreground)

            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier.padding(horizontal = 34.dp)
            )
            LinearProgressIndicator(
                progress = { 0.5f },
                modifier = Modifier.width(185.dp),
            )
            Text(text = "0:00/0:00", modifier = Modifier.padding(horizontal = 50.dp))
            Row {
                ElevatedButton(onClick = { skip() }) {
                    Text(text = "<<")
                }
                ElevatedButton(onClick = { skip() }) {
                    Text(text = "||")
                }
                ElevatedButton(onClick = { skip() }) {
                    Text(text = ">>")
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AudioPlayerTheme {
        MainFrame()
    }
}