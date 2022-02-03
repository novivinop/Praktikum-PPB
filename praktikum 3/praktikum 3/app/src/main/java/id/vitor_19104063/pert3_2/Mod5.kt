package id.vitor_19104063.pert3_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.Manifest
import android.annotation.SuppressLint
import android.content.pm.PackageManager
import android.net.Uri
import android.provider.MediaStore
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import id.vitor_19104063.pert3_2.databinding.ActivityMod5Binding

class Mod5 : AppCompatActivity() {
    private lateinit var binding: ActivityMod5Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mod5)
//        setContentView(binding.root)
        binding = ActivityMod5Binding.inflate(layoutInflater)

        binding.apply {
            btnProdi.setOnClickListener {
                val namaProdi = inputProdi.text.toString()

                if (namaProdi.isEmpty()){
                    inputProdi.error = "Prodi Tidak Boleh Kosong"
                    return@setOnClickListener
                }

                val moveWithDataIntent = Intent(this@Mod5, Mod5ReadDataActivity::class.java)
                moveWithDataIntent.putExtra(Mod5ReadDataActivity.EXTRA_PRODI, namaProdi)
                startActivity(moveWithDataIntent)
            }
        }

    }
}