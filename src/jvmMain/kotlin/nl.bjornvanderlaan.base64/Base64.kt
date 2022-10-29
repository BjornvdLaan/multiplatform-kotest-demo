package nl.bjornvanderlaan.base64

import java.util.*

object JvmBase64Encoder: Base64Encoder {
    override fun encode(src: ByteArray): ByteArray = Base64.getEncoder().encode(src)
}

actual object Base64Factory {
    actual fun createEncoder(): Base64Encoder = JvmBase64Encoder
}