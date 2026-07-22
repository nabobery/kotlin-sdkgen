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

public enum class InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine1X217abcf3Branch {
    Branch1,
    InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine1AnyOf2X7d268456,
}

public sealed class InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine1X217abcf3DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine1X217abcf3NoMatchException(
    message: String,
) : InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine1X217abcf3DecodingException(message)

internal data class InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine1X217abcf3Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine1AnyOf2X7d268456: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine1AnyOf2X7d268456,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1calculations/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/customer_details/properties/address/properties/line1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1calculations/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/customer_details/properties/address/properties/line1
 */
@Serializable(with = InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine1X217abcf3.Serializer::class)
public class InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine1X217abcf3 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine1X217abcf3Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val inlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine1AnyOf2X7d268456:
        InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine1AnyOf2X7d268456? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine1AnyOf2X7d268456) {
                json
                    .decodeFromJsonElement<InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine1AnyOf2X7d268456>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine1X217abcf3Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine1X217abcf3Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine1AnyOf2X7d268456) {
                    add(
                        InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine1X217abcf3Branch.InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine1AnyOf2X7d268456,
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
        ): InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine1X217abcf3 {
            val inspection = inspectInlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine1X217abcf3(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine1X217abcf3NoMatchException(
                    "InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine1X217abcf3 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine1X217abcf3(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine1X217abcf3> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine1X217abcf3 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine1X217abcf3",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine1X217abcf3,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine1X217abcf3",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine1X217abcf3(
    element: JsonElement,
): InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine1X217abcf3Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesInlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine1AnyOf2X7d268456 =
        element
            .isJsonDecodable<InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine1AnyOf2X7d268456>()
    return InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine1X217abcf3Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine1AnyOf2X7d268456 = matchesInlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine1AnyOf2X7d268456,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesInlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine1AnyOf2X7d268456) {
                    add(
                        "InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine1AnyOf2X7d268456: value does not match InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine1AnyOf2X7d268456",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
