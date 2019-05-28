package controllers.generator

import java.io.BufferedReader
import java.io.InputStreamReader

/*object GeneratorsObj {

    fun startCGenerator(seed: Long, fileName: String) = mutableListOf<String>().also { list ->
        BufferedReader(
            InputStreamReader(
                Runtime.getRuntime()
                    .exec("lli $pathToGen $seed")
                    .inputStream
            )
        ).forEachLine { line ->
            list.add(line)
        }
    }

    fun startPyGen(seed: Long, fileName: String) = mutableListOf<String>().also { list ->
        BufferedReader(
            InputStreamReader(
                Runtime.getRuntime()
                    .exec("python3 $pathToGen $seed")
                    .inputStream
            )
        ).forEachLine { line ->
            list.add(line)
        }
    }

    fun startNODGenWithZero(seed: Long, fileName: String) = mutableListOf<String>().also { list ->
        BufferedReader(
            InputStreamReader(
                Runtime.getRuntime()
                    .exec("lli  $fileName 0 $seed")
                    .inputStream
            )
        ).forEachLine { line ->
            list.add(line)
        }
    }

    fun startNODGenWithoutZero(seed: Long, fileName: String) = mutableListOf<String>().also { list ->
        BufferedReader(
            InputStreamReader(
                Runtime.getRuntime()
                    .exec("lli $pathToGen 1 $seed")
                    .inputStream
            )
        ).forEachLine { line ->
            list.add(line)
        }
    }

    fun startSvideteliGen(seed: Long, pathToGen: String) = mutableListOf<String>().also { list ->
        var generated = ""
        BufferedReader(
            InputStreamReader(
                Runtime.getRuntime()
                    .exec("lli $pathToGen $seed")
                    .inputStream
            )
        ).forEachLine { line ->
            generated += line
        }
        list.run {
            add(
                 generated
                    .substringAfter("uline{Задание}:}")
                    .substringBefore("\\begin{flushleft}")
               + generated
                    .substringAfter("\\begin{verse}")
                    .substringBefore("\\\\")
               + "\n"
               + generated
                    .substringAfter("\\\\")
                    .substringBefore("\\end{verse}")
               + "\n"
               + generated
                     .substringAfter("\\end{flushleft}")
                     .substringBefore("\\\\")
            )
            add(
                generated
                    .substringAfter("\\textbf{\\uline{Ответ}:}")
                    .substringBefore("\\\\")
            )
        }
    }
}

//MathJAX, KaLaTeX
 */