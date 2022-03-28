package com.mobautoespresso.tests.loginPage

import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.*
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.mobautoespresso.pages.LoginPages
import com.mobautoespresso.ui.login.LoginActivity
import org.hamcrest.Matchers.not
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class PasswordInput {

    private val lP = LoginPages()
    private val correctPassword = "password"

    @get:Rule
    val activityRule = ActivityScenarioRule(LoginActivity::class.java)

    @Test
    fun checkPasswordInputIsDisplayed() {
        lP.passwordInput.check(matches(isDisplayed()))
    }

    @Test
    fun checkCorrectPassInput() {
        lP.passwordInput.perform(typeText(correctPassword))
        lP.passwordInput.check(matches(withText(correctPassword)))
    }

    @Test
    fun checkInCorrectPassInput() {
        lP.passwordInput.perform(typeText("InCorrect"))
        lP.passwordInput.check(matches(not(withText(correctPassword))))
    }

}