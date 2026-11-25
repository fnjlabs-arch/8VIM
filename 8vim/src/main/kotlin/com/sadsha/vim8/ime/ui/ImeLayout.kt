package com.sadsha.vim8.ime.ui

import androidx.compose.runtime.Composable
import com.sadsha.vim8.ime.theme.ImeTheme
import com.sadsha.vim8.ime.ui.floating.compose.Layout

@Composable
fun ImeLayout(isFloating: Boolean, content: @Composable () -> Unit) {
    ImeTheme {
        if (isFloating) {
            Layout {
                content()
            }
        } else {
            content()
        }
    }
}
