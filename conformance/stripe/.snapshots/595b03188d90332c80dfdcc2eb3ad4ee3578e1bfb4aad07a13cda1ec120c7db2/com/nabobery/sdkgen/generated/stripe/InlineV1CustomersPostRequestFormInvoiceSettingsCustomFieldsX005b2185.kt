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
import kotlinx.serialization.json.decodeFromJsonElement
import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set

public enum class InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsX005b2185Branch {
    Branch1,
    InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsAnyOf2X2b6c43fe,
}

public sealed class InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsX005b2185DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsX005b2185NoMatchException(
    message: String,
) : InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsX005b2185DecodingException(message)

internal data class InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsX005b2185Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsAnyOf2X2b6c43fe: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsAnyOf2X2b6c43fe,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}/post/requestBody/content/application~1x-www-form-urle
 * ncoded/schema/properties/invoice_settings/properties/custom_fields.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}/post/requestBody/content/application~1x-www-form-urle
 * ncoded/schema/properties/invoice_settings/properties/custom_fields
 */
@Serializable(with = InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsX005b2185.Serializer::class)
public class InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsX005b2185 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsX005b2185Inspection,
) {
    public val branch1:
        List<InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsAnyOf1ItemX11b4c864>? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesBranch1) {
                json
                    .decodeFromJsonElement<List<InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsAnyOf1ItemX11b4c864>>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsAnyOf2X2b6c43fe:
        InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsAnyOf2X2b6c43fe? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsAnyOf2X2b6c43fe) {
                json
                    .decodeFromJsonElement<InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsAnyOf2X2b6c43fe>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsX005b2185Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsX005b2185Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsAnyOf2X2b6c43fe) {
                    add(
                        InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsX005b2185Branch.InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsAnyOf2X2b6c43fe,
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
        ): InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsX005b2185 {
            val inspection = inspectInlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsX005b2185(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsX005b2185NoMatchException(
                    "InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsX005b2185 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsX005b2185(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsX005b2185> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsX005b2185 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsX005b2185",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsX005b2185,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsX005b2185",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsX005b2185(
    element: JsonElement,
): InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsX005b2185Inspection {
    val matchesBranch1 =
        element.isJsonDecodable<List<InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsAnyOf1ItemX11b4c864>>() &&
            (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
    val matchesInlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsAnyOf2X2b6c43fe =
        element
            .isJsonDecodable<InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsAnyOf2X2b6c43fe>()
    return InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsX005b2185Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsAnyOf2X2b6c43fe = matchesInlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsAnyOf2X2b6c43fe,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match List")
                if (!matchesInlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsAnyOf2X2b6c43fe) {
                    add(
                        "InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsAnyOf2X2b6c43fe: value does not match InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsAnyOf2X2b6c43fe",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
