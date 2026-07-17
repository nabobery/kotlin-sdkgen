@file:Suppress("ktlint:standard:max-line-length")

package com.nabobery.sdkgen.engine.emit

import com.nabobery.sdkgen.engine.declarations.OperationClientDeclaration
import com.nabobery.sdkgen.engine.declarations.OperationDeclaration
import com.nabobery.sdkgen.engine.declarations.sanitizeKDoc
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.STRING
import com.squareup.kotlinpoet.TypeSpec

internal fun EmissionContext.emitOperationClient(
    file: FileSpec.Builder,
    declaration: OperationClientDeclaration,
) {
    val clientType = ClassName(declaration.packageName, declaration.resolvedName)
    val codecsType = ClassName(declaration.packageName, declaration.codecsObjectName)
    val codecsBuilder = TypeSpec.objectBuilder(codecsType).addModifiers(KModifier.PUBLIC)
    declaration.operations.forEach { operation ->
        addOperationCodecs(codecsBuilder, operation)
    }
    file.addType(codecsBuilder.build())

    val singleOperation = declaration.operations.singleOrNull()
    val clientBuilder =
        TypeSpec
            .classBuilder(clientType)
            .addModifiers(KModifier.PUBLIC)
            .addKdoc("%L\n", sanitizeKDoc(declaration.kdoc))
            .primaryConstructor(
                FunSpec
                    .constructorBuilder()
                    .addParameter("transport", SDK_TRANSPORT)
                    .addParameter("baseUri", STRING)
                    .build(),
            ).addProperty(
                PropertySpec
                    .builder("executor", SDK_EXECUTOR)
                    .addModifiers(KModifier.PRIVATE)
                    .initializer("%T(transport)", SDK_EXECUTOR)
                    .build(),
            ).addProperty(
                PropertySpec
                    .builder("baseUri", STRING)
                    .addModifiers(KModifier.PRIVATE)
                    .initializer("baseUri")
                    .build(),
            )
    val companionBuilder = TypeSpec.companionObjectBuilder()
    declaration.operations.forEach { operation ->
        val metadataPropertyName = operation.metadataPropertyName(singleOperation != null)
        clientBuilder.addFunction(operationFunction(operation, codecsType, metadataPropertyName))
        companionBuilder.addProperty(
            PropertySpec
                .builder(metadataPropertyName, OPERATION_METADATA)
                .addModifiers(KModifier.PUBLIC)
                .initializer(operationMetadata(operation))
                .build(),
        )
    }
    clientBuilder.addType(companionBuilder.build())
    file.addType(clientBuilder.build())
}

private fun EmissionContext.addOperationCodecs(
    codecsBuilder: TypeSpec.Builder,
    operation: OperationDeclaration,
) {
    val requestType = operation.requestType.toTypeName()
    val responseType = operation.responseType.toTypeName()
    val requestCodecType = MEDIA_TYPE_CODEC.parameterizedBy(requestType)
    val responseCodecType = MEDIA_TYPE_CODEC.parameterizedBy(responseType)
    val requestRegistryType = MEDIA_TYPE_CODEC_REGISTRY.parameterizedBy(requestType)
    val responseRegistryType = MEDIA_TYPE_CODEC_REGISTRY.parameterizedBy(responseType)
    codecsBuilder
        .addProperty(
            PropertySpec
                .builder(operation.requestCodecConstantName, STRING)
                .addModifiers(KModifier.PUBLIC, KModifier.CONST)
                .initializer("%S", operation.requestCodecId)
                .build(),
        ).addProperty(
            PropertySpec
                .builder(operation.responseCodecConstantName, STRING)
                .addModifiers(KModifier.PUBLIC, KModifier.CONST)
                .initializer("%S", operation.responseCodecId)
                .build(),
        ).addProperty(
            PropertySpec
                .builder(operation.requestCodecPropertyName, requestCodecType)
                .addModifiers(KModifier.PRIVATE)
                .initializer(
                    "%T(%L, %T.serializer(), SdkJson)",
                    KOTLINX_SERIALIZATION_CODEC,
                    operation.requestCodecConstantName,
                    requestType,
                ).build(),
        ).addProperty(
            PropertySpec
                .builder(operation.responseCodecPropertyName, responseCodecType)
                .addModifiers(KModifier.PRIVATE)
                .initializer(
                    "%T(%L, %T.serializer(), SdkJson)",
                    KOTLINX_SERIALIZATION_CODEC,
                    operation.responseCodecConstantName,
                    responseType,
                ).build(),
        ).addProperty(
            PropertySpec
                .builder("${operation.requestCodecPropertyName}Registry", requestRegistryType)
                .addModifiers(KModifier.PUBLIC)
                .initializer(
                    "%T.of(%L)",
                    MEDIA_TYPE_CODEC_REGISTRY,
                    operation.requestCodecPropertyName,
                ).build(),
        ).addProperty(
            PropertySpec
                .builder("${operation.responseCodecPropertyName}Registry", responseRegistryType)
                .addModifiers(KModifier.PUBLIC)
                .initializer(
                    "%T.of(%L)",
                    MEDIA_TYPE_CODEC_REGISTRY,
                    operation.responseCodecPropertyName,
                ).build(),
        )
}

private fun operationMetadata(operation: OperationDeclaration): CodeBlock =
    CodeBlock
        .builder()
        .add("%T(\n", OPERATION_METADATA)
        .indent()
        .add("operationId = %S,\n", operation.operationId)
        .add("method = %S,\n", operation.method)
        .add("path = %S,\n", operation.path)
        .add("requestMediaTypes = listOf(%L),\n", operation.requestMediaTypes.joinToString { "\"$it\"" })
        .add("responseMediaTypes = listOf(%L),\n", operation.responseMediaTypes.joinToString { "\"$it\"" })
        .add("successStatusCodes = setOf(%L),\n", operation.successStatusCodes.sorted().joinToString())
        .add("responseMode = %T.%L,\n", SDK_RESPONSE_MODE, operation.responseMode.name)
        .add(
            "deadlines = %T(%L, %L, %L),\n",
            SDK_DEADLINES,
            operation.deadlines.totalMillis.kotlinLongLiteral(),
            operation.deadlines.attemptMillis.kotlinLongLiteral(),
            operation.deadlines.idleMillis.kotlinLongLiteral(),
        ).unindent()
        .add(")")
        .build()

private fun EmissionContext.operationFunction(
    operation: OperationDeclaration,
    codecsType: ClassName,
    metadataPropertyName: String,
): FunSpec {
    val requestType = operation.requestType.toTypeName()
    val responseType = operation.responseType.toTypeName()
    return FunSpec
        .builder(operation.operationId)
        .addModifiers(KModifier.PUBLIC, KModifier.SUSPEND)
        .addParameter("request", requestType)
        .addParameter(
            ParameterSpec
                .builder("options", CALL_OPTIONS)
                .defaultValue("%T()", CALL_OPTIONS)
                .build(),
        ).returns(responseType)
        .addKdoc(
            "%L\n\n@param request Request body sent to the operation.\n@param options Execution options.\n@return Buffered response body.\n@throws SdkApiException When the service returns a non-success response.\n@throws SdkSerializationException When a request or response cannot be serialized.\n@throws SdkTransportException When transport execution fails.\n",
            sanitizeKDoc(operation.methodKdoc),
        ).addStatement(
            "return executor.execute<%T, %T>(%L, baseUri, request, listOf(%T.%L), listOf(%T.%L), %T.%L, %T.%L, options)",
            requestType,
            responseType,
            metadataPropertyName,
            codecsType,
            operation.requestCodecConstantName,
            codecsType,
            operation.responseCodecConstantName,
            codecsType,
            "${operation.requestCodecPropertyName}Registry",
            codecsType,
            "${operation.responseCodecPropertyName}Registry",
        ).build()
}

private fun OperationDeclaration.metadataPropertyName(isSingleOperation: Boolean): String =
    if (isSingleOperation) "metadata" else "${operationId}Metadata"

private fun Long?.kotlinLongLiteral(): String =
    this
        ?.toString()
        ?.reversed()
        ?.chunked(3)
        ?.joinToString("_")
        ?.reversed() ?: "null"
