package fr.enssat.osm

import android.util.Log
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.MaterialTheme
import androidx.compose.material.TabRowDefaults.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.unit.dp
import fr.enssat.osm.data.json.Rando
import fr.enssat.osm.model.RandosViewModel

@Composable
fun RandosList(viewModel: RandosViewModel) {
    Column {
        Text(text = "Randos du Trégor", modifier = Modifier.padding(20.dp), style = MaterialTheme.typography.h4)
        Divider(color = Color.Black)
        val randos: List<Rando> = viewModel.randos
        LazyColumn {
            items(randos) { rando: Rando ->
                ClickableText(
                    text = AnnotatedString(rando.properties.nom),
                    modifier = Modifier.padding(20.dp).fillMaxWidth(),
                    onClick = {
                        Log.d("SELECT", "selected: $rando")
                        //...
                    }
                )
                Divider(color = Color.Black)
            }
        }
    }
}
