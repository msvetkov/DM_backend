package controllers.generator.data

import controllers.generator.data.models.Generator
import controllers.generator.data.models.Solution
import controllers.generator.GeneratorsObj
import util.GeneratorExample

var generators: List<Generator>? = null

fun getSolution(id: Int, seed: Long, number: Int): Solution? =
    when (id) {
        1 -> {
            val generator = GeneratorExample(seed, number)
            generator.result
        }
        2 -> {
            GeneratorsObj.startCGenerator(
                seed,
                "/home/cyansmoke/DM_backend/src/main/resources/generators_cpp/main.bc"
            ).let {
                Solution(problem = it[0], answer = it[2])
            }
        }
        3 -> {
            GeneratorsObj.startPyGen(
                seed,
                "/home/cyansmoke/DM_backend/src/main/resources/generatots_python/task_generator.py"
            ).let {
                Solution(problem = it[0], answer = it[4])
            }
        }
        else -> null
    }