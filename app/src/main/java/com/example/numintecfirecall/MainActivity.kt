package com.example.numintecfirecall

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.tv.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.tv.material3.ExperimentalTvMaterial3Api
import androidx.tv.material3.Surface
import com.example.numintecfirecall.ui.theme.NumintecFireCallTheme
import android.content.Intent
import android.net.Uri
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;



class MainActivity : AppCompatActivity() {

    @OptIn(ExperimentalTvMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonVideoCall: Button = findViewById(R.id.button_video_call)
        buttonVideoCall.setOnClickListener {
            val url = "https://numintec-test.daily.co/Numintec_it"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }
    }

    @OptIn(ExperimentalTvMaterial3Api::class)
    @Composable
    fun Greeting(name: String, modifier: Modifier = Modifier) {
        Text(
            text = "Hello $name!",
            modifier = modifier
        )
    }

    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        NumintecFireCallTheme {
            Greeting("Android")
        }
    }
}