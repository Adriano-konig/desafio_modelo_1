package br.com.zup.desafio_modelo_1.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import br.com.zup.desafio_modelo_1.FragmentClick
import br.com.zup.desafio_modelo_1.R
import br.com.zup.desafio_modelo_1.databinding.ActivityHomeBinding
import br.com.zup.desafio_modelo_1.databinding.FragmentTelaCadastroProdutosBinding
import br.com.zup.desafio_modelo_1.fragment.TelaPrincipalFragment

class HomeActivity : AppCompatActivity(){

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        exibirAppBarCustomizada()

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.container) as NavHostFragment
        val navController: NavController = navHostFragment.navController
        NavigationUI.setupActionBarWithNavController(this,navController)
//        supportFragmentManager
//            .beginTransaction()
//            .add(binding.container.id,TelaPrincipalFragment())
//            .commit()
    }

    private fun exibirAppBarCustomizada(){
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setTitle("Produtos")
    }
}