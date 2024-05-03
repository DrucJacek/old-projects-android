package com.example.egzaminkawa

class Zamowienie(var nazwaKawy: String, var listaDodatkow: List<String>) {

    fun zwrocZamowienie(): String {
        val dodatkiString = listaDodatkow.joinToString("+")
        return "$nazwaKawy, + $dodatkiString"
    }

    fun policzZamowienie(): Int {
        val ceny = mapOf(
            "americano" to 15,
            "capuccino" to 16,
            "espresso" to 12,
            "cukier" to 2,
            "cynamon" to 3,
            "kakao" to 4
        )

        var suma = ceny.getOrDefault(nazwaKawy, 0)

        for (dodatek in listaDodatkow) {
            suma += ceny.getOrDefault(dodatek, 0)
        }

        return suma
    }

}


