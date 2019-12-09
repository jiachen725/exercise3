package com.example.exercise3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.get
import androidx.databinding.DataBindingUtil
import com.example.exercise3.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.buttonCalculate.setOnClickListener(){
            cauculate(it)
        }
    }

    fun cauculate(view: View){
        val selected= binding.spinnerAge.selectedItemPosition
        val malegenderSelect = binding.radioButtonMale
        var total=0

            if (selected == 0 ){
                total+=60
            }
            else if(selected == 1){
                total +=70
                if(malegenderSelect.isChecked )
                {
                    total+=50
                }
                if(binding.checkBoxSmoker.isChecked)
                {
                    total+=100
                }
            }
            else if(selected == 2){
                total +=90
                if(malegenderSelect.isChecked )
                {
                    total+=100
                }
                if(binding.checkBoxSmoker.isChecked)
                {
                    total+=150
                }
            }
            else if(selected == 3){
                total+=120
                if(malegenderSelect.isChecked )
                {
                    total+=150
                }
                if(binding.checkBoxSmoker.isChecked)
                {
                    total+=200
                }
            }
            else if(selected == 4){
                total+=150
                if(malegenderSelect.isChecked )
                {
                    total+=200
                }
                if(binding.checkBoxSmoker.isChecked)
                {
                    total+=250
                }
            }
            else{
                total+=150
                if(malegenderSelect.isChecked )
                    {
                    total+=200
                }
                if(binding.checkBoxSmoker.isChecked )
                {
                    total+=300
                }
                }


       binding.total.text = total.toString()
    }
}
