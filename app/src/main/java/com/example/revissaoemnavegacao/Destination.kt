package com.example.revissaoemnavegacao

sealed class Destination(val route: String){
    object ScreenSecond : Destination("ScreenSecond")
    object ScreenFirst : Destination("ScreenFirst")
}