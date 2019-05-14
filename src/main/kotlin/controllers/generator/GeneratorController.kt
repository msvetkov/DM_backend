package controllers.generator

import com.google.gson.Gson
import controllers.base.IBaseController
import controllers.generator.data.generators
import controllers.generator.data.getSolution
import controllers.generator.responses.GeneratorsOkResponse
import controllers.generator.responses.SolutionErrorResponse
import controllers.generator.responses.SolutionOkResponse
import controllers.generator.data.models.Generator
import controllers.generator.data.models.Solution
import daggerServerComponent
import spark.Spark
import javax.inject.Inject

class GeneratorController : IBaseController {

    @Inject
    lateinit var gson: Gson

    init {
        daggerServerComponent.inject(this)

    }

    override fun start() {
        getGeneratorsFromFile()
        initGetGeneratorsRequest()
        initGetTaskRequest()
    }

    private fun initGetGeneratorsRequest() {
        Spark.get("/get_generators", { request, response ->
            return@get GeneratorsOkResponse(generators ?: listOf())
        }, gson::toJson)
    }

    private fun initGetTaskRequest() {
        Spark.get("/get_task", { request, response ->

            val id  = request.queryParams("id")?.toInt() ?:
                return@get SolutionErrorResponse("No generator's ID parameter")

            val seed: Long = request.queryParams("seed")?.toLong() ?:
                return@get SolutionErrorResponse("No seed parameter")

            val number: Int = request.queryParams("number")?.toInt() ?: 0

            val solution: Solution = getSolution(id, seed, number) ?:
                return@get SolutionErrorResponse("Generator's ID not found")

            return@get SolutionOkResponse(solution)
        }, gson::toJson)
    }

    private fun getGeneratorsFromFile() {
        val generatorText = String::class.java.getResource("/generators.json").readText()
        generators = gson.fromJson(generatorText, Array<Generator>::class.java).toList()
    }
}