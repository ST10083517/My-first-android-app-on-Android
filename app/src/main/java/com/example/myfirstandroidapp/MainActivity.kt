package com.example.myfirstandroidapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    lateinit var ivDuh : ImageView
    lateinit var ivDiamond : ImageView
    lateinit var ivPumba : ImageView
   lateinit var productName :String




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ivDuh = findViewById(R.id.ivDuh)
        ivPumba = findViewById(R.id.ivPumba)
        ivDiamond = findViewById(R.id.ivDiamond)

        ivDuh.setOnClickListener(){

            Toast.makeText(this@MainActivity,"Duh-Shirt",Toast.LENGTH_SHORT).show()
            productName = "Duh-Shirt"
            val intent = Intent(this,OrderDetails::class.java)
            intent.putExtra("productName",productName)
            startActivity(intent)
        }

        ivDiamond.setOnClickListener(){

            Toast.makeText(this@MainActivity,"Diamond-Shirt",Toast.LENGTH_SHORT).show()
            productName = "Diamond-Shirt"
            val intent  = Intent(this,OrderDetails::class.java)
            intent.putExtra("productName",productName)
            startActivity(intent)

        }

        ivPumba.setOnClickListener(){

            Toast.makeText(this@MainActivity,"Pumba-Shirt",Toast.LENGTH_SHORT).show()
            productName = "Pumba-Shirt"
            val intent  = Intent(this,OrderDetails::class.java)
            intent.putExtra("productName",productName)
            startActivity(intent)
        }

    }



}