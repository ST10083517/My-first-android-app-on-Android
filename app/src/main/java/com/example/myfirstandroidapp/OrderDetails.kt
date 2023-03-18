package com.example.myfirstandroidapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast

class OrderDetails : AppCompatActivity() {
    lateinit var ivOrderitem : ImageView
    lateinit var btnShare : ImageButton
    lateinit var etName : EditText
    lateinit var etPhoneNumber : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order_details)

        ivOrderitem = findViewById(R.id.ivOrderitem)
        btnShare = findViewById(R.id.btnShare)
        etName = findViewById(R.id.etName)
        etPhoneNumber = findViewById(R.id.etPhoneNumber)
        lateinit var sName :String
        lateinit var sPhoneNumber :String
       lateinit  var orderTime : Order
        lateinit var sendIntent: Intent


        sName = etName.text.toString()
        sPhoneNumber = etPhoneNumber.text.toString()

        val productName = intent.getStringExtra("productName").toString()
        Toast.makeText(this,productName,Toast.LENGTH_SHORT).show()
        when(productName){
            "Diamond-Shirt" -> ivOrderitem.setImageResource(R.drawable.diamond)
            "Duh-Shirt"-> ivOrderitem.setImageResource(R.drawable.duh)
            "Pumba-Shirt"  -> ivOrderitem.setImageResource(R.drawable.pumba)
            else -> ivOrderitem.setImageResource(R.drawable.no_lmage)

        }

        btnShare.setOnClickListener() {
            orderTime = Order(sName, sPhoneNumber, productName)

            sendIntent = Intent(Intent.ACTION_SEND)
            sendIntent.setType("text/plain")
            sendIntent.putExtra(Intent.EXTRA_TEXT, orderTime.product)
            startActivity(Intent.createChooser(sendIntent, "Share order too..."))
        }
    }
}