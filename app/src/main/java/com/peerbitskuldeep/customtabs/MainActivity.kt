package com.peerbitskuldeep.customtabs

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.browser.customtabs.CustomTabsIntent
//import android.support.customtabs.CustomTabsIntent
//import android.support.v4.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {

            val url = edt.text.toString()
            val builder = CustomTabsIntent.Builder()
            var customTabsIntent: CustomTabsIntent = builder.build()
            customTabsIntent.launchUrl(this, Uri.parse(url))

        }
    }

  /*fun imgAnim()
    {

        imageView.animate().apply {

            duration = 1000
            alpha(.5f)
            scaleXBy(.5f)
            scaleYBy(.5f)
            rotationYBy(300f)
            translationYBy(200f)

        }.withEndAction {

            imageView.animate().apply {

                duration = 1000
                alpha(1f)
                scaleXBy(-.5f)
                scaleYBy(-.5f)
                rotationXBy(300f)
                translationYBy(-200f)
            }
        }.start()
    }*/
}