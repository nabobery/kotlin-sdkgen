package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement
import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set

public enum class InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine2Xb8c40158Branch {
    Branch1,
    InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine2AnyOf2X13aabf71,
}

public sealed class InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine2Xb8c40158DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine2Xb8c40158NoMatchException(
    message: String,
) : InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine2Xb8c40158DecodingException(message)

internal data class InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine2Xb8c40158Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine2AnyOf2X13aabf71: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine2AnyOf2X13aabf71,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1calculations/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/ship_from_details/properties/address/properties/line2.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1calculations/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/ship_from_details/properties/address/properties/line2
 */
@Serializable(with = InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine2Xb8c40158.Serializer::class)
public class InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine2Xb8c40158 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine2Xb8c40158Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val inlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine2AnyOf2X13aabf71:
        InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine2AnyOf2X13aabf71? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine2AnyOf2X13aabf71) {
                json
                    .decodeFromJsonElement<InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine2AnyOf2X13aabf71>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine2Xb8c40158Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine2Xb8c40158Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine2AnyOf2X13aabf71) {
                    add(
                        InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine2Xb8c40158Branch.InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine2AnyOf2X13aabf71,
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
        ): InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine2Xb8c40158 {
            val inspection = inspectInlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine2Xb8c40158(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine2Xb8c40158NoMatchException(
                    "InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine2Xb8c40158 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine2Xb8c40158(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine2Xb8c40158> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine2Xb8c40158 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine2Xb8c40158",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine2Xb8c40158,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine2Xb8c40158",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine2Xb8c40158(
    element: JsonElement,
): InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine2Xb8c40158Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesInlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine2AnyOf2X13aabf71 =
        element
            .isJsonDecodable<InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine2AnyOf2X13aabf71>()
    return InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine2Xb8c40158Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine2AnyOf2X13aabf71 = matchesInlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine2AnyOf2X13aabf71,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesInlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine2AnyOf2X13aabf71) {
                    add(
                        "InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine2AnyOf2X13aabf71: value does not match InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine2AnyOf2X13aabf71",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
