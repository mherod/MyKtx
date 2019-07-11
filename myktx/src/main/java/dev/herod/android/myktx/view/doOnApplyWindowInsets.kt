package dev.herod.android.myktx.view

import android.view.View
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

inline fun View.doOnApplyWindowInsets(crossinline function: (View, WindowInsetsCompat) -> Unit) {
    ViewCompat.setOnApplyWindowInsetsListener(this) { v, insets ->
        insets.also { function(v, it) }
    }
    requestApplyInsetsWhenAttached()
}