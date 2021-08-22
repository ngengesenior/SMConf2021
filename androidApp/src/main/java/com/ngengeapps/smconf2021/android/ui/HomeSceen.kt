package com.ngengeapps.smconf2021.android.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.material.ExtendedFloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.ngengeapps.smconf2021.android.R

@Composable
fun Home() {
    Scaffold(floatingActionButton = {
        ExtendedFloatingActionButton(text =
        { Text(text = "SMConf")
        },
            onClick = {  },
        icon = {Icon(Icons.Default.Menu, contentDescription = null )})
    }) {

        Column() {
            Text(text = stringResource(R.string.app_name))
        }


    }
}

@Preview(showBackground = true,showSystemUi = true)
@Composable
fun HomePreview() {
    SMConfTheme {
        Home()
    }
}
