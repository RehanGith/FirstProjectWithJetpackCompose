package com.example.simpleuiproject

import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.simpleuiproject.ui.theme.Purple300

@Composable
fun HomeUi() {
    Box(modifier = Modifier.padding(0.dp, 10.dp, 0.dp, 0.dp)) {
        Column(Modifier.background(Purple300)) {

        }
    }
}

@Composable
fun Buttons(
    @DrawableRes icon1: Int,
    tint: Color = Color.Unspecified
    ) {
    IconButton(onClick = { /*TODO*/ }) {
        Icon(painter = painterResource(icon1), contentDescription = null)
    }
}