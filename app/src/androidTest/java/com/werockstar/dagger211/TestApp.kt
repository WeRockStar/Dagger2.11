package com.werockstar.dagger211

class TestApp : App() {

    private var baseUrl: String? = null

    override fun getBaseUrl(): String {
        return baseUrl ?: super.getBaseUrl()
    }

    fun applyBaseUrl(url: String) {
        this.baseUrl = url
    }
}