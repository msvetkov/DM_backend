import controllers.generator.GeneratorController
import di.DaggerServerComponent

val daggerServerComponent = DaggerServerComponent
    .builder()
    .build()


fun main(args: Array<String>) {
    val controllers = listOf(GeneratorController())
    controllers.forEach{ it.start() }
}