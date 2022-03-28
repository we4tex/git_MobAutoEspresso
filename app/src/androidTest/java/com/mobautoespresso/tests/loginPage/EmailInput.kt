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
class EmailInput {

    private val lP = LoginPages()
    private val correctEmail = "login_email"

    @get:Rule
    val activityRule = ActivityScenarioRule(LoginActivity::class.java)

    @Test
    fun checkEmailInputIsDisplayed() {
        lP.emailInput.check(matches(isDisplayed()))
    }

    @Test
    fun checkCorrectInput() {
        lP.emailInput.perform(typeText(correctEmail))
        lP.emailInput.check(matches(withText(correctEmail)))
    }

    @Test
    fun checkInCorrectInput() {
        lP.emailInput.perform(typeText("InCorrect"))
        lP.emailInput.check(matches(not(withText(correctEmail))))
    }

}