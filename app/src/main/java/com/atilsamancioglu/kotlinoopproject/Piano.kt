package com.atilsamancioglu.kotlinoopproject

class Piano : HouseDecor, Instrument {


    override var roomName: String
        get() = "Kitchen"
        set(value) {}


    var brand: String? = null
    var digital : Boolean? = null
}