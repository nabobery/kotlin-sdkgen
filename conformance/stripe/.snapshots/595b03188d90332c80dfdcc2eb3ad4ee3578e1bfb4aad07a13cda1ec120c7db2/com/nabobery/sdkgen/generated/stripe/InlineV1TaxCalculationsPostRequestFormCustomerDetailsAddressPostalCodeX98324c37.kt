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

public enum class InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressPostalCodeX98324c37Branch {
    Branch1,
    InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressAnyOf2Xa380610c,
}

public sealed class InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressPostalCodeX98324c37DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressPostalCodeX98324c37NoMatchException(
    message: String,
) : InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressPostalCodeX98324c37DecodingException(message)

internal data class InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressPostalCodeX98324c37Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressAnyOf2Xa380610c: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressAnyOf2Xa380610c,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1calculations/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/customer_details/properties/address/properties/postal_code.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1calculations/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/customer_details/properties/address/properties/postal_code
 */
@Serializable(with = InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressPostalCodeX98324c37.Serializer::class)
public class InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressPostalCodeX98324c37 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressPostalCodeX98324c37Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val inlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressAnyOf2Xa380610c:
        InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressAnyOf2Xa380610c? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressAnyOf2Xa380610c) {
                json
                    .decodeFromJsonElement<InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressAnyOf2Xa380610c>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressPostalCodeX98324c37Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressPostalCodeX98324c37Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressAnyOf2Xa380610c) {
                    add(
                        InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressPostalCodeX98324c37Branch.InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressAnyOf2Xa380610c,
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
        ): InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressPostalCodeX98324c37 {
            val inspection = inspectInlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressPostalCodeX98324c37(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressPostalCodeX98324c37NoMatchException(
                    "InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressPostalCodeX98324c37 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressPostalCodeX98324c37(
                raw,
                json,
                inspection,
            )
        }
    }

    public object Serializer : KSerializer<InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressPostalCodeX98324c37> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressPostalCodeX98324c37 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressPostalCodeX98324c37",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressPostalCodeX98324c37,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressPostalCodeX98324c37",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressPostalCodeX98324c37(
    element: JsonElement,
): InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressPostalCodeX98324c37Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesInlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressAnyOf2Xa380610c =
        element
            .isJsonDecodable<InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressAnyOf2Xa380610c>()
    return InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressPostalCodeX98324c37Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressAnyOf2Xa380610c = matchesInlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressAnyOf2Xa380610c,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesInlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressAnyOf2Xa380610c) {
                    add(
                        "InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressAnyOf2Xa380610c: value does not match InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressAnyOf2Xa380610c",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
