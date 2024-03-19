package id.ac.unpas.ppm.pertemuan4.hellocompose.ui.composable

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview

// Allfiandi Rahman
// 213040052
// Praktikum Pemrograman Mobile [Kelas A]
// Pertemuan 4 = Pengenalan Jetpack Compose
// 23 Februari 2024

@Composable
fun Calculator() {
    val angka1 = remember {
        mutableStateOf(TextFieldValue(""))
    }
    val angka2 = remember {
        mutableStateOf(TextFieldValue(""))
    }
    val hasil = remember {
        mutableStateOf(TextFieldValue(""))
    }

    Column(modifier = Modifier.fillMaxSize()) {
        Row(modifier = Modifier.fillMaxWidth()) {
            Text(text = "Angka 1", modifier = Modifier.weight(1f))
            TextField(value = angka1.value, onValueChange = {
                angka1.value = it
            })
        }

        Row(modifier = Modifier.fillMaxWidth()) {
            Text(text = "Angka 2", modifier = Modifier.weight(1f))
            TextField(value = angka2.value, onValueChange = {
                angka2.value = it
            })
        }

        Row(modifier = Modifier.fillMaxWidth()) {
            Button(onClick = {
                val angka1Int = angka1.value.text.toInt()
                val angka2Int = angka2.value.text.toInt()
                val hasilInt = angka1Int + angka2Int
                hasil.value = TextFieldValue(hasilInt.toString())
            }, modifier = Modifier.weight(1f)) {
                Text(text = "+")
            }
            Button(onClick = {
                val angka1Int = angka1.value.text.toInt()
                val angka2Int = angka2.value.text.toInt()
                val hasilInt = angka1Int - angka2Int
                hasil.value = TextFieldValue(hasilInt.toString())
            }, modifier = Modifier.weight(1f)) {
                Text(text = "-")
            }
            Button(onClick = {
                val angka1Int = angka1.value.text.toInt()
                val angka2Int = angka2.value.text.toInt()
                val hasilInt = angka1Int * angka2Int
                hasil.value = TextFieldValue(hasilInt.toString())
            }, modifier = Modifier.weight(1f)) {
                Text(text = "*")
            }
            Button(onClick = {
                val angka1Int = angka1.value.text.toInt()
                val angka2Int = angka2.value.text.toInt()
                val hasilInt = angka1Int / angka2Int
                hasil.value = TextFieldValue(hasilInt.toString())
            }, modifier = Modifier.weight(1f)) {
                Text(text = "/")
            }
        }

        Row(modifier = Modifier.fillMaxWidth()) {
            Text(text = "Hasil", modifier = Modifier.weight(1f))
            TextField(value = hasil.value, onValueChange = {
                hasil.value = it
            })
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun CalculatorPreview() {
    Calculator()
}