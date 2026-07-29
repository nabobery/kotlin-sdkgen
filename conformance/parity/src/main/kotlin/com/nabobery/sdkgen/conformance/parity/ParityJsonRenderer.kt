package com.nabobery.sdkgen.conformance.parity

import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

internal object ParityJsonRenderer {
    private val json =
        Json {
            prettyPrint = true
            encodeDefaults = true
        }

    fun render(report: ParityReport): String = json.encodeToString(report) + "\n"
}
