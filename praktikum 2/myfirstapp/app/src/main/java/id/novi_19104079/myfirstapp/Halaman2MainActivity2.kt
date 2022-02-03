package id.novi_19104079.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class Halaman2MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman2_main2)
    }

    fun printState(msg: String){
        Log.d("Activitystate",msg)
        Toast.makeText(applicationContext,msg, Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        printState("Halaman dua on Start")
    }

    override fun onResume() {
        super.onResume()
        printState("Halaman dua onResume")
    }

    override fun onPause() {
        super.onPause()
        printState("Halaman dua onPause")
    }

    override fun onStop() {
        super.onStop()
        printState("Halaman dua onStop")
    }

    override fun onRestart() {
        super.onRestart()
        printState("Halaman dua onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        printState("Halaman dua onDestroy")
    }
}