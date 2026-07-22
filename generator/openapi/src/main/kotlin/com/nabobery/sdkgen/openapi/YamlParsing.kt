package com.nabobery.sdkgen.openapi

import io.swagger.v3.parser.util.DeserializationUtils
import org.yaml.snakeyaml.LoaderOptions

// SnakeYAML and swagger-parser default to 3 MiB. The pinned GitHub REST corpus is approximately 9.7 MiB,
// so accept production-scale contracts while retaining a finite parser safety boundary.
internal const val SDKGEN_YAML_CODE_POINT_LIMIT: Int = 16 * 1024 * 1024

internal fun largeDocumentLoaderOptions(): LoaderOptions =
    LoaderOptions().apply {
        codePointLimit = SDKGEN_YAML_CODE_POINT_LIMIT
    }

internal fun configureSwaggerParserYamlLimit() {
    DeserializationUtils.getOptions().maxYamlCodePoints = SDKGEN_YAML_CODE_POINT_LIMIT
}
