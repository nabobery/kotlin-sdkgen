package com.nabobery.sdkgen.engine.emit

import com.nabobery.sdkgen.engine.declarations.AnyOfBranchDeclaration
import com.nabobery.sdkgen.engine.declarations.AnyOfBranchShape
import com.nabobery.sdkgen.engine.declarations.AnyOfDeclaration
import com.nabobery.sdkgen.engine.declarations.JsonAdditionalPropertiesPredicate
import com.nabobery.sdkgen.engine.declarations.JsonBranchPredicate
import com.nabobery.sdkgen.engine.declarations.JsonStringFormat
import com.nabobery.sdkgen.engine.declarations.KotlinTypeRef
import com.nabobery.sdkgen.engine.declarations.OneOfCaseDeclaration
import com.nabobery.sdkgen.engine.declarations.OneOfDeclaration
import com.nabobery.sdkgen.engine.declarations.PrimitiveOneOfCaseDeclaration
import com.nabobery.sdkgen.engine.declarations.PrimitiveOneOfDeclaration
import com.nabobery.sdkgen.engine.declarations.PrimitiveOneOfJsonKind
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
    val branchValidationException = ClassName(model.packageName, "${model.resolvedName}BranchValidationException")
    val inspectionPlan = oneOfInspectionPlan(model)
    file.addType(exceptionBaseType("${model.resolvedName}DecodingException"))
    file.addType(exceptionType("${model.resolvedName}NoMatchException", decodingException))
    file.addType(exceptionType("${model.resolvedName}AmbiguityException", decodingException))
    file.addType(exceptionType("${model.resolvedName}BranchValidationException", decodingException))
    if (model.cases.any { case -> case.predicate != null }) {
        file.addImport("kotlinx.serialization.json", "JsonArray", "JsonNull", "JsonObject", "JsonPrimitive")
    }

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
    model.cases.forEach { case ->
        union.addType(
            oneOfCase(
                unionType,
                model,
                case,
                branchValidationException,
                noMatchException,
                ambiguityException,
                inspectionPlan,
            ),
        )
    }
    union.addType(oneOfSerializer(model, unionType, noMatchException, ambiguityException, inspectionPlan))
    file.addType(union.build())
    file.addType(oneOfInspection(model, inspectionPlan))
    file.addFunction(inspectOneOf(model, inspectionPlan))
    oneOfPredicateFunctions(model).forEach(file::addFunction)
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
}

private data class OneOfInspectionPlan(
    val states: List<OneOfInspectionState>,
    private val statesByField: Map<UnionFieldDeclaration, OneOfInspectionState>,
    private val valueStates: Map<UnionFieldDeclaration, OneOfInspectionState>,
    private val caseMatchNames: Map<OneOfCaseDeclaration, String>,
) {
    fun state(field: UnionFieldDeclaration): OneOfInspectionState = statesByField.getValue(field)

    fun valueStateName(field: UnionFieldDeclaration): String =
        valueStates.getValue(field.copy(expectedStringValue = null, expectedStringValues = emptyList())).valueName

    fun caseMatchName(case: OneOfCaseDeclaration): String = caseMatchNames.getValue(case)
}

private class InspectionNameAllocator(
    initialNames: Set<String>,
) {
    private val usedNames = initialNames.toMutableSet()
    private val usedGetterNames = initialNames.mapTo(mutableSetOf(), ::getterName)

    fun allocate(preferredName: String): String {
        var suffix = 1
        while (true) {
            val candidate = if (suffix == 1) preferredName else "$preferredName$suffix"
            val getterName = getterName(candidate)
            if (candidate !in usedNames && getterName !in usedGetterNames) {
                usedNames += candidate
                usedGetterNames += getterName
                return candidate
            }
            suffix += 1
        }
    }
}

private fun getterName(name: String): String = name.replaceFirstChar(Char::uppercaseChar)

private fun oneOfInspectionPlan(model: OneOfDeclaration): OneOfInspectionPlan {
    val fields = model.cases.flatMap { case -> case.matchFields + case.requiredFields }.distinct()
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

    val nameAllocator = InspectionNameAllocator(setOf("failures", "names", "raw", "rawEmpty", "size"))
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
                        if (field.expectedStringValues.isNotEmpty()) {
                            nameAllocator.allocate("${valueName}Matches")
                        } else {
                            null
                        },
                )
            }
    val valueStates =
        fields
            .groupBy { it.copy(expectedStringValue = null, expectedStringValues = emptyList()) }
            .mapValues { (_, matchingFields) ->
                val representative = matchingFields.minBy { it.inspectionShapeSortKey() }
                statesByField.getValue(representative)
            }

    val caseMatchNames =
        model.cases.associateWith { case ->
            nameAllocator.allocate("${case.resolvedName}Matches")
        }
    return OneOfInspectionPlan(
        states = fields.map(statesByField::getValue),
        statesByField = statesByField,
        valueStates = valueStates,
        caseMatchNames = caseMatchNames,
    )
}

private fun OneOfCaseDeclaration.matchExpression(
    inspectionPlan: OneOfInspectionPlan,
    prefix: String = "",
): String = prefix + inspectionPlan.caseMatchName(this)

private fun OneOfCaseDeclaration.legacyMatchExpression(inspectionPlan: OneOfInspectionPlan): String =
    if (matchesEmptyObject) {
        "rawEmpty"
    } else {
        matchFields.joinToString(" && ") { field -> inspectionPlan.state(field).matchExpression() }
    }

private fun UnionFieldDeclaration.inspectionShapeSortKey(): String =
    buildString {
        append(resolvedName).append('|')
        append(wireName).append('|')
        append(type.inspectionShapeSortKey()).append('|')
        append(expectedStringValues.isNotEmpty()).append('|')
        append(expectedStringValues.joinToString(","))
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
    model: OneOfDeclaration,
    case: OneOfCaseDeclaration,
    branchValidationException: ClassName,
    noMatchException: ClassName,
    ambiguityException: ClassName,
    inspectionPlan: OneOfInspectionPlan,
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
            .addFunction(
                oneOfFactory(
                    caseType,
                    model,
                    case,
                    branchValidationException,
                    noMatchException,
                    ambiguityException,
                    inspectionPlan,
                ),
            ).build(),
    )
    return type.build()
}

private fun oneOfFactory(
    caseType: ClassName,
    model: OneOfDeclaration,
    case: OneOfCaseDeclaration,
    branchValidationException: ClassName,
    noMatchException: ClassName,
    ambiguityException: ClassName,
    inspectionPlan: OneOfInspectionPlan,
): FunSpec {
    val function =
        FunSpec
            .builder("of")
            .addModifiers(KModifier.PUBLIC)
            .addKdoc("Creates this branch and its canonical raw JSON representation.\n")
            .returns(caseType)
    case.requiredFields.forEach { field -> function.addParameter(field.resolvedName, field.type.toTypeName()) }
    val requiredWireNames = case.requiredFields.map(UnionFieldDeclaration::wireName).toSet()
    val expectedValues =
        case.matchFields
            .filterNot { field -> field.wireName in requiredWireNames }
            .associate { field -> field.wireName to field.expectedStringValues.singleOrNull() }
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
    val call = CodeBlock.builder()
    call.addStatement("val raw = %L", raw.build())
    call.addStatement("val inspection = inspect%L(raw)", model.resolvedName)
    call.beginControlFlow("if (inspection.size == 0)")
    call.addStatement(
        "throw %T(%S + inspection.failures.joinToString(%S))",
        noMatchException,
        "${model.resolvedName} matched 0 branches: ",
        "; ",
    )
    call.endControlFlow()
    call.beginControlFlow("if (!inspection.%L)", inspectionPlan.caseMatchName(case))
    call.addStatement(
        "throw %T(%S)",
        branchValidationException,
        "${case.resolvedName} factory arguments do not satisfy the selected JSON Schema branch",
    )
    call.endControlFlow()
    call.beginControlFlow("if (inspection.size > 1)")
    call.addStatement(
        "throw %T(%S + inspection.size + %S + inspection.names.joinToString())",
        ambiguityException,
        "${model.resolvedName} matched ",
        " branches; expected exactly 1: ",
    )
    call.endControlFlow()
    call.add("return %T(\n", caseType).indent()
    case.requiredFields.forEach { field -> call.add("%L = %L,\n", field.resolvedName, field.resolvedName) }
    call.add("raw = raw,\n").unindent().add(")")
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
                "val rawObject = jsonDecoder.decodeJsonElement() as? %T ?: throw %T(%S)",
                JSON_OBJECT,
                noMatchException,
                "${model.resolvedName} matched 0 branches: expected JSON object",
            ).addStatement("val matches = inspect%L(rawObject)", model.resolvedName)
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
        val checks = case.matchExpression(inspectionPlan, "matches.")
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
        val constructorArguments = if (args.isEmpty()) "raw = rawObject" else "$args, raw = rawObject"
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
            ).addModifiers(KModifier.INTERNAL, KModifier.DATA)
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
    model.cases.forEach { case ->
        val name = inspectionPlan.caseMatchName(case)
        constructor.addParameter(name, BOOLEAN)
        type.addProperty(PropertySpec.builder(name, BOOLEAN).initializer(name).build())
    }
    constructor.addParameter("rawEmpty", BOOLEAN)
    type.addProperty(PropertySpec.builder("rawEmpty", BOOLEAN).initializer("rawEmpty").build())
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
                addStatement("if (${case.matchExpression(inspectionPlan)}) add(%S)", case.resolvedName)
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
            "val %L = rawObject[%S]?.let { element -> runCatching { SdkJson.%M<%T>(element) } }",
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
            body.addStatement("val %L = rawObject.containsKey(%S)", presentName, field.wireName)
        }
        body.addStatement(
            "val %L = %L?.isSuccess == true",
            state.decodedName,
            state.resultName,
        )
        state.matchesName?.let { matchesName ->
            val expected =
                CodeBlock.builder().apply {
                    field.expectedStringValues.forEachIndexed { index, value ->
                        if (index > 0) add(" || ")
                        add("rawObject.stringValue(%S) == %S", field.wireName, value)
                    }
                }
            val decoded = state.presentName?.let { "$it && ${state.decodedName}" } ?: state.decodedName
            body.addStatement(
                "val %L = (%L) && $decoded",
                matchesName,
                expected.build(),
            )
        }
    }
    body.addStatement("val rawEmpty = rawObject.isEmpty()")
    model.cases.forEach { case ->
        val expression =
            case.predicate?.let {
                "${oneOfCasePredicateFunctionName(model, case)}(rawObject)"
            } ?: case.legacyMatchExpression(inspectionPlan)
        body.addStatement("val %L = %L", inspectionPlan.caseMatchName(case), expression)
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
    model.cases.forEach { case ->
        val name = inspectionPlan.caseMatchName(case)
        body.add("%L = %L,\n", name, name)
    }
    body.add("rawEmpty = rawEmpty,\n")
    body.add("failures = buildList {\n").indent()
    model.cases.forEach { case ->
        val condition = "!${inspectionPlan.caseMatchName(case)}"
        val failure =
            if (case.matchesEmptyObject) {
                "${case.resolvedName}: expected a closed empty object"
            } else {
                val names = case.matchFields.joinToString("' and '") { it.wireName }
                "${case.resolvedName}: branch predicate did not match properties '$names'"
            }
        body.addStatement("if ($condition) add(%S)", failure)
    }
    body
        .unindent()
        .add("},\n")
        .unindent()
        .add(")\n")
    return FunSpec
        .builder("inspect${model.resolvedName}")
        .addModifiers(KModifier.PRIVATE)
        .addParameter("rawObject", JSON_OBJECT)
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

internal fun EmissionContext.emitPrimitiveOneOf(
    file: FileSpec.Builder,
    model: PrimitiveOneOfDeclaration,
) {
    val unionType = ClassName(model.packageName, model.resolvedName)
    val decodingException = ClassName(model.packageName, "${model.resolvedName}DecodingException")
    val noMatchException = ClassName(model.packageName, "${model.resolvedName}NoMatchException")
    val ambiguityException = ClassName(model.packageName, "${model.resolvedName}AmbiguityException")
    val branchValidationException = ClassName(model.packageName, "${model.resolvedName}BranchValidationException")
    file.addImport("kotlinx.serialization.json", "JsonArray", "JsonNull", "JsonObject", "JsonPrimitive")
    file.addType(exceptionBaseType("${model.resolvedName}DecodingException"))
    file.addType(exceptionType("${model.resolvedName}NoMatchException", decodingException))
    file.addType(exceptionType("${model.resolvedName}AmbiguityException", decodingException))
    file.addType(exceptionType("${model.resolvedName}BranchValidationException", decodingException))

    val union =
        TypeSpec
            .interfaceBuilder(model.resolvedName)
            .addModifiers(KModifier.PUBLIC, KModifier.SEALED)
            .addAnnotation(serializableWith(unionType.nestedClass("Serializer")))
            .addKdoc("%L\n", sanitizeKDoc(model.kdoc))
            .addProperty(
                PropertySpec
                    .builder("raw", JSON_ELEMENT)
                    .addModifiers(KModifier.PUBLIC, KModifier.ABSTRACT)
                    .addKdoc("Raw JSON retained as the serialization authority.\n")
                    .build(),
            )
    model.cases.forEach { case -> union.addType(primitiveOneOfCase(unionType, case, branchValidationException)) }
    union.addType(primitiveOneOfCompanion(model, unionType, noMatchException, ambiguityException))
    union.addType(primitiveOneOfSerializer(model, unionType))
    file.addType(union.build())
    primitiveOneOfPredicateFunctions(model).forEach(file::addFunction)
}

private fun EmissionContext.primitiveOneOfCase(
    unionType: ClassName,
    case: PrimitiveOneOfCaseDeclaration,
    branchValidationException: ClassName,
): TypeSpec {
    val caseType = unionType.nestedClass(case.resolvedName)
    return TypeSpec
        .classBuilder(case.resolvedName)
        .addModifiers(KModifier.PUBLIC, KModifier.DATA)
        .primaryConstructor(
            FunSpec
                .constructorBuilder()
                .addModifiers(KModifier.INTERNAL)
                .addParameter("value", case.type.toTypeName())
                .addParameter("raw", JSON_ELEMENT)
                .build(),
        ).addSuperinterface(unionType)
        .addProperty(
            PropertySpec
                .builder("value", case.type.toTypeName())
                .addModifiers(KModifier.PUBLIC)
                .initializer("value")
                .build(),
        ).addProperty(
            PropertySpec
                .builder("raw", JSON_ELEMENT)
                .addModifiers(KModifier.PUBLIC, KModifier.OVERRIDE)
                .addKdoc("Raw JSON retained as the serialization authority.\n")
                .initializer("raw")
                .build(),
        ).addType(
            TypeSpec
                .companionObjectBuilder()
                .addFunction(
                    FunSpec
                        .builder("of")
                        .addModifiers(KModifier.PUBLIC)
                        .addKdoc("Creates this branch and its canonical raw JSON representation.\n")
                        .addParameter("value", case.type.toTypeName())
                        .returns(caseType)
                        .addStatement("val raw = %M.%M(value)", sdkJson, ENCODE_TO_JSON_ELEMENT)
                        .beginControlFlow("if (!matches%L(raw))", case.resolvedName)
                        .addStatement(
                            "throw %T(%S)",
                            branchValidationException,
                            "${case.resolvedName} value does not satisfy its JSON Schema branch predicate",
                        ).endControlFlow()
                        .addStatement("return %T(value, raw)", caseType)
                        .build(),
                ).build(),
        ).build()
}

private fun EmissionContext.primitiveOneOfCompanion(
    model: PrimitiveOneOfDeclaration,
    unionType: ClassName,
    noMatchException: ClassName,
    ambiguityException: ClassName,
): TypeSpec =
    TypeSpec
        .companionObjectBuilder()
        .addFunction(
            FunSpec
                .builder("fromRaw")
                .addModifiers(KModifier.PUBLIC)
                .addKdoc("Decodes exactly one JSON-kind-compatible branch without rewriting raw JSON.\n")
                .addParameter("raw", JSON_ELEMENT)
                .addParameter(ParameterSpec.builder("json", JSON).defaultValue("%M", sdkJson).build())
                .returns(unionType)
                .addCode(primitiveOneOfFromRawBody(model, unionType, noMatchException, ambiguityException))
                .build(),
        ).build()

private fun primitiveOneOfFromRawBody(
    model: PrimitiveOneOfDeclaration,
    unionType: ClassName,
    noMatchException: ClassName,
    ambiguityException: ClassName,
): CodeBlock {
    val body = CodeBlock.builder().add("val matches = buildList<String> {\n").indent()
    model.cases.forEach { case ->
        body.addStatement("if (matches%L(raw)) add(%S)", case.resolvedName, case.resolvedName)
    }
    body.unindent().add("}\n")
    body.beginControlFlow("if (matches.isEmpty())")
    body.addStatement("throw %T(%S)", noMatchException, "${model.resolvedName} matched 0 branches")
    body.endControlFlow()
    body.beginControlFlow("if (matches.size > 1)")
    body.addStatement(
        "throw %T(%S + matches.size + %S + matches.joinToString())",
        ambiguityException,
        "${model.resolvedName} matched ",
        " branches; expected exactly 1: ",
    )
    body.endControlFlow()
    body.beginControlFlow("return when (matches.single())")
    model.cases.forEach { case ->
        body.addStatement(
            "%S -> %T(json.%M<%T>(raw), raw)",
            case.resolvedName,
            unionType.nestedClass(case.resolvedName),
            DECODE_FROM_JSON_ELEMENT,
            case.type.toTypeName(),
        )
    }
    body.addStatement("else -> error(%S)", "unreachable")
    body.endControlFlow()
    return body.build()
}

private fun oneOfPredicateFunctions(model: OneOfDeclaration): List<FunSpec> {
    val predicateCases = model.cases.filter { case -> case.predicate != null }
    return predicateCases.map { case ->
        FunSpec
            .builder(oneOfCasePredicateFunctionName(model, case))
            .addModifiers(KModifier.PRIVATE)
            .addParameter("rawObject", JSON_OBJECT)
            .returns(BOOLEAN)
            .addStatement("return %L", primitivePredicateExpression(requireNotNull(case.predicate), "rawObject"))
            .build()
    } + if (predicateCases.isEmpty()) emptyList() else predicateSupportFunctions(model.packageName)
}

private fun oneOfCasePredicateFunctionName(
    model: OneOfDeclaration,
    case: OneOfCaseDeclaration,
): String = "matches${model.resolvedName}${case.resolvedName}Branch"

private fun primitiveOneOfPredicateFunctions(model: PrimitiveOneOfDeclaration): List<FunSpec> =
    model.cases.map { case ->
        FunSpec
            .builder("matches${case.resolvedName}")
            .addModifiers(KModifier.PRIVATE)
            .addParameter("element", JSON_ELEMENT)
            .returns(BOOLEAN)
            .addStatement("return %L", primitivePredicateExpression(case.predicate, "element"))
            .build()
    } + predicateSupportFunctions(model.packageName)

private fun primitivePredicateExpression(
    predicate: JsonBranchPredicate,
    element: String,
): String =
    when (predicate) {
        JsonBranchPredicate.AnyValue -> {
            "true"
        }

        JsonBranchPredicate.NeverMatch -> {
            "false"
        }

        is JsonBranchPredicate.Kind -> {
            primitiveOneOfKindCondition(predicate.kind, element)
        }

        is JsonBranchPredicate.AllOf -> {
            predicate.predicates.joinToString(" && ", "(", ")") {
                primitivePredicateExpression(it, element)
            }
        }

        is JsonBranchPredicate.AnyOf -> {
            predicate.predicates.joinToString(" || ", "(", ")") {
                primitivePredicateExpression(it, element)
            }
        }

        is JsonBranchPredicate.Constant -> {
            val expected = jsonString(jsonLiteral(predicate.value))
            "$element.jsonSchemaEquals(SdkJson.parseToJsonElement($expected))"
        }

        is JsonBranchPredicate.Enumeration -> {
            predicate.values.joinToString(" || ", "(", ")") { value ->
                val expected = jsonString(jsonLiteral(value))
                "$element.jsonSchemaEquals(SdkJson.parseToJsonElement($expected))"
            }
        }

        is JsonBranchPredicate.Numeric -> {
            val bounds =
                listOf(
                    predicate.minimum.jsonLiteral(),
                    predicate.maximum.jsonLiteral(),
                    predicate.exclusiveMinimum.jsonLiteral(),
                    predicate.exclusiveMaximum.jsonLiteral(),
                    predicate.multipleOf.jsonLiteral(),
                ).joinToString()
            "$element.matchesJsonSchemaNumber($bounds)"
        }

        is JsonBranchPredicate.StringShape -> {
            val lengths = listOf(predicate.minLength ?: "null", predicate.maxLength ?: "null").joinToString()
            val format = predicate.format.formatExpression()
            "$element.matchesJsonSchemaString($lengths, $format)"
        }

        is JsonBranchPredicate.ArrayShape -> {
            val array = "($element as JsonArray)"
            val checks = mutableListOf<String>()
            predicate.minItems?.let { checks += "$array.size >= $it" }
            predicate.maxItems?.let { checks += "$array.size <= $it" }
            predicate.item?.let { item ->
                checks +=
                    "$array.all { item -> ${primitivePredicateExpression(item, "item")} }"
            }
            if (predicate.uniqueItems) {
                checks +=
                    "$array.indices.none { left -> (left + 1 until $array.size).any { right -> $array[left].jsonSchemaEquals($array[right]) } }"
            }
            "$element !is JsonArray || (${checks.joinToString(" && ").ifEmpty { "true" }})"
        }

        is JsonBranchPredicate.ObjectShape -> {
            val jsonObject = "($element as JsonObject)"
            val checks = mutableListOf<String>()
            if (predicate.requiredNames.isNotEmpty()) {
                checks +=
                    predicate.requiredNames.joinToString(
                        " && ",
                    ) { name -> "$jsonObject.containsKey(${jsonString(name)})" }
            }
            predicate.properties.forEach { (name, property) ->
                checks +=
                    "($jsonObject[${jsonString(
                        name,
                    )}]?.let { property -> ${primitivePredicateExpression(property, "property")} } ?: true)"
            }
            val declaredNames = predicate.properties.keys.joinToString { name -> jsonString(name) }
            when (val additional = predicate.additionalProperties) {
                JsonAdditionalPropertiesPredicate.Open -> {
                    Unit
                }

                JsonAdditionalPropertiesPredicate.Closed -> {
                    checks += "$jsonObject.keys.all { it in setOf($declaredNames) }"
                }

                is JsonAdditionalPropertiesPredicate.Typed -> {
                    val additionalPredicate = primitivePredicateExpression(additional.predicate, "value")
                    checks +=
                        "$jsonObject.all { (name, value) -> name in setOf($declaredNames) || $additionalPredicate }"
                }
            }
            "$element !is JsonObject || (${checks.joinToString(" && ").ifEmpty { "true" }})"
        }
    }

private fun primitiveOneOfKindCondition(
    kind: PrimitiveOneOfJsonKind,
    element: String,
): String =
    when (kind) {
        PrimitiveOneOfJsonKind.NULL -> {
            "$element is JsonNull"
        }

        PrimitiveOneOfJsonKind.STRING -> {
            "$element is JsonPrimitive && $element.isString"
        }

        PrimitiveOneOfJsonKind.INTEGER -> {
            "$element.isJsonSchemaInteger()"
        }

        PrimitiveOneOfJsonKind.NUMBER -> {
            "$element.isJsonSchemaNumber()"
        }

        PrimitiveOneOfJsonKind.BOOLEAN -> {
            "$element is JsonPrimitive && " +
                "($element.content == \"true\" || $element.content == \"false\")"
        }

        PrimitiveOneOfJsonKind.ARRAY -> {
            "$element is JsonArray"
        }

        PrimitiveOneOfJsonKind.OBJECT -> {
            "$element is JsonObject"
        }
    }

private fun String?.jsonLiteral(): String = this?.let(::jsonString) ?: "null"

private fun JsonStringFormat?.formatExpression(): String =
    when (this) {
        null -> "null"
        JsonStringFormat.DATE -> "\"date\""
        JsonStringFormat.DATE_TIME -> "\"date-time\""
    }

private fun jsonString(value: String): String =
    buildString {
        append('\"')
        value.forEach { character ->
            when (character) {
                '\\' -> append("\\\\")
                '\"' -> append("\\\"")
                '\n' -> append("\\n")
                '\r' -> append("\\r")
                '\t' -> append("\\t")
                else -> append(character)
            }
        }
        append('\"')
    }

private fun jsonLiteral(value: com.nabobery.sdkgen.model.JsonValue): String =
    when (value) {
        com.nabobery.sdkgen.model.JsonValue.Null -> {
            "null"
        }

        is com.nabobery.sdkgen.model.JsonValue.BooleanValue -> {
            value.value.toString()
        }

        is com.nabobery.sdkgen.model.JsonValue.NumberValue -> {
            value.lexicalValue
        }

        is com.nabobery.sdkgen.model.JsonValue.StringValue -> {
            jsonString(value.value)
        }

        is com.nabobery.sdkgen.model.JsonValue.ArrayValue -> {
            value.values.joinToString(",", "[", "]") { child -> jsonLiteral(child) }
        }

        is com.nabobery.sdkgen.model.JsonValue.ObjectValue -> {
            value.properties.entries.joinToString(
                ",",
                "{",
                "}",
            ) { (name, child) -> "${jsonString(name)}:${jsonLiteral(child)}" }
        }
    }

internal fun schemaNumericSupportTypes(packageName: String): List<TypeSpec> =
    listOf(
        TypeSpec
            .classBuilder("SchemaInteger")
            .addModifiers(KModifier.INTERNAL, KModifier.DATA)
            .primaryConstructor(
                FunSpec
                    .constructorBuilder()
                    .addParameter("negative", BOOLEAN)
                    .addParameter("digits", STRING)
                    .build(),
            ).addProperty(PropertySpec.builder("negative", BOOLEAN).initializer("negative").build())
            .addProperty(PropertySpec.builder("digits", STRING).initializer("digits").build())
            .build(),
        TypeSpec
            .classBuilder("SchemaDecimal")
            .addModifiers(KModifier.INTERNAL, KModifier.DATA)
            .primaryConstructor(
                FunSpec
                    .constructorBuilder()
                    .addParameter("negative", BOOLEAN)
                    .addParameter("digits", STRING)
                    .addParameter("scale", ClassName(packageName, "SchemaInteger"))
                    .build(),
            ).addProperty(PropertySpec.builder("negative", BOOLEAN).initializer("negative").build())
            .addProperty(PropertySpec.builder("digits", STRING).initializer("digits").build())
            .addProperty(
                PropertySpec
                    .builder("scale", ClassName(packageName, "SchemaInteger"))
                    .initializer("scale")
                    .build(),
            ).build(),
    )

private fun exactNumericSupportFunctions(packageName: String): List<FunSpec> =
    listOf(
        FunSpec
            .builder("schemaExactDecimal")
            .addModifiers(KModifier.PRIVATE)
            .returns(ClassName(packageName, "SchemaDecimal").copy(nullable = true))
            .addParameter("value", STRING)
            .addCode(
                """
                val match = Regex("^(-?)(0|[1-9]\\d*)(?:\\.(\\d+))?(?:[eE]([+-]?\\d+))?${'$'}").matchEntire(value) ?: return null
                var digits = (match.groupValues[2] + match.groupValues[3]).trimStart('0').ifEmpty { "0" }
                if (digits == "0") return SchemaDecimal(false, "0", SchemaInteger(false, "0"))
                var scale = schemaIntegerSubtract(
                    SchemaInteger(false, match.groupValues[3].length.toString()),
                    requireNotNull(schemaInteger(match.groupValues[4].ifEmpty { "0" })),
                )
                while (digits.length > 1 && digits.endsWith('0')) {
                    digits = digits.dropLast(1)
                    scale = schemaIntegerSubtract(scale, SchemaInteger(false, "1"))
                }
                return SchemaDecimal(match.groupValues[1] == "-", digits, scale)
                """.trimIndent(),
            ).build(),
        FunSpec
            .builder("schemaInteger")
            .addModifiers(KModifier.PRIVATE)
            .returns(ClassName(packageName, "SchemaInteger").copy(nullable = true))
            .addParameter("value", STRING)
            .addCode(
                """
                val match = Regex("^([+-]?)(\\d+)${'$'}").matchEntire(value) ?: return null
                val digits = match.groupValues[2].trimStart('0').ifEmpty { "0" }
                return SchemaInteger(match.groupValues[1] == "-" && digits != "0", digits)
                """.trimIndent(),
            ).build(),
        FunSpec
            .builder("schemaIntegerCompare")
            .addModifiers(KModifier.PRIVATE)
            .returns(INT)
            .addParameter("left", ClassName(packageName, "SchemaInteger"))
            .addParameter("right", ClassName(packageName, "SchemaInteger"))
            .addCode(
                """
                if (left.negative != right.negative) return if (left.negative) -1 else 1
                val comparison = schemaIntegerMagnitudeCompare(left.digits, right.digits)
                return if (left.negative) -comparison else comparison
                """.trimIndent(),
            ).build(),
        FunSpec
            .builder("schemaIntegerMagnitudeCompare")
            .addModifiers(KModifier.PRIVATE)
            .returns(INT)
            .addParameter("left", STRING)
            .addParameter("right", STRING)
            .addCode(
                "if (left.length != right.length) return left.length.compareTo(right.length)\nreturn left.compareTo(right)",
            ).build(),
        FunSpec
            .builder("schemaIntegerSubtract")
            .addModifiers(KModifier.PRIVATE)
            .returns(ClassName(packageName, "SchemaInteger"))
            .addParameter("left", ClassName(packageName, "SchemaInteger"))
            .addParameter("right", ClassName(packageName, "SchemaInteger"))
            .addCode(
                "return schemaIntegerAdd(left, SchemaInteger(!right.negative && right.digits != \"0\", right.digits))",
            ).build(),
        FunSpec
            .builder("schemaIntegerAdd")
            .addModifiers(KModifier.PRIVATE)
            .returns(ClassName(packageName, "SchemaInteger"))
            .addParameter("left", ClassName(packageName, "SchemaInteger"))
            .addParameter("right", ClassName(packageName, "SchemaInteger"))
            .addCode(
                """
                if (left.negative == right.negative) return SchemaInteger(left.negative, schemaIntegerMagnitudeAdd(left.digits, right.digits))
                val comparison = schemaIntegerMagnitudeCompare(left.digits, right.digits)
                if (comparison == 0) return SchemaInteger(false, "0")
                return if (comparison > 0) {
                    SchemaInteger(left.negative, schemaIntegerMagnitudeSubtract(left.digits, right.digits))
                } else {
                    SchemaInteger(right.negative, schemaIntegerMagnitudeSubtract(right.digits, left.digits))
                }
                """.trimIndent(),
            ).build(),
        FunSpec
            .builder("schemaIntegerMagnitudeAdd")
            .addModifiers(KModifier.PRIVATE)
            .returns(STRING)
            .addParameter("left", STRING)
            .addParameter("right", STRING)
            .addCode(
                """
                val result = StringBuilder()
                var carry = 0
                val width = maxOf(left.length, right.length)
                for (offset in 0 until width) {
                    val leftDigit = left.getOrNull(left.length - 1 - offset)?.minus('0') ?: 0
                    val rightDigit = right.getOrNull(right.length - 1 - offset)?.minus('0') ?: 0
                    val total = leftDigit + rightDigit + carry
                    result.append(('0'.code + total %% 10).toChar())
                    carry = total / 10
                }
                if (carry > 0) result.append(('0'.code + carry).toChar())
                return result.reverse().toString()
                """.trimIndent(),
            ).build(),
        FunSpec
            .builder("schemaIntegerMagnitudeSubtract")
            .addModifiers(KModifier.PRIVATE)
            .returns(STRING)
            .addParameter("left", STRING)
            .addParameter("right", STRING)
            .addCode(
                """
                val result = StringBuilder()
                var borrow = 0
                for (offset in left.indices) {
                    var digit = left[left.length - 1 - offset] - '0' - borrow
                    val subtrahend = right.getOrNull(right.length - 1 - offset)?.minus('0') ?: 0
                    if (digit < subtrahend) { digit += 10; borrow = 1 } else borrow = 0
                    result.append(('0'.code + digit - subtrahend).toChar())
                }
                return result.reverse().toString().trimStart('0').ifEmpty { "0" }
                """.trimIndent(),
            ).build(),
        FunSpec
            .builder("schemaExactCompare")
            .addModifiers(KModifier.PRIVATE)
            .returns(INT)
            .addParameter("left", ClassName(packageName, "SchemaDecimal"))
            .addParameter("right", ClassName(packageName, "SchemaDecimal"))
            .addCode(
                """
                if (left.negative != right.negative) return if (left.negative) -1 else 1
                val comparison = schemaExactMagnitudeCompare(left, right)
                return if (left.negative) -comparison else comparison
                """.trimIndent(),
            ).build(),
        FunSpec
            .builder("schemaExactMagnitudeCompare")
            .addModifiers(KModifier.PRIVATE)
            .returns(INT)
            .addParameter("left", ClassName(packageName, "SchemaDecimal"))
            .addParameter("right", ClassName(packageName, "SchemaDecimal"))
            .addCode(
                """
                val leftPower = schemaIntegerSubtract(SchemaInteger(false, (left.digits.length - 1).toString()), left.scale)
                val rightPower = schemaIntegerSubtract(SchemaInteger(false, (right.digits.length - 1).toString()), right.scale)
                val powerComparison = schemaIntegerCompare(leftPower, rightPower)
                if (powerComparison != 0) return powerComparison
                val width = maxOf(left.digits.length, right.digits.length)
                for (index in 0 until width) {
                    val leftDigit = left.digits.getOrNull(index) ?: '0'
                    val rightDigit = right.digits.getOrNull(index) ?: '0'
                    if (leftDigit != rightDigit) return leftDigit.compareTo(rightDigit)
                }
                return 0
                """.trimIndent(),
            ).build(),
        FunSpec
            .builder("schemaExactIsMultipleOf")
            .addModifiers(KModifier.PRIVATE)
            .returns(BOOLEAN)
            .addParameter("value", ClassName(packageName, "SchemaDecimal"))
            .addParameter("divisor", ClassName(packageName, "SchemaDecimal"))
            .addCode(
                """
                if (divisor.digits == "0") return false
                if (value.digits == "0") return true
                val shift = schemaIntegerSubtract(divisor.scale, value.scale)
                if (schemaIntegerCompare(shift, SchemaInteger(false, "0")) < 0) return false
                val divisorTwos = schemaFactorCount(divisor.digits, 2)
                val divisorFives = schemaFactorCount(divisorTwos.first, 5)
                if (schemaExactRemainder(value.digits, divisorFives.first) != "0") return false
                val valueTwos = schemaFactorCount(value.digits, 2).second
                val valueFives = schemaFactorCount(value.digits, 5).second
                val requiredTwos = (divisorTwos.second - valueTwos).coerceAtLeast(0)
                val requiredFives = (divisorFives.second - valueFives).coerceAtLeast(0)
                return schemaIntegerCompare(shift, SchemaInteger(false, requiredTwos.toString())) >= 0 &&
                    schemaIntegerCompare(shift, SchemaInteger(false, requiredFives.toString())) >= 0
                """.trimIndent(),
            ).build(),
        FunSpec
            .builder("schemaFactorCount")
            .addModifiers(KModifier.PRIVATE)
            .returns(ClassName("kotlin", "Pair").parameterizedBy(STRING, INT))
            .addParameter("value", STRING)
            .addParameter("factor", INT)
            .addCode(
                """
                var remainder = value
                var count = 0
                while (remainder != "0") {
                    val division = schemaDivideBySmall(remainder, factor)
                    if (division.second != 0) break
                    remainder = division.first
                    count += 1
                }
                return remainder to count
                """.trimIndent(),
            ).build(),
        FunSpec
            .builder("schemaDivideBySmall")
            .addModifiers(KModifier.PRIVATE)
            .returns(ClassName("kotlin", "Pair").parameterizedBy(STRING, INT))
            .addParameter("value", STRING)
            .addParameter("divisor", INT)
            .addCode(
                """
                val quotient = StringBuilder()
                var remainder = 0
                value.forEach { digit ->
                    val combined = remainder * 10 + (digit - '0')
                    quotient.append(('0'.code + combined / divisor).toChar())
                    remainder = combined %% divisor
                }
                return quotient.toString().trimStart('0').ifEmpty { "0" } to remainder
                """.trimIndent(),
            ).build(),
        FunSpec
            .builder("schemaExactRemainder")
            .addModifiers(KModifier.PRIVATE)
            .returns(STRING)
            .addParameter("dividend", STRING)
            .addParameter("divisor", STRING)
            .addCode(
                """
                if (divisor == "1") return "0"
                var remainder = "0"
                dividend.forEach { digit ->
                    remainder = (remainder + digit).trimStart('0').ifEmpty { "0" }
                    while (schemaIntegerMagnitudeCompare(remainder, divisor) >= 0) {
                        remainder = schemaIntegerMagnitudeSubtract(remainder, divisor)
                    }
                }
                return remainder
                """.trimIndent(),
            ).build(),
    )

private fun predicateSupportFunctions(packageName: String): List<FunSpec> =
    exactNumericSupportFunctions(packageName) +
        listOf(
            FunSpec
                .builder("isJsonSchemaNumber")
                .addModifiers(KModifier.PRIVATE)
                .receiver(JSON_ELEMENT)
                .returns(BOOLEAN)
                .addCode(
                    """
                    val primitive = this as? JsonPrimitive ?: return false
                    if (primitive.isString || primitive.content == "true" || primitive.content == "false" || this is JsonNull) return false
                    return schemaExactDecimal(primitive.content) != null
                    """.trimIndent(),
                ).build(),
            FunSpec
                .builder("isJsonSchemaInteger")
                .addModifiers(KModifier.PRIVATE)
                .receiver(JSON_ELEMENT)
                .returns(BOOLEAN)
                .addCode(
                    """
                    val parts = (this as? JsonPrimitive)?.takeIf { isJsonSchemaNumber() }?.let { schemaExactDecimal(it.content) }
                        ?: return false
                    return schemaIntegerCompare(parts.scale, SchemaInteger(false, "0")) <= 0
                    """.trimIndent(),
                ).build(),
            FunSpec
                .builder(
                    "matchesJsonSchemaNumber",
                ).addModifiers(KModifier.PRIVATE)
                .receiver(JSON_ELEMENT)
                .returns(BOOLEAN)
                .addParameter("minimum", STRING.copy(nullable = true))
                .addParameter("maximum", STRING.copy(nullable = true))
                .addParameter(
                    "exclusiveMinimum",
                    STRING.copy(nullable = true),
                ).addParameter("exclusiveMaximum", STRING.copy(nullable = true))
                .addParameter("multipleOf", STRING.copy(nullable = true))
                .addCode(
                    """
                    if (!isJsonSchemaNumber()) return true
                    val value = requireNotNull(schemaExactDecimal((this as JsonPrimitive).content))
                    minimum?.let { if (schemaExactCompare(value, requireNotNull(schemaExactDecimal(it))) < 0) return false }
                    maximum?.let { if (schemaExactCompare(value, requireNotNull(schemaExactDecimal(it))) > 0) return false }
                    exclusiveMinimum?.let { if (schemaExactCompare(value, requireNotNull(schemaExactDecimal(it))) <= 0) return false }
                    exclusiveMaximum?.let { if (schemaExactCompare(value, requireNotNull(schemaExactDecimal(it))) >= 0) return false }
                    multipleOf?.let { if (!schemaExactIsMultipleOf(value, requireNotNull(schemaExactDecimal(it)))) return false }
                    return true
                    """.trimIndent(),
                ).build(),
            FunSpec
                .builder(
                    "matchesJsonSchemaString",
                ).addModifiers(KModifier.PRIVATE)
                .receiver(JSON_ELEMENT)
                .returns(BOOLEAN)
                .addParameter("minLength", INT.copy(nullable = true))
                .addParameter("maxLength", INT.copy(nullable = true))
                .addParameter("format", STRING.copy(nullable = true))
                .addCode(
                    """
                    val primitive = this as? JsonPrimitive ?: return true
                    if (!primitive.isString) return true
                    val value = primitive.content
                    val length = value.jsonSchemaCodePointCount()
                    if (minLength != null && length < minLength) return false
                    if (maxLength != null && length > maxLength) return false
                    return when (format) {
                        null -> true
                        "date" -> value.isRfc3339Date()
                        "date-time" -> value.isRfc3339DateTime()
                        else -> false
                    }
                    """.trimIndent(),
                ).build(),
            FunSpec
                .builder("jsonSchemaEquals")
                .addModifiers(KModifier.PRIVATE)
                .receiver(JSON_ELEMENT)
                .returns(BOOLEAN)
                .addParameter("other", JSON_ELEMENT)
                .addCode(
                    """
                    if (this is JsonNull || other is JsonNull) return this is JsonNull && other is JsonNull
                    if (this is JsonArray && other is JsonArray) return size == other.size && indices.all { this[it].jsonSchemaEquals(other[it]) }
                    if (this is JsonObject && other is JsonObject) return keys == other.keys && keys.all { key -> getValue(key).jsonSchemaEquals(other.getValue(key)) }
                    if (this !is JsonPrimitive || other !is JsonPrimitive) return false
                    if (isString || other.isString) return isString && other.isString && content == other.content
                    if (isJsonSchemaNumber() && other.isJsonSchemaNumber()) {
                        return schemaExactCompare(
                            requireNotNull(schemaExactDecimal(content)),
                            requireNotNull(schemaExactDecimal(other.content)),
                        ) == 0
                    }
                    return content == other.content
                    """.trimIndent(),
                ).build(),
            FunSpec
                .builder("jsonSchemaCodePointCount")
                .addModifiers(KModifier.PRIVATE)
                .receiver(STRING)
                .returns(INT)
                .addCode(
                    """
                    var count = 0
                    var index = 0
                    while (index < length) {
                        val highSurrogate = this[index].code in 55296..56319
                        val lowSurrogate = index + 1 < length && this[index + 1].code in 56320..57343
                        index += if (highSurrogate && lowSurrogate) 2 else 1
                        count += 1
                    }
                    return count
                    """.trimIndent(),
                ).build(),
            FunSpec
                .builder("isRfc3339Date")
                .addModifiers(KModifier.PRIVATE)
                .receiver(STRING)
                .returns(BOOLEAN)
                .addCode(
                    """
                    val match = Regex("^(\\d{4})-(\\d{2})-(\\d{2})${'$'}").matchEntire(this) ?: return false
                    return isValidRfc3339Date(match.groupValues[1].toInt(), match.groupValues[2].toInt(), match.groupValues[3].toInt())
                    """.trimIndent(),
                ).build(),
            FunSpec
                .builder("isRfc3339DateTime")
                .addModifiers(KModifier.PRIVATE)
                .receiver(STRING)
                .returns(BOOLEAN)
                .addCode(
                    """
                    val match = Regex("^(\\d{4})-(\\d{2})-(\\d{2})[Tt](\\d{2}):(\\d{2}):(\\d{2})(?:\\.\\d+)?([Zz]|[+-]\\d{2}:\\d{2})${'$'}")
                        .matchEntire(this) ?: return false
                    val hour = match.groupValues[4].toInt()
                    val minute = match.groupValues[5].toInt()
                    val second = match.groupValues[6].toInt()
                    val offset = match.groupValues[7]
                    val year = match.groupValues[1].toInt()
                    val month = match.groupValues[2].toInt()
                    val day = match.groupValues[3].toInt()
                    if (!isValidRfc3339Date(year, month, day)) return false
                    if (hour !in 0..23 || minute !in 0..59 || second !in 0..60) return false
                    if (offset.length != 1) {
                        val offsetHour = offset.substring(1, 3).toInt()
                        val offsetMinute = offset.substring(4, 6).toInt()
                        if (offsetHour !in 0..23 || offsetMinute !in 0..59) return false
                    }
                    return second != 60 || isKnownRfc3339LeapSecond(year, month, day, hour, minute, offset)
                    """.trimIndent(),
                ).build(),
            FunSpec
                .builder("isValidRfc3339Date")
                .addModifiers(KModifier.PRIVATE)
                .returns(BOOLEAN)
                .addParameter("year", INT)
                .addParameter("month", INT)
                .addParameter("day", INT)
                .addCode(
                    """
                    if (month !in 1..12) return false
                    val days = when (month) {
                        2 -> if (year %% 4 == 0 && (year %% 100 != 0 || year %% 400 == 0)) 29 else 28
                        4, 6, 9, 11 -> 30
                        else -> 31
                    }
                    return day in 1..days
                    """.trimIndent(),
                ).build(),
            FunSpec
                .builder("isKnownRfc3339LeapSecond")
                .addModifiers(KModifier.PRIVATE)
                .returns(BOOLEAN)
                .addParameter("year", INT)
                .addParameter("month", INT)
                .addParameter("day", INT)
                .addParameter("hour", INT)
                .addParameter("minute", INT)
                .addParameter("offset", STRING)
                .addCode(
                    """
                    val offsetMinutes =
                        if (offset.length == 1) 0
                        else {
                            val value = offset.substring(1, 3).toInt() * 60 + offset.substring(4, 6).toInt()
                            if (offset[0] == '-') -value else value
                        }
                    val instant = rfc3339DayIndex(year, month, day) * 1_440L + hour * 60L + minute + 1L - offsetMinutes
                    return rfc3339LeapSecondInstants().contains(instant)
                    """.trimIndent(),
                ).build(),
            FunSpec
                .builder("rfc3339DayIndex")
                .addModifiers(KModifier.PRIVATE)
                .returns(ClassName("kotlin", "Long"))
                .addParameter("year", INT)
                .addParameter("month", INT)
                .addParameter("day", INT)
                .addCode(
                    """
                    val yearDays = 365L * year + (year + 3L) / 4L - (year + 99L) / 100L + (year + 399L) / 400L
                    val monthDays = intArrayOf(0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334)[month - 1]
                    val leapDay = if (month > 2 && year %% 4 == 0 && (year %% 100 != 0 || year %% 400 == 0)) 1 else 0
                    return yearDays + monthDays + leapDay + day - 1L
                    """.trimIndent(),
                ).build(),
            FunSpec
                .builder("rfc3339LeapSecondInstants")
                .addModifiers(KModifier.PRIVATE)
                .returns(SET.parameterizedBy(ClassName("kotlin", "Long")))
                .addCode(
                    """
                    return setOf(
                        (rfc3339DayIndex(1972, 6, 30) + 1L) * 1_440L, (rfc3339DayIndex(1972, 12, 31) + 1L) * 1_440L,
                        (rfc3339DayIndex(1973, 12, 31) + 1L) * 1_440L, (rfc3339DayIndex(1974, 12, 31) + 1L) * 1_440L,
                        (rfc3339DayIndex(1975, 12, 31) + 1L) * 1_440L, (rfc3339DayIndex(1976, 12, 31) + 1L) * 1_440L,
                        (rfc3339DayIndex(1977, 12, 31) + 1L) * 1_440L, (rfc3339DayIndex(1978, 12, 31) + 1L) * 1_440L,
                        (rfc3339DayIndex(1979, 12, 31) + 1L) * 1_440L, (rfc3339DayIndex(1981, 6, 30) + 1L) * 1_440L,
                        (rfc3339DayIndex(1982, 6, 30) + 1L) * 1_440L, (rfc3339DayIndex(1983, 6, 30) + 1L) * 1_440L,
                        (rfc3339DayIndex(1985, 6, 30) + 1L) * 1_440L, (rfc3339DayIndex(1987, 12, 31) + 1L) * 1_440L,
                        (rfc3339DayIndex(1989, 12, 31) + 1L) * 1_440L, (rfc3339DayIndex(1990, 12, 31) + 1L) * 1_440L,
                        (rfc3339DayIndex(1992, 6, 30) + 1L) * 1_440L, (rfc3339DayIndex(1993, 6, 30) + 1L) * 1_440L,
                        (rfc3339DayIndex(1994, 6, 30) + 1L) * 1_440L, (rfc3339DayIndex(1995, 12, 31) + 1L) * 1_440L,
                        (rfc3339DayIndex(1997, 6, 30) + 1L) * 1_440L, (rfc3339DayIndex(1998, 12, 31) + 1L) * 1_440L,
                        (rfc3339DayIndex(2005, 12, 31) + 1L) * 1_440L, (rfc3339DayIndex(2008, 12, 31) + 1L) * 1_440L,
                        (rfc3339DayIndex(2012, 6, 30) + 1L) * 1_440L, (rfc3339DayIndex(2015, 6, 30) + 1L) * 1_440L,
                        (rfc3339DayIndex(2016, 12, 31) + 1L) * 1_440L,
                    )
                    """.trimIndent(),
                ).build(),
            FunSpec
                .builder("schemaDecimalParts")
                .addModifiers(KModifier.PRIVATE)
                .returns(LIST.parameterizedBy(STRING).copy(nullable = true))
                .addParameter("value", STRING)
                .addCode(
                    """
                    val match = Regex("^(-?)(0|[1-9]\\d*)(?:\\.(\\d+))?(?:[eE]([+-]?\\d+))?${'$'}").matchEntire(value) ?: return null
                    val exponent = match.groupValues[4].ifEmpty { "0" }.toLongOrNull() ?: return null
                    var digits = (match.groupValues[2] + match.groupValues[3]).trimStart('0').ifEmpty { "0" }
                    var scale = match.groupValues[3].length.toLong() - exponent
                    while (digits.length > 1 && digits.endsWith('0')) {
                        digits = digits.dropLast(1)
                        scale -= 1L
                    }
                    return listOf(if (digits == "0") "" else match.groupValues[1], digits, scale.toString())
                    """.trimIndent(),
                ).build(),
            FunSpec
                .builder("schemaCompare")
                .addModifiers(KModifier.PRIVATE)
                .returns(INT)
                .addParameter("left", LIST.parameterizedBy(STRING))
                .addParameter("right", LIST.parameterizedBy(STRING))
                .addCode(
                    """
                    val leftNegative = left[0] == "-"
                    val rightNegative = right[0] == "-"
                    if (leftNegative != rightNegative) return if (leftNegative) -1 else 1
                    val comparison = schemaCompareMagnitude(left, right)
                    return if (leftNegative) -comparison else comparison
                    """.trimIndent(),
                ).build(),
            FunSpec
                .builder("schemaCompareMagnitude")
                .addModifiers(KModifier.PRIVATE)
                .returns(INT)
                .addParameter("left", LIST.parameterizedBy(STRING))
                .addParameter("right", LIST.parameterizedBy(STRING))
                .addCode(
                    """
                    val leftScale = left[2].toLong()
                    val rightScale = right[2].toLong()
                    val leftPower = left[1].length.toLong() - 1L - leftScale
                    val rightPower = right[1].length.toLong() - 1L - rightScale
                    if (leftPower != rightPower) return leftPower.compareTo(rightPower)
                    val width = maxOf(left[1].length, right[1].length)
                    for (index in 0 until width) {
                        val leftDigit = left[1].getOrNull(index) ?: '0'
                        val rightDigit = right[1].getOrNull(index) ?: '0'
                        if (leftDigit != rightDigit) return leftDigit.compareTo(rightDigit)
                    }
                    return 0
                    """.trimIndent(),
                ).build(),
            FunSpec
                .builder("schemaIsMultipleOf")
                .addModifiers(KModifier.PRIVATE)
                .returns(BOOLEAN)
                .addParameter("value", LIST.parameterizedBy(STRING))
                .addParameter("divisor", LIST.parameterizedBy(STRING))
                .addCode(
                    """
                    if (divisor[1] == "0") return false
                    if (value[1] == "0") return true
                    val shift = divisor[2].toLong() - value[2].toLong()
                    return if (shift >= 0L) {
                        schemaRemainderAfterZeros(value[1], divisor[1], shift) == "0"
                    } else {
                        val zeros = -shift
                        if (zeros > value[1].length.toLong()) false
                        else {
                            val count = zeros.toInt()
                            value[1].takeLast(count).all { it == '0' } && schemaRemainder(value[1].dropLast(count), divisor[1]) == "0"
                        }
                    }
                    """.trimIndent(),
                ).build(),
            FunSpec
                .builder("schemaRemainderAfterZeros")
                .addModifiers(KModifier.PRIVATE)
                .returns(STRING)
                .addParameter(
                    "dividend",
                    STRING,
                ).addParameter("divisor", STRING)
                .addParameter("zeros", ClassName("kotlin", "Long"))
                .addCode(
                    """
                    var remainder = schemaRemainder(dividend, divisor)
                    var remaining = zeros
                    while (remaining > 0L) {
                        remainder = schemaRemainder(remainder + "0", divisor)
                        remaining -= 1L
                    }
                    return remainder
                    """.trimIndent(),
                ).build(),
            FunSpec
                .builder("schemaRemainder")
                .addModifiers(KModifier.PRIVATE)
                .returns(STRING)
                .addParameter("dividend", STRING)
                .addParameter("divisor", STRING)
                .addCode(
                    """
                    var remainder = "0"
                    dividend.forEach { digit ->
                        remainder = (remainder + digit).trimStart('0').ifEmpty { "0" }
                        while (schemaCompareInteger(remainder, divisor) >= 0) remainder = schemaSubtractInteger(remainder, divisor)
                    }
                    return remainder
                    """.trimIndent(),
                ).build(),
            FunSpec
                .builder("schemaCompareInteger")
                .addModifiers(KModifier.PRIVATE)
                .returns(INT)
                .addParameter("left", STRING)
                .addParameter("right", STRING)
                .addCode(
                    "if (left.length != right.length) return left.length.compareTo(right.length)\nreturn left.compareTo(right)\n",
                ).build(),
            FunSpec
                .builder("schemaSubtractInteger")
                .addModifiers(KModifier.PRIVATE)
                .returns(STRING)
                .addParameter("left", STRING)
                .addParameter("right", STRING)
                .addCode(
                    """
                    val result = StringBuilder()
                    var borrow = 0
                    for (index in left.indices.reversed()) {
                        var digit = (left[index] - '0') - borrow
                        val subtrahend = right.getOrNull(right.length - (left.length - index))?.minus('0') ?: 0
                        if (digit < subtrahend) { digit += 10; borrow = 1 } else borrow = 0
                        result.append(('0'.code + digit - subtrahend).toChar())
                    }
                    return result.reverse().toString().trimStart('0').ifEmpty { "0" }
                    """.trimIndent(),
                ).build(),
        )

private fun EmissionContext.primitiveOneOfSerializer(
    model: PrimitiveOneOfDeclaration,
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
                .addStatement("val jsonDecoder = decoder.requireJsonDecoder(%S)", model.resolvedName)
                .addStatement("return %T.fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)", unionType)
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
            .addModifiers(KModifier.PUBLIC)
            .apply {
                if (branch.viewFields.isNotEmpty()) addModifiers(KModifier.DATA)
            }.addAnnotation(SERIALIZABLE)
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
