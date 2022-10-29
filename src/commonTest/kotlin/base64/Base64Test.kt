package base64

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import nl.bjornvanderlaan.base64.Base64Factory

class Base64Test: StringSpec({
    "String is properly encoded to Base64" {
        val encoder = Base64Factory.createEncoder()

        val input = "Kotlin is awesome".encodeToByteArray()
        val expectedOutput = "S290bGluIGlzIGF3ZXNvbWU=".encodeToByteArray()

        encoder.encode(input) shouldBe expectedOutput
    }
})