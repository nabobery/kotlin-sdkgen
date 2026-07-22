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

public enum class InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine2Xb18dc622Branch {
    Branch1,
    InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine2AnyOf2X50b5169b,
}

public sealed class InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine2Xb18dc622DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine2Xb18dc622NoMatchException(
    message: String,
) : InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine2Xb18dc622DecodingException(message)

internal data class InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine2Xb18dc622Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine2AnyOf2X50b5169b: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine2AnyOf2X50b5169b,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1calculations/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/customer_details/properties/address/properties/line2.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1calculations/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/customer_details/properties/address/properties/line2
 */
@Serializable(with = InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine2Xb18dc622.Serializer::class)
public class InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine2Xb18dc622 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine2Xb18dc622Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val inlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine2AnyOf2X50b5169b:
        InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine2AnyOf2X50b5169b? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine2AnyOf2X50b5169b) {
                json
                    .decodeFromJsonElement<InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine2AnyOf2X50b5169b>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine2Xb18dc622Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine2Xb18dc622Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine2AnyOf2X50b5169b) {
                    add(
                        InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine2Xb18dc622Branch.InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine2AnyOf2X50b5169b,
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
        ): InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine2Xb18dc622 {
            val inspection = inspectInlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine2Xb18dc622(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine2Xb18dc622NoMatchException(
                    "InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine2Xb18dc622 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine2Xb18dc622(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine2Xb18dc622> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine2Xb18dc622 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine2Xb18dc622",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine2Xb18dc622,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine2Xb18dc622",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine2Xb18dc622(
    element: JsonElement,
): InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine2Xb18dc622Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesInlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine2AnyOf2X50b5169b =
        element
            .isJsonDecodable<InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine2AnyOf2X50b5169b>()
    return InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine2Xb18dc622Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine2AnyOf2X50b5169b = matchesInlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine2AnyOf2X50b5169b,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesInlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine2AnyOf2X50b5169b) {
                    add(
                        "InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine2AnyOf2X50b5169b: value does not match InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine2AnyOf2X50b5169b",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
