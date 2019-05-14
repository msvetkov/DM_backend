package controllers.generator

import java.io.BufferedReader
import java.io.InputStreamReader

object GeneratorsObj {
    fun startCGenerator(seed: Long, pathToGen: String) = mutableListOf<String>().also { list ->
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

    fun startPyGen(seed: Long, pathToGen: String) = mutableListOf<String>().also { list ->
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
}

//MathJAX, KaLaTeX