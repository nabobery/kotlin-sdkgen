package com.nabobery.sdkgen.openapi.overlays

import com.fasterxml.jackson.databind.JsonNode
import com.nabobery.sdkgen.openapi.jsonpath.Rfc9535Evaluator
import com.nabobery.sdkgen.openapi.jsonpath.Rfc9535GrammarValidator

public interface JsonPathSelector {
    public fun validate(
        expression: String,
        source: JsonPathSource,
    )

    public fun selectPointers(
        document: JsonNode,
        expression: String,
        source: JsonPathSource = JsonPathSource("unknown", null, "target"),
    ): List<String>
}

public class Rfc9535Selector : JsonPathSelector {
    override fun validate(
        expression: String,
        source: JsonPathSource,
    ) {
        Rfc9535GrammarValidator.validate(expression, source)
    }

    override fun selectPointers(
        document: JsonNode,
        expression: String,
        source: JsonPathSource,
    ): List<String> = Rfc9535Evaluator.select(document, expression, source).map { it.pointer }
}
