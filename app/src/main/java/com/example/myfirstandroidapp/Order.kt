package com.example.myfirstandroidapp

class Order {
    lateinit  var name:String
    lateinit  var phoneNumber:String
    lateinit  var product:String

 constructor (){}

    constructor  (sName:String, sPhoneNumber :String, sProduct:String) {

        this.name = sName
        this.phoneNumber = sPhoneNumber
        this.product = sProduct
    }
}