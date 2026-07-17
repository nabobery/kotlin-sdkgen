package com.nabobery.sdkgen.generated

import kotlin.String
import kotlinx.serialization.SerializationException
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonDecoder
import kotlinx.serialization.json.JsonEncoder

/**
 * SDK-owned JSON behavior and JSON-only serializer guards.
 */
public val SdkJson: Json = Json {
      ignoreUnknownKeys = true
      explicitNulls = true
      encodeDefaults = true
    }

internal fun Decoder.requireJsonDecoder(typeName: String): JsonDecoder = this as? JsonDecoder ?: throw SerializationException("$typeName supports JSON only")

internal fun Encoder.requireJsonEncoder(typeName: String): JsonEncoder = this as? JsonEncoder ?: throw SerializationException("$typeName supports JSON only")
