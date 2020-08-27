package br.com.tcc_20

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val buttonRegister : Button = findViewById(R.id.buttonRegister)
        val buttonContextn : Button = findViewById(R.id.buttonContextn)

        buttonRegister.setOnClickListener(){
            val intent = Intent(this,Profile::class.java)
            startActivity(intent)
        }
        buttonContextn.setOnClickListener{}

        }//Fim do onCreate
}
