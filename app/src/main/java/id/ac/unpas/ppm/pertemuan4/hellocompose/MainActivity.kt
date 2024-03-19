package id.ac.unpas.ppm.pertemuan4.hellocompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import id.ac.unpas.ppm.pertemuan4.hellocompose.ui.composable.Calculator
import id.ac.unpas.ppm.pertemuan4.hellocompose.ui.theme.HelloComposeTheme

// Allfiandi Rahman
// 213040052
// Praktikum Pemrograman Mobile [Kelas A]
// Pertemuan 4 = Pengenalan Jetpack Compose
// 23 Februari 2024

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // Greeting("Android")
                    // Demo()
                    Calculator()
                }
            }
        }
    }
}