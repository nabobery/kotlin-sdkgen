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

public enum class InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine1Xcaaf25a4Branch {
    Branch1,
    InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine1AnyOf2Xae6fe5aa,
}

public sealed class InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine1Xcaaf25a4DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine1Xcaaf25a4NoMatchException(
    message: String,
) : InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine1Xcaaf25a4DecodingException(message)

internal data class InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine1Xcaaf25a4Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine1AnyOf2Xae6fe5aa: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine1AnyOf2Xae6fe5aa,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1calculations/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/ship_from_details/properties/address/properties/line1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1calculations/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/ship_from_details/properties/address/properties/line1
 */
@Serializable(with = InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine1Xcaaf25a4.Serializer::class)
public class InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine1Xcaaf25a4 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine1Xcaaf25a4Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val inlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine1AnyOf2Xae6fe5aa:
        InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine1AnyOf2Xae6fe5aa? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine1AnyOf2Xae6fe5aa) {
                json
                    .decodeFromJsonElement<InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine1AnyOf2Xae6fe5aa>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine1Xcaaf25a4Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine1Xcaaf25a4Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine1AnyOf2Xae6fe5aa) {
                    add(
                        InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine1Xcaaf25a4Branch.InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine1AnyOf2Xae6fe5aa,
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
        ): InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine1Xcaaf25a4 {
            val inspection = inspectInlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine1Xcaaf25a4(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine1Xcaaf25a4NoMatchException(
                    "InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine1Xcaaf25a4 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine1Xcaaf25a4(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine1Xcaaf25a4> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine1Xcaaf25a4 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine1Xcaaf25a4",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine1Xcaaf25a4,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine1Xcaaf25a4",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine1Xcaaf25a4(
    element: JsonElement,
): InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine1Xcaaf25a4Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesInlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine1AnyOf2Xae6fe5aa =
        element
            .isJsonDecodable<InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine1AnyOf2Xae6fe5aa>()
    return InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine1Xcaaf25a4Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine1AnyOf2Xae6fe5aa = matchesInlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine1AnyOf2Xae6fe5aa,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesInlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine1AnyOf2Xae6fe5aa) {
                    add(
                        "InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine1AnyOf2Xae6fe5aa: value does not match InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine1AnyOf2Xae6fe5aa",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
