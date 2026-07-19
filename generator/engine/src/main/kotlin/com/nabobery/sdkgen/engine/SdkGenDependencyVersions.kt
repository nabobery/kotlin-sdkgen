package com.nabobery.sdkgen.engine

import java.util.Properties

/** Versions of implementation dependencies that contribute to generated SDK identity. */
public object SdkGenDependencyVersions {
    /** The KotlinPoet version used by this engine build. */
    public val kotlinPoet: String by lazy {
        val properties = Properties()
        SdkGenDependencyVersions::class.java
            .getResourceAsStream("/com/nabobery/sdkgen/engine/kotlinpoet-version.properties")
            ?.use(properties::load)
            ?: error("KotlinPoet dependency metadata is missing from the SDKGen engine artifact.")
        properties.getProperty("version")?.trim()?.takeIf(String::isNotEmpty)
            ?: error("KotlinPoet dependency metadata does not declare a version.")
    }
}
