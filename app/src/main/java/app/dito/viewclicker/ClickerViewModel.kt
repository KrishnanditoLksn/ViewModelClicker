package app.dito.viewclicker

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class ClickerViewModel : ViewModel() {

    var counter : Int by mutableIntStateOf(0)

    fun clickerIncrement(){
        counter++
    }
}