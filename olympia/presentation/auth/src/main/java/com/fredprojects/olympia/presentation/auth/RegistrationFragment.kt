package com.fredprojects.olympia.presentation.auth

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import com.fredprojects.olympia.presentation.auth.databinding.FragmentRegistrationBinding

/**
 * A simple [Fragment] subclass.
 * Use the [RegistrationFragment.newInstance] factory method to create an instance of this fragment.
 */
class RegistrationFragment : Fragment() {
    private var _binding: FragmentRegistrationBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View { // Inflate the layout for this fragment
        _binding = FragmentRegistrationBinding.inflate(inflater, container, false)
        return binding.root
    }

    companion object {
        /**
         * Use this factory method to create a new instance of this fragment
         * @return A new instance of fragment RegistrationFragment.
         */
        @JvmStatic
        fun newInstance() = RegistrationFragment()
    }
}