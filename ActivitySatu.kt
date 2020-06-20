import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.style.BackgroundColorSpan
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    private lateinit var c: ImageView
    private lateinit var b: TextView
    private lateinit var a: Button
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        a = findViewById(R.id.but1)
        b = findViewById(R.id.sa)
        c = findViewById(R.id.f)

       a.setOnClickListener{
           if (b.text=="Klik Button Dibawah"){
               b.setText("HAllo")
               c.setBackgroundColor(Color.BLACK)
           }else if(b.text=="HAllo"){
               b.setText("Apa Kabar")
               c.setBackgroundColor(Color.WHITE)
           }

        }


    }

}

