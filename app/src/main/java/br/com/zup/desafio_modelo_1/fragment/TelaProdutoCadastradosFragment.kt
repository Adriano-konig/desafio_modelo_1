package br.com.zup.desafio_modelo_1.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import br.com.zup.desafio_modelo_1.databinding.FragmentTelaProdutoCadastradosBinding

class TelaProdutoCadastrados : Fragment() {

    private lateinit var binding: FragmentTelaProdutoCadastradosBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTelaProdutoCadastradosBinding.inflate(inflater,container,false)
        return binding.root
    }
}