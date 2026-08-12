package com.nabobery.sdkgen.engine.emit

import com.nabobery.sdkgen.engine.declarations.AnyOfDeclaration
import com.nabobery.sdkgen.engine.declarations.KotlinDeclarationModel
import com.nabobery.sdkgen.engine.declarations.ModelDeclaration
import com.nabobery.sdkgen.engine.declarations.OneOfDeclaration
import com.nabobery.sdkgen.engine.declarations.OpenEnumDeclaration
import com.nabobery.sdkgen.engine.declarations.PrimitiveOneOfDeclaration

internal fun interface KotlinEmitter {
    fun render(model: KotlinDeclarationModel): EmittedSources
}

/**
 * The whole result of one emission: the files to publish, and the public-API projection derived from the very
 * same KotlinPoet tree those files were rendered from.
 *
 * The two travel together deliberately. An emitter that could return sources without a projection would let the
 * `kotlinApi` compatibility layer fall back to evidence that cannot observe emission -- the exact defect this
 * projection exists to close. Bundling them means one traversal, and no way for the projection to silently go
 * missing or drift from what was actually written.
 */
internal data class EmittedSources(
    val files: List<RenderedKotlinFile>,
    val publicApiProjection: String,
)

/** Dispatches a normalized declaration model to the internal KotlinPoet emission context. */
internal class KotlinPoetEmitter(
    private val generatedPackage: String? = null,
) : KotlinEmitter {
    override fun render(model: KotlinDeclarationModel): EmittedSources {
        val normalized = model.normalized()
        val packageName = generatedPackage ?: normalized.files.firstOrNull()?.packageName ?: DEFAULT_GENERATED_PACKAGE
        val customSerializerTypes =
            normalized.files
                .flatMap { file ->
                    file.declarations.mapNotNull { declaration ->
                        val placement =
                            when (declaration) {
                                is ModelDeclaration, is OpenEnumDeclaration, is AnyOfDeclaration -> {
                                    SerializerPlacement.NESTED
                                }

                                is OneOfDeclaration, is PrimitiveOneOfDeclaration -> {
                                    SerializerPlacement.TOP_LEVEL
                                }

                                else -> {
                                    null
                                }
                            }
                        placement?.let { "${declaration.packageName}.${declaration.resolvedName}" to it }
                    }
                }.toMap()
        return EmissionContext(packageName, customSerializerTypes).render(normalized)
    }

    private companion object {
        const val DEFAULT_GENERATED_PACKAGE = "com.nabobery.sdkgen.generated"
    }
}
