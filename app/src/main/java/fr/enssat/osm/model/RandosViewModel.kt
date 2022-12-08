package fr.enssat.osm.model

import android.util.Log
import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import fr.enssat.osm.DataFetcher
import fr.enssat.osm.data.json.Rando

class RandosViewModel: ViewModel() {
    val randos = mutableStateListOf<Rando>()

    init {  DataFetcher().apply {
                fetchRandos { list -> randos.addAll(list) }
            }
    }
}