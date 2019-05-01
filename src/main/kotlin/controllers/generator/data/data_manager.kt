package controllers.generator.data

import controllers.generators.models.Generator
import controllers.generators.models.Solution
import util.GeneratorExample

var generators: List<Generator>? = null

fun getSolution(id: Int, seed: Long, number: Int): Solution? =
    when(id) {
        1 -> {
            val generator = GeneratorExample(seed, number)
            generator.result
        }
        else -> null
    }