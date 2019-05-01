package util

import controllers.generators.models.Solution
import java.lang.StringBuilder
import java.util.*



// Упращенный пример генератора для тестирования сервера, пока не готова интеграция с GraalVM
class GeneratorExample (private val seed: Long, private var numberOfDigits: Int) {

    val result: Solution = Solution()

    init {
        generateTask()
    }

    private fun generateTask() {
        val random = Random()
        random.setSeed(seed)

        if (numberOfDigits < 1 || numberOfDigits > 8) {
            numberOfDigits = random.nextInt(3) + 3
        }

        val minNumber = pow(10, numberOfDigits - 1)
        val maxNumber = pow(10, numberOfDigits) - 1

        val a = random.nextInt((maxNumber - minNumber) + 1) + minNumber
        val b = random.nextInt((maxNumber - minNumber) + 1) + minNumber

        result.problem = getProblemString(a, b)
        result.answer = (a + b).toString()
    }

    private fun pow(a: Int, b: Int): Int {
        var result = 1
        for (number in 0..b) {
            result *= a
        }
        return result
    }

    private fun getProblemString(a: Int, b: Int) = StringBuilder().apply {
        append("Сложите $")
        append(a)
        append("$ и $")
        append(b)
        append("$.")
    }.toString()

}