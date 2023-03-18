package com.example.myfirstandroidapp

import android.content.Context
import android.content.Intent
class IntentHelper {

    fun openIntention(context:Context, order:String,activityToOrder :Class<*>){

   val intent :Intent = Intent(context,activityToOrder)
        intent.putExtra("Order",order)
        context.startActivity(intent)

    }
}