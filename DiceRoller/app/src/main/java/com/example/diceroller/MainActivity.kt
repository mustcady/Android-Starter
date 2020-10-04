package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.diceroller.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var count:Int=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding= DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.button.setOnClickListener{
            rollDice(it)

        }

    }
    private fun rollDice(view: View){
        count++
        val current_value=count%7
        when(current_value){
            1 ->{
                binding.textView.text=current_value.toString();
                binding.imageView.setImageResource(R.drawable.dice_1)

            }
            2 ->{
                binding.textView.text=current_value.toString();
                binding.imageView.setImageResource(R.drawable.dice_2)
            }
            3 ->{
                binding.textView.text=current_value.toString();
                binding.imageView.setImageResource(R.drawable.dice_3)
            }

            4 -> {
                binding.textView.text=current_value.toString();
                binding.imageView.setImageResource(R.drawable.dice_4)
            }
            5 ->{
                binding.textView.text=current_value.toString();
                binding.imageView.setImageResource(R.drawable.dice_5)
            }
            6 -> {
                binding.textView.text=current_value.toString();
                binding.imageView.setImageResource(R.drawable.dice_6)
            }
            else ->
            {
                binding.textView.text=current_value.toString();
                binding.imageView.setImageResource(R.drawable.empty_dice)
            }
        }


    }
}
