package com.example.seekbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.SeekBar
import com.example.seekbar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        with(binding){
            seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
                override fun onStopTrackingTouch(p0: SeekBar?) {

                }

                override fun onStartTrackingTouch(p0: SeekBar?) {

                }

                override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                    textView2.textSize = seekBar.progress.toString().toFloat()
                    textView5.text = "Aktualny rozmiar czcionki: " + seekBar.progress.toString()
                }
            })
            button.setOnClickListener{
                seekBar.max = editTextText3.text.toString().toInt()
                seekBar.min = editTextText2.text.toString().toInt()
                textView8.text = "Min: " + seekBar.min.toString()
                textView10.text = "Max: " + seekBar.max.toString()

            }
        }
    }
}