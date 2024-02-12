package com.cs4520.assignment1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class LoginFragment: Fragment(R.layout.login_layout) {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.login_layout, container, false)

        view.findViewById<Button>(R.id.loginButton).setOnClickListener(View.OnClickListener {

            val username = view.findViewById<EditText>(R.id.usernameText).text.toString()
            val password = view.findViewById<EditText>(R.id.passwordText).text.toString()
            if(username.equals("admin") && password.equals("admin")){
                findNavController().navigate(R.id.action_loginFragment_to_productListFragment)
            }
        })
        return view
    }
}