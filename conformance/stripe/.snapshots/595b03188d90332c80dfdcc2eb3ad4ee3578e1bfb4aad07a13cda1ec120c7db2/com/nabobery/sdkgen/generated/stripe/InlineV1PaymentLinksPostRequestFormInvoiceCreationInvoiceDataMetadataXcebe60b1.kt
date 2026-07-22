package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set

public enum class InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataMetadataXcebe60b1Branch {
    Branch1,
    InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xff06498e,
}

public sealed class InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataMetadataXcebe60b1DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataMetadataXcebe60b1NoMatchException(
    message: String,
) : InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataMetadataXcebe60b1DecodingException(message)

internal data class InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataMetadataXcebe60b1Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xff06498e: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xff06498e,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/invoice_creation/properties/invoice_data/properties/metadata.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/invoice_creation/properties/invoice_data/properties/metadata
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataMetadataXcebe60b1.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataMetadataXcebe60b1 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataMetadataXcebe60b1Inspection,
) {
    public val branch1: JsonObject? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

    public val inlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xff06498e:
        InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xff06498e? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xff06498e) {
                json
                    .decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xff06498e>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataMetadataXcebe60b1Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataMetadataXcebe60b1Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xff06498e) {
                    add(
                        InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataMetadataXcebe60b1Branch.InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xff06498e,
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
        ): InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataMetadataXcebe60b1 {
            val inspection = inspectInlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataMetadataXcebe60b1(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataMetadataXcebe60b1NoMatchException(
                    "InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataMetadataXcebe60b1 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataMetadataXcebe60b1(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataMetadataXcebe60b1> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataMetadataXcebe60b1 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataMetadataXcebe60b1",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataMetadataXcebe60b1,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataMetadataXcebe60b1",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataMetadataXcebe60b1(
    element: JsonElement,
): InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataMetadataXcebe60b1Inspection {
    val matchesBranch1 = element.isJsonDecodable<JsonObject>()
    val matchesInlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xff06498e =
        element
            .isJsonDecodable<InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xff06498e>()
    return InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataMetadataXcebe60b1Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xff06498e = matchesInlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xff06498e,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match JsonObject")
                if (!matchesInlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xff06498e) {
                    add(
                        "InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xff06498e: value does not match InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xff06498e",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
