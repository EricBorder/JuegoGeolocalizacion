package com.example.juegogeolocalizacion.ui.main

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData

class MainViewModel(application: Application) : AndroidViewModel(application) {
    // TODO: Implement the ViewModel

    //Creamos variable random de números entre 0 y 9
    var random = (0..9).random()
    //Creamos variable random2 de números entre 0 y 9
    var random2 = (0..9).random()
    //Iniciamos el resultado
    var resultado : Int = 0
    //Con esta variable observamos los cambios en el random
    var liveRandom = MutableLiveData<Int>()
    //Con esta variable observamos los cambios en el random2
    var liveRandom2 = MutableLiveData<Int>()
    //Con esta variable observamos los cambios en el resultado
    var liveResultado = MutableLiveData<Int>()

    //Inicializamos variables cuando instanciamos
    init {
        liveRandom.value = random
    }

    init {
        liveRandom2.value = random2
    }
    init {
        liveResultado.value = resultado
    }

    /**
     * Función para sumar dos números aleatorios
     */
    fun hacerSuma(){
        resultado = random + random2
    }
    /**
     * Función para multiplicar dos números aleatorios
     */
    fun hacerMultiplicacion(){

        resultado = random * random2

    }

}