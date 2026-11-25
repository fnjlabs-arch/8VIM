package com.sadsha.vim8.ime.layout

import android.content.Context
import arrow.core.None
import arrow.core.Option
import com.sadsha.vim8.appPreferenceModel
import com.sadsha.vim8.ime.layout.models.KeyboardData
import com.sadsha.vim8.ime.layout.parsers.CacheParser
import java.io.File

class Cache(private val cacheParser: CacheParser, context: Context) {
    private val prefs by appPreferenceModel()
    private val cacheDir = context.cacheDir

    fun load(name: String): Option<KeyboardData> {
        val current = prefs.layout.cache.get()
        if (current.contains(name)) {
            val file = File(cacheDir, "$name.cbor")
            return cacheParser
                .load(file)
                .onNone {
                    prefs.layout.cache.set(current - name)
                }
        }
        return None
    }

    fun add(name: String, keyboardData: KeyboardData) {
        val current = prefs.layout.cache.get()
        val file = File(cacheDir, "$name.cbor")
        if (!current.contains(name) && cacheParser.save(file, keyboardData)) {
            prefs.layout.cache.set(current + name)
        }
    }
}
