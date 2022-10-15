package br.com.antoniojoseuchoa.applanterna

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.annotation.RequiresApi
import br.com.antoniojoseuchoa.applanterna.databinding.ActivityMainBinding
import kotlin.properties.Delegates

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private var state: Boolean = false

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.cardAtivar.setOnClickListener {
            if(!binding.swAtivaDesativa.isChecked){
                binding.swAtivaDesativa.isChecked = true
                ativaDesativaLanterna()
            }else{
                binding.swAtivaDesativa.isChecked = false
                ativaDesativaLanterna()
            }
        }

    }

    @SuppressLint("SetTextI18n", "ResourceAsColor")
    @RequiresApi(Build.VERSION_CODES.M)
    fun ativaDesativaLanterna(){
        if(binding.swAtivaDesativa.isChecked){
           binding.tvAtivadoDesativado.text = "Ativado"
           binding.cardAtivar.setCardBackgroundColor(Color.GRAY)
           binding.ivLanterna.setImageResource(R.drawable.ic_lanterna_ligada)
           state = true
        }else{
            binding.tvAtivadoDesativado.text = "Desativado"
            binding.cardAtivar.setCardBackgroundColor(Color.WHITE)
            binding.ivLanterna.setImageResource(R.drawable.ic_lanterna_apagada)
            state = false
        }

    }


    fun ascenderLaternaDispositivo(state: Boolean){

    }

}