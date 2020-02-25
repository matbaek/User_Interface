package dk.offlines.userinterface

import android.graphics.Color
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*
import kotlinx.android.synthetic.main.content_main_login.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        button1.setOnClickListener{
            displayImageAsset("monster01.webp")
        }
        button2.setOnClickListener{
            displayImageAsset("monster02.webp")
        }
        button3.setOnClickListener{
            displayImageAsset("monster03.webp")
        }

// Brugt til login visning
//        button.setOnClickListener{
//            val username = nameInput.text.toString()
//            val password = passwordInput.text.toString()
//            val message = getString(R.string.login_message, username, password)
//
//            val snack = Snackbar.make(it, message, Snackbar.LENGTH_LONG)
//                .setAction("Click me", {showAnotherMessage()})
//                .show()
//        }
    }

    private fun displayImageAsset(fileName: String) {
        assets.open(fileName).use {
            val drawable = Drawable.createFromStream(it, null)
            monsterImage.setImageDrawable(drawable)
        }
    }

// Brugt til login visning
//    private fun showAnotherMessage() {
//        Toast.makeText(this, "You clicked!", Toast.LENGTH_LONG).show()
//    }
}
