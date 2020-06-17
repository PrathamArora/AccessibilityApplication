package com.sew.accessibility_application.activities

import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import com.sew.accessibility_application.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        tvRegisterNow.setOnClickListener {
            val intent = Intent(this@LoginActivity, RegistrationActivity::class.java)
            startActivity(intent)
            finish()
        }

        btnLogin.setOnClickListener {
            when {
                tieEmailInput.text.toString().trim().isEmpty() || (!Patterns.EMAIL_ADDRESS.matcher(
                    tieEmailInput.text.toString().trim()
                ).matches()) -> {
                    it.announceForAccessibility(EMAIL_ERROR)
                }
                tiePasswordInput.text.toString().trim().isEmpty() -> {
                    it.announceForAccessibility(PASSWORD_ERROR)
                }
                else -> {
                    val intent = Intent(this@LoginActivity, HomeActivity::class.java)
                    startActivity(intent)
                    finish()
                }
            }
        }

    }

}
