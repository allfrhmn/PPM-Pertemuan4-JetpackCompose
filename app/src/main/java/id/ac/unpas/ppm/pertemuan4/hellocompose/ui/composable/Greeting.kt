package id.ac.unpas.ppm.pertemuan4.hellocompose.ui.composable

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview

// Allfiandi Rahman
// 213040052
// Praktikum Pemrograman Mobile [Kelas A]
// Pertemuan 4 = Pengenalan Jetpack Compose
// 23 Februari 2024

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier,
        textAlign = TextAlign.Center
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Greeting("World")
}
