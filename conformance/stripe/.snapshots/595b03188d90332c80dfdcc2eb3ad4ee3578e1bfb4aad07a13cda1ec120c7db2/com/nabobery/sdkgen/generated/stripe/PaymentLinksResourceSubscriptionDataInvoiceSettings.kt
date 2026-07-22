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
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.String
import kotlin.Unit

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_links_resource_subscription_data_invoice_settings
 */
@Serializable(with = PaymentLinksResourceSubscriptionDataInvoiceSettings.Serializer::class)
public class PaymentLinksResourceSubscriptionDataInvoiceSettings(
    public val issuer: ConnectAccountReference,
) {
    public class Builder {
        private var issuerValue: ConnectAccountReference? = null

        public var issuer: ConnectAccountReference
            get() = requireNotNull(issuerValue) { "issuer is required" }
            set(`value`) {
                issuerValue = value
            }

        public fun build(): PaymentLinksResourceSubscriptionDataInvoiceSettings {
            check(issuerValue != null) { "issuer is required" }
            return PaymentLinksResourceSubscriptionDataInvoiceSettings(
                issuer = issuer,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): PaymentLinksResourceSubscriptionDataInvoiceSettings =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PaymentLinksResourceSubscriptionDataInvoiceSettings> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PaymentLinksResourceSubscriptionDataInvoiceSettings {
            val jsonDecoder = decoder.requireJsonDecoder("PaymentLinksResourceSubscriptionDataInvoiceSettings")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "PaymentLinksResourceSubscriptionDataInvoiceSettings must be a JSON object",
                    )
            val issuer = json.decodeRequired<ConnectAccountReference>(rawObject, "issuer")
            return PaymentLinksResourceSubscriptionDataInvoiceSettings(
                issuer = issuer,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: PaymentLinksResourceSubscriptionDataInvoiceSettings,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("PaymentLinksResourceSubscriptionDataInvoiceSettings")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("issuer", json.encodeToJsonElement(value.issuer))
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun paymentLinksResourceSubscriptionDataInvoiceSettings(
    block: PaymentLinksResourceSubscriptionDataInvoiceSettings.Builder.() -> Unit,
): PaymentLinksResourceSubscriptionDataInvoiceSettings =
    PaymentLinksResourceSubscriptionDataInvoiceSettings.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "PaymentLinksResourceSubscriptionDataInvoiceSettings is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
