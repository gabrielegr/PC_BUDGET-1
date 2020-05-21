package com.mauricio.moviles_bg2m


import android.app.AlertDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.mauricio.moviles_bg2m.databinding.FragmentMoreBinding
import kotlinx.android.synthetic.main.fragment_more.*

class MoreFragment : Fragment() {
    private lateinit var binding: FragmentMoreBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var binding = DataBindingUtil.inflate<FragmentMoreBinding>(inflater, R.layout.fragment_more, container,false)

        setToolbarTitle()
        return binding.root

        binding.apply {
            cambiar_contra.setOnClickListener { view: View ->
                view.findNavController().navigate(R.id.action_moreFragment_to_cambiopasswordFragment)
            }

        }

    }

    private fun setToolbarTitle() {
        (activity as AppCompatActivity)
            .supportActionBar?.title = getString(
            R.string.toolbar_title_more
        )

    }


}


