package com.nabobery.sdkgen.engine.emit

import com.nabobery.sdkgen.engine.declarations.DeepObjectAdditionalPropertiesSerialization
import com.nabobery.sdkgen.engine.declarations.FormFieldDeclaration
import com.nabobery.sdkgen.engine.declarations.FormScalarKind
import com.nabobery.sdkgen.engine.declarations.FormValueDeclaration
import com.nabobery.sdkgen.engine.declarations.FormWireKind
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
import com.nabobery.sdkgen.engine.declarations.ParameterSerialization
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
    if (declaration.subClients.isNotEmpty()) {
        file.addType(operationClientFacade(declaration))
        return
    }
    val clientType = ClassName(declaration.packageName, declaration.resolvedName)
    val codecsType = ClassName(declaration.packageName, declaration.codecsObjectName)
    file.addType(codecsObject(declaration, codecsType))

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
    if (declaration.operations.any { it.pagination is PaginationDeclaration.HeaderNextUrl }) {
        clientBuilder.addProperty(
            PropertySpec
                .builder("paginationTrustedHosts", TRUSTED_HOSTS)
                .addModifiers(KModifier.PRIVATE)
                .initializer("trustedHosts ?: %T.of(baseUri)", TRUSTED_HOSTS)
                .build(),
        )
    }
    val companionBuilder = TypeSpec.companionObjectBuilder()
    declaration.operations.forEach { operation ->
        val names = methodNames.getValue(operation)
        val metadataPropertyName =
            operation.metadataPropertyName(
                useGenericName = singleOperation != null && !declaration.preserveOperationMetadataNames,
                operationName = names.operationName,
            )
        val ordinaryResponseSupported = operation.hasCompatibleOrdinaryResponseShape()
        if (ordinaryResponseSupported) {
            clientBuilder.addFunction(operationFunction(operation, clientType, codecsType, metadataPropertyName, names))
        }
        if (names.responseTypeName != null) {
            names.errorTypeName?.let { clientBuilder.addType(responseErrorType(operation, it)) }
            clientBuilder.addType(responseResultType(operation, clientType, names))
            names.apiExceptionTypeName?.let {
                clientBuilder.addType(typedApiExceptionType(operation, clientType, names))
            }
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
                .addModifiers(KModifier.INTERNAL)
                .delegate(
                    "lazy(%T.PUBLICATION) { %L }",
                    LAZY_THREAD_SAFETY_MODE,
                    operationMetadata(operation),
                ).build(),
        )
        if (operation.responseMode == OperationResponseMode.MIXED) {
            val streamMetadataPropertyName = "${metadataPropertyName}Stream"
            companionBuilder.addProperty(
                PropertySpec
                    .builder(streamMetadataPropertyName, OPERATION_METADATA)
                    .addModifiers(KModifier.INTERNAL)
                    .delegate(
                        "lazy(%T.PUBLICATION) { %L }",
                        LAZY_THREAD_SAFETY_MODE,
                        mixedStreamMetadata(operation),
                    ).build(),
            )
            clientBuilder.addFunction(
                mixedStreamOperationFunction(operation, clientType, codecsType, streamMetadataPropertyName, names),
            )
        }
    }
    clientBuilder.addType(companionBuilder.build())
    file.addType(clientBuilder.build())
}

/**
 * Emits the root client facade for a partitioned SDK (task T3): the same public class name and constructor
 * signature the monolithic client used to have, but with zero operations of its own — instead exposing each
 * per-tag/resource sub-client as a lazily-initialized property (e.g. `client.chat.send(...)`). Auth/config/
 * transport wiring is unchanged and still flows through this single construction point into every sub-client.
 */
private fun operationClientFacade(declaration: OperationClientDeclaration): TypeSpec {
    val facadeType = ClassName(declaration.packageName, declaration.resolvedName)
    val builder =
        TypeSpec
            .classBuilder(facadeType)
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
    declaration.subClients.forEach { subClient ->
        val subClientType = ClassName(subClient.packageName, subClient.className)
        builder.addProperty(
            PropertySpec
                .builder(subClient.accessorName, subClientType)
                .addModifiers(KModifier.PUBLIC)
                .addKdoc("%L\n", sanitizeKDoc(subClient.kdoc))
                .delegate(
                    "lazy(%T.PUBLICATION) {\n⇥%T(transport, baseUri, credentialProviders, trustedHosts, authentication)\n⇤}",
                    LAZY_THREAD_SAFETY_MODE,
                    subClientType,
                ).build(),
        )
    }
    return builder.build()
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
    val errorTypeName: String? = null,
    val apiExceptionTypeName: String? = null,
    val withResponseName: String? = null,
    val responseDecoderName: String? = null,
    val parameterNames: Map<OperationParameterDeclaration, String> = emptyMap(),
    val cursorParameterName: String? = null,
    val limitParameterName: String? = null,
    /** `<operationName>Stream`, collision-allocated; populated only for [OperationResponseMode.MIXED] operations. */
    val streamName: String? = null,
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
        val errorTypeName =
            if (responseTypeName != null && operation.hasCompatibleOrdinaryResponseShape() &&
                operation.hasTypedErrorAlternatives()
            ) {
                uniqueMemberName(
                    "${current.operationName.replaceFirstChar(Char::uppercaseChar)}Error",
                    used,
                )
            } else {
                null
            }
        val apiExceptionTypeName =
            errorTypeName?.let {
                uniqueMemberName(
                    "${current.operationName.replaceFirstChar(Char::uppercaseChar)}ApiException",
                    used,
                )
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
                errorTypeName = errorTypeName,
                apiExceptionTypeName = apiExceptionTypeName,
                withResponseName =
                    responseTypeName?.let { uniqueMemberName("${current.operationName}WithResponse", used) },
                responseDecoderName =
                    responseTypeName?.let { uniqueMemberName("${it}Decoder", used) },
                streamName =
                    if (operation.responseMode == OperationResponseMode.MIXED) {
                        uniqueMemberName("${current.operationName}Stream", used)
                    } else {
                        null
                    },
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

/**
 * Whether the typed exhaustive `fooWithResponse()` API is generated. `operation.responseAlternatives` already
 * excludes a MIXED operation's streaming success alternative (see [OperationDeclaration.streamResponseType]'s
 * KDoc), so it is always a purely buffered union here regardless of whether [OperationDeclaration.responseMode] is
 * `BUFFERED` or `MIXED` — `fooWithResponse()` stays buffered-exhaustive per the approved API shape.
 */
private fun typedResponseAlternativesSupported(operation: OperationDeclaration): Boolean =
    operation.responseAlternatives.isNotEmpty() &&
        operation.responseMode != OperationResponseMode.STREAMING &&
        operation.responseAlternatives.all { alternative -> alternative.mode == OperationResponseMode.BUFFERED }

private fun OperationDeclaration.hasTypedErrorAlternatives(): Boolean =
    typedResponseAlternativesSupported(this) && responseAlternatives.any { it.mayMatchNonSuccess(this) }

private fun OperationResponseAlternative.mayMatchNonSuccess(operation: OperationDeclaration): Boolean =
    when (val responseSelector = selector) {
        is ResponseSelectorDeclaration.ExactStatus -> {
            responseSelector.code !in 200..299 && responseSelector.code !in operation.successStatusCodes
        }

        is ResponseSelectorDeclaration.StatusRange -> {
            responseSelector.firstInclusive < 200 || responseSelector.lastInclusive > 299
        }

        ResponseSelectorDeclaration.Default -> {
            true
        }
    }

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

private fun responseErrorType(
    operation: OperationDeclaration,
    errorTypeName: String,
): TypeSpec =
    TypeSpec
        .interfaceBuilder(errorTypeName)
        .addModifiers(KModifier.PUBLIC, KModifier.SEALED)
        .addKdoc(
            "Decoded non-success response alternatives that `%L` may expose through its typed API exception.\n",
            operation.operationIdentity,
        ).build()

private fun typedApiExceptionType(
    operation: OperationDeclaration,
    clientType: ClassName,
    names: OperationMethodNames,
): TypeSpec {
    val errorType = clientType.nestedClass(requireNotNull(names.errorTypeName))
    return TypeSpec
        .classBuilder(requireNotNull(names.apiExceptionTypeName))
        .addModifiers(KModifier.PUBLIC)
        .addKdoc(
            "Raised by `%L` after decoding a declared non-success response. [error] is typed and is not included " +
                "in the exception message or diagnostic rendering.\n",
            operation.operationIdentity,
        ).primaryConstructor(
            FunSpec
                .constructorBuilder()
                .addParameter("error", errorType)
                .addParameter("statusCode", INT)
                .addParameter("headers", LIST.parameterizedBy(SDK_HEADER))
                .build(),
        ).superclass(SDK_API_EXCEPTION)
        .addSuperclassConstructorParameter("statusCode")
        .addSuperclassConstructorParameter("headers")
        .addSuperclassConstructorParameter("%S", operation.operationIdentity)
        .addProperty(
            PropertySpec
                .builder("error", errorType)
                .addModifiers(KModifier.PUBLIC)
                .initializer("error")
                .build(),
        ).build()
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
        val variant =
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
        names.errorTypeName
            ?.takeIf { alternative.mayMatchNonSuccess(operation) }
            ?.let { variant.addSuperinterface(clientType.nestedClass(it)) }
        builder.addType(variant.build())
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
        .addKdoc("%L", withResponseKDoc(operation, names))
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

/**
 * The maximum number of stored (non-`const`) properties one codecs initializer may hold.
 *
 * Every non-`const` property of a Kotlin `object` is assigned in that object's `<clinit>`, and the JVM caps a
 * single method's bytecode at 65535 bytes (JVMS §4.9.1). A codecs object holding every operation in a client
 * therefore has a hard ceiling on client size — one this generator crossed on the Stripe corpus at 519
 * operations, where `V1Codecs.<clinit>` failed to compile with "Method too large".
 *
 * Above this many stored properties the codecs object moves them into nested partition objects, each with its
 * own `<clinit>`, and re-exposes the internal ones as forwarding accessors. See ADR-0015.
 *
 * **The bound is on properties, not operations.** One operation emits an unbounded number of stored properties
 * — two per typed response alternative — so an operation-count bound would not bound initializer size at all.
 * Each individual assignment is a constructor call with a handful of arguments, on the order of 30 bytes, so
 * bounding the count does bound the initializer. The measured failure was ~3,116 assignments; 400 leaves
 * roughly a five-fold margin.
 *
 * One residual case is not structurally bounded: a *single* operation declaring more than this many stored
 * properties cannot be split, because the private codec an internal registry wraps must stay its sibling. That
 * needs on the order of two thousand response alternatives on one operation, and no corpus approaches it.
 */
private const val CODEC_PARTITION_STORED_PROPERTIES = 400

/** One operation's emitted codec members, split by where each part has to live. */
private class OperationCodecMembers(
    val outerMembers: TypeSpec,
    val storedProperties: List<PropertySpec>,
)

/**
 * Builds the codecs object for [declaration], partitioning its stored properties when they would otherwise
 * risk the JVM `<clinit>` limit described on [CODEC_PARTITION_STORED_PROPERTIES].
 */
private fun EmissionContext.codecsObject(
    declaration: OperationClientDeclaration,
    codecsType: ClassName,
): TypeSpec {
    val builder = TypeSpec.objectBuilder(codecsType).addModifiers(KModifier.INTERNAL)
    // Emit once unpartitioned to measure. Below the bound this is also the final output, so small clients are
    // byte-for-byte unaffected by partitioning existing at all.
    val flat = declaration.operations.map { operation -> operationCodecMembers(operation, outerOwner = null) }
    if (flat.sumOf { members -> members.storedProperties.size } <= CODEC_PARTITION_STORED_PROPERTIES) {
        declaration.operations.forEach { operation -> addOperationCodecs(builder, builder, operation, null) }
        return builder.build()
    }

    // Re-emit with references qualified, since a partition can no longer see the outer object's members as
    // siblings, and group operations so no partition exceeds the bound. An operation is never split.
    val partitions = mutableListOf<MutableList<OperationCodecMembers>>()
    var storedInCurrent = 0
    declaration.operations.forEach { operation ->
        val members = operationCodecMembers(operation, outerOwner = codecsType)
        val overflows = storedInCurrent + members.storedProperties.size > CODEC_PARTITION_STORED_PROPERTIES
        if (partitions.isEmpty() || overflows) {
            partitions += mutableListOf<OperationCodecMembers>()
            storedInCurrent = 0
        }
        partitions.last() += members
        storedInCurrent += members.storedProperties.size
    }

    partitions.forEachIndexed { index, members ->
        val partitionName = "Partition$index"
        val partition = TypeSpec.objectBuilder(partitionName).addModifiers(KModifier.PRIVATE)
        members.forEach { operation ->
            // `const val` costs no `<clinit>` bytecode, and nested `object` declarations initialize lazily in
            // their own `<clinit>`, so both stay on the outer object where callers can still reach them.
            operation.outerMembers.propertySpecs.forEach(builder::addProperty)
            operation.outerMembers.typeSpecs.forEach(builder::addType)
            operation.storedProperties.forEach(partition::addProperty)
        }
        builder.addType(partition.build())
        members
            .flatMap(OperationCodecMembers::storedProperties)
            .filter { property -> KModifier.INTERNAL in property.modifiers }
            .forEach { property ->
                builder.addProperty(
                    PropertySpec
                        .builder(property.name, property.type)
                        .addModifiers(KModifier.INTERNAL)
                        .getter(
                            FunSpec
                                .getterBuilder()
                                .addStatement("return %L.%N", partitionName, property)
                                .build(),
                        ).build(),
                )
            }
    }
    return builder.build()
}

/** Emits one operation's codecs into scratch builders so they can be measured and placed. */
private fun EmissionContext.operationCodecMembers(
    operation: OperationDeclaration,
    outerOwner: ClassName?,
): OperationCodecMembers {
    val outer = TypeSpec.objectBuilder("Scratch")
    val stored = TypeSpec.objectBuilder("Scratch")
    addOperationCodecs(outer, stored, operation, outerOwner)
    return OperationCodecMembers(outer.build(), stored.build().propertySpecs)
}

/**
 * Adds one operation's codecs. [outerBuilder] receives the parts that must stay on the codecs object itself —
 * the `const val` codec identifiers and the nested form/multipart codec objects, all internal protocol glue
 * that costs no `<clinit>` bytecode. [membersBuilder] receives the stored properties. They are
 * the same builder unless the codecs object is partitioned. [outerOwner] qualifies references from a partition
 * back to [outerBuilder]'s members, and is null when the two are the same object.
 */
private fun EmissionContext.addOperationCodecs(
    outerBuilder: TypeSpec.Builder,
    codecsBuilder: TypeSpec.Builder,
    operation: OperationDeclaration,
    outerOwner: ClassName?,
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
    val formRequest = operation.formRequestBody()

    fun outerReference(name: String): CodeBlock =
        if (outerOwner == null) CodeBlock.of("%L", name) else CodeBlock.of("%T.%L", outerOwner, name)

    if (requestCodecSupported) {
        outerBuilder.addProperty(
            PropertySpec
                .builder(operation.requestCodecConstantName, STRING)
                .addModifiers(KModifier.INTERNAL, KModifier.CONST)
                .initializer("%S", operation.requestCodecId)
                .build(),
        )
        if (formRequest != null) {
            addFormRequestCodec(outerBuilder, codecsBuilder, operation, formRequest, requestCodecType, ::outerReference)
        } else if (multipartRequest != null) {
            addMultipartRequestCodec(
                outerBuilder,
                codecsBuilder,
                operation,
                multipartRequest,
                requestCodecType,
                ::outerReference,
            )
        } else {
            codecsBuilder.addProperty(
                PropertySpec
                    .builder(operation.requestCodecPropertyName, requestCodecType)
                    .addModifiers(KModifier.PRIVATE)
                    .initializer(
                        "%T(%L, %L, %M)",
                        KOTLINX_SERIALIZATION_CODEC,
                        outerReference(operation.requestCodecConstantName),
                        serializerExpression(operation.requestType),
                        sdkJson,
                    ).build(),
            )
        }
    }
    if (responseCodecSupported) {
        outerBuilder.addProperty(
            PropertySpec
                .builder(operation.responseCodecConstantName, STRING)
                .addModifiers(KModifier.INTERNAL, KModifier.CONST)
                .initializer("%S", operation.responseCodecId)
                .build(),
        )
        codecsBuilder.addProperty(
            PropertySpec
                .builder(operation.responseCodecPropertyName, responseCodecType)
                .addModifiers(KModifier.PRIVATE)
                .initializer(
                    "%T(%L, %L, %M)",
                    KOTLINX_SERIALIZATION_CODEC,
                    outerReference(operation.responseCodecConstantName),
                    serializerExpression(operation.responseType),
                    sdkJson,
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
                                "%T(%S, %L, %M)",
                                KOTLINX_SERIALIZATION_CODEC,
                                operation.responseAlternativeCodecId(index),
                                serializerExpression(alternative.type),
                                sdkJson,
                            ).build(),
                    ).addProperty(
                        PropertySpec
                            .builder(operation.responseAlternativeCodecRegistryName(index), alternativeRegistryType)
                            .addModifiers(KModifier.INTERNAL)
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
            .addModifiers(KModifier.INTERNAL)
            .initializer(requestRegistryInitializer)
            .build(),
    )
    if (operation.hasCompatibleOrdinaryResponseShape()) {
        codecsBuilder.addProperty(
            PropertySpec
                .builder("${operation.responseCodecPropertyName}Registry", responseRegistryType)
                .addModifiers(KModifier.INTERNAL)
                .initializer(responseRegistryInitializer)
                .build(),
        )
    }
}

private fun OperationDeclaration.formRequestBody(): OperationRequestBodyAlternative? =
    requestBodyAlternatives.firstOrNull { alternative ->
        alternative.mediaType.equals("application/x-www-form-urlencoded", ignoreCase = true)
    }

private fun OperationDeclaration.multipartRequestBody(): OperationRequestBodyAlternative? =
    requestBodyAlternatives.firstOrNull { alternative -> alternative.multipartParts.isNotEmpty() }

private fun EmissionContext.addFormRequestCodec(
    outerBuilder: TypeSpec.Builder,
    codecsBuilder: TypeSpec.Builder,
    operation: OperationDeclaration,
    form: OperationRequestBodyAlternative,
    requestCodecType: TypeName,
    outerReference: (String) -> CodeBlock,
) {
    val codecObjectName = operation.formCodecObjectName()
    val codecObject =
        TypeSpec
            .objectBuilder(codecObjectName)
            .addModifiers(KModifier.INTERNAL)
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
                    .initializer("setOf(%S)", form.mediaType)
                    .build(),
            ).addFunction(formEncodeFunction(operation, form))
            .addFunction(formDecodeFunction(operation))
            .build()
    outerBuilder.addType(codecObject)
    codecsBuilder.addProperty(
        PropertySpec
            .builder(operation.requestCodecPropertyName, requestCodecType)
            .addModifiers(KModifier.PRIVATE)
            .initializer("%L", outerReference(codecObjectName))
            .build(),
    )
}

private fun OperationDeclaration.formCodecObjectName(): String =
    operationId.replaceFirstChar(Char::uppercaseChar) + "FormCodec"

private fun EmissionContext.formEncodeFunction(
    operation: OperationDeclaration,
    form: OperationRequestBodyAlternative,
): FunSpec {
    val body = CodeBlock.builder()
    body.addStatement("val request = requireNotNull(value)")
    body.addStatement("val form = %T()", FORM_URL_ENCODED_BODY)
    form.formFields.forEach { field ->
        addFormField(body, field, CodeBlock.of("request"), CodeBlock.of("%S", field.wireName), 0)
    }
    body.addStatement("return form.build()")
    return FunSpec
        .builder("encode")
        .addModifiers(KModifier.OVERRIDE, KModifier.SUSPEND)
        .addParameter("value", operation.requestType.toTypeName())
        .addParameter("mediaType", STRING)
        .returns(SDK_REQUEST_BODY)
        .addCode(body.build())
        .build()
}

private fun EmissionContext.addFormField(
    body: CodeBlock.Builder,
    field: FormFieldDeclaration,
    parent: CodeBlock,
    key: CodeBlock,
    depth: Int,
) {
    val expression = CodeBlock.of("%L.%L", parent, field.accessorName)
    if (field.required) {
        addFormValue(body, field.value, expression, key, depth)
    } else {
        val valueName = "formValue$depth"
        body.beginControlFlow("%L?.let { %L ->", expression, valueName)
        addFormValue(body, field.value, CodeBlock.of("%L", valueName), key, depth + 1)
        body.endControlFlow()
    }
}

private fun EmissionContext.addFormValue(
    body: CodeBlock.Builder,
    value: FormValueDeclaration,
    expression: CodeBlock,
    key: CodeBlock,
    depth: Int,
    mapValuesAreJsonElements: Boolean = false,
) {
    when (value) {
        is FormValueDeclaration.Scalar -> {
            val wireValue =
                when (value.kind) {
                    FormScalarKind.STRING -> {
                        expression
                    }

                    FormScalarKind.OPEN_ENUM -> {
                        CodeBlock.of("%L.value", expression)
                    }

                    FormScalarKind.NUMBER -> {
                        expression
                    }

                    FormScalarKind.INTEGER, FormScalarKind.BOOLEAN -> {
                        CodeBlock.of("%L.toString()", expression)
                    }
                }
            body.addStatement("form.add(%L, %L)", key, wireValue)
        }

        is FormValueDeclaration.Array -> {
            val indexName = "formIndex$depth"
            val elementName = "formElement$depth"
            body.beginControlFlow("if (%L.isEmpty())", expression)
            body.addStatement("form.add(%L, %S)", key, "")
            body.nextControlFlow("else")
            body.beginControlFlow("%L.forEachIndexed { %L, %L ->", expression, indexName, elementName)
            addFormValue(
                body,
                value.element,
                CodeBlock.of("%L", elementName),
                CodeBlock.of("%L + %S + %L + %S", key, "[", indexName, "]"),
                depth + 1,
            )
            body.endControlFlow()
            body.endControlFlow()
        }

        is FormValueDeclaration.Map -> {
            val segmentName = "formKey$depth"
            val mapValueName = "formMapValue$depth"
            body.beginControlFlow("%L.forEach { (%L, %L) ->", expression, segmentName, mapValueName)
            val mapKey = CodeBlock.of("%L + %S + %L + %S", key, "[", segmentName, "]")
            if (value.valuesAreJsonElements || mapValuesAreJsonElements) {
                val primitiveName = "formPrimitive$depth"
                body.addStatement(
                    "val %L = %L as? %T ?: error(%S)",
                    primitiveName,
                    mapValueName,
                    JSON_PRIMITIVE,
                    "Form map values encoded from a raw JSON object must be JSON primitives",
                )
                body.addStatement("form.add(%L, %L.content)", mapKey, primitiveName)
            } else {
                addFormValue(
                    body,
                    value.value,
                    CodeBlock.of("%L", mapValueName),
                    mapKey,
                    depth + 1,
                )
            }
            body.endControlFlow()
        }

        is FormValueDeclaration.Union -> {
            body.addStatement(
                "require(%L.matchedBranches.size == 1) { %S }",
                expression,
                "Form union value must match exactly one wire-kind branch",
            )
            body.beginControlFlow("when")
            value.branches.forEach { branch ->
                body.beginControlFlow("%L.%L != null ->", expression, branch.accessorName)
                addFormValue(
                    body,
                    branch.value,
                    CodeBlock.of("requireNotNull(%L.%L)", expression, branch.accessorName),
                    key,
                    depth + 1,
                    mapValuesAreJsonElements =
                        branch.kind == FormWireKind.OBJECT && branch.value is FormValueDeclaration.Map,
                )
                body.endControlFlow()
            }
            body.beginControlFlow("else ->")
            body.addStatement("error(%S)", "Form union value has no selected branch")
            body.endControlFlow()
            body.endControlFlow()
        }

        is FormValueDeclaration.Object -> {
            value.fields.forEach { field ->
                addFormField(
                    body,
                    field,
                    expression,
                    CodeBlock.of("%L + %S", key, "[${field.wireName}]"),
                    depth + 1,
                )
            }
        }
    }
}

private fun EmissionContext.formDecodeFunction(operation: OperationDeclaration): FunSpec =
    FunSpec
        .builder("decode")
        .addModifiers(KModifier.OVERRIDE, KModifier.SUSPEND)
        .addParameter("body", SDK_BYTE_STREAM)
        .addParameter("mediaType", STRING.copy(nullable = true))
        .returns(operation.requestType.toTypeName())
        .addStatement("error(%S)", "Form request codecs do not decode response bodies.")
        .build()

private fun EmissionContext.addMultipartRequestCodec(
    outerBuilder: TypeSpec.Builder,
    codecsBuilder: TypeSpec.Builder,
    operation: OperationDeclaration,
    multipart: OperationRequestBodyAlternative,
    requestCodecType: TypeName,
    outerReference: (String) -> CodeBlock,
) {
    val codecObjectName = operation.multipartCodecObjectName()
    val codecObject =
        TypeSpec
            .objectBuilder(codecObjectName)
            .addModifiers(KModifier.INTERNAL)
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
    outerBuilder.addType(codecObject)
    codecsBuilder.addProperty(
        PropertySpec
            .builder(operation.requestCodecPropertyName, requestCodecType)
            .addModifiers(KModifier.PRIVATE)
            .initializer("%L", outerReference(codecObjectName))
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
        val accessorName = part.accessorName
        if (part.required) {
            val expression =
                if (part.type.nullable) {
                    CodeBlock.of("requireNotNull(request.%L)", accessorName)
                } else {
                    CodeBlock.of("request.%L", accessorName)
                }
            if (part.indexedElements) {
                addIndexedMultipartTextParts(body, part, expression)
            } else {
                addMultipartPart(body, part, part.type, expression)
            }
        } else {
            body.beginControlFlow("request.%L?.let", accessorName)
            if (part.indexedElements) {
                addIndexedMultipartTextParts(body, part, CodeBlock.of("it"))
            } else {
                addMultipartPart(body, part, part.type, CodeBlock.of("it"))
            }
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

private fun EmissionContext.addIndexedMultipartTextParts(
    body: CodeBlock.Builder,
    part: MultipartPartDeclaration,
    expression: CodeBlock,
) {
    val headers = multipartHeaders(part)
    body.beginControlFlow("if (%L.isEmpty())", expression)
    body.addStatement(
        "multipart.text(name = %S, value = %S, mediaType = %S, headers = %L)",
        part.wireName,
        "",
        part.contentType,
        headers,
    )
    body.nextControlFlow("else")
    body.beginControlFlow("%L.forEachIndexed { index, element ->", expression)
    body.addStatement(
        "multipart.text(name = %S + %S + index + %S, value = element, mediaType = %S, headers = %L)",
        part.wireName,
        "[",
        "]",
        part.contentType,
        headers,
    )
    body.endControlFlow()
    body.endControlFlow()
}

private fun EmissionContext.addMultipartPart(
    body: CodeBlock.Builder,
    part: MultipartPartDeclaration,
    valueType: KotlinTypeRef,
    expression: CodeBlock,
) {
    val headers = multipartHeaders(part)
    when {
        valueType.isRawStream() -> {
            body.addStatement(
                "multipart.binary(name = %S, stream = %L, mediaType = %S, headers = %L)",
                part.wireName,
                expression,
                part.contentType,
                headers,
            )
        }

        valueType.isString() -> {
            body.addStatement(
                "multipart.text(name = %S, value = %L, mediaType = %S, headers = %L)",
                part.wireName,
                expression,
                part.contentType,
                headers,
            )
        }

        else -> {
            body.addStatement(
                "multipart.bytes(name = %S, value = %M.encodeToString(%L).encodeToByteArray(), " +
                    "mediaType = %S, headers = %L)",
                part.wireName,
                sdkJson,
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

        else -> {
            when (customSerializerTypes["${nonNullable.packageName}.${nonNullable.simpleName}"]) {
                SerializerPlacement.NESTED -> {
                    expression.add(
                        "%T",
                        ClassName(nonNullable.packageName, nonNullable.simpleName).nestedClass("Serializer"),
                    )
                }

                SerializerPlacement.TOP_LEVEL -> {
                    expression.add("%T", ClassName(nonNullable.packageName, "${nonNullable.simpleName}Serializer"))
                }

                null -> {
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
        }
    }
    if (type.nullable) expression.add(".%M", NULLABLE_SERIALIZER)
    return expression.build()
}

private fun operationMetadata(operation: OperationDeclaration): CodeBlock =
    operationMetadata(
        operation,
        // A MIXED operation's own foo()/fooWithResponse() metadata always executes as an ordinary BUFFERED call —
        // see mixedStreamMetadata for the dedicated STREAMING metadata fooStream() uses instead.
        runtimeResponseModeName =
            if (operation.responseMode == OperationResponseMode.MIXED) {
                "BUFFERED"
            } else {
                operation.responseMode.runtimeName()
            },
        totalDeadlineMillis = operation.deadlines.totalMillis,
        retryConnectionErrors = operation.retry.retryConnectionErrors,
    )

/**
 * The dedicated [com.nabobery.sdkgen.runtime.OperationMetadata] for a [OperationResponseMode.MIXED] operation's
 * `fooStream()` entry point: identical request/response shape metadata to [operationMetadata], but with its own
 * `responseMode = STREAMING`, no total deadline, and no connection-error retry — matching the policy a
 * `STREAMING`-only operation of the same shape would get, since `foo()`'s buffered metadata (which stays
 * `BUFFERED`, keeps its total deadline, and keeps its retry policy) must not be shared with the streaming call.
 */
private fun mixedStreamMetadata(operation: OperationDeclaration): CodeBlock =
    operationMetadata(
        operation,
        runtimeResponseModeName = "STREAMING",
        totalDeadlineMillis = null,
        retryConnectionErrors = false,
    )

private fun operationMetadata(
    operation: OperationDeclaration,
    runtimeResponseModeName: String,
    totalDeadlineMillis: Long?,
    retryConnectionErrors: Boolean,
): CodeBlock {
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
        .add("responseMode = %T.%L,\n", SDK_RESPONSE_MODE, runtimeResponseModeName)
        .add(
            "deadlines = %T(%L, %L, %L),\n",
            SDK_DEADLINES,
            totalDeadlineMillis.kotlinLongLiteral(),
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
        .add(
            "retry = %L,\n",
            retryExpression(
                RetryDeclaration(
                    retryableStatusCodes = operation.retry.retryableStatusCodes,
                    retryConnectionErrors = retryConnectionErrors,
                    maxAttempts = operation.retry.maxAttempts,
                    backoff = operation.retry.backoff,
                ),
            ),
        ).add("pagination = %L,\n", paginationExpression(operation))
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

        is PaginationDeclaration.HeaderNextUrl -> {
            CodeBlock.of(
                "%T.HeaderNextUrl(responseItemsPath = %T(%S))",
                PAGINATION_DESCRIPTOR,
                PROPERTY_PATH,
                pagination.responseItemsPath,
            )
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

/**
 * The runtime [com.nabobery.sdkgen.runtime.SdkResponseMode] name for one physical call's expected response shape.
 * [OperationResponseMode.MIXED] has no runtime equivalent by itself — a MIXED operation's buffered and streaming
 * entry points each execute as an ordinary [OperationResponseMode.BUFFERED] or [OperationResponseMode.STREAMING]
 * call respectively, against their own dedicated [com.nabobery.sdkgen.runtime.OperationMetadata] (see
 * [mixedStreamMetadata]) — so this is never asked to render `MIXED` itself.
 */
private fun OperationResponseMode.runtimeName(): String =
    when (this) {
        OperationResponseMode.BUFFERED -> "BUFFERED"
        OperationResponseMode.STREAMING -> "STREAMING"
        OperationResponseMode.MIXED -> error("Mixed response modes must be diagnosed before emission")
    }

private fun EmissionContext.operationFunction(
    operation: OperationDeclaration,
    clientType: ClassName,
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
            bufferedOperationFunction(operation, clientType, codecsType, metadataPropertyName, names)
        }
    }

private fun EmissionContext.bufferedOperationFunction(
    operation: OperationDeclaration,
    clientType: ClassName,
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
            .addKdoc("%L", bufferedKDoc(operation, names))
    if (names.apiExceptionTypeName != null) {
        function.addCode(typedErrorExecutionCode(operation, clientType, codecsType, metadataPropertyName, names))
        return function.build()
    }
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

private fun typedErrorExecutionCode(
    operation: OperationDeclaration,
    clientType: ClassName,
    codecsType: ClassName,
    metadataPropertyName: String,
    names: OperationMethodNames,
): CodeBlock {
    val requestType = operation.requestType.toTypeName()
    val responseType = operation.responseType.toTypeName()
    val responseInterface = clientType.nestedClass(requireNotNull(names.responseTypeName))
    val apiExceptionType = clientType.nestedClass(requireNotNull(names.apiExceptionTypeName))
    val variants = responseVariantNames(operation)
    return CodeBlock
        .builder()
        .add("return executor.executeWithTypedErrors<%T, %T, %T>(\n", requestType, responseInterface, responseType)
        .indent()
        .add(
            "request = %T(%L, baseUri, %L, %L, %L),\n",
            SDK_EXECUTION_REQUEST,
            metadataPropertyName,
            requestValue(operation),
            requestCodecIds(operation, codecsType),
            requestParametersExpression(operation, names),
        ).add("requestCodecs = %T.%L,\n", codecsType, "${operation.requestCodecPropertyName}Registry")
        .add("responseDecoder = %L,\n", requireNotNull(names.responseDecoderName))
        .add("mapSuccess = { response ->\n")
        .indent()
        .add("when (response) {\n")
        .indent()
        .apply {
            operation.responseAlternatives.forEachIndexed { index, alternative ->
                add("is %T -> ", responseInterface.nestedClass(variants[index]))
                if (alternative.type == operation.responseType) {
                    add("response.%L\n", responsePayloadPropertyName(alternative))
                } else {
                    add("error(%S)\n", "Runtime selected a non-success response for success mapping.")
                }
            }
            add(
                "is %T -> error(%S)\n",
                responseInterface.nestedClass("Unknown"),
                "Runtime returned an unmatched response through the typed success path.",
            )
        }.unindent()
        .add("}\n")
        .unindent()
        .add("},\n")
        .add("mapError = { response, statusCode, headers ->\n")
        .indent()
        .add("when (response) {\n")
        .indent()
        .apply {
            operation.responseAlternatives.forEachIndexed { index, alternative ->
                add("is %T -> ", responseInterface.nestedClass(variants[index]))
                if (alternative.mayMatchNonSuccess(operation)) {
                    add("%T(response, statusCode, headers)\n", apiExceptionType)
                } else {
                    add("error(%S)\n", "Runtime selected a success response for error mapping.")
                }
            }
            add(
                "is %T -> error(%S)\n",
                responseInterface.nestedClass("Unknown"),
                "Runtime returned an unmatched response through the typed error path.",
            )
        }.unindent()
        .add("}\n")
        .unindent()
        .add("},\n")
        .add("options = options,\n")
        .unindent()
        .add(")\n")
        .build()
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
    return sseFlowFunction(
        operation = operation,
        codecsType = codecsType,
        metadataPropertyName = metadataPropertyName,
        functionName = names.operationName,
        elementType = operation.responseType,
        names = names,
        kdoc = streamingKDoc(operation, names),
    )
}

/**
 * `fooStream()` for a [OperationResponseMode.MIXED] operation (approved API shape: `foo()`/`fooWithResponse()` stay
 * buffered-only; `fooStream()` is the collision-allocated, distinctly-named cold-`Flow` entry point — never an
 * overload of `foo()` by return type, since Kotlin overload resolution cannot disambiguate `suspend fun foo(): T`
 * from `fun foo(): Flow<T>` at every call site). Executes against [mixedStreamMetadata] rather than the buffered
 * `foo()`/`fooWithResponse()` metadata, so its own `STREAMING` response mode, absent total deadline, and disabled
 * connection-error retry never leak into (or get leaked into by) the buffered entry points sharing this operation.
 */
private fun EmissionContext.mixedStreamOperationFunction(
    operation: OperationDeclaration,
    clientType: ClassName,
    codecsType: ClassName,
    streamMetadataPropertyName: String,
    names: OperationMethodNames,
): FunSpec {
    require(operation.streaming is StreamingDeclaration.ServerSentEvents) {
        "Streaming emission requires a declared ServerSentEvents descriptor."
    }
    val elementType = requireNotNull(operation.streamResponseType) { "MIXED operation requires a streamResponseType" }
    return sseFlowFunction(
        operation = operation,
        clientType = clientType,
        codecsType = codecsType,
        metadataPropertyName = streamMetadataPropertyName,
        functionName = requireNotNull(names.streamName),
        elementType = elementType,
        names = names,
        kdoc = mixedStreamKDoc(operation, names, elementType),
    )
}

private fun rawTypedErrorStreamCode(
    operation: OperationDeclaration,
    clientType: ClassName,
    codecsType: ClassName,
    metadataPropertyName: String,
    names: OperationMethodNames,
): CodeBlock {
    val requestType = operation.requestType.toTypeName()
    val responseInterface = clientType.nestedClass(requireNotNull(names.responseTypeName))
    val apiExceptionType = clientType.nestedClass(requireNotNull(names.apiExceptionTypeName))
    val variants = responseVariantNames(operation)
    return CodeBlock
        .builder()
        .add("executor.executeRawWithTypedErrors<%T, %T>(\n", requestType, responseInterface)
        .indent()
        .add(
            "request = %T(%L, baseUri, %L, %L, %L),\n",
            SDK_EXECUTION_REQUEST,
            metadataPropertyName,
            requestValue(operation),
            requestCodecIds(operation, codecsType),
            requestParametersExpression(operation, names),
        ).add("requestCodecs = %T.%L,\n", codecsType, "${operation.requestCodecPropertyName}Registry")
        .add("responseDecoder = %L,\n", requireNotNull(names.responseDecoderName))
        .add("mapError = { response, statusCode, headers ->\n")
        .indent()
        .add("when (response) {\n")
        .indent()
        .apply {
            operation.responseAlternatives.forEachIndexed { index, alternative ->
                add("is %T -> ", responseInterface.nestedClass(variants[index]))
                if (alternative.mayMatchNonSuccess(operation)) {
                    add("%T(response, statusCode, headers)\n", apiExceptionType)
                } else {
                    add("error(%S)\n", "Runtime selected a success response for error mapping.")
                }
            }
            add(
                "is %T -> error(%S)\n",
                responseInterface.nestedClass("Unknown"),
                "Runtime returned an unmatched response through the typed error path.",
            )
        }.unindent()
        .add("}\n")
        .unindent()
        .add("},\n")
        .add("options = options,\n")
        .unindent()
        .add(")\n")
        .build()
}

private fun EmissionContext.sseFlowFunction(
    operation: OperationDeclaration,
    clientType: ClassName? = null,
    codecsType: ClassName,
    metadataPropertyName: String,
    functionName: String,
    elementType: KotlinTypeRef,
    names: OperationMethodNames,
    kdoc: String,
): FunSpec {
    val requestType = operation.requestType.toTypeName()
    val returnElementType = if (elementType.isSseEvent()) SSE_EVENT else elementType.toTypeName()
    val function =
        FunSpec
            .builder(functionName)
            .addModifiers(KModifier.PUBLIC)
            .apply {
                requestParameter(operation)?.let(::addParameter)
                operationParameterSpecs(operation, names).forEach(::addParameter)
            }.addParameter(optionsParameter())
            .returns(FLOW.parameterizedBy(returnElementType))
            .addKdoc("%L", kdoc)
    val body = CodeBlock.builder()
    body.add("return %M(\n", SSE_FLOW).indent()
    body.add("streamProvider = {\n").indent()
    if (operation.responseMode == OperationResponseMode.MIXED) {
        body.add(
            rawTypedErrorStreamCode(
                operation = operation,
                clientType = requireNotNull(clientType),
                codecsType = codecsType,
                metadataPropertyName = metadataPropertyName,
                names = names,
            ),
        )
    } else {
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
    }
    body.unindent().add("},\n")
    body.add(
        "descriptor = requireNotNull(%L.streaming as? %T.ServerSentEvents),\n",
        metadataPropertyName,
        STREAMING_DESCRIPTOR,
    )
    body.unindent().add(")")
    if (!elementType.isSseEvent()) {
        body.add(
            ".%M { data -> %M.decodeFromString(%L, data) }",
            DECODE_DATA,
            sdkJson,
            serializerExpression(elementType),
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
    val pagination = requireNotNull(operation.pagination)
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
    function.addStatement(
        "val engine = %L",
        paginationEngineExpression(metadataPropertyName, responseType, itemType, pagination),
    )
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
    val pagination = requireNotNull(operation.pagination)
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
                operationParameterKDoc(operation, names) +
                "@param options Execution options, including pagination bounds.\n",
        ).addStatement(
            "return %L.pages(fetch = { pageRequest -> %L(%L, pageRequest, options) }, pagination = options.pagination)",
            paginationEngineExpression(metadataPropertyName, responseType, itemType, pagination),
            requireNotNull(names.fetchPageName),
            pageFetchArguments(operation, names),
        ).build()
}

private fun EmissionContext.paginationItemsFunction(
    operation: OperationDeclaration,
    metadataPropertyName: String,
    names: OperationMethodNames,
): FunSpec {
    val pagination = requireNotNull(operation.pagination)
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
            paginationEngineExpression(metadataPropertyName, responseType, itemType, pagination),
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
    val pagination = requireNotNull(operation.pagination)
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
    when (pagination) {
        is PaginationDeclaration.CursorToken -> {
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
        }

        is PaginationDeclaration.HeaderNextUrl -> {
            body.add("val effectiveBaseUri = when (pageRequest) {\n").indent()
            body.add("is %T.NextUrl -> %M(pageRequest.url).first\n", PAGE_REQUEST, SPLIT_RESOLVED_URL)
            body.add("else -> baseUri\n")
            body.unindent().add("}\n")
            body.add("val effectivePath = when (pageRequest) {\n").indent()
            body.add("is %T.NextUrl -> %M(pageRequest.url).second\n", PAGE_REQUEST, SPLIT_RESOLVED_URL)
            body.add("else -> pageMetadata.path\n")
            body.unindent().add("}\n")
            body.add("val effectiveParameters = when (pageRequest) {\n").indent()
            body.add("is %T.NextUrl -> emptyList()\n", PAGE_REQUEST)
            body.add("else -> %L\n", requestParametersExpression(operation, names))
            body.unindent().add("}\n")
            body
                .add(
                    "val response = executor.executeWithHeaders<%T, %T>(\n",
                    requestType,
                    responseType,
                ).indent()
            body.add(
                "%T(pageMetadata.copy(path = effectivePath), effectiveBaseUri, pageRequestValue, %L, effectiveParameters),\n",
                SDK_EXECUTION_REQUEST,
                requestCodecIds(operation, codecsType),
            )
            body.add("%L,\n", responseCodecIds(operation, codecsType))
            body.add("%T.%L,\n", codecsType, "${operation.requestCodecPropertyName}Registry")
            body.add("%T.%L,\n", codecsType, "${operation.responseCodecPropertyName}Registry")
            body.add("options,\n")
            body.unindent().add(")\n")
            body.add(
                "val requestUri = %M(effectiveBaseUri, effectivePath, effectiveParameters)\n",
                BUILD_REQUEST_URI,
            )
            body
                .add(
                    "return %T(\n",
                    PAGE_ENVELOPE,
                ).indent()
            body.add("value = response.value,\n")
            body.add("items = %L.orEmpty(),\n", responsePathExpression("response.value", pagination.responseItemsPath))
            body.add("responseHeaders = response.headers,\n")
            body.add("requestUri = requestUri,\n")
            body.unindent().add(")\n")
        }
    }
    function.addCode(body.build())
    return function.build()
}

private fun paginationEngineExpression(
    metadataPropertyName: String,
    responseType: TypeName,
    itemType: TypeName,
    pagination: PaginationDeclaration,
): CodeBlock {
    val descriptorSubtype =
        when (pagination) {
            is PaginationDeclaration.CursorToken -> "CursorToken"
            is PaginationDeclaration.HeaderNextUrl -> "HeaderNextUrl"
        }
    return CodeBlock
        .builder()
        .add("%T<%T, %T>(\n", PAGINATION_ENGINE, responseType, itemType)
        .indent()
        .add(
            "descriptor = requireNotNull(%L.pagination as? %T.%L),\n",
            metadataPropertyName,
            PAGINATION_DESCRIPTOR,
            descriptorSubtype,
        ).add("operationId = %L.operationId,\n", metadataPropertyName)
        .apply {
            if (pagination is PaginationDeclaration.HeaderNextUrl) {
                add("trustedHosts = paginationTrustedHosts,\n")
            }
        }.unindent()
        .add(")")
        .build()
}

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
        when (val serialization = parameter.serialization) {
            ParameterSerialization.StripeCompatibleIndexedArray -> {
                if (parameter.required && !parameter.type.nullable) {
                    result.add("%L.forEachIndexed { index, value ->\n", parameterName)
                } else {
                    result.add("%L?.forEachIndexed { index, value ->\n", parameterName)
                }
                result
                    .indent()
                    .add(
                        "add(%T(location = %T.%L, name = %S + \"[\" + index + \"]\", values = listOf(value.toString())))\n",
                        SDK_REQUEST_PARAMETER,
                        SDK_PARAMETER_LOCATION,
                        parameter.location.name,
                        parameter.name,
                    ).unindent()
                    .add("}\n")
            }

            is ParameterSerialization.DeepObject -> {
                serialization.properties.forEach { property ->
                    result.add(
                        "add(%T(location = %T.%L, name = %S, values = %L))\n",
                        SDK_REQUEST_PARAMETER,
                        SDK_PARAMETER_LOCATION,
                        parameter.location.name,
                        "${parameter.name}[${property.wireName}]",
                        deepObjectPropertyValuesExpression(parameter, parameterName, property.accessorName),
                    )
                }
                serialization.additionalProperties?.let { additional ->
                    val mapExpression =
                        if (parameter.required && !parameter.type.nullable) {
                            "$parameterName.${additional.accessorName}"
                        } else {
                            "$parameterName?.${additional.accessorName}"
                        }
                    val requiredAdditionalProperties = parameter.required && !parameter.type.nullable
                    if (!requiredAdditionalProperties) {
                        result.add("%L?.let { dynamicProperties ->\n", mapExpression).indent()
                    }
                    val mapAccessor = if (requiredAdditionalProperties) mapExpression else "dynamicProperties"
                    result.add("%L.keys.sorted().forEach { key ->\n", mapAccessor).indent()
                    result.addStatement("val dynamicValue = %L.getValue(key)", mapAccessor)
                    when (additional.serialization) {
                        DeepObjectAdditionalPropertiesSerialization.JSON_PRIMITIVE_CONTENT -> {
                            result.addStatement(
                                "val primitive = dynamicValue as? %T ?: error(%S + key + %S)",
                                JSON_PRIMITIVE,
                                "deepObject parameter '${parameter.name}' additionalProperties entry '",
                                "' requires a primitive JSON value",
                            )
                            result.add(
                                "add(%T(location = %T.%L, name = %S + \"[\" + key + \"]\", values = listOf(primitive.content)))\n",
                                SDK_REQUEST_PARAMETER,
                                SDK_PARAMETER_LOCATION,
                                parameter.location.name,
                                parameter.name,
                            )
                        }

                        DeepObjectAdditionalPropertiesSerialization.OPEN_ENUM_VALUE -> {
                            result.add(
                                "add(%T(location = %T.%L, name = %S + \"[\" + key + \"]\", values = listOf(dynamicValue.value)))\n",
                                SDK_REQUEST_PARAMETER,
                                SDK_PARAMETER_LOCATION,
                                parameter.location.name,
                                parameter.name,
                            )
                        }

                        DeepObjectAdditionalPropertiesSerialization.TO_STRING -> {
                            result.add(
                                "add(%T(location = %T.%L, name = %S + \"[\" + key + \"]\", values = listOf(dynamicValue.toString())))\n",
                                SDK_REQUEST_PARAMETER,
                                SDK_PARAMETER_LOCATION,
                                parameter.location.name,
                                parameter.name,
                            )
                        }
                    }
                    result.unindent().add("}\n")
                    if (!requiredAdditionalProperties) {
                        result.unindent().add("}\n")
                    }
                }
            }

            ParameterSerialization.CommaJoined,
            ParameterSerialization.Repeated,
            ParameterSerialization.StripeCompatibleScalar,
            ParameterSerialization.StripeCompatibleJsonScalar,
            ParameterSerialization.PrimitiveUnion,
            -> {
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
        }
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
    if (parameter.serialization == ParameterSerialization.StripeCompatibleJsonScalar) {
        stripeCompatibleJsonScalarValuesExpression(parameter, parameterName)
    } else if (parameter.serialization == ParameterSerialization.PrimitiveUnion) {
        // Every case of a generated primitive union retains the JSON it was built from, so one projection
        // covers all branches without emitting a `when` over case names. See ADR-0016.
        if (!parameter.required || parameter.type.nullable) {
            CodeBlock.of("%L?.let { %M(it.raw) }.orEmpty()", parameterName, SDK_PRIMITIVE_UNION_PARAMETER_VALUES)
        } else {
            CodeBlock.of("%M(%L.raw)", SDK_PRIMITIVE_UNION_PARAMETER_VALUES, parameterName)
        }
    } else if (parameter.serialization == ParameterSerialization.CommaJoined) {
        if (!parameter.required || parameter.type.nullable) {
            CodeBlock.of("%L?.let { listOf(it.joinToString(\",\")) }.orEmpty()", parameterName)
        } else {
            CodeBlock.of("listOf(%L.joinToString(\",\"))", parameterName)
        }
    } else if (parameter.type.isRepeatedParameter()) {
        if (!parameter.required || parameter.type.nullable) {
            CodeBlock.of("%L?.map { it.toString() }.orEmpty()", parameterName)
        } else {
            CodeBlock.of("%L.map { it.toString() }", parameterName)
        }
    } else if (parameter.required && !parameter.type.nullable) {
        CodeBlock.of("listOf(%L.toString())", parameterName)
    } else {
        CodeBlock.of("%L?.let { listOf(it.toString()) }.orEmpty()", parameterName)
    }

private fun stripeCompatibleJsonScalarValuesExpression(
    parameter: OperationParameterDeclaration,
    parameterName: String,
): CodeBlock {
    val valueExpression =
        CodeBlock.of(
            "{ value ->\nval primitive = value.raw as? %T ?: error(%S)\nlistOf(primitive.content)\n}",
            JSON_PRIMITIVE,
            "Stripe-compatible deepObject scalar fallback requires a JSON primitive value",
        )
    return if (parameter.required && !parameter.type.nullable) {
        CodeBlock.of("%L.let %L", parameterName, valueExpression)
    } else {
        CodeBlock.of("%L?.let %L.orEmpty()", parameterName, valueExpression)
    }
}

private fun deepObjectPropertyValuesExpression(
    parameter: OperationParameterDeclaration,
    parameterName: String,
    accessorName: String,
): CodeBlock {
    val propertyExpression = "$parameterName.$accessorName"
    return if (parameter.required && !parameter.type.nullable) {
        CodeBlock.of("%L?.let { listOf(it.toString()) }.orEmpty()", propertyExpression)
    } else {
        CodeBlock.of("%L?.let { listOf(it.toString()) }.orEmpty()", "$parameterName?.$accessorName")
    }
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

private fun withResponseKDoc(
    operation: OperationDeclaration,
    names: OperationMethodNames,
): String =
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
        if (!operation.requestType.isUnit()) append("@param request Request body sent to the operation.\n")
        append(operationParameterKDoc(operation, names))
        append("@param options Execution options.\n")
    }

private fun bufferedKDoc(
    operation: OperationDeclaration,
    names: OperationMethodNames,
): String =
    buildString {
        append(sanitizeKDoc(operation.methodKdoc))
        append("\n\n")
        if (!operation.requestType.isUnit()) append("@param request Request body sent to the operation.\n")
        append(operationParameterKDoc(operation, names))
        append("@param options Execution options.\n")
        append(
            when {
                operation.responseType.isUnit() -> "@return No response body.\n"
                operation.responseType.isRawStream() -> "@return Response body stream.\n"
                else -> "@return Buffered response body.\n"
            },
        )
        names.apiExceptionTypeName?.let { exceptionTypeName ->
            append(
                "@throws $exceptionTypeName When the service returns a declared non-success response; its `error` " +
                    "property exposes the decoded ${requireNotNull(names.errorTypeName)} payload.\n",
            )
        } ?: append("@throws SdkApiException When the service returns a non-success response.\n")
        append("@throws SdkSerializationException When a request or response cannot be serialized.\n")
        append("@throws SdkTransportException When transport execution fails.\n")
    }

private fun streamingKDoc(
    operation: OperationDeclaration,
    names: OperationMethodNames,
): String =
    buildString {
        append(sanitizeKDoc(operation.methodKdoc))
        append("\n\n")
        if (!operation.requestType.isUnit()) append("@param request Request body sent to the operation.\n")
        append(operationParameterKDoc(operation, names))
        append("@param options Execution options.\n")
        append("@return A cold flow decoded by the declared streaming descriptor.\n")
        append("@throws SdkApiException When the service returns a non-success response.\n")
        append("@throws SdkSerializationException When a request or stream item cannot be decoded.\n")
        append("@throws SdkStreamingException When the stream framing or declared in-band error fails.\n")
    }

/**
 * KDoc for a [OperationResponseMode.MIXED] operation's `fooStream()` entry point, distinct from [streamingKDoc]:
 * this operation *also* has a buffered `foo()`/`fooWithResponse()` pair over the same underlying request, so the
 * doc must be explicit about which method to call for which need, plus the execution/ownership/termination
 * contract every generated streaming method shares.
 */
private fun mixedStreamKDoc(
    operation: OperationDeclaration,
    names: OperationMethodNames,
    elementType: KotlinTypeRef,
): String =
    buildString {
        append(sanitizeKDoc(operation.methodKdoc))
        append("\n\n")
        append(
            "Streaming counterpart of this operation's buffered `${operation.operationId}()`/" +
                "`${operation.operationId}WithResponse()` methods: the service can answer the same request either " +
                "as a single buffered JSON body (use those) or as a `text/event-stream` (use this method) — this " +
                "method always requests the streaming alternative.\n\n",
        )
        append(
            "The returned `Flow` is cold: no request is sent, and the connection is not opened, until a collector " +
                "actually starts collecting. Each independent collection opens its own fresh connection; " +
                "collections are never shared or replayed. Cancelling the collecting coroutine promptly closes the " +
                "underlying connection; ownership of the response body transfers to the flow for its lifetime and " +
                "is always released — on normal completion, on a declared terminal sentinel, or on cancellation or " +
                "failure — a caller never needs to close anything itself.\n\n",
        )
        if (!elementType.isSseEvent()) {
            append(
                "Each event's `data` is decoded as `${elementType.simpleName}`; a declared terminal sentinel value " +
                    "ends the stream without being emitted, and a declared in-band error event fails the flow with " +
                    "SdkStreamingException instead of being emitted as a value.\n\n",
            )
        } else {
            append(
                "Events are emitted undecoded; a declared terminal sentinel value ends the stream without being " +
                    "emitted, and a declared in-band error event fails the flow with SdkStreamingException instead " +
                    "of being emitted as a value.\n\n",
            )
        }
        if (!operation.requestType.isUnit()) append("@param request Request body sent to the operation.\n")
        append(operationParameterKDoc(operation, names))
        append("@param options Execution options.\n")
        append("@return A cold flow of decoded streaming events; never resolves to a single response value.\n")
        append("@throws SdkApiException When the service returns a non-success response.\n")
        append("@throws SdkSerializationException When a request or stream item cannot be decoded.\n")
        append("@throws SdkStreamingException When the stream framing or declared in-band error fails.\n")
    }

private fun operationParameterKDoc(
    operation: OperationDeclaration,
    names: OperationMethodNames,
): String =
    operation.parameters.joinToString(separator = "") { parameter ->
        val resolvedName = requireNotNull(names.parameterNames[parameter])
        val description = parameter.kdoc.ifBlank { "Wire parameter `${parameter.name}`." }
        "@param $resolvedName ${sanitizeKDoc(description)}\n"
    }

private fun OperationDeclaration.metadataPropertyName(
    useGenericName: Boolean,
    operationName: String,
): String = if (useGenericName) "metadata" else "${operationName}Metadata"

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
