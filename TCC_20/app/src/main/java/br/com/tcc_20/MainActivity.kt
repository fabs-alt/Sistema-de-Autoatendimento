package br.com.tcc_20

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.internal.ManufacturerUtils
import kotlinx.android.synthetic.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val buttonRegister : Button = findViewById(R.id.buttonRegister)
        val buttonContextn : Button = findViewById(R.id.buttonContextn)

        buttonRegister.setOnClickListener(){}
        buttonContextn.setOnClickListener{}

        val locationsViewPager2: ViewPager2 = findViewById(R.id.viewPagerLocations)


        }//Fim do onCreate
}
