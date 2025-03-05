package com.example.simpleuiproject.ui.theme

import androidx.annotation.DrawableRes
import com.example.simpleuiproject.R
import java.util.ArrayList

object Data {
    data class Demo(
        @DrawableRes val profile: Int,
        val name: String,
        val description: String,
        val price : String
    )

    var dataList = ArrayList<Demo>(
        listOf(
            Demo(profile = R.drawable.profile,"Pant Coat", "Coat Made of Leather", "10$" ),
            Demo(profile = R.drawable.profile,"Pant Coat", "Coat Made of Leather", "10$" ),
            Demo(profile = R.drawable.profile,"Pant Coat", "Coat Made of Leather", "10$" ),
            Demo(profile = R.drawable.profile,"Pant Coat", "Coat Made of Leather", "10$" ),
            Demo(profile = R.drawable.profile,"Pant Coat", "Coat Made of Leather", "10$" ),
            Demo(profile = R.drawable.profile,"Pant Coat", "Coat Made of Leather", "10$" ),
        )
    )



}