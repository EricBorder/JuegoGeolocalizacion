package com.example.juegogeolocalizacion

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.juegogeolocalizacion.ui.main.CameraFragment
import com.google.android.gms.maps.SupportMapFragment

class MainActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Instanciamos el botón de la suma y lo asociamos a su layout
        val camara: Button = findViewById(R.id.camara)
        //Instanciamos el botón de la multiplicación y lo asociamos a su layout
        val mapas: Button = findViewById(R.id.mapas)

        //Ponemos un escuchador al botón de la suma y le añadimos la función
        camara.setOnClickListener { replaceFragment(CameraFragment()) }
        //Ponemos un escuchador al botón de la multiplicación y le añadimos la función
        mapas.setOnClickListener { replaceFragment(SupportMapFragment()) }

    }

    /**
     * Función que cambia de fragmentos en el layout Principal cuando se pulsa el respectivo botón
     * asociado al respectivo layout de cada Fragment
     * @param fragment
     */
    private fun replaceFragment(fragment: Fragment) {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainer, fragment)
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()
    }
}