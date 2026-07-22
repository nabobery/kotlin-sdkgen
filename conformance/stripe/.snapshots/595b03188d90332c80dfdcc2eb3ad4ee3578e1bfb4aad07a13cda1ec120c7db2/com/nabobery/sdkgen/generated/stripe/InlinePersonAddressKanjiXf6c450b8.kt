package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement
import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set

public enum class InlinePersonAddressKanjiXf6c450b8Branch {
    LegalEntityJapanAddress,
}

public sealed class InlinePersonAddressKanjiXf6c450b8DecodingException(
    message: String,
) : SerializationException(message)

public class InlinePersonAddressKanjiXf6c450b8NoMatchException(
    message: String,
) : InlinePersonAddressKanjiXf6c450b8DecodingException(message)

internal data class InlinePersonAddressKanjiXf6c450b8Inspection(
    public val matchesLegalEntityJapanAddress: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesLegalEntityJapanAddress).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.json#/components/schemas/person/properties/address_kanji.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/person/properties/address_kanji
 */
@Serializable(with = InlinePersonAddressKanjiXf6c450b8.Serializer::class)
public class InlinePersonAddressKanjiXf6c450b8 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlinePersonAddressKanjiXf6c450b8Inspection,
) {
    public val legalEntityJapanAddress: LegalEntityJapanAddressView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesLegalEntityJapanAddress) {
                json.decodeFromJsonElement<LegalEntityJapanAddressView>(
                    raw,
                )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlinePersonAddressKanjiXf6c450b8Branch>
        get() =
            buildSet {
                if (inspection.matchesLegalEntityJapanAddress) {
                    add(
                        InlinePersonAddressKanjiXf6c450b8Branch.LegalEntityJapanAddress,
                    )
                }
            }

    public companion object {
        /**
         * Builds a validated wrapper around raw JSON without rewriting it.
         */
        public fun fromRaw(
            raw: JsonElement,
            json: Json = SdkJson,
        ): InlinePersonAddressKanjiXf6c450b8 {
            val inspection = inspectInlinePersonAddressKanjiXf6c450b8(raw)
            if (inspection.matchCount == 0) {
                throw InlinePersonAddressKanjiXf6c450b8NoMatchException(
                    "InlinePersonAddressKanjiXf6c450b8 matched 0 branches: " + inspection.failures.joinToString("; "),
                )
            }
            return InlinePersonAddressKanjiXf6c450b8(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlinePersonAddressKanjiXf6c450b8> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlinePersonAddressKanjiXf6c450b8 {
            val jsonDecoder = decoder.requireJsonDecoder("InlinePersonAddressKanjiXf6c450b8")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePersonAddressKanjiXf6c450b8,
        ) {
            encoder.requireJsonEncoder("InlinePersonAddressKanjiXf6c450b8").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlinePersonAddressKanjiXf6c450b8(
    element: JsonElement,
): InlinePersonAddressKanjiXf6c450b8Inspection {
    val raw =
        element as? JsonObject ?: return InlinePersonAddressKanjiXf6c450b8Inspection(
            matchesLegalEntityJapanAddress = false,
            failures = listOf("LegalEntityJapanAddress: expected JSON object"),
        )
    val matchesLegalEntityJapanAddress = true
    return InlinePersonAddressKanjiXf6c450b8Inspection(
        matchesLegalEntityJapanAddress = matchesLegalEntityJapanAddress,
        failures =
            buildList {
                if (!matchesLegalEntityJapanAddress) {
                    add(
                        "LegalEntityJapanAddress: required properties  do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
