package nl.bjornvanderlaan.base64

import kotlinx.browser.window

object JsBase64Encoder: Base64Encoder {
    override fun encode(src: ByteArray): ByteArray {
        val string = src.decodeToString()
        val encodedString = window.btoa(string)
        return encodedString.encodeToByteArray()
    }
}

actual object Base64Factory {
    actual fun createEncoder(): Base64Encoder = JsBase64Encoder
}