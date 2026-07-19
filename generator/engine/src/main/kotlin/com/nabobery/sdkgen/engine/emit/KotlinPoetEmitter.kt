package com.nabobery.sdkgen.engine.emit

import com.nabobery.sdkgen.engine.declarations.AnyOfDeclaration
import com.nabobery.sdkgen.engine.declarations.KotlinDeclarationModel
import com.nabobery.sdkgen.engine.declarations.ModelDeclaration
import com.nabobery.sdkgen.engine.declarations.OneOfDeclaration
import com.nabobery.sdkgen.engine.declarations.OpenEnumDeclaration

internal fun interface KotlinEmitter {
    fun render(model: KotlinDeclarationModel): List<RenderedKotlinFile>
}

/** Dispatches a normalized declaration model to the internal KotlinPoet emission context. */
internal class KotlinPoetEmitter(
    private val generatedPackage: String? = null,
) : KotlinEmitter {
    override fun render(model: KotlinDeclarationModel): List<RenderedKotlinFile> {
        val normalized = model.normalized()
        val packageName = generatedPackage ?: normalized.files.firstOrNull()?.packageName ?: DEFAULT_GENERATED_PACKAGE
        val customSerializerTypes =
            normalized.files
                .flatMap { file ->
                    file.declarations
                        .filter { declaration ->
                            declaration is ModelDeclaration ||
                                declaration is OpenEnumDeclaration ||
                                declaration is OneOfDeclaration ||
                                declaration is AnyOfDeclaration
                        }.map { declaration -> "${declaration.packageName}.${declaration.resolvedName}" }
                }.toSet()
        return EmissionContext(packageName, customSerializerTypes).render(normalized)
    }

    private companion object {
        const val DEFAULT_GENERATED_PACKAGE = "com.nabobery.sdkgen.generated"
    }
}
