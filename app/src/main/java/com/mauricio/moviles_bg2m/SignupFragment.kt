package com.mauricio.moviles_bg2m

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.mauricio.moviles_bg2m.databinding.FragmentSignupBinding

/**
 * A simple [Fragment] subclass.
 */
class SignupFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var binding=DataBindingUtil.inflate<FragmentSignupBinding>(inflater,R.layout.fragment_signup,container,false)
        binding.buttonCreate.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_signupFragment_to_loginFragment2)

        }
        return binding.root


    }

}
