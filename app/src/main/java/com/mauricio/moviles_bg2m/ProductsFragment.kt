package com.mauricio.moviles_bg2m

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.mauricio.moviles_bg2m.databinding.FragmentProductsBinding
import kotlinx.android.synthetic.main.fragment_products.*

/**
 * A simple [Fragment] subclass.
 */
class ProductsFragment : Fragment() {
    lateinit var binding : FragmentProductsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate<FragmentProductsBinding>(inflater, R.layout.fragment_products,container
            ,false)

        navegacionCategorias()

        return binding.root
    }

    private fun navegacionCategorias(){
        binding.apply {
            buttonProcessor.setOnClickListener { view: View ->
                view.findNavController().navigate(R.id.action_productsFragment_to_categories_Procesadores)
            }
            buttnVideocard.setOnClickListener { view: View ->
                view.findNavController().navigate(R.id.action_productsFragment_to_categories_Tarj_video)
            }
            buttonMemories.setOnClickListener { view: View ->
                view.findNavController().navigate(R.id.action_productsFragment_to_categories_Memorias)
            }
            buttonMotherboard.setOnClickListener { view: View ->
                view.findNavController().navigate(R.id.action_productsFragment_to_categories_Tarj_Madre)
            }
            buttonStorage.setOnClickListener { view: View ->
                view.findNavController().navigate(R.id.action_productsFragment_to_categories_almacenamiento)
            }
            buttonPowerSupply.setOnClickListener { view: View ->
                view.findNavController().navigate(R.id.action_productsFragment_to_categories_Fuentes_Poder)
            }
            buttonCase.setOnClickListener { view: View ->
                view.findNavController().navigate(R.id.action_productsFragment_to_categories_Gabinetes)
            }
        }
    }

}
