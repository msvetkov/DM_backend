package controllers.generator.responses;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcontrollers/generator/responses/GeneratorsOkResponse;", "Lcontrollers/base/responses/BaseOkResponse;", "generators", "", "Lcontrollers/generator/data/models/Generator;", "(Ljava/util/List;)V", "getGenerators", "()Ljava/util/List;", "server_dm"})
public final class GeneratorsOkResponse extends controllers.base.responses.BaseOkResponse {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.Expose()
    private final java.util.List<controllers.generator.data.models.Generator> generators = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<controllers.generator.data.models.Generator> getGenerators() {
        return null;
    }
    
    public GeneratorsOkResponse(@org.jetbrains.annotations.NotNull()
    java.util.List<controllers.generator.data.models.Generator> generators) {
        super(0);
    }
}