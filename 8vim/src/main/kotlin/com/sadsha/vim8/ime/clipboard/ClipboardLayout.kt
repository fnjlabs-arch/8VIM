package com.sadsha.vim8.ime.clipboard

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.ListItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.semantics.Role
import com.sadsha.vim8.clipboardManager
import com.sadsha.vim8.editorInstance
import com.sadsha.vim8.lib.compose.observeAsNonNullState
import com.sadsha.vim8.lib.compose.verticalScroll

@Composable
fun ClipboardLayout() {
    val context = LocalContext.current
    val clipboardManager by context.clipboardManager()
    val editorInstance by context.editorInstance()

    val history by clipboardManager.history.observeAsNonNullState()

    Column(modifier = Modifier.verticalScroll()) {
        for ((idx, item) in history.withIndex()) {
            ListItem(
                modifier = Modifier.clickable(
                    role = Role.Button,
                    onClick = { editorInstance.commitText(item) }
                ),
                headlineContent = { Text("${idx + 1}. $item") }
            )
        }
    }
}
