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

public enum class InlineV1CustomersPostRequestFormTaxIpAddressX92883f53Branch {
    Branch1,
    InlineV1CustomersPostRequestFormTaxIpAddressAnyOf2X2f07647d,
}

public sealed class InlineV1CustomersPostRequestFormTaxIpAddressX92883f53DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1CustomersPostRequestFormTaxIpAddressX92883f53NoMatchException(
    message: String,
) : InlineV1CustomersPostRequestFormTaxIpAddressX92883f53DecodingException(message)

internal data class InlineV1CustomersPostRequestFormTaxIpAddressX92883f53Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1CustomersPostRequestFormTaxIpAddressAnyOf2X2f07647d: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesInlineV1CustomersPostRequestFormTaxIpAddressAnyOf2X2f07647d).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}/post/requestBody/content/application~1x-www-form-urle
 * ncoded/schema/properties/tax/properties/ip_address.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}/post/requestBody/content/application~1x-www-form-urle
 * ncoded/schema/properties/tax/properties/ip_address
 */
@Serializable(with = InlineV1CustomersPostRequestFormTaxIpAddressX92883f53.Serializer::class)
public class InlineV1CustomersPostRequestFormTaxIpAddressX92883f53 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1CustomersPostRequestFormTaxIpAddressX92883f53Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val inlineV1CustomersPostRequestFormTaxIpAddressAnyOf2X2f07647d:
        InlineV1CustomersPostRequestFormTaxIpAddressAnyOf2X2f07647d? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1CustomersPostRequestFormTaxIpAddressAnyOf2X2f07647d) {
                json
                    .decodeFromJsonElement<InlineV1CustomersPostRequestFormTaxIpAddressAnyOf2X2f07647d>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineV1CustomersPostRequestFormTaxIpAddressX92883f53Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlineV1CustomersPostRequestFormTaxIpAddressX92883f53Branch.Branch1)
                if (inspection.matchesInlineV1CustomersPostRequestFormTaxIpAddressAnyOf2X2f07647d) {
                    add(
                        InlineV1CustomersPostRequestFormTaxIpAddressX92883f53Branch.InlineV1CustomersPostRequestFormTaxIpAddressAnyOf2X2f07647d,
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
        ): InlineV1CustomersPostRequestFormTaxIpAddressX92883f53 {
            val inspection = inspectInlineV1CustomersPostRequestFormTaxIpAddressX92883f53(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1CustomersPostRequestFormTaxIpAddressX92883f53NoMatchException(
                    "InlineV1CustomersPostRequestFormTaxIpAddressX92883f53 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1CustomersPostRequestFormTaxIpAddressX92883f53(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1CustomersPostRequestFormTaxIpAddressX92883f53> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1CustomersPostRequestFormTaxIpAddressX92883f53 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersPostRequestFormTaxIpAddressX92883f53")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CustomersPostRequestFormTaxIpAddressX92883f53,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1CustomersPostRequestFormTaxIpAddressX92883f53",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1CustomersPostRequestFormTaxIpAddressX92883f53(
    element: JsonElement,
): InlineV1CustomersPostRequestFormTaxIpAddressX92883f53Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesInlineV1CustomersPostRequestFormTaxIpAddressAnyOf2X2f07647d =
        element
            .isJsonDecodable<InlineV1CustomersPostRequestFormTaxIpAddressAnyOf2X2f07647d>()
    return InlineV1CustomersPostRequestFormTaxIpAddressX92883f53Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1CustomersPostRequestFormTaxIpAddressAnyOf2X2f07647d = matchesInlineV1CustomersPostRequestFormTaxIpAddressAnyOf2X2f07647d,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesInlineV1CustomersPostRequestFormTaxIpAddressAnyOf2X2f07647d) {
                    add(
                        "InlineV1CustomersPostRequestFormTaxIpAddressAnyOf2X2f07647d: value does not match InlineV1CustomersPostRequestFormTaxIpAddressAnyOf2X2f07647d",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
