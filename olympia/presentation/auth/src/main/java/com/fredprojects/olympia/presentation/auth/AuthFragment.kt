package com.fredprojects.olympia.presentation.auth

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import com.fredprojects.olympia.presentation.auth.databinding.FragmentAuthBinding

/**
 * A simple [Fragment] subclass.
 * Use the [AuthFragment.newInstance] factory method to create an instance of this fragment.
 */
class AuthFragment : Fragment() {
    private var _binding: FragmentAuthBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View { // Inflate the layout for this fragment
        _binding = FragmentAuthBinding.inflate(inflater, container, false)
        return binding.root
    }

    companion object {
        /**
         * Use this factory method to create a new instance of this fragment.
         * @return A new instance of fragment AuthFragment.
         */
        @JvmStatic
        fun newInstance() = AuthFragment()
    }
}