package id.ac.unpas.ppm.pertemuan4.hellocompose.ui.composable

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

// Allfiandi Rahman
// 213040052
// Praktikum Pemrograman Mobile [Kelas A]
// Pertemuan 4 = Pengenalan Jetpack Compose
// 23 Februari 2024

@Composable
fun Demo() {
    Column {
        Row(modifier = Modifier.fillMaxWidth()) {
            Text(
                text = "Ini barisan pertama kolom pertama",
                Modifier.weight(1f)
            )

            Text (
                text = "Ini barisan pertama kolom kedua",
                Modifier.weight(1f)
            )
        }
        
        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Ini barisan kedua",
            modifier = Modifier.fillMaxWidth(),
        )

        Text(
            text = "Ini barisan ketiga",
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DemoPreview() {
    Demo()
}