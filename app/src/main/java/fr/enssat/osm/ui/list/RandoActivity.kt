package fr.enssat.osm.ui.list

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import fr.enssat.osm.RandosList
import fr.enssat.osm.model.RandosViewModel
import fr.enssat.osm.TregorRandoTheme

class RandoActivity : ComponentActivity() {
    companion object {
        val factory = object: ViewModelProvider.Factory {
            val randosViewModel = RandosViewModel()

            override fun <T : ViewModel?> create(modelClass: Class<T>): T {
                return randosViewModel as T
            }
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModel: RandosViewModel by viewModels { factory }
        setContent {
            TregorRandoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    RandosList(viewModel = viewModel)
                }
            }
        }
    }
}
