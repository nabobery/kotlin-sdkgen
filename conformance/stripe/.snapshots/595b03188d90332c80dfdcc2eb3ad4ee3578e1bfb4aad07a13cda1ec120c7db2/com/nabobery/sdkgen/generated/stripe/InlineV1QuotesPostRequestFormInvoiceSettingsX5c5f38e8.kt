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
 * All invoices will be billed using the specified settings.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes~1{quote}/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/invoice_settings
 */
@Serializable(with = InlineV1QuotesPostRequestFormInvoiceSettingsX5c5f38e8.Serializer::class)
public class InlineV1QuotesPostRequestFormInvoiceSettingsX5c5f38e8(
    public val daysUntilDue: Int? = null,
    public val issuer: InlineV1QuotesPostRequestFormInvoiceSettingsIssuerX644e86c0? = null,
) {
    public class Builder {
        public var daysUntilDue: Int? = null

        public var issuer: InlineV1QuotesPostRequestFormInvoiceSettingsIssuerX644e86c0? = null

        public fun build(): InlineV1QuotesPostRequestFormInvoiceSettingsX5c5f38e8 =
            InlineV1QuotesPostRequestFormInvoiceSettingsX5c5f38e8(
                daysUntilDue = daysUntilDue,
                issuer = issuer,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1QuotesPostRequestFormInvoiceSettingsX5c5f38e8 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1QuotesPostRequestFormInvoiceSettingsX5c5f38e8> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1QuotesPostRequestFormInvoiceSettingsX5c5f38e8 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1QuotesPostRequestFormInvoiceSettingsX5c5f38e8")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1QuotesPostRequestFormInvoiceSettingsX5c5f38e8 must be a JSON object",
                    )
            return InlineV1QuotesPostRequestFormInvoiceSettingsX5c5f38e8(
                daysUntilDue = rawObject["days_until_due"]?.let { json.decodeFromJsonElement<Int>(it) },
                issuer =
                    rawObject["issuer"]?.let {
                        json.decodeFromJsonElement<InlineV1QuotesPostRequestFormInvoiceSettingsIssuerX644e86c0>(it)
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1QuotesPostRequestFormInvoiceSettingsX5c5f38e8,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1QuotesPostRequestFormInvoiceSettingsX5c5f38e8")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.daysUntilDue?.let { put("days_until_due", json.encodeToJsonElement(it)) }
                    value.issuer?.let { put("issuer", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1QuotesPostRequestFormInvoiceSettingsX5c5f38e8(
    block: InlineV1QuotesPostRequestFormInvoiceSettingsX5c5f38e8.Builder.() -> Unit,
): InlineV1QuotesPostRequestFormInvoiceSettingsX5c5f38e8 =
    InlineV1QuotesPostRequestFormInvoiceSettingsX5c5f38e8.build(block)
