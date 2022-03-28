package com.mobautoespresso.tests.adsPage

import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.mobautoespresso.MainActivity
import com.mobautoespresso.pages.AdsPages
import org.hamcrest.Matchers.not
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import java.lang.Thread.sleep

@RunWith(AndroidJUnit4::class)
class ButtonAdsPage {

    private val ads = AdsPages()

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun checkVisibleLevelText() {
        ads.levelAdsPage.check(matches(isDisplayed()))
    }

    @Test
    fun checkCorrectLevelText() {
        ads.levelAdsPage.check(matches(withText("Level 1")))
    }

    @Test
    fun checkVisibleButtonAdsPage() {
        ads.buttonAdsPage.check(matches(isDisplayed()))
    }

    @Test
    fun checkUnEnableButton() {
        ads.buttonAdsPage.check(matches(not(isEnabled())))

    }
}