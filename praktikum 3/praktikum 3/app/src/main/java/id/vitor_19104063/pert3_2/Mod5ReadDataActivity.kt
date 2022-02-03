package id.vitor_19104063.pert3_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.vitor_19104063.pert3_2.databinding.ActivityMod5ReadDataBinding

class Mod5ReadDataActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMod5ReadDataBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mod5_read_data)
//        setContentView(binding.root)
        binding = ActivityMod5ReadDataBinding.inflate(layoutInflater)

        val prodi = intent.getStringExtra(EXTRA_PRODI)
        binding.lblProdiSaya.text = "Prodi Saya Adalah $prodi"

    }

    companion object {
        const val EXTRA_PRODI = "extra_prodi"
    }
}