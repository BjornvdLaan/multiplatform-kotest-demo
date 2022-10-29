package nl.bjornvanderlaan.factorialoffactorial

import nl.bjornvanderlaan.factorial.factorial
import java.math.BigInteger

fun factorialOfFactorial(number: Int): BigInteger {
    val bigNumber = factorial(number).toBigInteger()

    var currentNumber = BigInteger.ONE
    var accumulator = BigInteger.ONE

    while(currentNumber <= bigNumber) {
        accumulator *= currentNumber
        currentNumber++
    }
    return accumulator
}