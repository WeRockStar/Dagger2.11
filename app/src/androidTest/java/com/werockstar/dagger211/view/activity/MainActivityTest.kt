package com.werockstar.dagger211.view.activity

import android.support.test.InstrumentationRegistry
import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.assertion.ViewAssertions
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.espresso.matcher.ViewMatchers.withText
import android.support.test.rule.ActivityTestRule
import com.werockstar.dagger211.TestApp
import com.werockstar.dagger212.R
import okhttp3.mockwebserver.MockResponse
import okhttp3.mockwebserver.MockWebServer
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class MainActivityTest {

    @get:Rule val rule = ActivityTestRule(MainActivity::class.java, true, false)

    private val mockWebServer = MockWebServer()

    @Before
    fun setUp() {
        mockWebServer.start()
        val app = InstrumentationRegistry.getTargetContext().applicationContext as TestApp
        app.applyBaseUrl(mockWebServer.url("/").toString())
    }

    @Test
    fun click_request_should_see_WeRockStar() {
        mockWebServer.enqueue(MockResponse().setBody("""
            {
                "login": "WeRockStar"
            }
        """.trimIndent()))
        rule.launchActivity(null)
        onView(withId(R.id.btnRequest))
                .perform(click())

        onView(withId(R.id.tvResult))
                .check(ViewAssertions.matches(withText("WeRockStar")))
    }

    @After
    fun tearDown() {
        mockWebServer.shutdown()
    }
}