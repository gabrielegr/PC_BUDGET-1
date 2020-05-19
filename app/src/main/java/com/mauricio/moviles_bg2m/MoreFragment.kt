package com.mauricio.moviles_bg2m


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.mauricio.moviles_bg2m.databinding.FragmentMoreBinding

class MoreFragment : Fragment() {
    private lateinit var binding: FragmentMoreBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate<FragmentMoreBinding>(inflater, R.layout.fragment_more, container,false)

        setToolbarTitle()
        return binding.root
    }

    private fun setToolbarTitle() {
        (activity as AppCompatActivity)
            .supportActionBar?.title = getString(
            R.string.toolbar_title_more
        )

    }
}
