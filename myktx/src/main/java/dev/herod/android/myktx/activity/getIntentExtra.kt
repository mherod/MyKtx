package dev.herod.android.myktx.activity

import android.app.Activity

fun Activity.getIntentExtraOrEmpty(key: String) = getIntentExtra(key, "")

inline fun <reified T> Activity.getIntentExtra(key: String, default: T) = lazy {
    when (default) {
        is String -> intent?.getStringExtra(key) ?: default
        is Int -> intent?.getIntExtra(key, default) ?: default
        else -> throw UnsupportedOperationException()
    } as T
}