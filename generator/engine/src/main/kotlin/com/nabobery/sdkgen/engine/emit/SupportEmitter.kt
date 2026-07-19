package com.nabobery.sdkgen.engine.emit

import com.nabobery.sdkgen.engine.declarations.SupportDeclaration
import com.nabobery.sdkgen.engine.declarations.SupportKind
import com.nabobery.sdkgen.engine.declarations.sanitizeKDoc
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.NOTHING
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.STRING
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.TypeVariableName

internal fun EmissionContext.emitSupport(
    file: FileSpec.Builder,
    declaration: SupportDeclaration,
) {
    when (declaration.kind) {
        SupportKind.FieldPresence -> emitFieldPresence(file)
        SupportKind.Serialization -> emitSerializationSupport(file, declaration.kdoc)
    }
}

private fun EmissionContext.emitFieldPresence(file: FileSpec.Builder) {
    file.addType(
        TypeSpec
            .enumBuilder("FieldPresence")
            .addModifiers(KModifier.PUBLIC)
            .addKdoc("Wire presence of a property, independent of Kotlin nullability.\n")
            .addEnumConstant("Absent")
            .addEnumConstant("PresentNull")
            .addEnumConstant("PresentValue")
            .build(),
    )
    val state = ClassName(generatedPackage, "FieldState")
    val typeVariable = TypeVariableName("T", variance = KModifier.OUT)
    file.addType(
        TypeSpec
            .interfaceBuilder("FieldState")
            .addModifiers(KModifier.INTERNAL, KModifier.SEALED)
            .addTypeVariable(typeVariable)
            .addType(
                TypeSpec
                    .objectBuilder("Absent")
                    .addModifiers(KModifier.DATA)
                    .addSuperinterface(state.parameterizedBy(NOTHING))
                    .build(),
            ).addType(
                TypeSpec
                    .objectBuilder("Null")
                    .addModifiers(KModifier.DATA)
                    .addSuperinterface(state.parameterizedBy(NOTHING))
                    .build(),
            ).addType(
                TypeSpec
                    .classBuilder("Value")
                    .addModifiers(KModifier.DATA)
                    .addTypeVariable(TypeVariableName("T"))
                    .primaryConstructor(
                        FunSpec.constructorBuilder().addParameter("value", TypeVariableName("T")).build(),
                    ).addProperty(PropertySpec.builder("value", TypeVariableName("T")).initializer("value").build())
                    .addSuperinterface(state.parameterizedBy(TypeVariableName("T")))
                    .build(),
            ).build(),
    )
    file.addProperty(
        PropertySpec
            .builder("presence", fieldPresence)
            .receiver(state.parameterizedBy(STAR))
            .addModifiers(KModifier.INTERNAL)
            .getter(
                FunSpec
                    .getterBuilder()
                    .addCode(
                        "return when (this) {\n" +
                            "  %T.Absent -> %T.Absent\n" +
                            "  %T.Null -> %T.PresentNull\n" +
                            "  is %T.Value -> %T.PresentValue\n" +
                            "}\n",
                        state,
                        fieldPresence,
                        state,
                        fieldPresence,
                        state,
                        fieldPresence,
                    ).build(),
            ).build(),
    )
    file.addFunction(
        FunSpec
            .builder("valueOrNull")
            .addModifiers(KModifier.INTERNAL)
            .addTypeVariable(TypeVariableName("T"))
            .receiver(state.parameterizedBy(TypeVariableName("T")))
            .returns(TypeVariableName("T").copy(nullable = true))
            .addCode(
                "return when (this) {\n" +
                    "  %T.Absent, %T.Null -> null\n" +
                    "  is %T.Value -> value\n" +
                    "}\n",
                state,
                state,
                state,
            ).build(),
    )
}

private fun emitSerializationSupport(
    file: FileSpec.Builder,
    kdoc: String,
) {
    file.addProperty(
        PropertySpec
            .builder("SdkJson", JSON)
            .addModifiers(KModifier.PUBLIC)
            .addKdoc("%L\n", sanitizeKDoc(kdoc))
            .initializer(
                "%T {\n  ignoreUnknownKeys = true\n  explicitNulls = true\n  encodeDefaults = true\n}",
                JSON,
            ).build(),
    )
    file.addFunction(
        FunSpec
            .builder("requireJsonDecoder")
            .addModifiers(KModifier.INTERNAL)
            .receiver(DECODER)
            .addParameter("typeName", STRING)
            .returns(JSON_DECODER)
            .addCode(
                "return this as? %T ?: throw %T(\"\$typeName supports JSON only\")\n",
                JSON_DECODER,
                SERIALIZATION_EXCEPTION,
            ).build(),
    )
    file.addFunction(
        FunSpec
            .builder("requireJsonEncoder")
            .addModifiers(KModifier.INTERNAL)
            .receiver(ENCODER)
            .addParameter("typeName", STRING)
            .returns(JSON_ENCODER)
            .addCode(
                "return this as? %T ?: throw %T(\"\$typeName supports JSON only\")\n",
                JSON_ENCODER,
                SERIALIZATION_EXCEPTION,
            ).build(),
    )
}
