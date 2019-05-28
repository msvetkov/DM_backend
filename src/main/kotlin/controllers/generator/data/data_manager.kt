package controllers.generator.data

import controllers.generator.data.models.Solution
import java.io.BufferedReader
import java.io.InputStreamReader

const val PATH_TO_GENERATORS = "src/main/resources/generators/"

//чтобы добавить новый генератор сначала требуется добавить title и id в файл generators.json в папке resources
// затем обработать его генерацию здесь

private fun generate(command: String, fileName: String, preSeedCommand: String?, seed: Long, postSeedCommand: String?) =
    BufferedReader(
        InputStreamReader(
            Runtime.getRuntime()
                .exec(
                    "$command $PATH_TO_GENERATORS$fileName ${preSeedCommand ?: ""} $seed ${postSeedCommand ?: ""}"
                )
                .inputStream
        )
    ).readText()

fun getSolution(id: Int, seed: Long) = when (id) {
    1 -> {
        generate("lli", "a_plus_b_gen.bc", null, seed, null).run {
            Solution(
                problem = substringBefore("% == разделитель условия и ответа =="),
                answer = substringAfter("% == разделитель условия и ответа ==")
            )
        }
    }
    2 -> {
        generate("python3", "task_generator.py", null, seed, null).run {
            Solution(
                problem = substringBefore("% == разделитель условия и ответа =="),
                answer = substringAfter("% == разделитель условия и ответа ==")
            )
        }
    }
    3 -> {
        generate("lli", "NODgenerator.bc", "0", seed, null).run {
            Solution(
                problem = substringBefore("=================="),
                answer = substringAfter("==================")
            )
        }
    }
    4 -> {
        generate("lli", "NODgenerator.bc", "1", seed, null).run {
            Solution(
                problem = substringBefore("=================="),
                answer = substringAfter("==================")
            )
        }
    }
    5 -> {
        generate("lli", "svidetile_gen.bc", null, seed, null).run {
            Solution(
                problem = substringAfter("uline{Задание}:}")
                    .substringBefore("\\begin{flushleft}")
                        + substringAfter("\\begin{verse}")
                    .substringBefore("\\\\")
                        + "\n"
                        + substringAfter("\\\\")
                    .substringBefore("\\end{verse}")
                        + "\n"
                        + substringAfter("\\end{flushleft}")
                    .substringBefore("\\\\"),
                answer = substringAfter("\\textbf{\\uline{Ответ}:}")
                    .substringBefore("\\\\")
            )
        }
    }
    else -> null
}