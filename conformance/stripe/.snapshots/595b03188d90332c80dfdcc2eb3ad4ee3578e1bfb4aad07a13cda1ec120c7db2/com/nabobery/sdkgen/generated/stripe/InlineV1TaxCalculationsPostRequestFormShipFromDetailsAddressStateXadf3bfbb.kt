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

public enum class InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressStateXadf3bfbbBranch {
    Branch1,
    InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressStateAnyOf2X98d03fee,
}

public sealed class InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressStateXadf3bfbbDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressStateXadf3bfbbNoMatchException(
    message: String,
) : InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressStateXadf3bfbbDecodingException(message)

internal data class InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressStateXadf3bfbbInspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressStateAnyOf2X98d03fee: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressStateAnyOf2X98d03fee,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1calculations/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/ship_from_details/properties/address/properties/state.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1calculations/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/ship_from_details/properties/address/properties/state
 */
@Serializable(with = InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressStateXadf3bfbb.Serializer::class)
public class InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressStateXadf3bfbb internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressStateXadf3bfbbInspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val inlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressStateAnyOf2X98d03fee:
        InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressStateAnyOf2X98d03fee? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressStateAnyOf2X98d03fee) {
                json
                    .decodeFromJsonElement<InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressStateAnyOf2X98d03fee>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressStateXadf3bfbbBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressStateXadf3bfbbBranch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressStateAnyOf2X98d03fee) {
                    add(
                        InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressStateXadf3bfbbBranch.InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressStateAnyOf2X98d03fee,
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
        ): InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressStateXadf3bfbb {
            val inspection = inspectInlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressStateXadf3bfbb(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressStateXadf3bfbbNoMatchException(
                    "InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressStateXadf3bfbb matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressStateXadf3bfbb(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressStateXadf3bfbb> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressStateXadf3bfbb {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressStateXadf3bfbb",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressStateXadf3bfbb,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressStateXadf3bfbb",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressStateXadf3bfbb(
    element: JsonElement,
): InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressStateXadf3bfbbInspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesInlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressStateAnyOf2X98d03fee =
        element
            .isJsonDecodable<InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressStateAnyOf2X98d03fee>()
    return InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressStateXadf3bfbbInspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressStateAnyOf2X98d03fee = matchesInlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressStateAnyOf2X98d03fee,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesInlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressStateAnyOf2X98d03fee) {
                    add(
                        "InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressStateAnyOf2X98d03fee: value does not match InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressStateAnyOf2X98d03fee",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
