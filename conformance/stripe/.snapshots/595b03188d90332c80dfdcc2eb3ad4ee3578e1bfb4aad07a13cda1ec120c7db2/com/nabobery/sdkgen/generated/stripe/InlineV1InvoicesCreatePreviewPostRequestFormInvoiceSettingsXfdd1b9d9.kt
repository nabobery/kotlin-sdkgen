package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.Int
import kotlin.Unit

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/schedule_details/properties/phases/items/properties/invoice_settings.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/schedule_details/properties/phases/items/properties/invoice_settings
 */
@Serializable(with = InlineV1InvoicesCreatePreviewPostRequestFormInvoiceSettingsXfdd1b9d9.Serializer::class)
public class InlineV1InvoicesCreatePreviewPostRequestFormInvoiceSettingsXfdd1b9d9(
    public val accountTaxIds: InlineV1InvoicesCreatePreviewPostRequestFormAccountTaxIdsXa5c99459? = null,
    public val daysUntilDue: Int? = null,
    public val issuer: InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesIssuerXf5c93c81? = null,
) {
    public class Builder {
        public var accountTaxIds: InlineV1InvoicesCreatePreviewPostRequestFormAccountTaxIdsXa5c99459? =
            null

        public var daysUntilDue: Int? = null

        public var issuer:
            InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesIssuerXf5c93c81? = null

        public fun build(): InlineV1InvoicesCreatePreviewPostRequestFormInvoiceSettingsXfdd1b9d9 =
            InlineV1InvoicesCreatePreviewPostRequestFormInvoiceSettingsXfdd1b9d9(
                accountTaxIds = accountTaxIds,
                daysUntilDue = daysUntilDue,
                issuer = issuer,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1InvoicesCreatePreviewPostRequestFormInvoiceSettingsXfdd1b9d9 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1InvoicesCreatePreviewPostRequestFormInvoiceSettingsXfdd1b9d9> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1InvoicesCreatePreviewPostRequestFormInvoiceSettingsXfdd1b9d9 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1InvoicesCreatePreviewPostRequestFormInvoiceSettingsXfdd1b9d9",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1InvoicesCreatePreviewPostRequestFormInvoiceSettingsXfdd1b9d9 must be a JSON object",
                    )
            return InlineV1InvoicesCreatePreviewPostRequestFormInvoiceSettingsXfdd1b9d9(
                accountTaxIds =
                    rawObject["account_tax_ids"]?.let {
                        json.decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormAccountTaxIdsXa5c99459>(
                            it,
                        )
                    },
                daysUntilDue = rawObject["days_until_due"]?.let { json.decodeFromJsonElement<Int>(it) },
                issuer =
                    rawObject["issuer"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesIssuerXf5c93c81>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1InvoicesCreatePreviewPostRequestFormInvoiceSettingsXfdd1b9d9,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1InvoicesCreatePreviewPostRequestFormInvoiceSettingsXfdd1b9d9",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.accountTaxIds?.let { put("account_tax_ids", json.encodeToJsonElement(it)) }
                    value.daysUntilDue?.let { put("days_until_due", json.encodeToJsonElement(it)) }
                    value.issuer?.let { put("issuer", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1InvoicesCreatePreviewPostRequestFormInvoiceSettingsXfdd1b9d9(
    block: InlineV1InvoicesCreatePreviewPostRequestFormInvoiceSettingsXfdd1b9d9.Builder.() -> Unit,
): InlineV1InvoicesCreatePreviewPostRequestFormInvoiceSettingsXfdd1b9d9 =
    InlineV1InvoicesCreatePreviewPostRequestFormInvoiceSettingsXfdd1b9d9.build(block)
