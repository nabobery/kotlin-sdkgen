package com.nabobery.sdkgen.cli

internal object SdkGenCliVersion {
    private const val DEVELOPMENT_VERSION = "0.0.0-dev"

    fun current(): String = resolve { SdkGenCliVersion::class.java.`package`?.implementationVersion }

    internal fun resolve(implementationVersion: () -> String?): String =
        implementationVersion()?.trim()?.takeIf(String::isNotEmpty) ?: DEVELOPMENT_VERSION
}
