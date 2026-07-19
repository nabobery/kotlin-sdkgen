package com.nabobery.sdkgen.engine.emit

import com.nabobery.sdkgen.engine.declarations.AnyOfBranchDeclaration
import com.nabobery.sdkgen.engine.declarations.AnyOfBranchShape
import com.nabobery.sdkgen.engine.declarations.AnyOfDeclaration
import com.nabobery.sdkgen.engine.declarations.KotlinTypeRef
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
    val decodingException = ClassName(model.packageName, "${model.resolvedName}DecodingException")
    val noMatchException = ClassName(model.packageName, "${model.resolvedName}NoMatchException")
    val ambiguityException = ClassName(model.packageName, "${model.resolvedName}AmbiguityException")
    file.addType(exceptionBaseType("${model.resolvedName}DecodingException"))
    file.addType(exceptionType("${model.resolvedName}NoMatchException", decodingException))
    file.addType(exceptionType("${model.resolvedName}AmbiguityException", decodingException))

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
    val inspectionPlan = oneOfInspectionPlan(model)
    union.addType(oneOfSerializer(model, unionType, noMatchException, ambiguityException, inspectionPlan))
    file.addType(union.build())
    file.addType(oneOfInspection(model, inspectionPlan))
    file.addFunction(inspectOneOf(model, inspectionPlan))
    file.addFunction(stringValueFunction())
}

private data class OneOfInspectionState(
    val field: UnionFieldDeclaration,
    val valueName: String,
    val resultName: String,
    val presentName: String?,
    val decodedName: String,
    val matchesName: String?,
) {
    fun matchExpression(prefix: String = ""): String =
        matchesName?.let { "$prefix$it" }
            ?: presentName?.let { "$prefix$it && $prefix$decodedName" }
            ?: "$prefix$decodedName"

    fun mismatchExpression(prefix: String = ""): String =
        matchesName?.let { "!$prefix$it" }
            ?: presentName?.let { "!$prefix$it || !$prefix$decodedName" }
            ?: "!$prefix$decodedName"
}

private data class OneOfInspectionPlan(
    val states: List<OneOfInspectionState>,
    private val statesByField: Map<UnionFieldDeclaration, OneOfInspectionState>,
    private val valueStates: Map<UnionFieldDeclaration, OneOfInspectionState>,
) {
    fun state(field: UnionFieldDeclaration): OneOfInspectionState = statesByField.getValue(field)

    fun valueStateName(field: UnionFieldDeclaration): String =
        valueStates.getValue(field.copy(expectedStringValue = null)).valueName
}

private class InspectionNameAllocator(
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

private fun oneOfInspectionPlan(model: OneOfDeclaration): OneOfInspectionPlan {
    val fields = model.cases.flatMap { it.matchFields }.distinct()
    val fieldsByResolvedName = fields.groupBy { it.resolvedName }
    val reservedStateNames = fieldsByResolvedName.keys.toMutableSet()
    val preferredStateNames = mutableMapOf<UnionFieldDeclaration, String>()

    fieldsByResolvedName.toSortedMap().forEach { (resolvedName, matchingFields) ->
        if (matchingFields.size == 1) {
            preferredStateNames[matchingFields.single()] = resolvedName
        } else {
            matchingFields
                .sortedBy { it.inspectionShapeSortKey() }
                .forEachIndexed { index, field ->
                    var disambiguator = 1
                    var stateName = "${resolvedName}State${index + 1}"
                    while (!reservedStateNames.add(stateName)) {
                        disambiguator += 1
                        stateName = "${resolvedName}State${index + 1}_$disambiguator"
                    }
                    preferredStateNames[field] = stateName
                }
        }
    }

    val nameAllocator = InspectionNameAllocator(setOf("failures", "names", "raw", "size"))
    val statesByField =
        fields
            .sortedBy { it.inspectionShapeSortKey() }
            .associateWith { field ->
                val valueName = nameAllocator.allocate(preferredStateNames.getValue(field))
                OneOfInspectionState(
                    field = field,
                    valueName = valueName,
                    resultName = nameAllocator.allocate("${valueName}Result"),
                    presentName =
                        if (field.type.nullable) {
                            nameAllocator.allocate("${valueName}Present")
                        } else {
                            null
                        },
                    decodedName = nameAllocator.allocate("${valueName}Decoded"),
                    matchesName =
                        if (field.expectedStringValue != null) {
                            nameAllocator.allocate("${valueName}Matches")
                        } else {
                            null
                        },
                )
            }
    val valueStates =
        fields
            .groupBy { it.copy(expectedStringValue = null) }
            .mapValues { (_, matchingFields) ->
                val representative = matchingFields.minBy { it.inspectionShapeSortKey() }
                statesByField.getValue(representative)
            }

    return OneOfInspectionPlan(
        states = fields.map(statesByField::getValue),
        statesByField = statesByField,
        valueStates = valueStates,
    )
}

private fun UnionFieldDeclaration.inspectionShapeSortKey(): String =
    buildString {
        append(resolvedName).append('|')
        append(wireName).append('|')
        append(type.inspectionShapeSortKey()).append('|')
        append(expectedStringValue != null).append('|')
        append(expectedStringValue.orEmpty())
    }

private fun KotlinTypeRef.inspectionShapeSortKey(): String =
    buildString {
        append(packageName).append(':').append(simpleName)
        if (arguments.isNotEmpty()) {
            append('<')
            arguments.forEachIndexed { index, argument ->
                if (index > 0) append(',')
                append(argument.inspectionShapeSortKey())
            }
            append('>')
        }
        append(if (nullable) '?' else '!')
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
    val expectedValues = case.matchFields.associate { it.wireName to it.expectedStringValue }
    val requiredWireNames = case.requiredFields.map(UnionFieldDeclaration::wireName).toSet()
    val raw = CodeBlock.builder().add("%M {\n", BUILD_JSON_OBJECT).indent()
    case.requiredFields.forEach { field ->
        val expected = expectedValues[field.wireName]
        if (expected != null) {
            raw.add("%M(%S, %S)\n", PUT, field.wireName, expected)
        } else if (field.type.packageName == "kotlin" && field.type.simpleName == "String") {
            raw.add("%M(%S, %L)\n", PUT, field.wireName, field.resolvedName)
        } else {
            raw.add(
                "%M(%S, SdkJson.%M(%L))\n",
                PUT,
                field.wireName,
                ENCODE_TO_JSON_ELEMENT,
                field.resolvedName,
            )
        }
    }
    case.matchFields
        .filter { expectedValues[it.wireName] != null && it.wireName !in requiredWireNames }
        .forEach { field ->
            raw.add(
                "%M(%S, %S)\n",
                PUT,
                field.wireName,
                requireNotNull(expectedValues.getValue(field.wireName)),
            )
        }
    raw.unindent().add("}")
    val call = CodeBlock.builder().add("return %T(\n", caseType).indent()
    case.requiredFields.forEach { field -> call.add("%L = %L,\n", field.resolvedName, field.resolvedName) }
    call.add("raw = %L,\n", raw.build()).unindent().add(")")
    return function.addCode(call.build()).build()
}

private fun EmissionContext.oneOfSerializer(
    model: OneOfDeclaration,
    unionType: ClassName,
    noMatchException: ClassName,
    ambiguityException: ClassName,
    inspectionPlan: OneOfInspectionPlan,
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
                .addCode(oneOfDeserializeBody(model, unionType, noMatchException, ambiguityException, inspectionPlan))
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
    noMatchException: ClassName,
    ambiguityException: ClassName,
    inspectionPlan: OneOfInspectionPlan,
): CodeBlock {
    val code =
        CodeBlock
            .builder()
            .addStatement("val jsonDecoder = decoder.requireJsonDecoder(%S)", model.resolvedName)
            .addStatement(
                "val raw = jsonDecoder.decodeJsonElement() as? %T ?: throw %T(%S)",
                JSON_OBJECT,
                noMatchException,
                "${model.resolvedName} matched 0 branches: expected JSON object",
            ).addStatement("val matches = inspect%L(raw)", model.resolvedName)
            .beginControlFlow("if (matches.size == 0)")
            .addStatement(
                "throw %T(%S + matches.failures.joinToString(%S))",
                noMatchException,
                "${model.resolvedName} matched 0 branches: ",
                "; ",
            ).endControlFlow()
            .beginControlFlow("if (matches.size > 1)")
            .addStatement(
                "throw %T(%S + matches.size + %S + matches.names.joinToString())",
                ambiguityException,
                "${model.resolvedName} matched ",
                " branches; expected exactly 1: ",
            ).endControlFlow()
            .beginControlFlow("return when")
    model.cases.forEach { case ->
        val caseType = unionType.nestedClass(case.resolvedName)
        val checks =
            case.matchFields.joinToString(" && ") {
                inspectionPlan.state(it).matchExpression("matches.")
            }
        val args =
            case.requiredFields.joinToString(
                ", ",
            ) { field ->
                val stateName = inspectionPlan.valueStateName(field)
                val value =
                    if (field.type.nullable) {
                        "matches.$stateName"
                    } else {
                        "requireNotNull(matches.$stateName)"
                    }
                "${field.resolvedName} = $value"
            }
        val constructorArguments = if (args.isEmpty()) "raw = raw" else "$args, raw = raw"
        code.addStatement("$checks -> %T($constructorArguments)", caseType)
    }
    code
        .addStatement("else -> error(%S)", "unreachable")
        .endControlFlow()
    return code.build()
}

private fun oneOfInspection(
    model: OneOfDeclaration,
    inspectionPlan: OneOfInspectionPlan,
): TypeSpec {
    val constructor = FunSpec.constructorBuilder()
    val type =
        TypeSpec
            .classBuilder(
                "${model.resolvedName}Inspection",
            ).addModifiers(KModifier.PRIVATE, KModifier.DATA)
    inspectionPlan.states.forEach { state ->
        val field = state.field
        constructor.addParameter(state.valueName, field.type.toTypeName().copy(nullable = true))
        type.addProperty(
            PropertySpec
                .builder(
                    state.valueName,
                    field.type.toTypeName().copy(nullable = true),
                ).initializer(state.valueName)
                .build(),
        )
        state.presentName?.let { presentName ->
            constructor.addParameter(presentName, BOOLEAN)
            type.addProperty(PropertySpec.builder(presentName, BOOLEAN).initializer(presentName).build())
        }
        constructor.addParameter(state.decodedName, BOOLEAN)
        type.addProperty(PropertySpec.builder(state.decodedName, BOOLEAN).initializer(state.decodedName).build())
        state.matchesName?.let { matchesName ->
            constructor.addParameter(matchesName, BOOLEAN)
            type.addProperty(PropertySpec.builder(matchesName, BOOLEAN).initializer(matchesName).build())
        }
    }
    constructor.addParameter("failures", LIST.parameterizedBy(STRING))
    type.addProperty(PropertySpec.builder("failures", LIST.parameterizedBy(STRING)).initializer("failures").build())
    type.addProperty(
        PropertySpec
            .builder("names", LIST.parameterizedBy(STRING))
            .getter(FunSpec.getterBuilder().addCode(oneOfNamesBody(model, inspectionPlan)).build())
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

private fun oneOfNamesBody(
    model: OneOfDeclaration,
    inspectionPlan: OneOfInspectionPlan,
): CodeBlock =
    CodeBlock
        .builder()
        .add("return buildList {\n")
        .indent()
        .apply {
            model.cases.forEach { case ->
                val check =
                    case.matchFields.joinToString(" && ") {
                        inspectionPlan.state(it).matchExpression()
                    }
                addStatement("if ($check) add(%S)", case.resolvedName)
            }
        }.unindent()
        .add("}\n")
        .build()

private fun inspectOneOf(
    model: OneOfDeclaration,
    inspectionPlan: OneOfInspectionPlan,
): FunSpec {
    val body = CodeBlock.builder()
    inspectionPlan.states.forEach { state ->
        val field = state.field
        body.addStatement(
            "val %L = raw[%S]?.let { element -> runCatching { SdkJson.%M<%T>(element) } }",
            state.resultName,
            field.wireName,
            DECODE_FROM_JSON_ELEMENT,
            field.type.toTypeName(),
        )
        body.addStatement(
            "val %L = %L?.getOrNull()",
            state.valueName,
            state.resultName,
        )
        state.presentName?.let { presentName ->
            body.addStatement("val %L = raw.containsKey(%S)", presentName, field.wireName)
        }
        body.addStatement(
            "val %L = %L?.isSuccess == true",
            state.decodedName,
            state.resultName,
        )
        state.matchesName?.let { matchesName ->
            val expected = requireNotNull(field.expectedStringValue)
            val decoded = state.presentName?.let { "$it && ${state.decodedName}" } ?: state.decodedName
            body.addStatement(
                "val %L = raw.stringValue(%S) == %S && $decoded",
                matchesName,
                field.wireName,
                expected,
            )
        }
    }
    body.add("return %T(\n", ClassName(model.packageName, "${model.resolvedName}Inspection")).indent()
    inspectionPlan.states.forEach { state ->
        body.add("%L = %L,\n", state.valueName, state.valueName)
        state.presentName?.let { presentName ->
            body.add("%L = %L,\n", presentName, presentName)
        }
        body.add("%L = %L,\n", state.decodedName, state.decodedName)
        state.matchesName?.let { matchesName ->
            body.add("%L = %L,\n", matchesName, matchesName)
        }
    }
    body.add("failures = buildList {\n").indent()
    model.cases.forEach { case ->
        val condition =
            case.matchFields.joinToString(" || ") {
                inspectionPlan.state(it).mismatchExpression()
            }
        val names = case.matchFields.joinToString("' and '") { it.wireName }
        body.addStatement(
            "if ($condition) add(%S)",
            "${case.resolvedName}: required properties '$names' do not match their declared types",
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
    if (model.branches.all { it.shape == AnyOfBranchShape.VALUE } ||
        model.branches.any { it.shape == AnyOfBranchShape.VALUE }
    ) {
        require(model.branches.all { it.type != null }) {
            "Mixed anyOf branches require a typed value for every branch"
        }
        emitValueAnyOf(file, model)
        return
    }
    val wrapperType = ClassName(model.packageName, model.resolvedName)
    model.branches.filter { branch -> branch.viewFileName == null }.forEach { branch ->
        file.addType(anyOfViewType(branch))
    }
    file.addType(
        TypeSpec
            .enumBuilder(model.branchEnumName)
            .addModifiers(KModifier.PUBLIC)
            .apply { model.branches.forEach { addEnumConstant(it.resolvedName) } }
            .build(),
    )
    val decodingException = ClassName(model.packageName, "${model.resolvedName}DecodingException")
    file.addType(exceptionBaseType("${model.resolvedName}DecodingException"))
    file.addType(exceptionType("${model.resolvedName}NoMatchException", decodingException))
    file.addType(anyOfInspection(model))
    file.addType(anyOfWrapper(model, wrapperType))
    file.addFunction(inspectAnyOf(model))
    file.addFunction(isStringFunction())
    file.addFunction(isStringArrayFunction())
}

internal fun anyOfViewType(branch: AnyOfBranchDeclaration): TypeSpec {
    val name = branch.viewTypeName
    val constructor = FunSpec.constructorBuilder()
    val type =
        TypeSpec
            .classBuilder(name)
            .addModifiers(KModifier.PUBLIC, KModifier.DATA)
            .addAnnotation(SERIALIZABLE)
    branch.viewFields.forEach { field ->
        val parameter = ParameterSpec.builder(field.resolvedName, field.type.toTypeName())
        if (!field.required) parameter.defaultValue("null")
        constructor.addParameter(parameter.build())
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
                    ClassName(model.packageName, "${model.resolvedName}NoMatchException"),
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

private fun isJsonDecodableFunction(): FunSpec {
    val type =
        com.squareup.kotlinpoet
            .TypeVariableName("T")
            .copy(reified = true)
    return FunSpec
        .builder("isJsonDecodable")
        .addModifiers(KModifier.PRIVATE, KModifier.INLINE)
        .addTypeVariable(type)
        .receiver(JSON_ELEMENT.copy(nullable = true))
        .returns(BOOLEAN)
        .addStatement("val element = this ?: return false")
        .addStatement("return runCatching { SdkJson.%M<%T>(element) }.isSuccess", DECODE_FROM_JSON_ELEMENT, type)
        .build()
}

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
    val decodingException = ClassName(model.packageName, "${model.resolvedName}DecodingException")
    file.addType(exceptionBaseType("${model.resolvedName}DecodingException"))
    file.addType(exceptionType("${model.resolvedName}NoMatchException", decodingException))
    file.addType(valueAnyOfInspection(model, inspectionType))
    file.addType(valueAnyOfWrapper(model, wrapperType, branchType, inspectionType))
    file.addFunction(inspectValueAnyOf(model, inspectionType))
    file.addFunction(isJsonDecodableFunction())
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
                        ClassName(model.packageName, "${model.resolvedName}NoMatchException"),
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
        val expression = valueAnyOfMatchExpression()
        val args: Array<out Any> =
            if (type.packageName == "kotlin.collections" && type.simpleName == "List") {
                arrayOf(type.toTypeName(), JSON_ARRAY)
            } else {
                arrayOf(type.toTypeName())
            }
        val maxItems =
            if (type.packageName == "kotlin.collections" && type.simpleName == "List") {
                " && (element as? %T)?.size?.let { it <= ${branch.maxItems ?: Int.MAX_VALUE} } == true"
            } else {
                ""
            }
        body.addStatement("val matches%L = $expression$maxItems", branch.resolvedName, *args)
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

private fun valueAnyOfMatchExpression(): String = "element.isJsonDecodable<%T>()"

private fun UnionFieldDeclaration.jsonMatchExpression(): String =
    when {
        type.simpleName == "String" -> {
            "raw[${kotlinStringLiteral(wireName)}].isString()"
        }

        type.simpleName == "List" && type.arguments.singleOrNull()?.simpleName == "String" -> {
            "raw[${kotlinStringLiteral(wireName)}].isStringArray()"
        }

        else -> {
            "raw[${kotlinStringLiteral(wireName)}] != null"
        }
    }

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

private fun exceptionBaseType(name: String): TypeSpec =
    TypeSpec
        .classBuilder(name)
        .addModifiers(KModifier.PUBLIC, KModifier.SEALED)
        .primaryConstructor(FunSpec.constructorBuilder().addParameter("message", STRING).build())
        .superclass(SERIALIZATION_EXCEPTION)
        .addSuperclassConstructorParameter("message")
        .build()

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
