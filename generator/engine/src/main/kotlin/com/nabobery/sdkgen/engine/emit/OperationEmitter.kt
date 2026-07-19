package com.nabobery.sdkgen.engine.emit

import com.nabobery.sdkgen.engine.declarations.KotlinNameResolver
import com.nabobery.sdkgen.engine.declarations.KotlinTypeRef
import com.nabobery.sdkgen.engine.declarations.MultipartPartDeclaration
import com.nabobery.sdkgen.engine.declarations.OperationClientDeclaration
import com.nabobery.sdkgen.engine.declarations.OperationDeclaration
import com.nabobery.sdkgen.engine.declarations.OperationParameterDeclaration
import com.nabobery.sdkgen.engine.declarations.OperationRequestBodyAlternative
import com.nabobery.sdkgen.engine.declarations.OperationResponseAlternative
import com.nabobery.sdkgen.engine.declarations.OperationResponseMode
import com.nabobery.sdkgen.engine.declarations.OperationSecuritySchemeDeclaration
import com.nabobery.sdkgen.engine.declarations.PaginationDeclaration
import com.nabobery.sdkgen.engine.declarations.ResponseSelectorDeclaration
import com.nabobery.sdkgen.engine.declarations.RetryDeclaration
import com.nabobery.sdkgen.engine.declarations.StreamingDeclaration
import com.nabobery.sdkgen.engine.declarations.hasCompatibleOrdinaryResponseShape
import com.nabobery.sdkgen.engine.declarations.rawResponseAlternativeDiagnostic
import com.nabobery.sdkgen.engine.declarations.sanitizeKDoc
import com.nabobery.sdkgen.engine.declarations.unrepresentableRawResponseAlternative
import com.nabobery.sdkgen.model.JsonValue
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.INT
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.LIST
import com.squareup.kotlinpoet.MAP
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.STRING
import com.squareup.kotlinpoet.TypeName
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
    val methodNames = operationMethodNames(declaration.operations)
    val requiresSecurityAuthentication =
        declaration.operations.any { operation ->
            operation.security.any { requirement -> requirement.schemes.isNotEmpty() }
        }
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
                    .addParameter(
                        ParameterSpec
                            .builder("credentialProviders", MAP.parameterizedBy(STRING, CREDENTIAL_PROVIDER))
                            .defaultValue("emptyMap()")
                            .build(),
                    ).addParameter(
                        ParameterSpec
                            .builder("trustedHosts", TRUSTED_HOSTS.copy(nullable = true))
                            .defaultValue("null")
                            .build(),
                    ).addParameter(
                        ParameterSpec
                            .builder("authentication", SDK_AUTHENTICATION.copy(nullable = true))
                            .defaultValue("null")
                            .build(),
                    ).build(),
            )
    if (requiresSecurityAuthentication) {
        clientBuilder.addProperty(
            PropertySpec
                .builder("contractSecuritySchemes", MAP.parameterizedBy(STRING, SECURITY_SCHEME))
                .addModifiers(KModifier.PRIVATE)
                .initializer(contractSecuritySchemesExpression(declaration.securitySchemes))
                .build(),
        )
    }
    clientBuilder
        .addProperty(
            PropertySpec
                .builder("authentication", SDK_AUTHENTICATION.copy(nullable = true))
                .addModifiers(KModifier.PRIVATE)
                .initializer(authenticationInitializer(requiresSecurityAuthentication))
                .build(),
        ).addProperty(
            PropertySpec
                .builder("executor", SDK_EXECUTOR)
                .addModifiers(KModifier.PRIVATE)
                .initializer(
                    "%T(transport, authentication = this@%L.authentication)",
                    SDK_EXECUTOR,
                    declaration.resolvedName,
                ).build(),
        ).addProperty(
            PropertySpec
                .builder("baseUri", STRING)
                .addModifiers(KModifier.PRIVATE)
                .initializer("baseUri")
                .build(),
        )
    val companionBuilder = TypeSpec.companionObjectBuilder()
    declaration.operations.forEach { operation ->
        val names = methodNames.getValue(operation)
        val metadataPropertyName = operation.metadataPropertyName(singleOperation != null, names.operationName)
        val ordinaryResponseSupported = operation.hasCompatibleOrdinaryResponseShape()
        if (ordinaryResponseSupported) {
            clientBuilder.addFunction(operationFunction(operation, codecsType, metadataPropertyName, names))
        }
        if (names.responseTypeName != null) {
            clientBuilder.addType(responseResultType(operation, clientType, names))
            clientBuilder.addType(responseDecoderType(operation, clientType, codecsType, names))
            clientBuilder.addFunction(
                withResponseFunction(operation, clientType, codecsType, metadataPropertyName, names),
            )
        }
        if (operation.pagination != null && ordinaryResponseSupported) {
            clientBuilder.addFunction(paginationPagesFunction(operation, metadataPropertyName, names))
            clientBuilder.addFunction(paginationItemsFunction(operation, metadataPropertyName, names))
            clientBuilder.addFunction(pageMetadataFunction(operation, metadataPropertyName, names))
            clientBuilder.addFunction(pageFetcherFunction(operation, codecsType, names))
        }
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

private fun authenticationInitializer(requiresSecurityAuthentication: Boolean): CodeBlock {
    if (!requiresSecurityAuthentication) return CodeBlock.of("authentication")
    return CodeBlock
        .builder()
        .add("authentication ?: %T(\n", SECURITY_SCHEME_AUTHENTICATION)
        .indent()
        .add("bindings =\n")
        .indent()
        .add("contractSecuritySchemes.mapNotNull { (schemeId, scheme) ->\n")
        .indent()
        .add(
            "credentialProviders[schemeId]?.let { provider -> schemeId to %T(scheme, provider) }\n",
            SECURITY_SCHEME_BINDING,
        ).unindent()
        .add("}.toMap(),\n")
        .unindent()
        .add("trustedHosts = trustedHosts ?: %T.of(baseUri),\n", TRUSTED_HOSTS)
        .unindent()
        .add(")")
        .build()
}

private fun contractSecuritySchemesExpression(schemes: Map<String, OperationSecuritySchemeDeclaration>): CodeBlock {
    if (schemes.isEmpty()) return CodeBlock.of("emptyMap()")
    val result = CodeBlock.builder().add("mapOf(\n").indent()
    schemes.toSortedMap().forEach { (schemeId, scheme) ->
        result.add("%S to %L,\n", schemeId, securitySchemeExpression(scheme))
    }
    return result.unindent().add(")").build()
}

private fun securitySchemeExpression(scheme: OperationSecuritySchemeDeclaration): CodeBlock =
    when (scheme) {
        is OperationSecuritySchemeDeclaration.ApiKey -> {
            CodeBlock.of(
                "%T.ApiKey(location = %T.%L, parameterName = %S)",
                SECURITY_SCHEME,
                SECURITY_SCHEME.nestedClass("ApiKeyLocation"),
                scheme.location.name,
                scheme.parameterName,
            )
        }

        OperationSecuritySchemeDeclaration.HttpBasic -> {
            CodeBlock.of("%T.HttpBasic", SECURITY_SCHEME)
        }

        is OperationSecuritySchemeDeclaration.HttpBearer -> {
            if (scheme.scheme == "Bearer") {
                CodeBlock.of("%T.HttpBearer()", SECURITY_SCHEME)
            } else {
                CodeBlock.of("%T.HttpBearer(scheme = %S)", SECURITY_SCHEME, scheme.scheme)
            }
        }

        is OperationSecuritySchemeDeclaration.Unsupported -> {
            CodeBlock.of("%T.Unsupported(kind = %S)", SECURITY_SCHEME, scheme.kind)
        }
    }

private data class OperationMethodNames(
    val operationName: String,
    val pagesName: String? = null,
    val itemsName: String? = null,
    val pageMetadataName: String? = null,
    val fetchPageName: String? = null,
    val responseTypeName: String? = null,
    val withResponseName: String? = null,
    val responseDecoderName: String? = null,
    val parameterNames: Map<OperationParameterDeclaration, String> = emptyMap(),
    val cursorParameterName: String? = null,
    val limitParameterName: String? = null,
)

private fun operationMethodNames(
    operations: List<OperationDeclaration>,
): Map<OperationDeclaration, OperationMethodNames> {
    val used = mutableSetOf("executor", "baseUri")
    val names = linkedMapOf<OperationDeclaration, OperationMethodNames>()
    operations.forEach { operation ->
        operation.unrepresentableRawResponseAlternative()?.let { alternative ->
            throw IllegalArgumentException(operation.rawResponseAlternativeDiagnostic(alternative))
        }
        require(
            operation.responseMode != OperationResponseMode.STREAMING ||
                operation.hasCompatibleOrdinaryResponseShape(),
        ) {
            "Operation '${operation.operationIdentity}' has incompatible successful streaming response shapes; " +
                "no callable API can be emitted."
        }
        names[operation] = OperationMethodNames(uniqueMemberName(operation.operationId, used))
    }
    operations.forEach { operation ->
        val current = names.getValue(operation)
        val parameterNames = operationParameterNames(operation)
        val pagination = operation.pagination as? PaginationDeclaration.CursorToken
        val responseTypeName =
            if (typedResponseAlternativesSupported(operation)) {
                uniqueMemberName(
                    "${current.operationName.replaceFirstChar(Char::uppercaseChar)}Response",
                    used,
                )
            } else {
                null
            }
        names[operation] =
            current.copy(
                pagesName = operation.pagination?.let { uniqueMemberName("${current.operationName}Pages", used) },
                itemsName = operation.pagination?.let { uniqueMemberName("${current.operationName}Items", used) },
                pageMetadataName =
                    operation.pagination?.let {
                        uniqueMemberName(
                            "metadataFor${current.operationName.replaceFirstChar(Char::uppercaseChar)}Page",
                            used,
                        )
                    },
                fetchPageName =
                    operation.pagination?.let {
                        uniqueMemberName(
                            "fetch${current.operationName}Page",
                            used,
                        )
                    },
                responseTypeName = responseTypeName,
                withResponseName =
                    responseTypeName?.let { uniqueMemberName("${current.operationName}WithResponse", used) },
                responseDecoderName =
                    responseTypeName?.let { uniqueMemberName("${it}Decoder", used) },
                parameterNames = parameterNames,
                cursorParameterName =
                    pagination?.requestCursorParam?.let { raw ->
                        operation.parameters.firstOrNull { it.name == raw }?.let(parameterNames::get)
                    },
                limitParameterName =
                    pagination?.requestLimitParam?.let { raw ->
                        operation.parameters.firstOrNull { it.name == raw }?.let(parameterNames::get)
                    },
            )
    }
    return names
}

private fun operationParameterNames(operation: OperationDeclaration): Map<OperationParameterDeclaration, String> {
    val used = mutableSetOf("request", "options", "pageRequest")
    val result = linkedMapOf<OperationParameterDeclaration, String>()
    operation.parameters.forEach { parameter ->
        val base = KotlinNameResolver.memberName(parameter.name)
        var candidate = base
        var suffix = 2
        while (!used.add(candidate)) {
            candidate = "$base$suffix"
            suffix += 1
        }
        result[parameter] = candidate
    }
    return result
}

private fun uniqueMemberName(
    base: String,
    used: MutableSet<String>,
): String {
    var candidate = base
    var suffix = 2
    while (!used.add(candidate)) {
        candidate = "$base$suffix"
        suffix += 1
    }
    return candidate
}

private fun operationParameterSpecs(
    operation: OperationDeclaration,
    names: OperationMethodNames,
): List<ParameterSpec> =
    operation.parameters.map { parameter ->
        parameter.toParameterSpec(requireNotNull(names.parameterNames[parameter]))
    }

private fun OperationParameterDeclaration.toParameterSpec(name: String): ParameterSpec =
    ParameterSpec
        .builder(name, (if (required) type else type.copy(nullable = true)).toTypeName())
        .apply { if (!required) defaultValue("null") }
        .build()

private fun typedResponseAlternativesSupported(operation: OperationDeclaration): Boolean =
    operation.responseAlternatives.isNotEmpty() &&
        operation.responseMode == OperationResponseMode.BUFFERED &&
        operation.responseAlternatives.all { alternative -> alternative.mode == OperationResponseMode.BUFFERED }

private fun responseVariantNames(operation: OperationDeclaration): List<String> {
    val used = mutableSetOf<String>()
    return operation.responseAlternatives.map { alternative ->
        val statusName = responseStatusName(alternative.selector)
        val mediaTypeKey = alternative.mediaTypes.joinToString("|")
        val sameStatusAndMediaAlternatives =
            operation.responseAlternatives.filter { candidate ->
                candidate.selector == alternative.selector && candidate.mediaTypes.joinToString("|") == mediaTypeKey
            }
        val sameStatusAndMediaCount = sameStatusAndMediaAlternatives.size
        val distinctTypeTagCount =
            sameStatusAndMediaAlternatives.map { candidate -> candidate.type.simpleName }.distinct().size
        val mediaTypeSuffix = alternative.mediaTypes.firstOrNull()?.responseTypeSuffix()
        val typeSuffix =
            alternative.type.simpleName
                .takeUnless { it == "Unit" }
                ?.let(KotlinNameResolver::typeName)
        val suffix =
            when {
                mediaTypeSuffix != null && sameStatusAndMediaCount > 1 && distinctTypeTagCount > 1 -> {
                    mediaTypeSuffix + (typeSuffix ?: "")
                }

                mediaTypeSuffix != null -> {
                    mediaTypeSuffix
                }

                typeSuffix != null -> {
                    typeSuffix
                }

                else -> {
                    "NoContent"
                }
            }
        uniqueMemberName(statusName + suffix, used)
    }
}

private fun responseStatusName(selector: ResponseSelectorDeclaration): String =
    when (selector) {
        is ResponseSelectorDeclaration.ExactStatus -> {
            if (selector.code in 200..299) "Success" else "Http${selector.code}"
        }

        is ResponseSelectorDeclaration.StatusRange -> {
            val prefix =
                if (selector.firstInclusive <= 299 && selector.lastInclusive >= 200) {
                    "Success"
                } else {
                    "Http"
                }
            "$prefix${selector.firstInclusive}To${selector.lastInclusive}"
        }

        ResponseSelectorDeclaration.Default -> {
            "Default"
        }
    }

private fun String.responseTypeSuffix(): String =
    substringAfter('/', missingDelimiterValue = this)
        .replace('+', '-')
        .split('-', '_', '.', ' ')
        .filter(String::isNotBlank)
        .joinToString("") { part -> KotlinNameResolver.typeName(part) }
        .ifBlank { "Media" }

private fun responsePayloadPropertyName(alternative: OperationResponseAlternative): String {
    val mediaType = alternative.mediaTypes.firstOrNull()?.lowercase()
    val candidate =
        when {
            alternative.type.isRawStream() || mediaType == "application/octet-stream" -> "bytes"
            mediaType == "application/json" || mediaType?.endsWith("+json") == true -> "json"
            mediaType?.startsWith("text/") == true -> "text"
            mediaType != null -> mediaType.responseTypeSuffix()
            alternative.type.isUnit() -> "unit"
            else -> alternative.type.simpleName
        }
    return KotlinNameResolver.memberName(candidate.ifBlank { "value" })
}

private fun responseResultType(
    operation: OperationDeclaration,
    clientType: ClassName,
    names: OperationMethodNames,
): TypeSpec {
    val responseTypeName = requireNotNull(names.responseTypeName)
    val responseInterface = clientType.nestedClass(responseTypeName)
    val builder =
        TypeSpec
            .interfaceBuilder(responseTypeName)
            .addModifiers(KModifier.PUBLIC, KModifier.SEALED)
            .addKdoc(
                "Typed response alternatives for `%L`. Non-success alternatives are not converted " +
                    "into success values.\n",
                operation.operationIdentity,
            )
    responseVariantNames(operation).forEachIndexed { index, variantName ->
        val alternative = operation.responseAlternatives[index]
        val payloadPropertyName = responsePayloadPropertyName(alternative)
        builder.addType(
            TypeSpec
                .classBuilder(variantName)
                .addModifiers(KModifier.PUBLIC)
                .primaryConstructor(
                    FunSpec
                        .constructorBuilder()
                        .addParameter(payloadPropertyName, alternative.type.toTypeName())
                        .addParameter("statusCode", INT)
                        .addParameter("headers", LIST.parameterizedBy(SDK_HEADER))
                        .build(),
                ).addProperty(
                    PropertySpec
                        .builder(payloadPropertyName, alternative.type.toTypeName())
                        .initializer(payloadPropertyName)
                        .build(),
                ).addProperty(PropertySpec.builder("statusCode", INT).initializer("statusCode").build())
                .addProperty(
                    PropertySpec
                        .builder("headers", LIST.parameterizedBy(SDK_HEADER))
                        .initializer("headers")
                        .build(),
                ).addSuperinterface(responseInterface)
                .build(),
        )
    }
    builder.addType(
        TypeSpec
            .classBuilder("Unknown")
            .addModifiers(KModifier.PUBLIC)
            .primaryConstructor(
                FunSpec
                    .constructorBuilder()
                    .addParameter("statusCode", INT)
                    .addParameter("headers", LIST.parameterizedBy(SDK_HEADER))
                    .build(),
            ).addProperty(PropertySpec.builder("statusCode", INT).initializer("statusCode").build())
            .addProperty(
                PropertySpec
                    .builder("headers", LIST.parameterizedBy(SDK_HEADER))
                    .initializer("headers")
                    .build(),
            ).addSuperinterface(responseInterface)
            .build(),
    )
    return builder.build()
}

private fun responseDecoderType(
    operation: OperationDeclaration,
    clientType: ClassName,
    codecsType: ClassName,
    names: OperationMethodNames,
): TypeSpec {
    val responseTypeName = requireNotNull(names.responseTypeName)
    val responseInterface = clientType.nestedClass(responseTypeName)
    val decoderName = requireNotNull(names.responseDecoderName)
    val decodeFunction =
        FunSpec
            .builder("decode")
            .addModifiers(KModifier.PUBLIC, KModifier.OVERRIDE, KModifier.SUSPEND)
            .addParameter("alternative", RESPONSE_ALTERNATIVE)
            .addParameter("statusCode", INT)
            .addParameter("headers", LIST.parameterizedBy(SDK_HEADER))
            .addParameter("body", SDK_BYTE_STREAM)
            .addParameter("mediaType", STRING.copy(nullable = true))
            .returns(responseInterface)
            .addStatement("return decodeWithBody(alternative, statusCode, headers, body, mediaType).value")

    val decodeWithBodyFunction =
        FunSpec
            .builder("decodeWithBody")
            .addModifiers(KModifier.PUBLIC, KModifier.OVERRIDE, KModifier.SUSPEND)
            .addParameter("alternative", RESPONSE_ALTERNATIVE)
            .addParameter("statusCode", INT)
            .addParameter("headers", LIST.parameterizedBy(SDK_HEADER))
            .addParameter("body", SDK_BYTE_STREAM)
            .addParameter("mediaType", STRING.copy(nullable = true))
            .returns(SDK_RESPONSE_DECODE_RESULT.parameterizedBy(responseInterface))
    val decodeBody = CodeBlock.builder().add("return when {\n").indent()
    operation.responseAlternatives.forEachIndexed { index, alternative ->
        decodeBody.add("alternative.id == %S -> ", operation.responseAlternativeCodecId(index))
        decodeBody.add("%T(\n", SDK_RESPONSE_DECODE_RESULT)
        decodeBody.indent()
        decodeBody.add(
            "value = %T(\n",
            responseInterface.nestedClass(responseVariantNames(operation)[index]),
        )
        decodeBody.indent()
        decodeBody.add(
            "%L = %L,\n",
            responsePayloadPropertyName(alternative),
            responseAlternativeDecodeExpression(operation, codecsType, alternative, index),
        )
        decodeBody.add("statusCode = statusCode,\n")
        decodeBody.add("headers = headers,\n")
        decodeBody.unindent()
        decodeBody.add("),\n")
        decodeBody.add(
            "transferBody = %L,\n",
            alternative.type.isRawStream(),
        )
        decodeBody.unindent()
        decodeBody.add(")\n")
    }
    decodeBody
        .add("else -> error(%S)\n", "No generated response decoder matched the selected response alternative.")
        .unindent()
        .add("}\n")
    decodeWithBodyFunction.addCode(decodeBody.build())

    val unknownFunction =
        FunSpec
            .builder("decodeUnknown")
            .addModifiers(KModifier.PUBLIC, KModifier.OVERRIDE, KModifier.SUSPEND)
            .addParameter("statusCode", INT)
            .addParameter("headers", LIST.parameterizedBy(SDK_HEADER))
            .addParameter("body", SDK_BYTE_STREAM)
            .returns(responseInterface)
            .addStatement(
                "return %T(statusCode = statusCode, headers = headers)",
                responseInterface.nestedClass("Unknown"),
            ).build()
    return TypeSpec
        .objectBuilder(decoderName)
        .addModifiers(KModifier.PRIVATE)
        .addSuperinterface(SDK_RESPONSE_ALTERNATIVE_DECODER.parameterizedBy(responseInterface))
        .addFunction(decodeFunction.build())
        .addFunction(decodeWithBodyFunction.build())
        .addFunction(unknownFunction)
        .build()
}

private fun responseAlternativeDecodeExpression(
    operation: OperationDeclaration,
    codecsType: ClassName,
    alternative: OperationResponseAlternative,
    index: Int,
): CodeBlock =
    when {
        alternative.type.isUnit() -> {
            CodeBlock.of("Unit")
        }

        alternative.type.isRawStream() -> {
            CodeBlock.of("body")
        }

        alternative.type.requiresSerializationCodec() -> {
            val effectiveMediaType =
                alternative.mediaTypes.firstOrNull()?.let { mediaTypeValue ->
                    CodeBlock.of("mediaType ?: %S", mediaTypeValue)
                } ?: CodeBlock.of("mediaType")
            CodeBlock.of(
                "%T.%L.select(listOf(%S), %L).decode(body, %L)",
                codecsType,
                operation.responseAlternativeCodecRegistryName(index),
                operation.responseAlternativeCodecId(index),
                effectiveMediaType,
                effectiveMediaType,
            )
        }

        else -> {
            CodeBlock.of("error(%S)", "Unsupported typed response alternative codec.")
        }
    }

private fun withResponseFunction(
    operation: OperationDeclaration,
    clientType: ClassName,
    codecsType: ClassName,
    metadataPropertyName: String,
    names: OperationMethodNames,
): FunSpec {
    val responseTypeName = requireNotNull(names.responseTypeName)
    val responseInterface = clientType.nestedClass(responseTypeName)
    val requestType = operation.requestType.toTypeName()
    return FunSpec
        .builder(requireNotNull(names.withResponseName))
        .addModifiers(KModifier.PUBLIC, KModifier.SUSPEND)
        .apply {
            requestParameter(operation)?.let(::addParameter)
            operationParameterSpecs(operation, names).forEach(::addParameter)
        }.addParameter(optionsParameter())
        .returns(SDK_RESPONSE_RESULT.parameterizedBy(responseInterface))
        .addKdoc("%L", withResponseKDoc(operation))
        .addStatement(
            "return executor.executeWithResponse<%T, %T>(%T(%L, baseUri, %L, %L, %L), %T.%L, %L, options)",
            requestType,
            responseInterface,
            SDK_EXECUTION_REQUEST,
            metadataPropertyName,
            requestValue(operation),
            requestCodecIds(operation, codecsType),
            requestParametersExpression(operation, names),
            codecsType,
            "${operation.requestCodecPropertyName}Registry",
            requireNotNull(names.responseDecoderName),
        ).build()
}

private fun OperationDeclaration.responseAlternativeCodecId(index: Int): String = "$responseCodecId.alternative$index"

private fun OperationDeclaration.responseAlternativeCodecPropertyName(index: Int): String =
    "${responseCodecPropertyName}Alternative${index}Codec"

private fun OperationDeclaration.responseAlternativeCodecRegistryName(index: Int): String =
    "${responseCodecPropertyName}Alternative${index}Registry"

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
    val requestCodecSupported = operation.requestType.requiresSerializationCodec()
    val responseCodecSupported = operation.responseCodecSupported()
    val multipartRequest = operation.multipartRequestBody()

    if (requestCodecSupported) {
        codecsBuilder.addProperty(
            PropertySpec
                .builder(operation.requestCodecConstantName, STRING)
                .addModifiers(KModifier.PUBLIC, KModifier.CONST)
                .initializer("%S", operation.requestCodecId)
                .build(),
        )
        if (multipartRequest != null) {
            addMultipartRequestCodec(codecsBuilder, operation, multipartRequest, requestCodecType)
        } else {
            codecsBuilder.addProperty(
                PropertySpec
                    .builder(operation.requestCodecPropertyName, requestCodecType)
                    .addModifiers(KModifier.PRIVATE)
                    .initializer(
                        "%T(%L, %L, SdkJson)",
                        KOTLINX_SERIALIZATION_CODEC,
                        operation.requestCodecConstantName,
                        serializerExpression(operation.requestType),
                    ).build(),
            )
        }
    }
    if (responseCodecSupported) {
        codecsBuilder
            .addProperty(
                PropertySpec
                    .builder(operation.responseCodecConstantName, STRING)
                    .addModifiers(KModifier.PUBLIC, KModifier.CONST)
                    .initializer("%S", operation.responseCodecId)
                    .build(),
            ).addProperty(
                PropertySpec
                    .builder(operation.responseCodecPropertyName, responseCodecType)
                    .addModifiers(KModifier.PRIVATE)
                    .initializer(
                        "%T(%L, %L, SdkJson)",
                        KOTLINX_SERIALIZATION_CODEC,
                        operation.responseCodecConstantName,
                        serializerExpression(operation.responseType),
                    ).build(),
            )
    }
    if (typedResponseAlternativesSupported(operation)) {
        operation.responseAlternatives.forEachIndexed { index, alternative ->
            if (alternative.type.requiresSerializationCodec()) {
                val alternativeType = alternative.type.toTypeName()
                val alternativeCodecType = MEDIA_TYPE_CODEC.parameterizedBy(alternativeType)
                val alternativeRegistryType = MEDIA_TYPE_CODEC_REGISTRY.parameterizedBy(alternativeType)
                codecsBuilder
                    .addProperty(
                        PropertySpec
                            .builder(operation.responseAlternativeCodecPropertyName(index), alternativeCodecType)
                            .addModifiers(KModifier.PRIVATE)
                            .initializer(
                                "%T(%S, %L, SdkJson)",
                                KOTLINX_SERIALIZATION_CODEC,
                                operation.responseAlternativeCodecId(index),
                                serializerExpression(alternative.type),
                            ).build(),
                    ).addProperty(
                        PropertySpec
                            .builder(operation.responseAlternativeCodecRegistryName(index), alternativeRegistryType)
                            .addModifiers(KModifier.PUBLIC)
                            .initializer(
                                "%T.of(%L)",
                                MEDIA_TYPE_CODEC_REGISTRY,
                                operation.responseAlternativeCodecPropertyName(index),
                            ).build(),
                    )
            }
        }
    }
    val requestRegistryInitializer =
        if (requestCodecSupported) {
            CodeBlock.of("%T.of(%L)", MEDIA_TYPE_CODEC_REGISTRY, operation.requestCodecPropertyName)
        } else {
            CodeBlock.of("%T.of()", MEDIA_TYPE_CODEC_REGISTRY)
        }
    val responseRegistryInitializer =
        if (responseCodecSupported) {
            CodeBlock.of("%T.of(%L)", MEDIA_TYPE_CODEC_REGISTRY, operation.responseCodecPropertyName)
        } else {
            CodeBlock.of("%T.of()", MEDIA_TYPE_CODEC_REGISTRY)
        }
    codecsBuilder.addProperty(
        PropertySpec
            .builder("${operation.requestCodecPropertyName}Registry", requestRegistryType)
            .addModifiers(KModifier.PUBLIC)
            .initializer(requestRegistryInitializer)
            .build(),
    )
    if (operation.hasCompatibleOrdinaryResponseShape()) {
        codecsBuilder.addProperty(
            PropertySpec
                .builder("${operation.responseCodecPropertyName}Registry", responseRegistryType)
                .addModifiers(KModifier.PUBLIC)
                .initializer(responseRegistryInitializer)
                .build(),
        )
    }
}

private fun OperationDeclaration.multipartRequestBody(): OperationRequestBodyAlternative? =
    requestBodyAlternatives.firstOrNull { alternative -> alternative.multipartParts.isNotEmpty() }

private fun EmissionContext.addMultipartRequestCodec(
    codecsBuilder: TypeSpec.Builder,
    operation: OperationDeclaration,
    multipart: OperationRequestBodyAlternative,
    requestCodecType: TypeName,
) {
    val codecObjectName = operation.multipartCodecObjectName()
    val codecObject =
        TypeSpec
            .objectBuilder(codecObjectName)
            .addSuperinterface(MEDIA_TYPE_CODEC.parameterizedBy(operation.requestType.toTypeName()))
            .addProperty(
                PropertySpec
                    .builder("id", STRING)
                    .addModifiers(KModifier.OVERRIDE)
                    .initializer("%S", operation.requestCodecId)
                    .build(),
            ).addProperty(
                PropertySpec
                    .builder("mediaTypes", SET.parameterizedBy(STRING))
                    .addModifiers(KModifier.OVERRIDE)
                    .initializer("setOf(%S)", multipart.mediaType)
                    .build(),
            ).addFunction(multipartEncodeFunction(operation, multipart))
            .addFunction(multipartDecodeFunction(operation))
            .build()
    codecsBuilder
        .addType(codecObject)
        .addProperty(
            PropertySpec
                .builder(operation.requestCodecPropertyName, requestCodecType)
                .addModifiers(KModifier.PRIVATE)
                .initializer("%L", codecObjectName)
                .build(),
        )
}

private fun OperationDeclaration.multipartCodecObjectName(): String =
    operationId.replaceFirstChar(Char::uppercaseChar) + "MultipartCodec"

private fun EmissionContext.multipartEncodeFunction(
    operation: OperationDeclaration,
    multipart: OperationRequestBodyAlternative,
): FunSpec {
    val body = CodeBlock.builder()
    body.addStatement("val request = requireNotNull(value)")
    body.addStatement("val multipart = %T()", MULTIPART_BODY)
    multipart.multipartParts.forEach { part ->
        val propertyName = part.propertyName
        if (part.required) {
            val expression =
                if (part.type.nullable) {
                    CodeBlock.of("requireNotNull(request.%L)", propertyName)
                } else {
                    CodeBlock.of("request.%L", propertyName)
                }
            addMultipartPart(body, part, expression)
        } else {
            body.beginControlFlow("request.%L?.let", propertyName)
            addMultipartPart(body, part, CodeBlock.of("it"))
            body.endControlFlow()
        }
    }
    body.addStatement("return multipart.build()")
    return FunSpec
        .builder("encode")
        .addModifiers(KModifier.OVERRIDE, KModifier.SUSPEND)
        .addParameter("value", operation.requestType.toTypeName())
        .addParameter("mediaType", STRING)
        .returns(SDK_REQUEST_BODY)
        .addCode(body.build())
        .build()
}

private fun EmissionContext.addMultipartPart(
    body: CodeBlock.Builder,
    part: MultipartPartDeclaration,
    expression: CodeBlock,
) {
    val headers = multipartHeaders(part)
    when {
        part.type.isRawStream() -> {
            body.addStatement(
                "multipart.binary(name = %S, stream = %L, mediaType = %S, headers = %L)",
                part.name,
                expression,
                part.contentType,
                headers,
            )
        }

        part.type.isString() -> {
            body.addStatement(
                "multipart.text(name = %S, value = %L, mediaType = %S, headers = %L)",
                part.name,
                expression,
                part.contentType,
                headers,
            )
        }

        else -> {
            body.addStatement(
                "multipart.bytes(name = %S, value = SdkJson.encodeToString(%L).encodeToByteArray(), " +
                    "mediaType = %S, headers = %L)",
                part.name,
                expression,
                part.contentType,
                headers,
            )
        }
    }
}

private fun multipartHeaders(part: MultipartPartDeclaration): CodeBlock {
    val result = CodeBlock.builder().add("listOf(")
    part.headers.toSortedMap().forEach { (name, value) ->
        result.add("%T(name = %S, value = %S), ", SDK_HEADER, name, value.headerValue())
    }
    return result.add(")").build()
}

private fun EmissionContext.multipartDecodeFunction(operation: OperationDeclaration): FunSpec =
    FunSpec
        .builder("decode")
        .addModifiers(KModifier.OVERRIDE, KModifier.SUSPEND)
        .addParameter("body", SDK_BYTE_STREAM)
        .addParameter("mediaType", STRING.copy(nullable = true))
        .returns(operation.requestType.toTypeName())
        .addStatement("error(%S)", "Multipart request codecs do not decode response bodies.")
        .build()

private fun JsonValue.headerValue(): String =
    when (this) {
        JsonValue.Null -> {
            "null"
        }

        is JsonValue.BooleanValue -> {
            value.toString()
        }

        is JsonValue.NumberValue -> {
            lexicalValue
        }

        is JsonValue.StringValue -> {
            value
        }

        is JsonValue.ArrayValue -> {
            values.joinToString(prefix = "[", postfix = "]") { it.headerValue() }
        }

        is JsonValue.ObjectValue -> {
            properties
                .toSortedMap()
                .entries
                .joinToString(prefix = "{", postfix = "}") { (name, value) -> "\"$name\":${value.headerValue()}" }
        }
    }

private fun EmissionContext.serializerExpression(type: KotlinTypeRef): CodeBlock {
    val nonNullable = type.copy(nullable = false)
    val expression = CodeBlock.builder()
    when {
        nonNullable.packageName == "kotlin.collections" && nonNullable.simpleName == "List" -> {
            val element =
                requireNotNull(nonNullable.arguments.singleOrNull()) {
                    "List serializer requires one element type"
                }
            expression.add("%M(%L)", LIST_SERIALIZER, serializerExpression(element))
        }

        nonNullable.packageName == "kotlin.collections" && nonNullable.simpleName == "Map" -> {
            val key = requireNotNull(nonNullable.arguments.getOrNull(0)) { "Map serializer requires a key type" }
            val value = requireNotNull(nonNullable.arguments.getOrNull(1)) { "Map serializer requires a value type" }
            expression.add("%M(%L, %L)", MAP_SERIALIZER, serializerExpression(key), serializerExpression(value))
        }

        nonNullable.packageName == "kotlin" &&
            nonNullable.simpleName in
            setOf("Boolean", "Byte", "Char", "Double", "Float", "Int", "Long", "Short", "String") -> {
            expression.add("%T.%M()", nonNullable.toTypeName(), BUILTIN_SERIALIZER)
        }

        "${nonNullable.packageName}.${nonNullable.simpleName}" in customSerializerTypes -> {
            expression.add(
                "%T",
                ClassName(nonNullable.packageName, nonNullable.simpleName).nestedClass("Serializer"),
            )
        }

        else -> {
            if (nonNullable.packageName == generatedPackage) {
                expression.add(
                    "%T",
                    ClassName(nonNullable.packageName, nonNullable.simpleName).nestedClass("Serializer"),
                )
            } else {
                expression.add("%T.serializer()", nonNullable.toTypeName())
            }
        }
    }
    if (type.nullable) expression.add(".%M", NULLABLE_SERIALIZER)
    return expression.build()
}

private fun operationMetadata(operation: OperationDeclaration): CodeBlock {
    val requestMediaTypes = operation.requestMediaTypesForEmission()
    val responseMediaTypes = operation.responseMediaTypesForEmission()
    return CodeBlock
        .builder()
        .add("%T(\n", OPERATION_METADATA)
        .indent()
        .add("operationId = %S,\n", operation.operationIdentity)
        .add("method = %S,\n", operation.method)
        .add("path = %S,\n", operation.path)
        .add("requestMediaTypes = %L,\n", mediaTypesExpression(requestMediaTypes))
        .add("responseMediaTypes = %L,\n", mediaTypesExpression(responseMediaTypes))
        .add("successStatusCodes = setOf(%L),\n", operation.successStatusCodes.sorted().joinToString())
        .add("responseMode = %T.%L,\n", SDK_RESPONSE_MODE, operation.responseMode.runtimeName())
        .add(
            "deadlines = %T(%L, %L, %L),\n",
            SDK_DEADLINES,
            operation.deadlines.totalMillis.kotlinLongLiteral(),
            operation.deadlines.attemptMillis.kotlinLongLiteral(),
            operation.deadlines.idleMillis.kotlinLongLiteral(),
        ).add("responseAlternatives = %L,\n", responseAlternativesExpression(operation))
        .add("security = %L,\n", securityExpression(operation))
        .add(
            "safety = %T(safe = %L, idempotent = %L),\n",
            OPERATION_SAFETY,
            operation.safety.safe,
            operation.safety.idempotent,
        ).add("idempotency = %L,\n", idempotencyExpression(operation))
        .add("retry = %L,\n", retryExpression(operation.retry))
        .add("pagination = %L,\n", paginationExpression(operation))
        .add("streaming = %L,\n", streamingExpression(operation))
        .unindent()
        .add(")")
        .build()
}

private fun mediaTypesExpression(mediaTypes: List<String>): CodeBlock {
    if (mediaTypes.isEmpty()) return CodeBlock.of("emptyList()")
    val values = CodeBlock.builder().add("listOf(")
    mediaTypes.forEachIndexed { index, value ->
        if (index > 0) values.add(", ")
        values.add("%S", value)
    }
    return values.add(")").build()
}

private fun responseAlternativesExpression(operation: OperationDeclaration): CodeBlock {
    if (operation.responseAlternatives.isEmpty()) return CodeBlock.of("emptyList()")
    val result = CodeBlock.builder().add("listOf(\n").indent()
    operation.responseAlternatives.forEachIndexed { index, alternative ->
        result.add("%T(\n", RESPONSE_ALTERNATIVE).indent()
        result.add("selector = %L,\n", responseSelectorExpression(alternative.selector))
        result.add("mediaTypes = %L,\n", mediaTypesExpression(alternative.mediaTypes))
        result.add("typeTag = %S,\n", alternative.type.simpleName)
        result.add("mode = %T.%L,\n", SDK_RESPONSE_MODE, alternative.mode.runtimeName())
        result.add("id = %S,\n", operation.responseAlternativeCodecId(index))
        result.unindent().add("),\n")
    }
    return result.unindent().add(")").build()
}

private fun responseSelectorExpression(selector: ResponseSelectorDeclaration): CodeBlock =
    when (selector) {
        is ResponseSelectorDeclaration.ExactStatus -> {
            CodeBlock.of("%T.ExactStatus(code = %L)", RESPONSE_SELECTOR, selector.code)
        }

        is ResponseSelectorDeclaration.StatusRange -> {
            CodeBlock.of(
                "%T.StatusRange(firstInclusive = %L, lastInclusive = %L)",
                RESPONSE_SELECTOR,
                selector.firstInclusive,
                selector.lastInclusive,
            )
        }

        ResponseSelectorDeclaration.Default -> {
            CodeBlock.of("%T.Default", RESPONSE_SELECTOR)
        }
    }

private fun securityExpression(operation: OperationDeclaration): CodeBlock {
    if (operation.security.isEmpty()) return CodeBlock.of("emptyList()")
    val result = CodeBlock.builder().add("listOf(\n").indent()
    operation.security.forEach { requirement ->
        if (requirement.schemes.isEmpty()) {
            result.add("%T(schemes = emptyList()),\n", SECURITY_REQUIREMENT)
        } else {
            result.add("%T(schemes = listOf(\n", SECURITY_REQUIREMENT).indent()
            requirement.schemes.forEach { scheme ->
                result.add(
                    "%T(schemeId = %S, scopes = %L),\n",
                    SECURITY_SCHEME_REF,
                    scheme.schemeId,
                    mediaTypesExpression(scheme.scopes),
                )
            }
            result.unindent().add(")),\n")
        }
    }
    return result.unindent().add(")").build()
}

private fun idempotencyExpression(operation: OperationDeclaration): CodeBlock =
    operation.idempotency?.let { descriptor ->
        CodeBlock.of(
            "%T(keyHeader = %S, clientGenerated = %L)",
            IDEMPOTENCY_DESCRIPTOR,
            descriptor.keyHeader,
            descriptor.clientGenerated,
        )
    } ?: CodeBlock.of("null")

private fun retryExpression(retry: RetryDeclaration): CodeBlock {
    val result = CodeBlock.builder().add("%T(\n", RETRY_DESCRIPTOR).indent()
    result.add("retryableStatusCodes = %L,\n", selectorsExpression(retry.retryableStatusCodes))
    result.add("retryConnectionErrors = %L,\n", retry.retryConnectionErrors)
    result.add("maxAttempts = %L,\n", retry.maxAttempts?.toString() ?: "null")
    result.add("backoff = %L,\n", backoffExpression(retry))
    return result.unindent().add(")").build()
}

private fun selectorsExpression(selectors: List<ResponseSelectorDeclaration>): CodeBlock {
    if (selectors.isEmpty()) return CodeBlock.of("emptyList()")
    val result = CodeBlock.builder().add("listOf(")
    selectors.forEachIndexed { index, selector ->
        if (index > 0) result.add(", ")
        result.add("%L", responseSelectorExpression(selector))
    }
    return result.add(")").build()
}

private fun backoffExpression(retry: RetryDeclaration): CodeBlock =
    retry.backoff?.let { backoff ->
        CodeBlock.of(
            "%T(baseDelayMillis = %L, multiplier = %L, maxDelayMillis = %L)",
            BACKOFF_HINTS,
            backoff.baseDelayMillis.kotlinLongLiteral(),
            backoff.multiplier,
            backoff.maxDelayMillis.kotlinLongLiteral(),
        )
    } ?: CodeBlock.of("null")

private fun paginationExpression(operation: OperationDeclaration): CodeBlock =
    when (val pagination = operation.pagination) {
        null -> {
            CodeBlock.of("null")
        }

        is PaginationDeclaration.CursorToken -> {
            CodeBlock
                .builder()
                .add(
                    "%T.CursorToken(requestCursorParam = %S, requestLimitParam = %L, ",
                    PAGINATION_DESCRIPTOR,
                    pagination.requestCursorParam,
                    nullableStringExpression(pagination.requestLimitParam),
                ).add(
                    "responseItemsPath = %T(%S), responseNextCursorPath = %T(%S))",
                    PROPERTY_PATH,
                    pagination.responseItemsPath,
                    PROPERTY_PATH,
                    pagination.responseNextCursorPath,
                ).build()
        }
    }

private fun streamingExpression(operation: OperationDeclaration): CodeBlock =
    when (val streaming = operation.streaming) {
        null -> {
            CodeBlock.of("null")
        }

        is StreamingDeclaration.ServerSentEvents -> {
            CodeBlock
                .builder()
                .add(
                    "%T.ServerSentEvents(terminalSentinel = %L, inBandError = null, " +
                        "requestFlag = %L, responseContentType = %S)",
                    STREAMING_DESCRIPTOR,
                    nullableStringExpression(streaming.terminalSentinel),
                    nullableStringExpression(streaming.requestFlag),
                    streaming.responseContentType,
                ).build()
        }
    }

private fun nullableStringExpression(value: String?): CodeBlock =
    value?.let { CodeBlock.of("%S", it) } ?: CodeBlock.of("null")

private fun OperationResponseMode.runtimeName(): String =
    when (this) {
        OperationResponseMode.BUFFERED -> "BUFFERED"
        OperationResponseMode.STREAMING -> "STREAMING"
        OperationResponseMode.MIXED -> error("Mixed response modes must be diagnosed before emission")
    }

private fun EmissionContext.operationFunction(
    operation: OperationDeclaration,
    codecsType: ClassName,
    metadataPropertyName: String,
    names: OperationMethodNames,
): FunSpec =
    when {
        operation.pagination != null -> {
            paginatedOperationFunction(operation, metadataPropertyName, names)
        }

        operation.responseMode == OperationResponseMode.STREAMING -> {
            streamingOperationFunction(operation, codecsType, metadataPropertyName, names)
        }

        else -> {
            bufferedOperationFunction(operation, codecsType, metadataPropertyName, names)
        }
    }

private fun EmissionContext.bufferedOperationFunction(
    operation: OperationDeclaration,
    codecsType: ClassName,
    metadataPropertyName: String,
    names: OperationMethodNames,
): FunSpec {
    val requestType = operation.requestType.toTypeName()
    val responseType = operation.responseType.toTypeName()
    val function =
        FunSpec
            .builder(names.operationName)
            .addModifiers(KModifier.PUBLIC, KModifier.SUSPEND)
            .apply {
                requestParameter(operation)?.let(::addParameter)
                operationParameterSpecs(operation, names).forEach(::addParameter)
            }.addParameter(optionsParameter())
            .returns(responseType)
            .addKdoc("%L", bufferedKDoc(operation))
    when {
        operation.responseType.isUnit() -> {
            function.addStatement(
                "return executor.executeBodyless<%T>(%T(%L, baseUri, %L, %L, %L), %T.%L, options)",
                requestType,
                SDK_EXECUTION_REQUEST,
                metadataPropertyName,
                requestValue(operation),
                requestCodecIds(operation, codecsType),
                requestParametersExpression(operation, names),
                codecsType,
                "${operation.requestCodecPropertyName}Registry",
            )
        }

        operation.responseType.isRawStream() -> {
            function.addStatement(
                "return executor.executeRaw<%T>(%T(%L, baseUri, %L, %L, %L), %T.%L, options)",
                requestType,
                SDK_EXECUTION_REQUEST,
                metadataPropertyName,
                requestValue(operation),
                requestCodecIds(operation, codecsType),
                requestParametersExpression(operation, names),
                codecsType,
                "${operation.requestCodecPropertyName}Registry",
            )
        }

        else -> {
            function.addStatement(
                "return executor.execute<%T, %T>(%T(%L, baseUri, %L, %L, %L), %L, %T.%L, %T.%L, options)",
                requestType,
                responseType,
                SDK_EXECUTION_REQUEST,
                metadataPropertyName,
                requestValue(operation),
                requestCodecIds(operation, codecsType),
                requestParametersExpression(operation, names),
                responseCodecIds(operation, codecsType),
                codecsType,
                "${operation.requestCodecPropertyName}Registry",
                codecsType,
                "${operation.responseCodecPropertyName}Registry",
            )
        }
    }
    return function.build()
}

private fun EmissionContext.streamingOperationFunction(
    operation: OperationDeclaration,
    codecsType: ClassName,
    metadataPropertyName: String,
    names: OperationMethodNames,
): FunSpec {
    require(operation.streaming is StreamingDeclaration.ServerSentEvents) {
        "Streaming emission requires a declared ServerSentEvents descriptor."
    }
    val requestType = operation.requestType.toTypeName()
    val responseType = operation.responseType.toTypeName()
    val returnElementType = if (operation.responseType.isSseEvent()) SSE_EVENT else responseType
    val function =
        FunSpec
            .builder(names.operationName)
            .addModifiers(KModifier.PUBLIC)
            .apply {
                requestParameter(operation)?.let(::addParameter)
                operationParameterSpecs(operation, names).forEach(::addParameter)
            }.addParameter(optionsParameter())
            .returns(FLOW.parameterizedBy(returnElementType))
            .addKdoc("%L", streamingKDoc(operation))
    val body = CodeBlock.builder()
    body.add("return %M(\n", SSE_FLOW).indent()
    body.add("streamProvider = {\n").indent()
    body.add(
        "executor.executeRaw<%T>(%T(%L, baseUri, %L, %L, %L), %T.%L, options)\n",
        requestType,
        SDK_EXECUTION_REQUEST,
        metadataPropertyName,
        requestValue(operation),
        requestCodecIds(operation, codecsType),
        requestParametersExpression(operation, names),
        codecsType,
        "${operation.requestCodecPropertyName}Registry",
    )
    body.unindent().add("},\n")
    body.add(
        "descriptor = requireNotNull(%L.streaming as? %T.ServerSentEvents),\n",
        metadataPropertyName,
        STREAMING_DESCRIPTOR,
    )
    body.unindent().add(")")
    if (!operation.responseType.isSseEvent()) {
        body.add(
            ".%M { data -> SdkJson.decodeFromString(%L, data) }",
            DECODE_DATA,
            serializerExpression(operation.responseType),
        )
    }
    body.add("\n")
    function.addCode(body.build())
    return function.build()
}

private fun EmissionContext.paginatedOperationFunction(
    operation: OperationDeclaration,
    metadataPropertyName: String,
    names: OperationMethodNames,
): FunSpec {
    val pagination = requireNotNull(operation.pagination as? PaginationDeclaration.CursorToken)
    val responseType = operation.responseType.toTypeName()
    val itemType = pagination.itemType.toTypeNameOrAny()
    val pageType = PAGE.parameterizedBy(responseType, itemType)
    val function =
        FunSpec
            .builder(names.operationName)
            .addModifiers(KModifier.PUBLIC, KModifier.SUSPEND)
            .apply {
                requestParameter(operation)?.let(::addParameter)
                operationParameterSpecs(operation, names).forEach(::addParameter)
            }.addParameter(optionsParameter())
            .returns(pageType)
            .addKdoc(
                "%L\n\n@param options Execution options, including pagination " +
                    "bounds.\n@return The first decoded page.\n",
                sanitizeKDoc(operation.methodKdoc),
            )
    function.addStatement("val engine = %L", paginationEngineExpression(metadataPropertyName, responseType, itemType))
    function.addStatement(
        "return engine.firstPage { pageRequest -> %L(%L, pageRequest, options) }",
        requireNotNull(names.fetchPageName),
        pageFetchArguments(operation, names),
    )
    return function.build()
}

private fun EmissionContext.paginationPagesFunction(
    operation: OperationDeclaration,
    metadataPropertyName: String,
    names: OperationMethodNames,
): FunSpec {
    val pagination = requireNotNull(operation.pagination as? PaginationDeclaration.CursorToken)
    val responseType = operation.responseType.toTypeName()
    val itemType = pagination.itemType.toTypeNameOrAny()
    val returnType = FLOW.parameterizedBy(PAGE.parameterizedBy(responseType, itemType))
    return FunSpec
        .builder(requireNotNull(names.pagesName))
        .addModifiers(KModifier.PUBLIC)
        .apply {
            requestParameter(operation)?.let(::addParameter)
            operationParameterSpecs(operation, names).forEach(::addParameter)
        }.addParameter(optionsParameter())
        .returns(returnType)
        .addKdoc(
            "%L",
            "Returns a cold page flow for ${sanitizeKDoc(operation.operationIdentity)}.\n\n" +
                "@param options Execution options, including pagination bounds.\n",
        ).addStatement(
            "return %L.pages(fetch = { pageRequest -> %L(%L, pageRequest, options) }, pagination = options.pagination)",
            paginationEngineExpression(metadataPropertyName, responseType, itemType),
            requireNotNull(names.fetchPageName),
            pageFetchArguments(operation, names),
        ).build()
}

private fun EmissionContext.paginationItemsFunction(
    operation: OperationDeclaration,
    metadataPropertyName: String,
    names: OperationMethodNames,
): FunSpec {
    val pagination = requireNotNull(operation.pagination as? PaginationDeclaration.CursorToken)
    val responseType = operation.responseType.toTypeName()
    val itemType = pagination.itemType.toTypeNameOrAny()
    return FunSpec
        .builder(requireNotNull(names.itemsName))
        .addModifiers(KModifier.PUBLIC)
        .apply {
            requestParameter(operation)?.let(::addParameter)
            operationParameterSpecs(operation, names).forEach(::addParameter)
        }.addParameter(optionsParameter())
        .returns(FLOW.parameterizedBy(itemType))
        .addKdoc(
            "%L",
            "Returns a cold item flow for ${sanitizeKDoc(operation.operationIdentity)}.\n\n" +
                "@param options Execution options, including pagination bounds.\n",
        ).addStatement(
            "return %L.items(fetch = { pageRequest -> %L(%L, pageRequest, options) }, pagination = options.pagination)",
            paginationEngineExpression(metadataPropertyName, responseType, itemType),
            requireNotNull(names.fetchPageName),
            pageFetchArguments(operation, names),
        ).build()
}

private fun EmissionContext.pageMetadataFunction(
    operation: OperationDeclaration,
    metadataPropertyName: String,
    names: OperationMethodNames,
): FunSpec =
    FunSpec
        .builder(requireNotNull(names.pageMetadataName))
        .addModifiers(KModifier.PRIVATE)
        .addParameter("pageRequest", PAGE_REQUEST)
        .apply { operationParameterSpecs(operation, names).forEach(::addParameter) }
        .returns(OPERATION_METADATA)
        .addStatement("return %L", metadataPropertyName)
        .build()

private fun EmissionContext.pageFetcherFunction(
    operation: OperationDeclaration,
    codecsType: ClassName,
    names: OperationMethodNames,
): FunSpec {
    val pagination = requireNotNull(operation.pagination as? PaginationDeclaration.CursorToken)
    val requestType = operation.requestType.toTypeName()
    val responseType = operation.responseType.toTypeName()
    val itemType = pagination.itemType.toTypeNameOrAny()
    val function =
        FunSpec
            .builder(requireNotNull(names.fetchPageName))
            .addModifiers(KModifier.PRIVATE, KModifier.SUSPEND)
            .addParameter("request", requestType)
            .apply { operationParameterSpecs(operation, names).forEach(::addParameter) }
            .addParameter("pageRequest", PAGE_REQUEST)
            .addParameter("options", CALL_OPTIONS)
            .returns(PAGE_ENVELOPE.parameterizedBy(responseType, itemType))
    val body = CodeBlock.builder()
    body.add("val pageRequestValue = when (pageRequest) {\n").indent()
    body.add("%T.First -> request\n", PAGE_REQUEST)
    body.add("is %T.NextCursor -> request\n", PAGE_REQUEST)
    body.add("is %T.NextOffset -> request\n", PAGE_REQUEST)
    body.add("is %T.NextPage -> request\n", PAGE_REQUEST)
    body.add("is %T.NextUrl -> request\n", PAGE_REQUEST)
    body.add("is %T.NextToken -> request\n", PAGE_REQUEST)
    body.unindent().add("}\n")
    body.add(
        "val pageMetadata = %L(%L)\n",
        requireNotNull(names.pageMetadataName),
        pageMetadataArguments(operation, names),
    )
    body.add(
        "val response = executor.execute<%T, %T>(%T(pageMetadata, baseUri, pageRequestValue, %L, %L), " +
            "%L, %T.%L, %T.%L, options)\n",
        requestType,
        responseType,
        SDK_EXECUTION_REQUEST,
        requestCodecIds(operation, codecsType),
        pageRequestParametersExpression(operation, names),
        responseCodecIds(operation, codecsType),
        codecsType,
        "${operation.requestCodecPropertyName}Registry",
        codecsType,
        "${operation.responseCodecPropertyName}Registry",
    )
    body.add(
        "return %T(value = response, items = %L.orEmpty(), nextCursor = %L)\n",
        PAGE_ENVELOPE,
        responsePathExpression("response", pagination.responseItemsPath),
        responsePathExpression("response", pagination.responseNextCursorPath),
    )
    function.addCode(body.build())
    return function.build()
}

private fun paginationEngineExpression(
    metadataPropertyName: String,
    responseType: TypeName,
    itemType: TypeName,
): CodeBlock =
    CodeBlock
        .builder()
        .add("%T<%T, %T>(\n", PAGINATION_ENGINE, responseType, itemType)
        .indent()
        .add(
            "descriptor = requireNotNull(%L.pagination as? %T.CursorToken),\n",
            metadataPropertyName,
            PAGINATION_DESCRIPTOR,
        ).add("operationId = %L.operationId,\n", metadataPropertyName)
        .unindent()
        .add(")")
        .build()

private fun responsePathExpression(
    root: String,
    path: String,
): CodeBlock {
    val expression = CodeBlock.builder().add(root)
    path.split('.').filter(String::isNotEmpty).forEach { segment ->
        expression.add(".%L", KotlinNameResolver.memberName(segment))
    }
    return expression.build()
}

private fun requestParametersExpression(
    operation: OperationDeclaration,
    names: OperationMethodNames,
): CodeBlock = parameterListExpression(operation, names, pageRequestAware = false)

private fun pageRequestParametersExpression(
    operation: OperationDeclaration,
    names: OperationMethodNames,
): CodeBlock = parameterListExpression(operation, names, pageRequestAware = true)

private fun parameterListExpression(
    operation: OperationDeclaration,
    names: OperationMethodNames,
    pageRequestAware: Boolean,
): CodeBlock {
    val pagination = operation.pagination as? PaginationDeclaration.CursorToken
    if (operation.parameters.isEmpty()) return CodeBlock.of("emptyList()")
    val result = CodeBlock.builder()
    if (pageRequestAware && pagination != null && names.cursorParameterName != null) {
        result.add("run {\n").indent()
        result.add("val effectiveCursor = when (pageRequest) {\n").indent()
        result.add("%T.First -> %L\n", PAGE_REQUEST, names.cursorParameterName)
        result.add("is %T.NextCursor -> pageRequest.cursor\n", PAGE_REQUEST)
        result.add("is %T.NextOffset -> %L\n", PAGE_REQUEST, names.cursorParameterName)
        result.add("is %T.NextPage -> %L\n", PAGE_REQUEST, names.cursorParameterName)
        result.add("is %T.NextUrl -> %L\n", PAGE_REQUEST, names.cursorParameterName)
        result.add("is %T.NextToken -> %L\n", PAGE_REQUEST, names.cursorParameterName)
        result.unindent().add("}\n")
    }
    result.add("buildList {\n").indent()
    operation.parameters.forEach { parameter ->
        val parameterName = requireNotNull(names.parameterNames[parameter])
        val valueExpression =
            if (pageRequestAware && pagination?.requestCursorParam == parameter.name &&
                names.cursorParameterName != null
            ) {
                CodeBlock.of("effectiveCursor?.let { listOf(it.toString()) }.orEmpty()")
            } else {
                parameterValuesExpression(parameter, parameterName)
            }
        result.add(
            "add(%T(location = %T.%L, name = %S, values = %L))\n",
            SDK_REQUEST_PARAMETER,
            SDK_PARAMETER_LOCATION,
            parameter.location.name,
            parameter.name,
            valueExpression,
        )
    }
    result.unindent().add("}")
    if (pageRequestAware && pagination != null && names.cursorParameterName != null) {
        result.unindent().add("\n}")
    }
    return result.build()
}

private fun parameterValuesExpression(
    parameter: OperationParameterDeclaration,
    parameterName: String,
): CodeBlock =
    if (parameter.type.isRepeatedParameter()) {
        if (parameter.type.nullable) {
            CodeBlock.of("%L?.map { it.toString() }.orEmpty()", parameterName)
        } else {
            CodeBlock.of("%L.map { it.toString() }", parameterName)
        }
    } else if (parameter.required && !parameter.type.nullable) {
        CodeBlock.of("listOf(%L.toString())", parameterName)
    } else {
        CodeBlock.of("%L?.let { listOf(it.toString()) }.orEmpty()", parameterName)
    }

private fun KotlinTypeRef.isRepeatedParameter(): Boolean =
    packageName == "kotlin.collections" && simpleName in setOf("List", "Set")

private fun pageFetchArguments(
    operation: OperationDeclaration,
    names: OperationMethodNames,
): CodeBlock {
    val arguments = CodeBlock.builder().add("%L", requestValue(operation))
    operation.parameters.forEach { parameter ->
        arguments.add(", %L", requireNotNull(names.parameterNames[parameter]))
    }
    return arguments.build()
}

private fun pageMetadataArguments(
    operation: OperationDeclaration,
    names: OperationMethodNames,
): CodeBlock {
    val arguments = CodeBlock.builder().add("pageRequest")
    operation.parameters.forEach { parameter ->
        arguments.add(", %L", requireNotNull(names.parameterNames[parameter]))
    }
    return arguments.build()
}

private fun requestParameter(operation: OperationDeclaration): ParameterSpec? {
    if (operation.requestType.isUnit()) return null
    return ParameterSpec
        .builder("request", operation.requestType.toTypeName())
        .apply {
            if (!operation.requestBodyRequired && operation.requestBodyAlternatives.isNotEmpty()) {
                defaultValue("null")
            }
        }.build()
}

private fun optionsParameter(): ParameterSpec =
    ParameterSpec
        .builder("options", CALL_OPTIONS)
        .defaultValue("%T()", CALL_OPTIONS)
        .build()

private fun requestValue(operation: OperationDeclaration): CodeBlock =
    if (operation.requestType.isUnit()) CodeBlock.of("Unit") else CodeBlock.of("request")

private fun requestCodecIds(
    operation: OperationDeclaration,
    codecsType: ClassName,
): CodeBlock =
    if (operation.requestType.requiresSerializationCodec()) {
        CodeBlock.of("listOf(%T.%L)", codecsType, operation.requestCodecConstantName)
    } else {
        CodeBlock.of("emptyList()")
    }

private fun responseCodecIds(
    operation: OperationDeclaration,
    codecsType: ClassName,
): CodeBlock =
    if (operation.responseCodecSupported()) {
        CodeBlock.of("listOf(%T.%L)", codecsType, operation.responseCodecConstantName)
    } else {
        CodeBlock.of("emptyList()")
    }

private fun withResponseKDoc(operation: OperationDeclaration): String =
    buildString {
        append(sanitizeKDoc(operation.methodKdoc))
        append("\n\n")
        if (!operation.hasCompatibleOrdinaryResponseShape()) {
            append(
                "No unified convenience method is generated because response alternatives decode to " +
                    "different Kotlin types; use this typed result instead.\n\n",
            )
        }
        append(
            "Returns the selected exact, range, default, or unknown response alternative without converting " +
                "non-success statuses into success values.\n",
        )
    }

private fun bufferedKDoc(operation: OperationDeclaration): String =
    buildString {
        append(sanitizeKDoc(operation.methodKdoc))
        append("\n\n")
        if (!operation.requestType.isUnit()) append("@param request Request body sent to the operation.\n")
        append("@param options Execution options.\n")
        append(
            when {
                operation.responseType.isUnit() -> "@return No response body.\n"
                operation.responseType.isRawStream() -> "@return Response body stream.\n"
                else -> "@return Buffered response body.\n"
            },
        )
        append("@throws SdkApiException When the service returns a non-success response.\n")
        append("@throws SdkSerializationException When a request or response cannot be serialized.\n")
        append("@throws SdkTransportException When transport execution fails.\n")
    }

private fun streamingKDoc(operation: OperationDeclaration): String =
    buildString {
        append(sanitizeKDoc(operation.methodKdoc))
        append("\n\n")
        if (!operation.requestType.isUnit()) append("@param request Request body sent to the operation.\n")
        append("@param options Execution options.\n")
        append("@return A cold flow decoded by the declared streaming descriptor.\n")
        append("@throws SdkApiException When the service returns a non-success response.\n")
        append("@throws SdkSerializationException When a request or stream item cannot be decoded.\n")
        append("@throws SdkStreamingException When the stream framing or declared in-band error fails.\n")
    }

private fun OperationDeclaration.metadataPropertyName(
    isSingleOperation: Boolean,
    operationName: String,
): String = if (isSingleOperation) "metadata" else "${operationName}Metadata"

private fun OperationDeclaration.requestMediaTypesForEmission(): List<String> =
    if (requestType.isUnit()) emptyList() else requestMediaTypes

private fun OperationDeclaration.responseMediaTypesForEmission(): List<String> = responseMediaTypes

private fun OperationDeclaration.responseCodecSupported(): Boolean =
    hasCompatibleOrdinaryResponseShape() &&
        responseMode != OperationResponseMode.STREAMING &&
        responseType.requiresSerializationCodec()

private fun KotlinTypeRef.requiresSerializationCodec(): Boolean = !isUnit() && !isRawStream()

private fun KotlinTypeRef.isUnit(): Boolean = packageName == "kotlin" && simpleName == "Unit"

private fun KotlinTypeRef.isRawStream(): Boolean =
    packageName == "com.nabobery.sdkgen.runtime" && simpleName == "SdkByteStream"

private fun KotlinTypeRef.isSseEvent(): Boolean =
    packageName == "com.nabobery.sdkgen.runtime.streaming" && simpleName == "SseEvent"

private fun KotlinTypeRef.isString(): Boolean = packageName == "kotlin" && simpleName == "String"

private fun KotlinTypeRef?.toTypeNameOrAny(): TypeName =
    this?.toTypeName() ?: ClassName("kotlin", "Any").copy(nullable = true)

private fun Long?.kotlinLongLiteral(): String =
    this
        ?.toString()
        ?.reversed()
        ?.chunked(3)
        ?.joinToString("_")
        ?.reversed() ?: "null"
