package com.example.aclass

data class User(val name:String, val surname:String, val login:String, val gender:Int) {
    override fun toString(): String {
        val genderString = when (gender) {
            R.id.radioButtonKobiera -> "Kobieta"
            R.id.radioButtonMezczyzna -> "Mężczyzna"
            R.id.radioButtonNiePodam -> "Nie podam"
            else -> "Nieznana"
        }
        return "$login $genderString"
    }
}