package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.Int
import kotlin.String
import kotlin.Unit

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_intent_next_action_konbini
 */
@Serializable(with = PaymentIntentNextActionKonbini.Serializer::class)
public class PaymentIntentNextActionKonbini(
    /**
     * The timestamp at which the pending Konbini payment expires.
     */
    public val expiresAt: Int,
    public val stores: PaymentIntentNextActionKonbiniStores,
    /**
     * The URL for the Konbini payment instructions page, which allows customers to view and print a Konbini voucher.
     */
    public val hostedVoucherUrl: String? = null,
) {
    public class Builder {
        private var expiresAtValue: Int? = null

        public var expiresAt: Int
            get() = requireNotNull(expiresAtValue) { "expiresAt is required" }
            set(`value`) {
                expiresAtValue = value
            }

        private var storesValue: PaymentIntentNextActionKonbiniStores? = null

        public var stores: PaymentIntentNextActionKonbiniStores
            get() = requireNotNull(storesValue) { "stores is required" }
            set(`value`) {
                storesValue = value
            }

        /**
         * The URL for the Konbini payment instructions page, which allows customers to view and print a Konbini voucher.
         */
        public var hostedVoucherUrl: String? = null

        public fun build(): PaymentIntentNextActionKonbini {
            check(expiresAtValue != null) { "expiresAt is required" }
            check(storesValue != null) { "stores is required" }
            return PaymentIntentNextActionKonbini(
                expiresAt = expiresAt,
                stores = stores,
                hostedVoucherUrl = hostedVoucherUrl,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): PaymentIntentNextActionKonbini = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PaymentIntentNextActionKonbini> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PaymentIntentNextActionKonbini {
            val jsonDecoder = decoder.requireJsonDecoder("PaymentIntentNextActionKonbini")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("PaymentIntentNextActionKonbini must be a JSON object")
            val expiresAt = json.decodeRequired<Int>(rawObject, "expires_at")
            val stores = json.decodeRequired<PaymentIntentNextActionKonbiniStores>(rawObject, "stores")
            return PaymentIntentNextActionKonbini(
                expiresAt = expiresAt,
                stores = stores,
                hostedVoucherUrl =
                    rawObject["hosted_voucher_url"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: PaymentIntentNextActionKonbini,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("PaymentIntentNextActionKonbini")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("expires_at", json.encodeToJsonElement(value.expiresAt))
                    put("stores", json.encodeToJsonElement(value.stores))
                    value.hostedVoucherUrl?.let { put("hosted_voucher_url", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun paymentIntentNextActionKonbini(
    block: PaymentIntentNextActionKonbini.Builder.() -> Unit,
): PaymentIntentNextActionKonbini = PaymentIntentNextActionKonbini.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "PaymentIntentNextActionKonbini is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
