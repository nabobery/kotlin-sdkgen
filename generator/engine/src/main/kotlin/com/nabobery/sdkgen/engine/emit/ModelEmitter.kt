package com.nabobery.sdkgen.engine.emit

import com.nabobery.sdkgen.engine.declarations.AdditionalPropertiesDeclaration
import com.nabobery.sdkgen.engine.declarations.FieldDeclaration
import com.nabobery.sdkgen.engine.declarations.KotlinTypeRef
import com.nabobery.sdkgen.engine.declarations.ModelDeclaration
import com.nabobery.sdkgen.engine.declarations.SimpleModelDeclaration
import com.nabobery.sdkgen.engine.declarations.sanitizeKDoc
import com.squareup.kotlinpoet.BOOLEAN
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.LambdaTypeName
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.STRING
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.TypeVariableName
import com.squareup.kotlinpoet.UNIT

internal fun EmissionContext.emitModel(
    file: FileSpec.Builder,
    model: ModelDeclaration,
) {
    model.auxiliaryModels.forEach { auxiliary -> file.addType(simpleModel(model.packageName, auxiliary)) }
    file.addType(model(model))
    model.additionalProperties?.let { additional ->
        file.addFunction(modelAdditionalPropertiesValidator(model, additional))
    }
    file.addFunction(modelDsl(model))
    if (model.fields.any { field -> field.required && !field.nullable }) {
        file.addFunction(decodeRequired(model.resolvedName))
    }
    if (model.usesFieldState) {
        file.addFunction(toNullableFieldState())
        if (model.fields.any { field -> field.type.requiresOwnershipSnapshot() }) {
            file.addFunction(copyFieldStateValue())
        }
        file.addFunction(decodeOptional(model.resolvedName))
        file.addFunction(putState())
    }
}

private fun EmissionContext.simpleModel(
    packageName: String,
    declaration: SimpleModelDeclaration,
): TypeSpec {
    val constructor = FunSpec.constructorBuilder()
    val type =
        TypeSpec
            .classBuilder(ClassName(packageName, declaration.resolvedName))
            .addModifiers(KModifier.PUBLIC)
            .apply {
                if (declaration.fields.none { field -> field.type.requiresOwnershipSnapshot() }) {
                    addModifiers(KModifier.DATA)
                }
            }.addAnnotation(SERIALIZABLE)
            .addKdoc("%L\n", sanitizeKDoc(declaration.kdoc))
    declaration.fields.forEach { field ->
        constructor.addParameter(field.resolvedName, field.type.toTypeName())
        val property =
            PropertySpec
                .builder(field.resolvedName, field.type.toTypeName())
                .addModifiers(KModifier.PUBLIC)
                .initializer(
                    field.type.ownershipSnapshotExpression(field.resolvedName, nullable = field.type.nullable),
                ).addKdoc("%L\n", sanitizeKDoc(field.kdoc))
        if (field.wireName != field.resolvedName) property.addAnnotation(serialName(field.wireName))
        type.addProperty(property.build())
    }
    return type.primaryConstructor(constructor.build()).build()
}

private fun EmissionContext.model(model: ModelDeclaration): TypeSpec {
    val requestType = ClassName(model.packageName, model.resolvedName)
    val required = model.fields.filter(FieldDeclaration::required)
    val optional = model.fields.filterNot(FieldDeclaration::required)
    val primary =
        FunSpec
            .constructorBuilder()
            .apply {
                if (optional.isNotEmpty() && model.usesFieldState) addModifiers(KModifier.INTERNAL)
            }
    required.forEach { field ->
        primary.addParameter(field.resolvedName, field.type.toTypeName().copy(nullable = field.nullable))
    }
    optional.forEach { field ->
        if (model.usesFieldState) {
            primary.addParameter("${field.resolvedName}State", fieldState.parameterizedBy(field.type.toTypeName()))
        } else {
            primary.addParameter(
                ParameterSpec
                    .builder(field.resolvedName, field.type.toTypeName().copy(nullable = true))
                    .defaultValue("null")
                    .build(),
            )
        }
    }
    model.additionalProperties?.let { additional ->
        primary.addParameter(
            ParameterSpec
                .builder(additional.resolvedName, additional.mapTypeName())
                .defaultValue("emptyMap()")
                .build(),
        )
    }
    val type =
        TypeSpec
            .classBuilder(model.resolvedName)
            .addModifiers(KModifier.PUBLIC)
            .addAnnotation(serializableWith(requestType.nestedClass("Serializer")))
            .addKdoc("%L\n", sanitizeKDoc(model.kdoc))
            .primaryConstructor(primary.build())
    required.forEach { field ->
        type.addProperty(
            PropertySpec
                .builder(field.resolvedName, field.type.toTypeName().copy(nullable = field.nullable))
                .addModifiers(KModifier.PUBLIC)
                .initializer(field.type.ownershipSnapshotExpression(field.resolvedName, nullable = field.nullable))
                .apply {
                    if (field.kdoc.isNotBlank()) addKdoc("%L\n", sanitizeKDoc(field.kdoc))
                }.build(),
        )
    }
    if (model.usesFieldState) {
        optional.forEach { field ->
            type.addProperty(
                PropertySpec
                    .builder("${field.resolvedName}State", fieldState.parameterizedBy(field.type.toTypeName()))
                    .addModifiers(KModifier.PRIVATE)
                    .initializer(field.type.copyFieldStateSnapshotExpression("${field.resolvedName}State"))
                    .build(),
            )
        }
        if (optional.isNotEmpty()) type.addFunction(requiredFieldsConstructor(model, requestType))
    }
    if (model.usesFieldState) {
        optional.forEach { field ->
            type.addProperty(
                PropertySpec
                    .builder(field.resolvedName, field.type.toTypeName().copy(nullable = true))
                    .addModifiers(KModifier.PUBLIC)
                    .apply {
                        if (field.kdoc.isNotBlank()) addKdoc("%L\n", sanitizeKDoc(field.kdoc))
                    }.getter(
                        FunSpec
                            .getterBuilder()
                            .addStatement(
                                "return %LState.valueOrNull()",
                                field.resolvedName,
                            ).build(),
                    ).build(),
            )
            type.addFunction(
                FunSpec
                    .builder("${field.resolvedName}Presence")
                    .addModifiers(KModifier.PUBLIC)
                    .addKdoc("Returns the wire presence of `%L`.\n", field.wireName)
                    .returns(fieldPresence)
                    .addStatement("return %LState.presence", field.resolvedName)
                    .build(),
            )
        }
    } else {
        optional.forEach { field ->
            type.addProperty(
                PropertySpec
                    .builder(field.resolvedName, field.type.toTypeName().copy(nullable = true))
                    .addModifiers(KModifier.PUBLIC)
                    .initializer(field.type.ownershipSnapshotExpression(field.resolvedName, nullable = true))
                    .apply {
                        if (field.kdoc.isNotBlank()) addKdoc("%L\n", sanitizeKDoc(field.kdoc))
                    }.build(),
            )
        }
    }
    model.additionalProperties?.let { additional ->
        type.addProperty(
            PropertySpec
                .builder(additional.resolvedName, additional.mapTypeName())
                .addModifiers(KModifier.PUBLIC)
                .initializer(
                    "%L(%L)",
                    modelAdditionalPropertiesValidatorName(model),
                    additional.resolvedName,
                ).addKdoc("%L\n", sanitizeKDoc(additional.kdoc))
                .build(),
        )
    }
    type.addType(modelBuilder(model, requestType))
    type.addType(
        TypeSpec
            .companionObjectBuilder()
            .addFunction(
                FunSpec
                    .builder("build")
                    .addModifiers(KModifier.PUBLIC)
                    .addParameter(
                        "block",
                        LambdaTypeName.get(
                            receiver = requestType.nestedClass("Builder"),
                            returnType = UNIT,
                        ),
                    ).returns(requestType)
                    .addStatement("return %T().apply(block).build()", requestType.nestedClass("Builder"))
                    .build(),
            ).build(),
    )
    type.addType(modelSerializer(model, requestType))
    return type.build()
}

private fun EmissionContext.requiredFieldsConstructor(
    model: ModelDeclaration,
    requestType: ClassName,
): FunSpec {
    val required = model.fields.filter(FieldDeclaration::required)
    val optional = model.fields.filterNot(FieldDeclaration::required)
    val function = FunSpec.constructorBuilder().addModifiers(KModifier.PUBLIC)
    required.forEach { field ->
        function.addParameter(field.resolvedName, field.type.toTypeName().copy(nullable = field.nullable))
    }
    val call = CodeBlock.builder()
    required.forEach { field -> call.add("%L = %L,\n", field.resolvedName, field.resolvedName) }
    optional.forEach { field -> call.add("%LState = %T.Absent,\n", field.resolvedName, fieldState) }
    model.additionalProperties?.let { additional ->
        function.addParameter(
            ParameterSpec
                .builder(additional.resolvedName, additional.mapTypeName())
                .defaultValue("emptyMap()")
                .build(),
        )
        call.add("%L = %L,\n", additional.resolvedName, additional.resolvedName)
    }
    @Suppress("UNUSED_VARIABLE")
    val keepType = requestType
    return function.callThisConstructor(call.build()).build()
}

private fun EmissionContext.modelBuilder(
    model: ModelDeclaration,
    requestType: ClassName,
): TypeSpec {
    val required = model.fields.filter(FieldDeclaration::required)
    val optional = model.fields.filterNot(FieldDeclaration::required)
    val builder = TypeSpec.classBuilder("Builder").addModifiers(KModifier.PUBLIC)
    required.filterNot(FieldDeclaration::nullable).forEach { field ->
        builder.addProperty(
            PropertySpec
                .builder("${field.resolvedName}Value", field.type.toTypeName().copy(nullable = true))
                .addModifiers(KModifier.PRIVATE)
                .mutable()
                .initializer("null")
                .build(),
        )
        builder.addProperty(
            PropertySpec
                .builder(field.resolvedName, field.type.toTypeName())
                .addModifiers(KModifier.PUBLIC)
                .mutable()
                .getter(
                    FunSpec
                        .getterBuilder()
                        .addStatement(
                            "return %L",
                            field.type.ownershipSnapshotExpression(
                                "requireNotNull(${field.resolvedName}Value) { " +
                                    "\"${field.resolvedName} is required\" }",
                                nullable = false,
                            ),
                        ).build(),
                ).setter(
                    FunSpec
                        .setterBuilder()
                        .addParameter("value", field.type.toTypeName())
                        .addStatement(
                            "%LValue = %L",
                            field.resolvedName,
                            field.type.ownershipSnapshotExpression("value", nullable = false),
                        ).build(),
                ).build(),
        )
    }
    required.filter(FieldDeclaration::nullable).forEach { field ->
        builder.addProperty(
            PropertySpec
                .builder("${field.resolvedName}State", fieldState.parameterizedBy(field.type.toTypeName()))
                .addModifiers(KModifier.PRIVATE)
                .mutable()
                .initializer("%T.Absent", fieldState)
                .build(),
        )
        builder.addProperty(nullableBuilderProperty(field, required = true))
    }
    if (model.usesFieldState) {
        optional.forEach { field ->
            builder.addProperty(
                PropertySpec
                    .builder("${field.resolvedName}State", fieldState.parameterizedBy(field.type.toTypeName()))
                    .addModifiers(KModifier.PRIVATE)
                    .mutable()
                    .initializer("%T.Absent", fieldState)
                    .build(),
            )
            builder.addProperty(
                if (field.nullable) {
                    nullableBuilderProperty(
                        field,
                        required = false,
                    )
                } else {
                    nonNullableBuilderProperty(field)
                },
            )
            builder.addFunction(
                FunSpec
                    .builder("unset${field.resolvedName.replaceFirstChar(Char::uppercase)}")
                    .addModifiers(KModifier.PUBLIC)
                    .addKdoc("Omits `%L` from serialized output.\n", field.wireName)
                    .addStatement("%LState = %T.Absent", field.resolvedName, fieldState)
                    .build(),
            )
        }
    } else {
        optional.forEach { field ->
            if (field.type.requiresOwnershipSnapshot()) {
                builder.addProperty(
                    PropertySpec
                        .builder("${field.resolvedName}Value", field.type.toTypeName().copy(nullable = true))
                        .addModifiers(KModifier.PRIVATE)
                        .mutable()
                        .initializer("null")
                        .build(),
                )
            }
            builder.addProperty(plainOptionalBuilderProperty(field))
        }
    }
    model.additionalProperties?.let { additional ->
        val propertyName = additional.resolvedName
        builder.addProperty(
            PropertySpec
                .builder("${propertyName}Value", additional.mapTypeName())
                .addModifiers(KModifier.PRIVATE)
                .mutable()
                .initializer("emptyMap()")
                .build(),
        )
        builder.addProperty(
            PropertySpec
                .builder(propertyName, additional.mapTypeName())
                .addModifiers(KModifier.PUBLIC)
                .mutable()
                .getter(
                    FunSpec
                        .getterBuilder()
                        .addStatement(
                            "return %L",
                            additional
                                .mapTypeRef()
                                .ownershipSnapshotExpression("${propertyName}Value", nullable = false),
                        ).build(),
                ).setter(
                    FunSpec
                        .setterBuilder()
                        .addParameter("value", additional.mapTypeName())
                        .addStatement(
                            "%LValue = %L",
                            propertyName,
                            additional.mapTypeRef().ownershipSnapshotExpression("value", nullable = false),
                        ).build(),
                ).addKdoc("%L\n", sanitizeKDoc(additional.kdoc))
                .build(),
        )
    }
    builder.addFunction(builderBuild(model, requestType))
    return builder.build()
}

private fun plainOptionalBuilderProperty(field: FieldDeclaration): PropertySpec {
    val requiresSnapshot = field.type.requiresOwnershipSnapshot()
    return PropertySpec
        .builder(field.resolvedName, field.type.toTypeName().copy(nullable = true))
        .addModifiers(KModifier.PUBLIC)
        .mutable()
        .apply {
            if (!requiresSnapshot) {
                initializer("null")
            } else {
                field.type.toTypeName().copy(nullable = true).let { nullableType ->
                    getter(
                        FunSpec
                            .getterBuilder()
                            .addStatement(
                                "return %L",
                                field.type.ownershipSnapshotExpression(
                                    "${field.resolvedName}Value",
                                    nullable = true,
                                ),
                            ).build(),
                    )
                    setter(
                        FunSpec
                            .setterBuilder()
                            .addParameter("value", nullableType)
                            .addStatement(
                                "%LValue = %L",
                                field.resolvedName,
                                field.type.ownershipSnapshotExpression("value", nullable = true),
                            ).build(),
                    )
                }
            }
            if (field.kdoc.isNotBlank()) addKdoc("%L\n", sanitizeKDoc(field.kdoc))
        }.build()
}

private fun EmissionContext.nullableBuilderProperty(
    field: FieldDeclaration,
    required: Boolean,
): PropertySpec =
    PropertySpec
        .builder(
            field.resolvedName,
            field.type.toTypeName().copy(nullable = true),
        ).addModifiers(KModifier.PUBLIC)
        .mutable()
        .getter(
            FunSpec
                .getterBuilder()
                .addStatement(
                    "return %L",
                    field.type.ownershipSnapshotExpression(
                        "${field.resolvedName}State.valueOrNull()",
                        nullable = true,
                    ),
                ).build(),
        ).setter(
            FunSpec
                .setterBuilder()
                .addParameter("value", field.type.toTypeName().copy(nullable = true))
                .addStatement(
                    "%LState = %L.toNullableFieldState()",
                    field.resolvedName,
                    field.type.ownershipSnapshotExpression("value", nullable = true),
                ).build(),
        ).apply {
            if (field.kdoc.isNotBlank()) addKdoc("%L\n", sanitizeKDoc(field.kdoc))
        }.addKdoc(
            if (required) {
                "Required nullable field; assigning `null` records present-null.\n"
            } else {
                "Assigning `null` records present-null; use the unset function to omit the property.\n"
            },
        ).build()

private fun EmissionContext.nonNullableBuilderProperty(field: FieldDeclaration): PropertySpec =
    PropertySpec
        .builder(
            field.resolvedName,
            field.type.toTypeName().copy(nullable = true),
        ).addModifiers(KModifier.PUBLIC)
        .mutable()
        .getter(
            FunSpec
                .getterBuilder()
                .addStatement(
                    "return %L",
                    field.type.ownershipSnapshotExpression(
                        "${field.resolvedName}State.valueOrNull()",
                        nullable = true,
                    ),
                ).build(),
        ).setter(
            FunSpec
                .setterBuilder()
                .addParameter("value", field.type.toTypeName().copy(nullable = true))
                .addStatement(
                    "val present = requireNotNull(value) { %S }",
                    "${field.resolvedName} is not nullable; call unset${field.resolvedName.replaceFirstChar(
                        Char::uppercase,
                    )}() to omit it",
                ).addStatement(
                    "%LState = %T.Value(%L)",
                    field.resolvedName,
                    fieldState,
                    field.type.ownershipSnapshotExpression("present", nullable = false),
                ).build(),
        ).apply {
            if (field.kdoc.isNotBlank()) addKdoc("%L\n", sanitizeKDoc(field.kdoc))
        }.addKdoc("Assign a non-null value, or use the unset function to omit the property.\n")
        .build()

private fun EmissionContext.builderBuild(
    model: ModelDeclaration,
    requestType: ClassName,
): FunSpec {
    val required = model.fields.filter(FieldDeclaration::required)
    val optional = model.fields.filterNot(FieldDeclaration::required)
    val body = CodeBlock.builder()
    required.filterNot(FieldDeclaration::nullable).forEach { field ->
        body.addStatement(
            "check(%LValue != null) { %S }",
            field.resolvedName,
            "${field.resolvedName} is required",
        )
    }
    required.filter(FieldDeclaration::nullable).forEach { field ->
        body.addStatement(
            "check(%LState !== %T.Absent) { %S }",
            field.resolvedName,
            fieldState,
            "${field.resolvedName} is required, even when null",
        )
    }
    body.add("return %T(\n", requestType).indent()
    required.forEach { field ->
        val expression = if (field.nullable) "${field.resolvedName}State.valueOrNull()" else field.resolvedName
        body.add("%L = %L,\n", field.resolvedName, expression)
    }
    if (model.usesFieldState) {
        optional.forEach { field -> body.add("%LState = %LState,\n", field.resolvedName, field.resolvedName) }
    } else {
        optional.forEach { field -> body.add("%L = %L,\n", field.resolvedName, field.resolvedName) }
    }
    model.additionalProperties?.let { additional ->
        body.add("%L = %L,\n", additional.resolvedName, additional.resolvedName)
    }
    body.unindent().add(")\n")
    return FunSpec
        .builder("build")
        .addModifiers(KModifier.PUBLIC)
        .returns(requestType)
        .addCode(body.build())
        .build()
}

private fun modelSerializer(
    model: ModelDeclaration,
    requestType: ClassName,
): TypeSpec {
    val required = model.fields.filter(FieldDeclaration::required)
    val optional = model.fields.filterNot(FieldDeclaration::required)
    return TypeSpec
        .objectBuilder("Serializer")
        .addModifiers(KModifier.PUBLIC)
        .addSuperinterface(K_SERIALIZER.parameterizedBy(requestType))
        .addProperty(
            PropertySpec
                .builder(
                    "descriptor",
                    SERIAL_DESCRIPTOR,
                ).addModifiers(KModifier.OVERRIDE)
                .initializer("%T.serializer().descriptor", JSON_ELEMENT)
                .build(),
        ).addFunction(
            FunSpec
                .builder("deserialize")
                .addModifiers(KModifier.OVERRIDE)
                .addParameter("decoder", DECODER)
                .returns(requestType)
                .addCode(modelDeserialize(model, requestType, required, optional))
                .build(),
        ).addFunction(
            FunSpec
                .builder("serialize")
                .addModifiers(KModifier.OVERRIDE)
                .addParameter("encoder", ENCODER)
                .addParameter("value", requestType)
                .addCode(modelSerialize(model, required, optional))
                .build(),
        ).build()
}

private fun modelDeserialize(
    model: ModelDeclaration,
    requestType: ClassName,
    required: List<FieldDeclaration>,
    optional: List<FieldDeclaration>,
): CodeBlock {
    val locals =
        ModelSerializerLocalNameAllocator(
            model.fields.mapTo(mutableSetOf(), FieldDeclaration::resolvedName),
        )
    val jsonDecoder = locals.allocate("jsonDecoder")
    val json = locals.allocate("json")
    val rawObject = locals.allocate("rawObject")
    val body =
        CodeBlock
            .builder()
            .addStatement("val %L = decoder.requireJsonDecoder(%S)", jsonDecoder, model.resolvedName)
            .addStatement("val %L = %L.json", json, jsonDecoder)
            .addStatement(
                "val %L = %L.decodeJsonElement() as? %T ?: throw %T(%S)",
                rawObject,
                jsonDecoder,
                JSON_OBJECT,
                SERIALIZATION_EXCEPTION,
                "${model.resolvedName} must be a JSON object",
            )
    required.filterNot(FieldDeclaration::nullable).forEach { field ->
        body.addStatement(
            "val %L = %L.decodeRequired<%T>(%L, %S)",
            field.resolvedName,
            json,
            field.type.toTypeName(),
            rawObject,
            field.wireName,
        )
    }
    required.filter(FieldDeclaration::nullable).forEach { field ->
        body
            .beginControlFlow("if (!%L.containsKey(%S))", rawObject, field.wireName)
            .addStatement(
                "throw %T(%S)",
                SERIALIZATION_EXCEPTION,
                "${model.resolvedName} is missing required property '${field.wireName}'",
            ).endControlFlow()
            .addStatement(
                "val %L = %L[%S].let { element -> if (element == %T) null else %L.%M<%T>(requireNotNull(element)) }",
                field.resolvedName,
                rawObject,
                field.wireName,
                JSON_NULL,
                json,
                DECODE_FROM_JSON_ELEMENT,
                field.type.toTypeName(),
            )
    }
    body.add("return %T(\n", requestType).indent()
    required.forEach { field -> body.add("%L = %L,\n", field.resolvedName, field.resolvedName) }
    optional.forEach { field ->
        if (model.usesFieldState) {
            body.add(
                "%LState = %L.decodeOptional(%L, %S, nullable = %L),\n",
                field.resolvedName,
                json,
                rawObject,
                field.wireName,
                field.nullable,
            )
        } else if (field.nullable) {
            body.add(
                "%L = %L[%S]?.let { element -> if (element == %T) null else %L.%M<%T>(element) },\n",
                field.resolvedName,
                rawObject,
                field.wireName,
                JSON_NULL,
                json,
                DECODE_FROM_JSON_ELEMENT,
                field.type.toTypeName(),
            )
        } else {
            body.add(
                "%L = %L[%S]?.let { %L.%M<%T>(it) },\n",
                field.resolvedName,
                rawObject,
                field.wireName,
                json,
                DECODE_FROM_JSON_ELEMENT,
                field.type.toTypeName(),
            )
        }
    }
    model.additionalProperties?.let { additional ->
        body.add(
            "%L = %L.filterKeys { key -> key !in %L }.mapValues { (_, element) -> %L }.toMap(),\n",
            additional.resolvedName,
            rawObject,
            additional.fixedWireNamesExpression(),
            additional.decodeExpression(json),
        )
    }
    body.unindent().add(")\n")
    return body.build()
}

private class ModelSerializerLocalNameAllocator(
    initialNames: Set<String>,
) {
    private val usedNames = initialNames.toMutableSet()

    fun allocate(preferredName: String): String {
        if (usedNames.add(preferredName)) return preferredName
        var suffix = 2
        while (!usedNames.add("$preferredName$suffix")) suffix += 1
        return "$preferredName$suffix"
    }
}

private fun AdditionalPropertiesDeclaration.mapTypeName() =
    ClassName("kotlin.collections", "Map").parameterizedBy(STRING, valueType.toTypeName())

private fun AdditionalPropertiesDeclaration.mapTypeRef() =
    KotlinTypeRef(
        packageName = "kotlin.collections",
        simpleName = "Map",
        arguments = listOf(KotlinTypeRef("kotlin", "String"), valueType),
    )

private fun AdditionalPropertiesDeclaration.fixedWireNamesExpression(): CodeBlock =
    CodeBlock
        .builder()
        .add("setOf(")
        .apply {
            fixedWireNames.sorted().forEachIndexed { index, wireName ->
                if (index > 0) add(", ")
                add("%S", wireName)
            }
        }.add(")")
        .build()

private fun modelAdditionalPropertiesValidatorName(model: ModelDeclaration): String =
    "copyAndValidate${model.resolvedName}AdditionalProperties"

private fun modelAdditionalPropertiesValidator(
    model: ModelDeclaration,
    additional: AdditionalPropertiesDeclaration,
): FunSpec =
    FunSpec
        .builder(modelAdditionalPropertiesValidatorName(model))
        .addModifiers(KModifier.PRIVATE)
        .addParameter(additional.resolvedName, additional.mapTypeName())
        .returns(additional.mapTypeName())
        .addStatement(
            "val copied = %L",
            additional.mapTypeRef().ownershipSnapshotExpression(additional.resolvedName, nullable = false),
        ).addStatement(
            "val collision = copied.keys.sorted().firstOrNull { key -> key in %L }",
            additional.fixedWireNamesExpression(),
        ).addStatement(
            "require(collision == null) { %S + collision + %S }",
            "${model.resolvedName} additionalProperties key '",
            "' collides with a fixed property",
        ).addStatement("return copied")
        .build()

private fun AdditionalPropertiesDeclaration.decodeExpression(jsonName: String): CodeBlock =
    when {
        valuesAreJsonElements -> {
            CodeBlock.of("element")
        }

        valueType.nullable -> {
            CodeBlock.of(
                "if (element == %T) null else %L.%M<%T>(element)",
                JSON_NULL,
                jsonName,
                DECODE_FROM_JSON_ELEMENT,
                valueType.toTypeName().copy(nullable = false),
            )
        }

        else -> {
            CodeBlock.of(
                "%L.%M<%T>(element)",
                jsonName,
                DECODE_FROM_JSON_ELEMENT,
                valueType.toTypeName(),
            )
        }
    }

private fun AdditionalPropertiesDeclaration.encodeStatement(): CodeBlock =
    when {
        valuesAreJsonElements -> {
            CodeBlock.of("%M(key, additionalValue)", PUT)
        }

        valueType.nullable -> {
            CodeBlock.of(
                "%M(key, additionalValue?.let { json.%M(it) } ?: %T)",
                PUT,
                ENCODE_TO_JSON_ELEMENT,
                JSON_NULL,
            )
        }

        else -> {
            CodeBlock.of("%M(key, json.%M(additionalValue))", PUT, ENCODE_TO_JSON_ELEMENT)
        }
    }

private fun modelSerialize(
    model: ModelDeclaration,
    required: List<FieldDeclaration>,
    optional: List<FieldDeclaration>,
): CodeBlock {
    val body =
        CodeBlock
            .builder()
            .addStatement("val jsonEncoder = encoder.requireJsonEncoder(%S)", model.resolvedName)
            .addStatement("val json = jsonEncoder.json")
            .add("val raw = %M {\n", BUILD_JSON_OBJECT)
            .indent()
    required.forEach { field ->
        when {
            field.nullable -> {
                body.addStatement(
                    "%M(%S, value.%L?.let { json.%M(it) } ?: %T)",
                    PUT,
                    field.wireName,
                    field.resolvedName,
                    ENCODE_TO_JSON_ELEMENT,
                    JSON_NULL,
                )
            }

            field.type.simpleName == "String" -> {
                body.addStatement(
                    "%M(%S, value.%L)",
                    PUT,
                    field.wireName,
                    field.resolvedName,
                )
            }

            else -> {
                body.addStatement(
                    "%M(%S, json.%M(value.%L))",
                    PUT,
                    field.wireName,
                    ENCODE_TO_JSON_ELEMENT,
                    field.resolvedName,
                )
            }
        }
    }
    optional.forEach { field ->
        if (model.usesFieldState) {
            body.addStatement(
                "putState(%S, value.%LState, json::%M)",
                field.wireName,
                field.resolvedName,
                ENCODE_TO_JSON_ELEMENT,
            )
        } else {
            val encode =
                if (field.type.simpleName == "String") {
                    CodeBlock.of("%M(%S, it)", PUT, field.wireName)
                } else {
                    CodeBlock.of(
                        "%M(%S, json.%M(it))",
                        PUT,
                        field.wireName,
                        ENCODE_TO_JSON_ELEMENT,
                    )
                }
            body.addStatement("value.%L?.let { %L }", field.resolvedName, encode)
        }
    }
    model.additionalProperties?.let { additional ->
        body.add("value.%L.keys.sorted().forEach { key ->\n", additional.resolvedName).indent()
        body.addStatement("val additionalValue = value.%L.getValue(key)", additional.resolvedName)
        body.addStatement(
            "check(key !in %L) { %S + key + %S }",
            additional.fixedWireNamesExpression(),
            "${model.resolvedName} additionalProperties key '",
            "' collides with a fixed property",
        )
        body.addStatement("%L", additional.encodeStatement())
        body.unindent().add("}\n")
    }
    body.unindent().add("}\n").addStatement("jsonEncoder.encodeJsonElement(raw)")
    return body.build()
}

private fun modelDsl(model: ModelDeclaration): FunSpec {
    val requestType = ClassName(model.packageName, model.resolvedName)
    return FunSpec
        .builder(model.dslFunctionName)
        .addModifiers(KModifier.PUBLIC)
        .addParameter(
            "block",
            LambdaTypeName.get(
                receiver = requestType.nestedClass("Builder"),
                returnType = UNIT,
            ),
        ).returns(requestType)
        .addStatement("return %T.build(block)", requestType)
        .build()
}

/**
 * Snapshots a `FieldState`'s collection value so the model owns it.
 *
 * `copyValue` is `FieldState<T>.copyValue((T) -> T)`, so when the field's value type is itself nullable —
 * `FieldState<List<String>?>`, a nullable array property under a merge-patch model — the lambda receives a
 * nullable value and the snapshot has to be null-safe. Passing `nullable = false` here emitted
 * `fieldValue.toList()` on a `List<String>?` receiver, which does not compile.
 */
private fun KotlinTypeRef.copyFieldStateSnapshotExpression(valueName: String): CodeBlock =
    if (requiresOwnershipSnapshot()) {
        CodeBlock.of(
            "%L.copyValue { fieldValue -> %L }",
            valueName,
            ownershipSnapshotExpression("fieldValue"),
        )
    } else {
        CodeBlock.of("%L", valueName)
    }

private fun EmissionContext.toNullableFieldState(): FunSpec =
    FunSpec
        .builder("toNullableFieldState")
        .addModifiers(KModifier.PRIVATE)
        .addTypeVariable(TypeVariableName("T"))
        .receiver(TypeVariableName("T").copy(nullable = true))
        .returns(fieldState.parameterizedBy(TypeVariableName("T")))
        .addStatement("return if (this == null) %T.Null else %T.Value(this)", fieldState, fieldState)
        .build()

private fun EmissionContext.copyFieldStateValue(): FunSpec {
    val type = TypeVariableName("T")
    return FunSpec
        .builder("copyValue")
        .addModifiers(KModifier.PRIVATE, KModifier.INLINE)
        .addTypeVariable(type)
        .receiver(fieldState.parameterizedBy(type))
        .addParameter(
            "copy",
            LambdaTypeName.get(
                parameters = listOf(ParameterSpec.unnamed(type)),
                returnType = type,
            ),
        ).returns(fieldState.parameterizedBy(type))
        .addCode(
            "return when (this) {\n" +
                "  %T.Absent -> this\n" +
                "  %T.Null -> this\n" +
                "  is %T.Value -> %T.Value(copy(value))\n" +
                "}\n",
            fieldState,
            fieldState,
            fieldState,
            fieldState,
        ).build()
}

private fun decodeRequired(modelName: String): FunSpec =
    FunSpec
        .builder("decodeRequired")
        .addModifiers(KModifier.PRIVATE, KModifier.INLINE)
        .addTypeVariable(TypeVariableName("T").copy(reified = true))
        .receiver(JSON)
        .addParameter("raw", JSON_OBJECT)
        .addParameter("name", STRING)
        .returns(TypeVariableName("T"))
        .addStatement(
            "val element = raw[name] ?: throw %T(%S + name + %S)",
            SERIALIZATION_EXCEPTION,
            "$modelName is missing required property '",
            "'",
        ).addStatement("return %M(element)", DECODE_FROM_JSON_ELEMENT)
        .build()

private fun EmissionContext.decodeOptional(modelName: String): FunSpec =
    FunSpec
        .builder("decodeOptional")
        .addModifiers(KModifier.PRIVATE, KModifier.INLINE)
        .addTypeVariable(TypeVariableName("T").copy(reified = true))
        .receiver(JSON)
        .addParameter("raw", JSON_OBJECT)
        .addParameter("name", STRING)
        .addParameter("nullable", BOOLEAN)
        .returns(fieldState.parameterizedBy(TypeVariableName("T")))
        .addCode(
            "if (!raw.containsKey(name)) return %T.Absent\n" +
                "val element = requireNotNull(raw[name])\n" +
                "if (element == %T) {\n" +
                "  if (!nullable) throw %T(%S + name + %S)\n" +
                "  return %T.Null\n" +
                "}\n" +
                "return %T.Value(%M<T>(element))\n",
            fieldState,
            JSON_NULL,
            SERIALIZATION_EXCEPTION,
            "$modelName property '",
            "' is not nullable",
            fieldState,
            fieldState,
            DECODE_FROM_JSON_ELEMENT,
        ).build()

private fun EmissionContext.putState(): FunSpec {
    val type = TypeVariableName("T")
    return FunSpec
        .builder("putState")
        .addModifiers(KModifier.PRIVATE, KModifier.INLINE)
        .addTypeVariable(type)
        .receiver(JSON_OBJECT_BUILDER)
        .addParameter("name", STRING)
        .addParameter("state", fieldState.parameterizedBy(type))
        .addParameter(
            "encode",
            LambdaTypeName.get(
                parameters = listOf(ParameterSpec.unnamed(type)),
                returnType = JSON_ELEMENT,
            ),
        ).addCode(
            "when (state) {\n" +
                "  %T.Absent -> Unit\n" +
                "  %T.Null -> %M(name, %T)\n" +
                "  is %T.Value -> %M(name, encode(state.value))\n" +
                "}\n",
            fieldState,
            fieldState,
            PUT,
            JSON_NULL,
            fieldState,
            PUT,
        ).build()
}
