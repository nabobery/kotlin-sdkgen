package com.nabobery.sdkgen.engine.spi

import com.nabobery.sdkgen.model.AdditionalPropertiesModel
import com.nabobery.sdkgen.model.CompositionModel
import com.nabobery.sdkgen.model.Diagnostic
import com.nabobery.sdkgen.model.DiscriminatorModel
import com.nabobery.sdkgen.model.EncodingModel
import com.nabobery.sdkgen.model.EnumModel
import com.nabobery.sdkgen.model.JsonValue
import com.nabobery.sdkgen.model.MediaTypeModel
import com.nabobery.sdkgen.model.OperationModel
import com.nabobery.sdkgen.model.ParameterModel
import com.nabobery.sdkgen.model.PropertyModel
import com.nabobery.sdkgen.model.PropertyOwnership
import com.nabobery.sdkgen.model.RequestBodyModel
import com.nabobery.sdkgen.model.ResponseModel
import com.nabobery.sdkgen.model.SchemaModel
import com.nabobery.sdkgen.model.SchemaRef
import com.nabobery.sdkgen.model.SecurityRequirementModel
import com.nabobery.sdkgen.model.SecuritySchemeModel
import com.nabobery.sdkgen.model.SemanticDocument
import com.nabobery.sdkgen.model.SourceDocumentIdentity
import java.util.Collections
import java.util.LinkedHashMap

/** JVM-backed immutable collection wrappers used at the public plugin boundary. */
internal fun <T> immutableList(values: Iterable<T>): List<T> = Collections.unmodifiableList(values.toList())

internal fun <K, V> immutableMap(values: Map<K, V>): Map<K, V> = Collections.unmodifiableMap(LinkedHashMap(values))

/**
 * Takes a recursive value snapshot of the semantic graph before it crosses the plugin boundary.
 * Read-only Kotlin collection types are not sufficient here: callers can still pass mutable backing
 * collections or cast them back to MutableList/MutableMap, so every nested collection is copied and
 * wrapped as well.
 */
internal fun SemanticDocument.immutableSnapshot(): SemanticDocument =
    copy(
        sourceDocuments = immutableList(sourceDocuments.map(SourceDocumentIdentity::immutableSnapshot)),
        schemas = immutableMap(schemas.mapValues { (_, schema) -> schema.immutableSnapshot() }),
        operations = immutableList(operations.map(OperationModel::immutableSnapshot)),
        securityAlternatives = immutableList(securityAlternatives.map(SecurityRequirementModel::immutableSnapshot)),
        extensions = extensions.immutableJsonMapSnapshot(),
        diagnostics = immutableList(diagnostics.map(Diagnostic::immutableSnapshot)),
        securitySchemes = immutableMap(securitySchemes.mapValues { (_, scheme) -> scheme.immutableSnapshot() }),
    )

private fun SourceDocumentIdentity.immutableSnapshot(): SourceDocumentIdentity = copy(source = source.copy())

private fun SchemaRef.immutableSnapshot(): SchemaRef = copy(source = source.copy())

private fun JsonValue.immutableSnapshot(): JsonValue =
    when (this) {
        JsonValue.Null -> this
        is JsonValue.BooleanValue -> this
        is JsonValue.NumberValue -> this
        is JsonValue.StringValue -> this
        is JsonValue.ArrayValue -> JsonValue.ArrayValue(immutableList(values.map(JsonValue::immutableSnapshot)))
        is JsonValue.ObjectValue -> JsonValue.ObjectValue(properties.immutableJsonMapSnapshot())
    }

private fun Map<String, JsonValue>.immutableJsonMapSnapshot(): Map<String, JsonValue> =
    immutableMap(mapValues { (_, value) -> value.immutableSnapshot() })

private fun EnumModel.immutableSnapshot(): EnumModel =
    copy(values = immutableList(values.map(JsonValue::immutableSnapshot)))

private fun DiscriminatorModel.immutableSnapshot(): DiscriminatorModel =
    copy(
        mapping = immutableMap(mapping),
        unmappedBranches = immutableList(unmappedBranches),
        extensions = extensions.immutableJsonMapSnapshot(),
    )

private fun CompositionModel.immutableSnapshot(): CompositionModel =
    copy(
        branches = immutableList(branches.map(SchemaRef::immutableSnapshot)),
        discriminator = discriminator?.immutableSnapshot(),
    )

private fun PropertyOwnership.immutableSnapshot(): PropertyOwnership =
    copy(constraints = constraints.immutableJsonMapSnapshot())

private fun PropertyModel.immutableSnapshot(): PropertyModel =
    copy(
        schema = schema.immutableSnapshot(),
        presenceStates = immutableList(presenceStates),
        defaultValue = defaultValue?.immutableSnapshot(),
        examples = immutableList(examples.map(JsonValue::immutableSnapshot)),
        extensions = extensions.immutableJsonMapSnapshot(),
    )

private fun AdditionalPropertiesModel.immutableSnapshot(): AdditionalPropertiesModel =
    when (this) {
        is AdditionalPropertiesModel.Closed -> {
            copy(source = source.copy())
        }

        is AdditionalPropertiesModel.FreeForm -> {
            copy(source = source.copy())
        }

        is AdditionalPropertiesModel.Typed -> {
            copy(
                valueSchema = valueSchema.copy(source = valueSchema.source.copy()),
                source = source.copy(),
            )
        }
    }

private fun SchemaModel.immutableSnapshot(): SchemaModel =
    copy(
        types = immutableList(types),
        nullabilityOrigins = immutableList(nullabilityOrigins),
        constraints = constraints.immutableJsonMapSnapshot(),
        defaultValue = defaultValue?.immutableSnapshot(),
        examples = immutableList(examples.map(JsonValue::immutableSnapshot)),
        enum = enum?.immutableSnapshot(),
        properties = immutableList(properties.map(PropertyModel::immutableSnapshot)),
        items = items?.immutableSnapshot(),
        additionalProperties = additionalProperties?.immutableSnapshot(),
        compositions = immutableList(compositions.map(CompositionModel::immutableSnapshot)),
        allOfPropertyOwnership = immutableList(allOfPropertyOwnership.map(PropertyOwnership::immutableSnapshot)),
        extensions = extensions.immutableJsonMapSnapshot(),
    )

private fun EncodingModel.immutableSnapshot(): EncodingModel =
    copy(
        headers = headers.immutableJsonMapSnapshot(),
        extensions = extensions.immutableJsonMapSnapshot(),
    )

private fun MediaTypeModel.immutableSnapshot(): MediaTypeModel =
    copy(
        schema = schema?.immutableSnapshot(),
        encoding = immutableList(encoding.map(EncodingModel::immutableSnapshot)),
        example = example?.immutableSnapshot(),
        examples = examples.immutableJsonMapSnapshot(),
        extensions = extensions.immutableJsonMapSnapshot(),
    )

private fun ParameterModel.immutableSnapshot(): ParameterModel =
    copy(
        schema = schema?.immutableSnapshot(),
        content = immutableList(content.map(MediaTypeModel::immutableSnapshot)),
        examples = examples.immutableJsonMapSnapshot(),
        extensions = extensions.immutableJsonMapSnapshot(),
    )

private fun RequestBodyModel.immutableSnapshot(): RequestBodyModel =
    copy(
        content = immutableList(content.map(MediaTypeModel::immutableSnapshot)),
        extensions = extensions.immutableJsonMapSnapshot(),
    )

private fun ResponseModel.immutableSnapshot(): ResponseModel =
    copy(
        content = immutableList(content.map(MediaTypeModel::immutableSnapshot)),
        headers =
            immutableList(
                headers.map { header ->
                    header.copy(
                        schema = header.schema?.immutableSnapshot(),
                        extensions = header.extensions.immutableJsonMapSnapshot(),
                    )
                },
            ),
        links = links.immutableJsonMapSnapshot(),
        extensions = extensions.immutableJsonMapSnapshot(),
    )

private fun SecurityRequirementModel.immutableSnapshot(): SecurityRequirementModel =
    copy(
        schemes = immutableMap(schemes.mapValues { (_, scopes) -> immutableList(scopes) }),
    )

private fun SecuritySchemeModel.immutableSnapshot(): SecuritySchemeModel = copy(source = source.copy())

private fun OperationModel.immutableSnapshot(): OperationModel =
    copy(
        parameters = immutableList(parameters.map(ParameterModel::immutableSnapshot)),
        requestBody = requestBody?.immutableSnapshot(),
        responses = immutableList(responses.map(ResponseModel::immutableSnapshot)),
        securityAlternatives = immutableList(securityAlternatives.map(SecurityRequirementModel::immutableSnapshot)),
        extensions = extensions.immutableJsonMapSnapshot(),
    )

private fun Diagnostic.immutableSnapshot(): Diagnostic = copy(source = source.copy())
