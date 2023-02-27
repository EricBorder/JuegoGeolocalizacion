package com.example.juegogeolocalizacion.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.juegogeolocalizacion.R

class CameraFragment : Fragment() {
    companion object {
        fun newInstance() = CameraFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        // TODO: Use the ViewModel
        //Instanciamos ViewModel que usaremos para llamar a nuestra clase ViewModel
        /* val miModelo by viewModels<MainViewModel>()

        //Observamos el cambio en el random
        miModelo.liveRandom.observe(
            this,
            Observer(
                fun(random: Int) {
                    var tvRandom: TextView? = view?.findViewById(R.id.sumaRandom1)
                    tvRandom?.setText("$random")

                }
            )

        )
        //Observamos el cambio en el random2
        miModelo.liveRandom2.observe(
            this,
            Observer(
                fun(random2: Int) {
                    var tvRandom2: TextView? = view?.findViewById(R.id.sumaRandom2)
                    tvRandom2?.setText("$random2")

                }
            )

        )
        //Observamos el cambio en el resultado
        miModelo.liveResultado.observe(
            this,
            Observer(
                fun(resultado: Int) {
                    var tvResultado: TextView? = view?.findViewById(R.id.sumaResultado)
                    tvResultado?.setText("$resultado")

                }
            )
        )*/

    }
}

