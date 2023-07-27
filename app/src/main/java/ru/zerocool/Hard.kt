package ru.zerocool

import kotlin.random.Random

object Hard{
    private fun makeOperation(num1: Int, num2: Int, op: String): Int {
        val ans: Int = try {
            when (op) {
                "+" -> num1 + num2
                "-" -> num1 - num2
                "x" -> num1 * num2
                else -> num1 / num2
            }
        } catch (e: ArithmeticException) {
            77777777
        }
        return ans
    }

    fun getQuestions(): Pair<String,Int>{
        val num1 = Random.nextInt(1,100)
        val num2 = Random.nextInt(1,100)
        val num3 = Random.nextInt(1,100)
        val num4 = Random.nextInt(1,100)

        val bracketPosition = Random.nextInt(1,4)
        val operator1 = arrayOf("+", "-", "x", "/").random()
        val operator2 = arrayOf("+", "-", "x", "/").random()
        val operator3 = arrayOf("+", "-", "x", "/").random()

        val problem = when(bracketPosition){
            1 -> "(($num1 $operator1 $num2) $operator2 $num3) $operator3 $num4 "
            else -> "($num1 $operator1 9$num2 $operator2 $num3) $operator3 $num4) "
        }
    }
}