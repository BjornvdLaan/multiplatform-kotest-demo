package nl.bjornvanderlaan.factorial

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.ints.shouldBeExactly

class FactorialTest : StringSpec({
    "Factorial of 5 is 120" {
        factorial(5) shouldBeExactly 120
    }
})