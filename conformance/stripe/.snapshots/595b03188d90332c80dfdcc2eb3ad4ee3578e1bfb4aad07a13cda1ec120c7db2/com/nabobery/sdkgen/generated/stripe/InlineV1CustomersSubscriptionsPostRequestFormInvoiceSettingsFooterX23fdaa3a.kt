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

public enum class InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsFooterX23fdaa3aBranch {
    Branch1,
    InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2X5e89bed6,
}

public sealed class InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsFooterX23fdaa3aDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsFooterX23fdaa3aNoMatchException(
    message: String,
) : InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsFooterX23fdaa3aDecodingException(message)

internal data class InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsFooterX23fdaa3aInspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2X5e89bed6: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2X5e89bed6,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/invoice_settings/properties/footer.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/invoice_settings/properties/footer
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsFooterX23fdaa3a.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsFooterX23fdaa3a internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsFooterX23fdaa3aInspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val inlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2X5e89bed6:
        InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2X5e89bed6? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2X5e89bed6) {
                json
                    .decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2X5e89bed6>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsFooterX23fdaa3aBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsFooterX23fdaa3aBranch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2X5e89bed6) {
                    add(
                        InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsFooterX23fdaa3aBranch.InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2X5e89bed6,
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
        ): InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsFooterX23fdaa3a {
            val inspection = inspectInlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsFooterX23fdaa3a(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsFooterX23fdaa3aNoMatchException(
                    "InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsFooterX23fdaa3a matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsFooterX23fdaa3a(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsFooterX23fdaa3a> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsFooterX23fdaa3a {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsFooterX23fdaa3a",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsFooterX23fdaa3a,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsFooterX23fdaa3a",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsFooterX23fdaa3a(
    element: JsonElement,
): InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsFooterX23fdaa3aInspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesInlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2X5e89bed6 =
        element
            .isJsonDecodable<InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2X5e89bed6>()
    return InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsFooterX23fdaa3aInspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2X5e89bed6 = matchesInlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2X5e89bed6,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesInlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2X5e89bed6) {
                    add(
                        "InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2X5e89bed6: value does not match InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2X5e89bed6",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
