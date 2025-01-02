package ru.mixail_akulov.compose_canvas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import ru.mixail_akulov.compose_canvas.ui.theme.Compose_Canvas_1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Compose_Canvas_1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Playground(Modifier.fillMaxSize().padding(innerPadding))
                }
            }
        }
    }
}
