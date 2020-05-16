package com.mauricio.moviles_bg2m

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity

class BudgetFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        setToolbarTitle()
        return inflater.inflate(R.layout.fragment_budget, container, false)
    }

    private fun setToolbarTitle() {
        (activity as AppCompatActivity)
            .supportActionBar?.title = getString(
            R.string.toolbar_title_budget
        )

    }
}
