package com.sannimith.kape_library.loading

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.unit.dp
import com.airbnb.lottie.LottieProperty
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.rememberLottieComposition
import com.airbnb.lottie.compose.rememberLottieDynamicProperties
import com.airbnb.lottie.compose.rememberLottieDynamicProperty
import com.sannimith.kape_library.R

object LoadingStyle {
    val LOADING_CYBER = R.raw.loading_cyber
    val LOADING_CIRCLE = R.raw.loading_circle
    val LOADING_GALAXY = R.raw.loading_galaxy
    val LOADING_NASA = R.raw.loading_naza
    val LOADING_SIGNAL = R.raw.loading_signal
}
@Composable
fun KapeLoading(
    style: Int,
    color: Color = Color.Unspecified,
    modifier: Modifier = Modifier
) {
    val composition by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(style))
    val properties = rememberLottieDynamicProperties(
        rememberLottieDynamicProperty(
            property = LottieProperty.COLOR,
            value = color.toArgb(),
            "**"
        )
    )
    Box(modifier = modifier){
        LottieAnimation(
            composition = composition,
            iterations = LottieConstants.IterateForever,
            dynamicProperties = properties,
            modifier = Modifier.fillMaxSize()
        )
    }
}
