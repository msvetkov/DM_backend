package controllers.generator.responses

import com.google.gson.annotations.Expose
import controllers.base.responses.BaseOkResponse
import controllers.generators.models.Solution

class SolutionOkResponse(
    @Expose val solution: Solution) : BaseOkResponse()