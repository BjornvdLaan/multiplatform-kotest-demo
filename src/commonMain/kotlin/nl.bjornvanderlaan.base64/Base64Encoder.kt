package nl.bjornvanderlaan.base64

interface Base64Encoder {
    fun encode(src: ByteArray): ByteArray
}

fun Base64Encoder.encodeToString(src: ByteArray): String {
    val encoded = encode(src)
    return buildString(encoded.size) {
        encoded.forEach { append(it.toInt().toChar()) }
    }
}