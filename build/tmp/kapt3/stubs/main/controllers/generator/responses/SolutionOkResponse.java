package controllers.generator.responses;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcontrollers/generator/responses/SolutionOkResponse;", "Lcontrollers/base/responses/BaseOkResponse;", "solution", "Lcontrollers/generators/models/Solution;", "(Lcontrollers/generators/models/Solution;)V", "getSolution", "()Lcontrollers/generators/models/Solution;", "server_dm"})
public final class SolutionOkResponse extends controllers.base.responses.BaseOkResponse {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.Expose()
    private final controllers.generators.models.Solution solution = null;
    
    @org.jetbrains.annotations.NotNull()
    public final controllers.generators.models.Solution getSolution() {
        return null;
    }
    
    public SolutionOkResponse(@org.jetbrains.annotations.NotNull()
    controllers.generators.models.Solution solution) {
        super(0);
    }
}