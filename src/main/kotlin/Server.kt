import controllers.generator.GeneratorController
import di.DaggerServerComponent
import spark.Spark.port

val daggerServerComponent = DaggerServerComponent
    .builder()
    .build()!!

lateinit var path: String

fun main(args: Array<String>) {
    path = args[0]
    port(9000)
    GeneratorController().start()
}