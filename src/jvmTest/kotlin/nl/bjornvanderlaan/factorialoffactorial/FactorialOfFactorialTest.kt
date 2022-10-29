package nl.bjornvanderlaan.factorialoffactorial

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.math.BigInteger

class FactorialOfFactorialTest: StringSpec({
    "Factorial of factorial of 4 is 620448401733239439360000" {
        factorialOfFactorial(4) shouldBe BigInteger("620448401733239439360000")
    }
})