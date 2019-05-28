import controllers.generator.GeneratorController
import di.DaggerServerComponent
import spark.Spark.port

val daggerServerComponent = DaggerServerComponent
    .builder()
    .build()!!

fun main() {
    port(9000)
    GeneratorController().start()
}