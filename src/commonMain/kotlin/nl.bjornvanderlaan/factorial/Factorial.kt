package nl.bjornvanderlaan.factorial


fun factorial(number: Int): Int
    = (1..number).fold(1) { acc, i -> acc * i}