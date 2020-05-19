package com.mauricio.moviles_bg2m

import android.app.AlertDialog
import android.app.Dialog
import android.app.ProgressDialog.show
import android.content.DialogInterface
import android.os.Bundle
import android.os.Message
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.DialogFragment
import com.google.android.material.snackbar.Snackbar
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
