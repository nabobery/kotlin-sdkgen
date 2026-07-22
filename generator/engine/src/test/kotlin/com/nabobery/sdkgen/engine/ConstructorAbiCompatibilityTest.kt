package com.nabobery.sdkgen.engine

import com.nabobery.sdkgen.engine.config.ConfigVersion
import com.nabobery.sdkgen.engine.config.DiagnosticsConfig
import com.nabobery.sdkgen.engine.config.KotlinGenerationConfig
import com.nabobery.sdkgen.engine.config.OutputConfig
import com.nabobery.sdkgen.engine.config.RuntimeDefaults
import com.nabobery.sdkgen.engine.config.SdkgenConfigV1Alpha1
import com.nabobery.sdkgen.engine.config.SourceConfig
import com.nabobery.sdkgen.engine.config.VerificationConfig
import com.nabobery.sdkgen.engine.config.WaivedSymbolKind
import java.nio.file.Path
import kotlin.test.Test
import kotlin.test.assertNotNull

class ConstructorAbiCompatibilityTest {
    @Test
    fun generationExclusionViewRetainsBothConstructorGenerations() {
        assertConstructor(
            GenerationExclusionView::class.java,
            String::class.java,
            String::class.java,
            String::class.java,
            String::class.java,
        )
        assertConstructor(
            GenerationExclusionView::class.java,
            String::class.java,
            String::class.java,
            String::class.java,
            String::class.java,
            WaivedSymbolKind::class.java,
            String::class.java,
            String::class.java,
        )
        assertConstructor(
            GenerationExclusionView::class.java,
            WaivedSymbolKind::class.java,
            String::class.java,
            String::class.java,
            String::class.java,
            String::class.java,
            String::class.java,
            String::class.java,
        )
    }

    @Test
    fun generationResultRetainsBothConstructorGenerations() {
        assertConstructor(
            GenerationResult::class.java,
            String::class.java,
            String::class.java,
            Path::class.java,
            Int::class.javaPrimitiveType!!,
            Long::class.javaPrimitiveType!!,
            List::class.java,
            List::class.java,
            Long::class.javaPrimitiveType!!,
        )
        assertConstructor(
            GenerationResult::class.java,
            String::class.java,
            String::class.java,
            Path::class.java,
            Int::class.javaPrimitiveType!!,
            Long::class.javaPrimitiveType!!,
            List::class.java,
            List::class.java,
            List::class.java,
            Long::class.javaPrimitiveType!!,
        )
        assertConstructor(
            GenerationResult::class.java,
            String::class.java,
            String::class.java,
            Path::class.java,
            Int::class.javaPrimitiveType!!,
            Long::class.javaPrimitiveType!!,
            List::class.java,
            List::class.java,
            Long::class.javaPrimitiveType!!,
            List::class.java,
        )
    }

    @Test
    fun sdkgenConfigRetainsBothConstructorGenerations() {
        val common =
            arrayOf(
                ConfigVersion::class.java,
                SourceConfig::class.java,
                List::class.java,
                List::class.java,
                KotlinGenerationConfig::class.java,
                RuntimeDefaults::class.java,
                List::class.java,
                List::class.java,
            )
        assertConstructor(
            SdkgenConfigV1Alpha1::class.java,
            *common,
            OutputConfig::class.java,
            DiagnosticsConfig::class.java,
            VerificationConfig::class.java,
        )
        assertConstructor(
            SdkgenConfigV1Alpha1::class.java,
            *common,
            List::class.java,
            OutputConfig::class.java,
            DiagnosticsConfig::class.java,
            VerificationConfig::class.java,
        )
        assertConstructor(
            SdkgenConfigV1Alpha1::class.java,
            *common,
            OutputConfig::class.java,
            DiagnosticsConfig::class.java,
            VerificationConfig::class.java,
            List::class.java,
        )
    }

    private fun assertConstructor(
        type: Class<*>,
        vararg parameterTypes: Class<*>,
    ) {
        assertNotNull(
            type.constructors.firstOrNull { constructor ->
                constructor.parameterTypes.contentEquals(parameterTypes)
            },
        )
    }
}
