package com.example.hesapmakinesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.hesapmakinesi.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)



        binding.buttonArt.setOnClickListener {
            var sayi1=binding.editText.text.toString().toIntOrNull()
            var sayi2=binding.editText2.text.toString().toIntOrNull()
            if(sayi1==null || sayi2==null){

                val snackbar = Snackbar.make(
                    findViewById(R.id.buttonArtı),
                    "KUTUCUKLARI BOŞ BIRAKMAYINIZ !!! ",
                    Snackbar.LENGTH_LONG
                )

                snackbar.setAction("OK") {
                    // Tıklandığında yapılacak işlem
                }

                snackbar.show()


            }else{
                binding.textView.text="Sonuc:  ${sayi1 + sayi2}"
            }

        }

        binding.buttonCikarma.setOnClickListener {
            var sayi1= binding.editText.text.toString().toIntOrNull()
            var sayi2=binding.editText2.text.toString().toIntOrNull()
            if(sayi1==null || sayi2==null){
                val snackbar = Snackbar.make(
                    findViewById(R.id.buttonCikarma),
                    "KUTUCUKLARI BOŞ BIRAKMAYINIZ !!! ",
                    Snackbar.LENGTH_LONG
                )

                snackbar.setAction("OK") {
                    // Tıklandığında yapılacak işlem
                }

                snackbar.show()

            }else{
                binding.textView.text="Sonuc: ${sayi1-sayi2}"
            }

        }


        binding.buttonBol.setOnClickListener {
            var sayi1=binding.editText.text.toString().toDoubleOrNull()
            var sayi2=binding.editText2.text.toString().toDoubleOrNull()
            if(sayi1==null || sayi2==null){
                val snackbar = Snackbar.make(
                    findViewById(R.id.buttonBol),
                    "KUTUCUKLARI BOŞ BIRAKMAYINIZ !!! ",
                    Snackbar.LENGTH_LONG
                )

                snackbar.setAction("OK") {
                    // Tıklandığında yapılacak işlem
                }

                snackbar.show()

            }else{
                binding.textView.text="Sonuc: ${sayi1/sayi2}"
            }

        }
        binding.buttonCarp.setOnClickListener {

            var sayi1=binding.editText.text.toString().toIntOrNull()
            var sayi2=binding.editText2.text.toString().toIntOrNull()
            if(sayi1==null || sayi2==null){
                val snackbar = Snackbar.make(
                    findViewById(R.id.buttonCarp),
                    "KUTUCUKLARI BOŞ BIRAKMAYINIZ !!! ",
                    Snackbar.LENGTH_LONG
                )

                snackbar.setAction("OK") {
                    // Tıklandığında yapılacak işlem
                }

                snackbar.show()
            }else{
                binding.textView.text="Sonuc:${sayi1*sayi2}"
            }

        }

        binding.buttonClear.setOnClickListener {

            binding.textView.text=""
            val snackbar = Snackbar.make(
                findViewById(R.id.buttonBol),
                "Ekran Temizlendi ",
                Snackbar.LENGTH_LONG
            )

            snackbar.setAction("OK") {
                // Tıklandığında yapılacak işlem
            }

            snackbar.show()
        }

        setContentView(binding.root)


    }


}