package id.novi_19104079.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnPage = findViewById<Button>(R.id.btn_page)
        btnPage.setOnClickListener{
            val intent=Intent(this, Halaman2MainActivity2::class.java)
            startActivity(intent)
        }

    }

    fun printState(msg: String){
        Log.d("Activitystate",msg)
        Toast.makeText(applicationContext,msg, Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        printState("Halaman satu on Start")
    }

    override fun onResume() {
        super.onResume()
        printState("Halaman satu onResume")
    }

    override fun onPause() {
        super.onPause()
        printState("Halaman satu onPause")
    }

    override fun onStop() {
        super.onStop()
        printState("Halaman satu onStop")
    }

    override fun onRestart() {
        super.onRestart()
        printState("Halaman satu onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        printState("Halaman satu onDestroy")
    }
}