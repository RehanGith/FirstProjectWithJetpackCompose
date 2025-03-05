package com.example.simpleuiproject

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.simpleuiproject.ui.theme.Purple300

@Composable
fun HomeUi() {
    Box(modifier = Modifier
        .padding(0.dp, 20.dp, 0.dp, 0.dp)
        .fillMaxSize()) {
        Column(modifier = Modifier.fillMaxSize()) {
            Row(modifier = Modifier
                .background(Purple300)
                .fillMaxWidth()
                .height(55.dp)) {
                Buttons(icon1 = R.drawable.baseline_menu_24, tint = Color.White)
                Text(text = "Male Suites", style = TextStyle(
                    fontSize = 20.sp,
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                ), modifier = Modifier.padding(10.dp))
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End) {
                    Buttons(icon1 = R.drawable.baseline_search_24, tint = Color.White)
                }

            }
            MyCard()
        }
    }
}

@Composable
fun Buttons(
    @DrawableRes icon1: Int,
    tint: Color = Color.Unspecified
    ) {
    IconButton(onClick = { /*TODO*/ }) {
        Icon(painter = painterResource(icon1), contentDescription = null, tint = tint)
    }

}
@Composable
fun MyCard() {
    Card(shape = RoundedCornerShape(10.dp)
    , modifier = Modifier
            .height(175.dp)
            .width(200.dp)
            .padding(10.dp)
            .background(Color.Gray)){
        Box(modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center) {
            Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
                Image(painter = painterResource(id = R.drawable.profile), contentDescription = null, modifier = Modifier
                    .clip(CircleShape)
                    .size(100.dp),
                    contentScale = ContentScale.Crop)

            }

        }

    }
}