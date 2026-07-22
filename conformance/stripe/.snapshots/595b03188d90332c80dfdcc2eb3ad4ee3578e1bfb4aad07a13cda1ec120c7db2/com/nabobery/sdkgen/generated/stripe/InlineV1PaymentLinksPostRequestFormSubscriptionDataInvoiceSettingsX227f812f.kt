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
import kotlin.Unit

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/subscription_data/properties/invoice_settings.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/subscription_data/properties/invoice_settings
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormSubscriptionDataInvoiceSettingsX227f812f.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormSubscriptionDataInvoiceSettingsX227f812f(
    public val issuer: InlineV1PaymentLinksPostRequestFormSubscriptionDataIssuerX286c2821? = null,
) {
    public class Builder {
        public var issuer: InlineV1PaymentLinksPostRequestFormSubscriptionDataIssuerX286c2821? = null

        public fun build(): InlineV1PaymentLinksPostRequestFormSubscriptionDataInvoiceSettingsX227f812f =
            InlineV1PaymentLinksPostRequestFormSubscriptionDataInvoiceSettingsX227f812f(
                issuer = issuer,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentLinksPostRequestFormSubscriptionDataInvoiceSettingsX227f812f = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormSubscriptionDataInvoiceSettingsX227f812f> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentLinksPostRequestFormSubscriptionDataInvoiceSettingsX227f812f {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentLinksPostRequestFormSubscriptionDataInvoiceSettingsX227f812f",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentLinksPostRequestFormSubscriptionDataInvoiceSettingsX227f812f must be a JSON object",
                    )
            return InlineV1PaymentLinksPostRequestFormSubscriptionDataInvoiceSettingsX227f812f(
                issuer =
                    rawObject["issuer"]?.let {
                        json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormSubscriptionDataIssuerX286c2821>(
                            it,
                        )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentLinksPostRequestFormSubscriptionDataInvoiceSettingsX227f812f,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentLinksPostRequestFormSubscriptionDataInvoiceSettingsX227f812f",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.issuer?.let { put("issuer", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentLinksPostRequestFormSubscriptionDataInvoiceSettingsX227f812f(
    block: InlineV1PaymentLinksPostRequestFormSubscriptionDataInvoiceSettingsX227f812f.Builder.() -> Unit,
): InlineV1PaymentLinksPostRequestFormSubscriptionDataInvoiceSettingsX227f812f =
    InlineV1PaymentLinksPostRequestFormSubscriptionDataInvoiceSettingsX227f812f.build(block)
