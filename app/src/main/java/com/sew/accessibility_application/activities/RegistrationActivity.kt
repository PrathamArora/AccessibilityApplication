package com.sew.accessibility_application.activities

import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import com.sew.accessibility_application.R
import kotlinx.android.synthetic.main.activity_registration.*

class RegistrationActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        imgBackButton.setOnClickListener {
            val intent = Intent(this@RegistrationActivity, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }

        btnRegisterNow.setOnClickListener {
            when {
                tieNameInput.text.toString().trim().isEmpty() -> {
                    it.announceForAccessibility(FULL_NAME_ERROR)
                }
                tieEmailInput.text.toString().trim().isEmpty() || (!Patterns.EMAIL_ADDRESS.matcher(
                    tieEmailInput.text.toString().trim()
                ).matches()) -> {
                    it.announceForAccessibility(EMAIL_ERROR)
                }
                tiePasswordInput.text.toString().trim().isEmpty() -> {
                    it.announceForAccessibility(PASSWORD_ERROR)
                }
                tieConfirmPasswordInput.text.toString().trim().isEmpty() -> {
                    it.announceForAccessibility(CONFIRM_PASSWORD_ERROR)
                }
                tiePasswordInput.text.toString().trim() != tieConfirmPasswordInput.text.toString()
                    .trim() -> {
                    it.announceForAccessibility(PASSWORD_MISMATCH_ERROR)
                }
                else -> {
                    val intent = Intent(this@RegistrationActivity, HomeActivity::class.java)
                    startActivity(intent)
                    finish()
                }
            }
        }


    }

    override fun onBackPressed() {
        super.onBackPressed()
        val intent = Intent(this@RegistrationActivity, LoginActivity::class.java)
        startActivity(intent)
        finish()
    }
}
