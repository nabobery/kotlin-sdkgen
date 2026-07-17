@file:Suppress("ktlint:standard:max-line-length")

package com.nabobery.sdkgen.engine.emit

import com.nabobery.sdkgen.engine.declarations.AnyOfBranchDeclaration
import com.nabobery.sdkgen.engine.declarations.AnyOfBranchShape
import com.nabobery.sdkgen.engine.declarations.AnyOfDeclaration
import com.nabobery.sdkgen.engine.declarations.OneOfCaseDeclaration
import com.nabobery.sdkgen.engine.declarations.OneOfDeclaration
import com.nabobery.sdkgen.engine.declarations.UnionFieldDeclaration
import com.nabobery.sdkgen.engine.declarations.sanitizeKDoc
import com.squareup.kotlinpoet.BOOLEAN
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.INT
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.LIST
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.SET
import com.squareup.kotlinpoet.STRING
import com.squareup.kotlinpoet.TypeSpec

internal fun EmissionContext.emitOneOf(
    file: FileSpec.Builder,
    model: OneOfDeclaration,
) {
    val unionType = ClassName(model.packageName, model.resolvedName)
    file.addType(
        TypeSpec
            .classBuilder("UnionDecodingException")
            .addModifiers(KModifier.PUBLIC, KModifier.SEALED)
            .primaryConstructor(FunSpec.constructorBuilder().addParameter("message", STRING).build())
            .superclass(SERIALIZATION_EXCEPTION)
            .addSuperclassConstructorParameter("message")
            .build(),
    )
    file.addType(exceptionType("OneOfNoMatchException", ClassName(model.packageName, "UnionDecodingException")))
    file.addType(exceptionType("OneOfAmbiguityException", ClassName(model.packageName, "UnionDecodingException")))

    val union =
        TypeSpec
            .interfaceBuilder(model.resolvedName)
            .addModifiers(KModifier.PUBLIC, KModifier.SEALED)
            .addAnnotation(serializableWith(unionType.nestedClass("Serializer")))
            .addKdoc("%L\n", sanitizeKDoc(model.kdoc))
            .addProperty(
                PropertySpec
                    .builder("raw", JSON_OBJECT)
                    .addModifiers(KModifier.PUBLIC, KModifier.ABSTRACT)
                    .addKdoc("Raw JSON retained as the serialization authority.\n")
                    .build(),
            )
    model.cases.forEach { case -> union.addType(oneOfCase(unionType, case)) }
    union.addType(oneOfSerializer(model, unionType))
    file.addType(union.build())
    file.addType(oneOfInspection(model))
    file.addFunction(inspectOneOf(model))
    file.addFunction(stringValueFunction())
}

private fun oneOfCase(
    unionType: ClassName,
    case: OneOfCaseDeclaration,
): TypeSpec {
    val caseType = unionType.nestedClass(case.resolvedName)
    val constructor = FunSpec.constructorBuilder().addModifiers(KModifier.INTERNAL)
    case.requiredFields.forEach { field -> constructor.addParameter(field.resolvedName, field.type.toTypeName()) }
    constructor.addParameter("raw", JSON_OBJECT)
    val type =
        TypeSpec
            .classBuilder(case.resolvedName)
            .addModifiers(KModifier.PUBLIC)
            .primaryConstructor(constructor.build())
            .addSuperinterface(unionType)
    case.requiredFields.forEach { field ->
        type.addProperty(
            PropertySpec
                .builder(field.resolvedName, field.type.toTypeName())
                .addModifiers(KModifier.PUBLIC)
                .initializer(field.resolvedName)
                .build(),
        )
    }
    type.addProperty(
        PropertySpec
            .builder("raw", JSON_OBJECT)
            .addModifiers(KModifier.PUBLIC, KModifier.OVERRIDE)
            .addKdoc("Raw JSON retained as the serialization authority.\n")
            .initializer("raw")
            .build(),
    )
    type.addType(
        TypeSpec
            .companionObjectBuilder()
            .addFunction(oneOfFactory(caseType, case))
            .build(),
    )
    return type.build()
}

private fun oneOfFactory(
    caseType: ClassName,
    case: OneOfCaseDeclaration,
): FunSpec {
    val function =
        FunSpec
            .builder("of")
            .addModifiers(KModifier.PUBLIC)
            .addKdoc("Creates this branch and its canonical raw JSON representation.\n")
            .returns(caseType)
    case.requiredFields.forEach { field -> function.addParameter(field.resolvedName, field.type.toTypeName()) }
    val raw = CodeBlock.builder().add("%M {\n", BUILD_JSON_OBJECT).indent()
    case.matchFields.filter { it.expectedStringValue != null }.forEach { field ->
        raw.add("%M(%S, %S)\n", PUT, field.wireName, field.expectedStringValue)
    }
    case.requiredFields.forEach { field -> raw.add("%M(%S, %L)\n", PUT, field.wireName, field.resolvedName) }
    raw.unindent().add("}")
    val call = CodeBlock.builder().add("return %T(\n", caseType).indent()
    case.requiredFields.forEach { field -> call.add("%L = %L,\n", field.resolvedName, field.resolvedName) }
    call.add("raw = %L,\n", raw.build()).unindent().add(")")
    return function.addCode(call.build()).build()
}

private fun EmissionContext.oneOfSerializer(
    model: OneOfDeclaration,
    unionType: ClassName,
): TypeSpec =
    TypeSpec
        .objectBuilder("Serializer")
        .addModifiers(KModifier.PUBLIC)
        .addSuperinterface(K_SERIALIZER.parameterizedBy(unionType))
        .addProperty(
            PropertySpec
                .builder("descriptor", SERIAL_DESCRIPTOR)
                .addModifiers(KModifier.OVERRIDE)
                .initializer("%T.serializer().descriptor", JSON_ELEMENT)
                .build(),
        ).addFunction(
            FunSpec
                .builder("deserialize")
                .addModifiers(KModifier.OVERRIDE)
                .addParameter("decoder", DECODER)
                .returns(unionType)
                .addCode(oneOfDeserializeBody(model, unionType))
                .build(),
        ).addFunction(
            FunSpec
                .builder("serialize")
                .addModifiers(KModifier.OVERRIDE)
                .addParameter("encoder", ENCODER)
                .addParameter("value", unionType)
                .addStatement("encoder.requireJsonEncoder(%S).encodeJsonElement(value.raw)", model.resolvedName)
                .build(),
        ).build()

private fun EmissionContext.oneOfDeserializeBody(
    model: OneOfDeclaration,
    unionType: ClassName,
): CodeBlock {
    val inspection = ClassName(model.packageName, "${model.resolvedName}Inspection")
    val code =
        CodeBlock
            .builder()
            .addStatement("val jsonDecoder = decoder.requireJsonDecoder(%S)", model.resolvedName)
            .addStatement(
                "val raw = jsonDecoder.decodeJsonElement() as? %T ?: throw %T(%S)",
                JSON_OBJECT,
                oneOfNoMatch,
                "${model.resolvedName} matched 0 branches: expected JSON object",
            ).addStatement("val matches = inspect%L(raw)", model.resolvedName)
            .beginControlFlow("if (matches.size == 0)")
            .addStatement(
                "throw %T(%S + matches.failures.joinToString(%S))",
                oneOfNoMatch,
                "${model.resolvedName} matched 0 branches: ",
                "; ",
            ).endControlFlow()
            .beginControlFlow("if (matches.size > 1)")
            .addStatement(
                "throw %T(%S + matches.size + %S + matches.names.joinToString())",
                oneOfAmbiguity,
                "${model.resolvedName} matched ",
                " branches; expected exactly 1: ",
            ).endControlFlow()
            .beginControlFlow("return when")
    model.cases.forEach { case ->
        val caseType = unionType.nestedClass(case.resolvedName)
        val checks = case.matchFields.joinToString(" && ") { it.matchExpression("matches.") }
        val args =
            case.requiredFields.joinToString(
                ", ",
            ) { "${it.resolvedName} = requireNotNull(matches.${it.resolvedName})" }
        val constructorArguments = if (args.isEmpty()) "raw = raw" else "$args, raw = raw"
        code.addStatement("$checks -> %T($constructorArguments)", caseType)
    }
    code
        .addStatement("else -> error(%S)", "unreachable")
        .endControlFlow()
    @Suppress("UNUSED_VARIABLE")
    val retainType = inspection
    return code.build()
}

private fun oneOfInspection(model: OneOfDeclaration): TypeSpec {
    val constructor = FunSpec.constructorBuilder()
    val type =
        TypeSpec
            .classBuilder(
                "${model.resolvedName}Inspection",
            ).addModifiers(KModifier.PRIVATE, KModifier.DATA)
    model.cases.flatMap { it.matchFields }.distinctBy { it.resolvedName }.forEach { field ->
        constructor.addParameter(field.resolvedName, field.type.toTypeName().copy(nullable = true))
        type.addProperty(
            PropertySpec
                .builder(
                    field.resolvedName,
                    field.type.toTypeName().copy(nullable = true),
                ).initializer(field.resolvedName)
                .build(),
        )
    }
    constructor.addParameter("failures", LIST.parameterizedBy(STRING))
    type.addProperty(PropertySpec.builder("failures", LIST.parameterizedBy(STRING)).initializer("failures").build())
    type.addProperty(
        PropertySpec
            .builder("names", LIST.parameterizedBy(STRING))
            .getter(FunSpec.getterBuilder().addCode(oneOfNamesBody(model)).build())
            .build(),
    )
    type.addProperty(
        PropertySpec
            .builder("size", INT)
            .getter(FunSpec.getterBuilder().addStatement("return names.size").build())
            .build(),
    )
    return type.primaryConstructor(constructor.build()).build()
}

private fun oneOfNamesBody(model: OneOfDeclaration): CodeBlock =
    CodeBlock
        .builder()
        .add("return buildList {\n")
        .indent()
        .apply {
            model.cases.forEach { case ->
                val check = case.matchFields.joinToString(" && ") { it.matchExpression() }
                addStatement("if ($check) add(%S)", case.resolvedName)
            }
        }.unindent()
        .add("}\n")
        .build()

private fun inspectOneOf(model: OneOfDeclaration): FunSpec {
    val allFields = model.cases.flatMap { it.matchFields }.distinctBy { it.resolvedName }
    val body = CodeBlock.builder()
    allFields.forEach { field ->
        body.addStatement("val %L = raw.stringValue(%S)", field.resolvedName, field.wireName)
    }
    body.add("return %T(\n", ClassName(model.packageName, "${model.resolvedName}Inspection")).indent()
    allFields.forEach { field -> body.add("%L = %L,\n", field.resolvedName, field.resolvedName) }
    body.add("failures = buildList {\n").indent()
    model.cases.forEach { case ->
        val condition =
            case.matchFields.joinToString(" || ") { field ->
                field.expectedStringValue?.let { "!(${field.matchExpression()})" }
                    ?: "${field.resolvedName} == null"
            }
        val names = case.matchFields.joinToString("' and '") { it.wireName }
        body.addStatement(
            "if ($condition) add(%S)",
            "${case.resolvedName}: required properties '$names' must be strings",
        )
    }
    body
        .unindent()
        .add("},\n")
        .unindent()
        .add(")\n")
    return FunSpec
        .builder("inspect${model.resolvedName}")
        .addModifiers(KModifier.PRIVATE)
        .addParameter("raw", JSON_OBJECT)
        .returns(ClassName(model.packageName, "${model.resolvedName}Inspection"))
        .addCode(body.build())
        .build()
}

private fun stringValueFunction(): FunSpec =
    FunSpec
        .builder("stringValue")
        .addModifiers(KModifier.PRIVATE)
        .receiver(JSON_OBJECT)
        .addParameter("name", STRING)
        .returns(STRING.copy(nullable = true))
        .addCode(
            "val primitive = this[name] as? %T ?: return null\nreturn primitive.takeIf { it.isString }?.content\n",
            JSON_PRIMITIVE,
        ).build()

internal fun EmissionContext.emitAnyOf(
    file: FileSpec.Builder,
    model: AnyOfDeclaration,
) {
    if (model.branches.all { it.shape == AnyOfBranchShape.VALUE }) {
        emitValueAnyOf(file, model)
        return
    }
    require(model.branches.all { it.shape == AnyOfBranchShape.OBJECT }) {
        "Mixed object/value anyOf branches are outside the Phase 1 emission subset"
    }
    val wrapperType = ClassName(model.packageName, model.resolvedName)
    model.branches.forEach { branch -> file.addType(anyOfViewType(branch)) }
    file.addType(
        TypeSpec
            .enumBuilder(model.branchEnumName)
            .addModifiers(KModifier.PUBLIC)
            .apply { model.branches.forEach { addEnumConstant(it.resolvedName) } }
            .build(),
    )
    file.addType(exceptionType("AnyOfNoMatchException", ClassName(model.packageName, "UnionDecodingException")))
    file.addType(anyOfInspection(model))
    file.addType(anyOfWrapper(model, wrapperType))
    file.addFunction(inspectAnyOf(model))
    file.addFunction(isStringFunction())
    file.addFunction(isStringArrayFunction())
}

private fun anyOfViewType(branch: AnyOfBranchDeclaration): TypeSpec {
    val name = branch.viewTypeName
    val constructor = FunSpec.constructorBuilder()
    val type =
        TypeSpec
            .classBuilder(name)
            .addModifiers(KModifier.PUBLIC, KModifier.DATA)
            .addAnnotation(SERIALIZABLE)
    branch.fields.forEach { field ->
        constructor.addParameter(field.resolvedName, field.type.toTypeName())
        val property =
            PropertySpec
                .builder(field.resolvedName, field.type.toTypeName())
                .addModifiers(KModifier.PUBLIC)
                .initializer(field.resolvedName)
        if (field.wireName != field.resolvedName) property.addAnnotation(serialName(field.wireName))
        type.addProperty(property.build())
    }
    return type.primaryConstructor(constructor.build()).build()
}

private fun anyOfInspection(model: AnyOfDeclaration): TypeSpec {
    val constructor = FunSpec.constructorBuilder()
    val type = TypeSpec.classBuilder(model.inspectionName).addModifiers(KModifier.INTERNAL, KModifier.DATA)
    model.branches.forEach { branch ->
        val name = "matches${branch.resolvedName}"
        constructor.addParameter(name, BOOLEAN)
        type.addProperty(PropertySpec.builder(name, BOOLEAN).initializer(name).build())
    }
    constructor.addParameter("failures", LIST.parameterizedBy(STRING))
    type.addProperty(PropertySpec.builder("failures", LIST.parameterizedBy(STRING)).initializer("failures").build())
    type.addProperty(
        PropertySpec
            .builder("matchCount", INT)
            .getter(
                FunSpec
                    .getterBuilder()
                    .addStatement(
                        "return listOf(%L).count { it }",
                        model.branches.joinToString(", ") { "matches${it.resolvedName}" },
                    ).build(),
            ).build(),
    )
    return type.primaryConstructor(constructor.build()).build()
}

private fun EmissionContext.anyOfWrapper(
    model: AnyOfDeclaration,
    wrapperType: ClassName,
): TypeSpec {
    val constructor =
        FunSpec
            .constructorBuilder()
            .addModifiers(KModifier.INTERNAL)
            .addParameter("raw", JSON_ELEMENT)
            .addParameter("json", JSON)
            .addParameter("inspection", ClassName(model.packageName, model.inspectionName))
            .build()
    val type =
        TypeSpec
            .classBuilder(model.resolvedName)
            .addModifiers(KModifier.PUBLIC)
            .addAnnotation(serializableWith(wrapperType.nestedClass("Serializer")))
            .addKdoc("%L\n", sanitizeKDoc(model.kdoc))
            .primaryConstructor(constructor)
            .addProperty(
                PropertySpec
                    .builder("raw", JSON_ELEMENT)
                    .addModifiers(KModifier.PUBLIC)
                    .addKdoc("Raw JSON retained as the serialization authority.\n")
                    .initializer("raw")
                    .build(),
            ).addProperty(
                PropertySpec
                    .builder("json", JSON)
                    .addModifiers(KModifier.PRIVATE)
                    .initializer("json")
                    .build(),
            ).addProperty(
                PropertySpec
                    .builder(
                        "inspection",
                        ClassName(model.packageName, model.inspectionName),
                    ).addModifiers(KModifier.PRIVATE)
                    .initializer("inspection")
                    .build(),
            )
    model.branches.forEach { branch ->
        val propertyType = ClassName(model.packageName, branch.viewTypeName)
        type.addProperty(
            PropertySpec
                .builder(branch.propertyName, propertyType.copy(nullable = true))
                .addModifiers(KModifier.PUBLIC)
                .delegate(
                    "lazy(%T.NONE) { if (inspection.matches%L) json.%M<%T>(raw) else null }",
                    LAZY_THREAD_SAFETY_MODE,
                    branch.resolvedName,
                    DECODE_FROM_JSON_ELEMENT,
                    propertyType,
                ).build(),
        )
    }
    type.addProperty(
        PropertySpec
            .builder(
                "matchedBranches",
                SET.parameterizedBy(ClassName(model.packageName, model.branchEnumName)),
            ).addModifiers(KModifier.PUBLIC)
            .getter(FunSpec.getterBuilder().addCode(matchedBranchesBody(model)).build())
            .build(),
    )
    type.addType(anyOfCompanion(model, wrapperType))
    type.addType(anyOfSerializer(model, wrapperType))
    return type.build()
}

private fun matchedBranchesBody(model: AnyOfDeclaration): CodeBlock =
    CodeBlock
        .builder()
        .add("return buildSet {\n")
        .indent()
        .apply {
            model.branches.forEach { branch ->
                addStatement(
                    "if (inspection.matches%L) add(%T.%L)",
                    branch.resolvedName,
                    ClassName(model.packageName, model.branchEnumName),
                    branch.resolvedName,
                )
            }
        }.unindent()
        .add("}\n")
        .build()

private fun EmissionContext.anyOfCompanion(
    model: AnyOfDeclaration,
    wrapperType: ClassName,
): TypeSpec =
    TypeSpec
        .companionObjectBuilder()
        .addFunction(
            FunSpec
                .builder("fromRaw")
                .addModifiers(KModifier.PUBLIC)
                .addKdoc("Builds a validated wrapper around raw JSON without rewriting it.\n")
                .addParameter("raw", JSON_ELEMENT)
                .addParameter(ParameterSpec.builder("json", JSON).defaultValue("SdkJson").build())
                .returns(wrapperType)
                .addCode(
                    "val inspection = inspect%L(raw)\n" +
                        "if (inspection.matchCount == 0) {\n" +
                        "  throw %T(%S + inspection.failures.joinToString(%S))\n" +
                        "}\n" +
                        "return %T(raw, json, inspection)\n",
                    model.resolvedName,
                    anyOfNoMatch,
                    "${model.resolvedName} matched 0 branches: ",
                    "; ",
                    wrapperType,
                ).build(),
        ).build()

private fun anyOfSerializer(
    model: AnyOfDeclaration,
    wrapperType: ClassName,
): TypeSpec =
    TypeSpec
        .objectBuilder("Serializer")
        .addModifiers(KModifier.PUBLIC)
        .addSuperinterface(K_SERIALIZER.parameterizedBy(wrapperType))
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
                .returns(wrapperType)
                .addStatement("val jsonDecoder = decoder.requireJsonDecoder(%S)", model.resolvedName)
                .addStatement("return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)")
                .build(),
        ).addFunction(
            FunSpec
                .builder("serialize")
                .addModifiers(KModifier.OVERRIDE)
                .addParameter("encoder", ENCODER)
                .addParameter("value", wrapperType)
                .addStatement("encoder.requireJsonEncoder(%S).encodeJsonElement(value.raw)", model.resolvedName)
                .build(),
        ).build()

private fun inspectAnyOf(model: AnyOfDeclaration): FunSpec {
    val inspectionType = ClassName(model.packageName, model.inspectionName)
    val body = CodeBlock.builder()
    body.add("val raw = element as? %T ?: return %T(\n", JSON_OBJECT, inspectionType).indent()
    model.branches.forEach { branch -> body.add("matches%L = false,\n", branch.resolvedName) }
    body.add(
        "failures = listOf(%L),\n",
        model.branches.joinToString { "\"${it.resolvedName}: expected JSON object\"" },
    )
    body.unindent().add(")\n")
    model.branches.forEach { branch ->
        val condition = branch.fields.joinToString(" && ") { field -> field.jsonMatchExpression() }
        body.addStatement("val matches%L = %L", branch.resolvedName, condition.ifEmpty { "true" })
    }
    body.add("return %T(\n", inspectionType).indent()
    model.branches.forEach { branch ->
        body.add("matches%L = matches%L,\n", branch.resolvedName, branch.resolvedName)
    }
    body.add("failures = buildList {\n").indent()
    model.branches.forEach { branch ->
        val fields = branch.fields.joinToString(", ") { "'${it.wireName}'" }
        body.addStatement(
            "if (!matches%L) add(%S)",
            branch.resolvedName,
            "${branch.resolvedName}: required properties $fields do not match their declared types",
        )
    }
    body
        .unindent()
        .add("},\n")
        .unindent()
        .add(")\n")
    return FunSpec
        .builder("inspect${model.resolvedName}")
        .addModifiers(KModifier.PRIVATE)
        .addParameter("element", JSON_ELEMENT)
        .returns(inspectionType)
        .addCode(body.build())
        .build()
}

private fun isStringFunction(): FunSpec =
    FunSpec
        .builder("isString")
        .addModifiers(KModifier.PRIVATE)
        .receiver(JSON_ELEMENT.copy(nullable = true))
        .returns(BOOLEAN)
        .addStatement("return this is %T && isString", JSON_PRIMITIVE)
        .build()

private fun isStringArrayFunction(): FunSpec =
    FunSpec
        .builder("isStringArray")
        .addModifiers(KModifier.PRIVATE)
        .receiver(JSON_ELEMENT.copy(nullable = true))
        .returns(BOOLEAN)
        .addStatement(
            "return this is %T && isNotEmpty() && all { it is %T && it.isString }",
            JSON_ARRAY,
            JSON_PRIMITIVE,
        ).build()

private fun emitValueAnyOf(
    file: FileSpec.Builder,
    model: AnyOfDeclaration,
) {
    val wrapperType = ClassName(model.packageName, model.resolvedName)
    val branchType = ClassName(model.packageName, "${model.resolvedName}Branch")
    val inspectionType = ClassName(model.packageName, "${model.resolvedName}Inspection")
    file.addType(
        TypeSpec
            .enumBuilder(branchType)
            .addModifiers(KModifier.PUBLIC)
            .apply { model.branches.forEach { addEnumConstant(it.resolvedName) } }
            .build(),
    )
    file.addType(
        TypeSpec
            .classBuilder("AnyOfNoMatchException")
            .addModifiers(KModifier.PUBLIC)
            .primaryConstructor(FunSpec.constructorBuilder().addParameter("message", STRING).build())
            .superclass(SERIALIZATION_EXCEPTION)
            .addSuperclassConstructorParameter("message")
            .build(),
    )
    file.addType(valueAnyOfInspection(model, inspectionType))
    file.addType(valueAnyOfWrapper(model, wrapperType, branchType, inspectionType))
    file.addFunction(inspectValueAnyOf(model, inspectionType))
}

private fun valueAnyOfInspection(
    model: AnyOfDeclaration,
    inspectionType: ClassName,
): TypeSpec {
    val constructor = FunSpec.constructorBuilder()
    val type = TypeSpec.classBuilder(inspectionType).addModifiers(KModifier.INTERNAL, KModifier.DATA)
    model.branches.forEach { branch ->
        val name = "matches${branch.resolvedName}"
        constructor.addParameter(name, BOOLEAN)
        type.addProperty(PropertySpec.builder(name, BOOLEAN).initializer(name).build())
    }
    constructor.addParameter("failures", LIST.parameterizedBy(STRING))
    type.addProperty(PropertySpec.builder("failures", LIST.parameterizedBy(STRING)).initializer("failures").build())
    type.addProperty(
        PropertySpec
            .builder("matchCount", INT)
            .getter(
                FunSpec
                    .getterBuilder()
                    .addStatement(
                        "return listOf(%L).count { it }",
                        model.branches.joinToString(", ") { "matches${it.resolvedName}" },
                    ).build(),
            ).build(),
    )
    return type.primaryConstructor(constructor.build()).build()
}

private fun valueAnyOfWrapper(
    model: AnyOfDeclaration,
    wrapperType: ClassName,
    branchType: ClassName,
    inspectionType: ClassName,
): TypeSpec {
    val type =
        TypeSpec
            .classBuilder(model.resolvedName)
            .addModifiers(KModifier.PUBLIC)
            .addAnnotation(serializableWith(wrapperType.nestedClass("Serializer")))
            .addKdoc("%L\n", sanitizeKDoc(model.kdoc))
            .primaryConstructor(
                FunSpec
                    .constructorBuilder()
                    .addModifiers(KModifier.INTERNAL)
                    .addParameter("raw", JSON_ELEMENT)
                    .addParameter("json", JSON)
                    .addParameter("inspection", inspectionType)
                    .build(),
            ).addProperty(
                PropertySpec
                    .builder("raw", JSON_ELEMENT)
                    .addModifiers(KModifier.PUBLIC)
                    .addKdoc("Raw JSON retained as the serialization authority.\n")
                    .initializer("raw")
                    .build(),
            ).addProperty(
                PropertySpec
                    .builder("json", JSON)
                    .addModifiers(KModifier.PRIVATE)
                    .initializer("json")
                    .build(),
            ).addProperty(
                PropertySpec
                    .builder(
                        "inspection",
                        inspectionType,
                    ).addModifiers(KModifier.PRIVATE)
                    .initializer("inspection")
                    .build(),
            )
    model.branches.forEach { branch ->
        val branchValueType =
            requireNotNull(branch.type) {
                "Value anyOf branch ${branch.symbolId} requires a type"
            }.toTypeName()
        type.addProperty(
            PropertySpec
                .builder(branch.propertyName, branchValueType.copy(nullable = true))
                .addModifiers(KModifier.PUBLIC)
                .delegate(
                    "lazy(%T.NONE) { if (inspection.matches%L) json.%M<%T>(raw) else null }",
                    LAZY_THREAD_SAFETY_MODE,
                    branch.resolvedName,
                    DECODE_FROM_JSON_ELEMENT,
                    branchValueType,
                ).build(),
        )
    }
    type.addProperty(
        PropertySpec
            .builder("matchedBranches", SET.parameterizedBy(branchType))
            .addModifiers(KModifier.PUBLIC)
            .getter(
                FunSpec
                    .getterBuilder()
                    .addCode(
                        CodeBlock
                            .builder()
                            .add("return buildSet {\n")
                            .indent()
                            .apply {
                                model.branches.forEach { branch ->
                                    addStatement(
                                        "if (inspection.matches%L) add(%T.%L)",
                                        branch.resolvedName,
                                        branchType,
                                        branch.resolvedName,
                                    )
                                }
                            }.unindent()
                            .add("}\n")
                            .build(),
                    ).build(),
            ).build(),
    )
    type.addType(
        TypeSpec
            .companionObjectBuilder()
            .addFunction(
                FunSpec
                    .builder("fromRaw")
                    .addModifiers(KModifier.PUBLIC)
                    .addKdoc("Builds a validated wrapper around raw JSON without rewriting it.\n")
                    .addParameter("raw", JSON_ELEMENT)
                    .addParameter(ParameterSpec.builder("json", JSON).defaultValue("SdkJson").build())
                    .returns(wrapperType)
                    .addStatement("val inspection = inspect%L(raw)", model.resolvedName)
                    .beginControlFlow("if (inspection.matchCount == 0)")
                    .addStatement(
                        "throw %T(%S + inspection.failures.joinToString(%S))",
                        ClassName(model.packageName, "AnyOfNoMatchException"),
                        "${model.resolvedName} matched 0 branches: ",
                        "; ",
                    ).endControlFlow()
                    .addStatement("return %T(raw, json, inspection)", wrapperType)
                    .build(),
            ).build(),
    )
    type.addType(
        TypeSpec
            .objectBuilder("Serializer")
            .addModifiers(KModifier.PUBLIC)
            .addSuperinterface(K_SERIALIZER.parameterizedBy(wrapperType))
            .addProperty(
                PropertySpec
                    .builder("descriptor", SERIAL_DESCRIPTOR)
                    .addModifiers(KModifier.OVERRIDE)
                    .initializer("%T.serializer().descriptor", JSON_ELEMENT)
                    .build(),
            ).addFunction(
                FunSpec
                    .builder("deserialize")
                    .addModifiers(KModifier.OVERRIDE)
                    .addParameter("decoder", DECODER)
                    .returns(wrapperType)
                    .addStatement("val jsonDecoder = decoder.requireJsonDecoder(%S)", model.resolvedName)
                    .addStatement("return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)")
                    .build(),
            ).addFunction(
                FunSpec
                    .builder("serialize")
                    .addModifiers(KModifier.OVERRIDE)
                    .addParameter("encoder", ENCODER)
                    .addParameter("value", wrapperType)
                    .addStatement("encoder.requireJsonEncoder(%S).encodeJsonElement(value.raw)", model.resolvedName)
                    .build(),
            ).build(),
    )
    return type.build()
}

private fun inspectValueAnyOf(
    model: AnyOfDeclaration,
    inspectionType: ClassName,
): FunSpec {
    val body = CodeBlock.builder()
    model.branches.forEach { branch ->
        val type = requireNotNull(branch.type)
        val expression =
            when {
                type.packageName == "kotlin" && type.simpleName == "String" -> {
                    "element is %T && element.isString"
                }

                type.packageName == "kotlin.collections" && type.simpleName == "List" &&
                    type.arguments.singleOrNull()?.let {
                        it.packageName == "kotlin" && it.simpleName == "String"
                    } ==
                    true -> {
                    "element is %T && element.all { it is %T && it.isString }%L"
                }

                else -> {
                    error("Unsupported Phase 1 value anyOf type: $type")
                }
            }
        val args =
            if (type.simpleName == "String") {
                arrayOf(JSON_PRIMITIVE)
            } else {
                arrayOf(
                    JSON_ARRAY,
                    JSON_PRIMITIVE,
                    CodeBlock.of(" && element.size <= %L", branch.maxItems ?: Int.MAX_VALUE),
                )
            }
        body.addStatement("val matches%L = $expression", branch.resolvedName, *args)
    }
    body.add("return %T(\n", inspectionType).indent()
    model.branches.forEach { branch ->
        body.add("matches%L = matches%L,\n", branch.resolvedName, branch.resolvedName)
    }
    body.add("failures = buildList {\n").indent()
    model.branches.forEach { branch ->
        body.addStatement(
            "if (!matches%L) add(%S)",
            branch.resolvedName,
            "${branch.resolvedName}: value does not match ${branch.type?.simpleName}",
        )
    }
    body
        .unindent()
        .add("},\n")
        .unindent()
        .add(")\n")
    return FunSpec
        .builder("inspect${model.resolvedName}")
        .addModifiers(KModifier.PRIVATE)
        .addParameter("element", JSON_ELEMENT)
        .returns(inspectionType)
        .addCode(body.build())
        .build()
}

private fun UnionFieldDeclaration.jsonMatchExpression(): String =
    when {
        type.simpleName == "String" -> {
            "raw[${kotlinStringLiteral(wireName)}].isString()"
        }

        type.simpleName == "List" && type.arguments.singleOrNull()?.simpleName == "String" -> {
            "raw[${kotlinStringLiteral(wireName)}].isStringArray()"
        }

        else -> {
            error("Unsupported object anyOf field type ${type.packageName}.${type.simpleName}")
        }
    }

private fun UnionFieldDeclaration.matchExpression(prefix: String = ""): String =
    expectedStringValue?.let { "$prefix$resolvedName == ${kotlinStringLiteral(it)}" }
        ?: "$prefix$resolvedName != null"

private fun kotlinStringLiteral(value: String): String =
    buildString {
        append('"')
        value.forEach { character ->
            when (character) {
                '\\' -> append("\\\\")
                '"' -> append("\\\"")
                '\n' -> append("\\n")
                '\r' -> append("\\r")
                '\t' -> append("\\t")
                else -> append(character)
            }
        }
        append('"')
    }

private fun exceptionType(
    name: String,
    superclass: ClassName,
): TypeSpec =
    TypeSpec
        .classBuilder(name)
        .addModifiers(KModifier.PUBLIC)
        .primaryConstructor(FunSpec.constructorBuilder().addParameter("message", STRING).build())
        .superclass(superclass)
        .addSuperclassConstructorParameter("message")
        .build()
