package com.nabobery.sdkgen.gradleplugin

import com.nabobery.sdkgen.engine.SdkGenDependencyVersions
import org.gradle.api.Action
import org.gradle.api.NamedDomainObjectContainer
import org.gradle.api.Project
import org.gradle.api.file.ConfigurableFileCollection
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.file.ProjectLayout
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.model.ObjectFactory
import org.gradle.api.provider.MapProperty
import org.gradle.api.provider.Property
import org.gradle.api.provider.Provider

/**
 * The `sdkgen` extension. Each named configuration owns one isolated generation task and output
 * directory.
 */
public open class SdkGenExtension internal constructor(
    objects: ObjectFactory,
    layout: ProjectLayout,
    version: Provider<String>,
) {
    public val configurations: NamedDomainObjectContainer<SdkGenConfiguration> =
        objects.domainObjectContainer(SdkGenConfiguration::class.java) { name ->
            SdkGenConfiguration(name, objects, layout, version)
        }

    public fun configurations(action: Action<NamedDomainObjectContainer<SdkGenConfiguration>>) {
        action.execute(configurations)
    }
}

/** Inputs and conventions for one named SDK generation configuration. */
public open class SdkGenConfiguration internal constructor(
    public val name: String,
    objects: ObjectFactory,
    layout: ProjectLayout,
    version: Provider<String>,
) {
    /** The checked-in `sdkgen.yaml` or `sdkgen.json` file. */
    public val configFile: RegularFileProperty = objects.fileProperty()

    /** Additional specification/reference files to include in the input fingerprint. */
    public val specFiles: ConfigurableFileCollection = objects.fileCollection()

    /** Additional overlay files to include in the input fingerprint. */
    public val overlayFiles: ConfigurableFileCollection = objects.fileCollection()

    /**
     * Extension/plugin artifacts. Non-empty values are rejected until Gradle-side SPI discovery
     * and execution are wired; keep this empty in the current preview.
     */
    public val pluginClasspath: ConfigurableFileCollection = objects.fileCollection()

    /**
     * Stable plugin coordinates/configuration. Non-empty values are rejected until Gradle-side SPI
     * discovery and execution are wired; keep this empty in the current preview.
     */
    public val pluginMetadata: MapProperty<String, String> =
        objects.mapProperty(String::class.java, String::class.java)

    /** Generator implementation identity. */
    public val generatorVersion: Property<String> = objects.property(String::class.java)

    /** Generator edition, included in the output manifest identity. */
    public val edition: Property<String> = objects.property(String::class.java)

    /** KotlinPoet implementation identity, included in the output manifest identity. */
    public val kotlinPoetVersion: Property<String> = objects.property(String::class.java)

    /** Unique task-owned output root; generated sources are published below its `sources` child. */
    public val outputDirectory: DirectoryProperty = objects.directoryProperty()

    init {
        generatorVersion.convention(version)
        edition.convention(SdkGenEditions.COMMUNITY)
        kotlinPoetVersion.convention(SdkGenDependencyVersions.kotlinPoet)
        outputDirectory.convention(layout.buildDirectory.dir("generated/sdkgen/$name"))
        pluginMetadata.convention(emptyMap())
    }
}

/** Stable identity of the plugin implementation, independent of the consumer project's version. */
internal object SdkGenPluginVersion {
    const val FALLBACK = "0.1.0-dev"

    fun current(): String =
        SdkGenPlugin::class.java.`package`.implementationVersion
            ?.trim()
            ?.takeIf { value -> value.isNotEmpty() && !value.equals("unspecified", ignoreCase = true) }
            ?: FALLBACK
}

internal fun Project.sdkGenExtension(
    objects: ObjectFactory,
    layout: ProjectLayout,
): SdkGenExtension =
    extensions.create(
        "sdkgen",
        SdkGenExtension::class.java,
        objects,
        layout,
        providers.provider { SdkGenPluginVersion.current() },
    )
