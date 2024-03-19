package app.dito.viewclicker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import app.dito.viewclicker.ui.theme.ViewClickerTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ViewClickerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ViewClicker()
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun ViewClickerPreview() {
    ViewClickerTheme {

    }
}

/*
Will be implement a viewmodel
 */
@Composable
fun ViewClicker(clickerViewModel: ClickerViewModel = viewModel()) {
    Spacer(modifier = Modifier.size(15.dp))
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = clickerViewModel.counter.toString())
        Button(onClick = {
            clickerViewModel.clickerIncrement()
        }) {
            Text(
                text = "+"
            )
        }
    }
}