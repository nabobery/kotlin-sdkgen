package com.nabobery.sdkgen.engine.emit

import com.nabobery.sdkgen.engine.declarations.OpenEnumDeclaration
import com.nabobery.sdkgen.engine.declarations.sanitizeKDoc
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.STRING
import com.squareup.kotlinpoet.TypeSpec

internal fun EmissionContext.openEnum(model: OpenEnumDeclaration): TypeSpec {
    val enumType = ClassName(model.packageName, model.resolvedName)
    val type =
        TypeSpec
            .classBuilder(model.resolvedName)
            .addModifiers(KModifier.PUBLIC, KModifier.SEALED)
            .addAnnotation(serializableWith(enumType.nestedClass("Serializer")))
            .addKdoc("%L\n", sanitizeKDoc(model.kdoc))
            .addProperty(
                PropertySpec
                    .builder("value", STRING)
                    .addModifiers(KModifier.PUBLIC, KModifier.ABSTRACT)
                    .build(),
            )
    model.values.forEach { value ->
        type.addType(
            TypeSpec
                .objectBuilder(value.resolvedName)
                .addModifiers(KModifier.PUBLIC, KModifier.DATA)
                .addKdoc("%L Wire value: `%L`.\n", sanitizeKDoc(value.kdoc), value.wireValue)
                .superclass(enumType)
                .addProperty(
                    PropertySpec
                        .builder("value", STRING)
                        .addModifiers(KModifier.PUBLIC, KModifier.OVERRIDE)
                        .initializer("%S", value.wireValue)
                        .build(),
                ).build(),
        )
    }
    type.addType(
        TypeSpec
            .classBuilder("SdkUnknown")
            .addModifiers(KModifier.PUBLIC, KModifier.DATA)
            .primaryConstructor(FunSpec.constructorBuilder().addParameter("value", STRING).build())
            .addProperty(
                PropertySpec
                    .builder("value", STRING)
                    .addModifiers(KModifier.PUBLIC, KModifier.OVERRIDE)
                    .initializer("value")
                    .build(),
            ).superclass(enumType)
            .build(),
    )
    type.addType(
        TypeSpec
            .companionObjectBuilder()
            .addFunction(
                FunSpec
                    .builder("fromValue")
                    .addModifiers(KModifier.PUBLIC)
                    .addParameter("value", STRING)
                    .returns(enumType)
                    .addCode(buildFromValue(model, enumType))
                    .build(),
            ).build(),
    )
    type.addType(
        TypeSpec
            .objectBuilder("Serializer")
            .addModifiers(KModifier.PUBLIC)
            .addSuperinterface(K_SERIALIZER.parameterizedBy(enumType))
            .addProperty(
                PropertySpec
                    .builder("descriptor", SERIAL_DESCRIPTOR)
                    .addModifiers(KModifier.OVERRIDE)
                    .initializer(
                        "%T(%S, %T.STRING)",
                        PRIMITIVE_SERIAL_DESCRIPTOR,
                        enumType.canonicalName,
                        PRIMITIVE_KIND,
                    ).build(),
            ).addFunction(
                FunSpec
                    .builder("deserialize")
                    .addModifiers(KModifier.OVERRIDE)
                    .addParameter("decoder", DECODER)
                    .returns(enumType)
                    .addStatement("return fromValue(decoder.decodeString())")
                    .build(),
            ).addFunction(
                FunSpec
                    .builder("serialize")
                    .addModifiers(KModifier.OVERRIDE)
                    .addParameter("encoder", ENCODER)
                    .addParameter("value", enumType)
                    .addStatement("encoder.encodeString(value.value)")
                    .build(),
            ).build(),
    )
    return type.build()
}

private fun buildFromValue(
    model: OpenEnumDeclaration,
    enumType: ClassName,
): CodeBlock =
    CodeBlock
        .builder()
        .beginControlFlow("return when (value)")
        .apply {
            model.values.forEach { value ->
                val caseType = enumType.nestedClass(value.resolvedName)
                addStatement("%T.value -> %T", caseType, caseType)
            }
        }.addStatement("else -> %T(value)", enumType.nestedClass("SdkUnknown"))
        .endControlFlow()
        .build()
