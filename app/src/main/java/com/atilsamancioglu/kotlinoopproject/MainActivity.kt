package com.atilsamancioglu.kotlinoopproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //constructor
       var myUser = User("James",50)
        myUser.name = "Lars"
        myUser.age = 60

        println(myUser.age.toString())
        println(myUser.name)
        println(myUser.information())


        //encapsulation

        var james = Musician("James","Guitar",55)
        println(james.age.toString())
        println(james.returnBandName("Atil"))
        println(james.returnBandName("Kirk"))

        //inheritance

        var lars = SuperMusician("Lars","Drums",65)
        println(lars.name)
        println(lars.returnBandName("Atil"))
        lars.sing()

        //polymorphism

        //static polymorphism

        var mathematics = Mathematics()
        println(mathematics.sum())
        println(mathematics.sum(3,4))
        println(mathematics.sum(3,4,5))


        //dynamic polymorphism
        val animal = Animal()
        animal.sing()

        val barley = Dog()
        barley.test()
        barley.sing()

        // abstract & interface

        //var myPeople = People()

        var myPiano = Piano()
        myPiano.brand = "Yamaha"
        myPiano.digital = false
        println(myPiano.roomName)
        myPiano.info()




    }
}
