package br.com.zup.desafio_modelo_1.fragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.zup.desafio_modelo_1.FragmentClick
import br.com.zup.desafio_modelo_1.R
import br.com.zup.desafio_modelo_1.databinding.FragmentTelaCadastroProdutosBinding
import br.com.zup.desafio_modelo_1.databinding.FragmentTelaPrincipalBinding
import br.com.zup.desafio_modelo_1.home.HomeActivity


class TelaCadastroProdutosFragment : Fragment() {
    private lateinit var binding: FragmentTelaCadastroProdutosBinding
//    private var interfaceClick = FragmentClick

//    override fun onAttach(context: Context) {
//        super.onAttach(context)
//        try {
//            interfaceClick = context as HomeActivity
//        }catch (ex:Exception){
//            Log.i("Error","Erro na inicialização da interfaceClick ${ex.message}")
//        }
//    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTelaCadastroProdutosBinding.inflate(inflater, container, false )
        return binding.root
    }


}