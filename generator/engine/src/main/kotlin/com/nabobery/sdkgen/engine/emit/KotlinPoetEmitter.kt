package com.nabobery.sdkgen.engine.emit

import com.nabobery.sdkgen.engine.declarations.KotlinDeclarationModel

internal fun interface KotlinEmitter {
    fun render(model: KotlinDeclarationModel): List<RenderedKotlinFile>
}

/** Dispatches a normalized declaration model to the internal KotlinPoet emission context. */
internal class KotlinPoetEmitter(
    private val generatedPackage: String? = null,
) : KotlinEmitter {
    override fun render(model: KotlinDeclarationModel): List<RenderedKotlinFile> {
        val packageName = generatedPackage ?: model.files.firstOrNull()?.packageName ?: DEFAULT_GENERATED_PACKAGE
        return EmissionContext(packageName).render(model)
    }

    private companion object {
        const val DEFAULT_GENERATED_PACKAGE = "com.nabobery.sdkgen.generated"
    }
}
