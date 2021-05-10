package app.myoji.nickname.appjam

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        val button = findViewById<TextView>(R.id.text_view)

        button.setOnClickListener {

        }

    }

}
