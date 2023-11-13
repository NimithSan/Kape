package com.sannimith.kapelibrary

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.sannimith.kape_library.loading.KapeLoading
import com.sannimith.kape_library.loading.LoadingStyle
import com.sannimith.kapelibrary.ui.theme.KapeLibraryTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KapeLibraryTheme {
                Box(modifier = Modifier.fillMaxSize().background(Color.Black), contentAlignment = Alignment.Center) {
                    KapeLoading(
                        style = LoadingStyle.LOADING_SIGNAL,
                        modifier = Modifier.size(120.dp)
                    )
                }
            }
        }
    }
}
