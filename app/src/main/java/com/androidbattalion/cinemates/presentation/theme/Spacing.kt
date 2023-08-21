package com.androidbattalion.cinemates.presentation.theme

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

sealed class Spacing(val value: Dp) {
    object ContainerSpacing : Spacing(17.dp)
    object RegularSpacing : Spacing(22.dp)
    object ExtraSpacing : Spacing(80.dp)
}

