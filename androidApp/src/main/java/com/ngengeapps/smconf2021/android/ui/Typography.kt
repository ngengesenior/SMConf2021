package com.ngengeapps.smconf2021.android.ui

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.ngengeapps.smconf2021.android.R

private val OpenSans = FontFamily(
    Font(R.font.open_sans_regular),
    Font(R.font.open_sans_light,FontWeight.Light),
    Font(R.font.open_sans_semi_bold,FontWeight.SemiBold),
    Font(R.font.open_sans_bold, FontWeight.Bold)
)

val SMConfTypography = Typography(

    h4 = TextStyle(fontFamily = OpenSans,
        fontSize = 30.sp,
        fontWeight = FontWeight.Bold
    ),
    h5 = TextStyle(
        fontFamily = OpenSans,
        fontWeight = FontWeight.SemiBold,
        fontSize = 24.sp
    ),
    h6 = TextStyle(
        fontFamily = OpenSans,
        fontSize = 24.sp,
        fontWeight = FontWeight.SemiBold
    ),
    subtitle2 = TextStyle(
        fontWeight = FontWeight.Light,
        fontSize = 16.sp,
        fontFamily = OpenSans
    ) ,
    subtitle1 = TextStyle(
        fontWeight = FontWeight.Light,
        fontSize = 14.sp,
        fontFamily = OpenSans
    ) ,
    body1 = TextStyle(
        fontFamily = OpenSans,
        fontSize = 16.sp
    ),
    body2 = TextStyle(
        fontSize = 14.sp,
        fontFamily = OpenSans
    ),
    button = TextStyle(
        fontSize = 14.sp,
        fontWeight = FontWeight.SemiBold,
        fontFamily = OpenSans
    ),
    caption = TextStyle(
        fontFamily = OpenSans,
        fontSize = 12.sp,
        fontWeight = FontWeight.Normal
    )

)