package dev.herod.android.myktx.sample

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import dev.herod.android.myktx.activity.getIntentExtraOrEmpty

class MainActivity : AppCompatActivity() {

    private val exampleExtraString: String by getIntentExtraOrEmpty("EXAMPLE")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("MainActivity", exampleExtraString)
    }
}
