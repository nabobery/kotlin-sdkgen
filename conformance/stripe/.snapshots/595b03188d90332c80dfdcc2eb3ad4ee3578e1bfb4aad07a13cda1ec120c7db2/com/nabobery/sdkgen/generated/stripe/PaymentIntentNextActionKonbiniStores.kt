package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.Unit

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_intent_next_action_konbini_stores
 */
@Serializable(with = PaymentIntentNextActionKonbiniStores.Serializer::class)
public class PaymentIntentNextActionKonbiniStores(
    /**
     * FamilyMart instruction details.
     */
    public val familymart: InlinePaymentIntentNextActionKonbiniStoresFamilymartXdf5edf2f? = null,
    /**
     * Lawson instruction details.
     */
    public val lawson: InlinePaymentIntentNextActionKonbiniStoresLawsonX667e6d70? = null,
    /**
     * Ministop instruction details.
     */
    public val ministop: InlinePaymentIntentNextActionKonbiniStoresMinistopX9893f31a? = null,
    /**
     * Seicomart instruction details.
     */
    public val seicomart: InlinePaymentIntentNextActionKonbiniStoresSeicomartX058fdecf? = null,
) {
    public class Builder {
        /**
         * FamilyMart instruction details.
         */
        public var familymart: InlinePaymentIntentNextActionKonbiniStoresFamilymartXdf5edf2f? = null

        /**
         * Lawson instruction details.
         */
        public var lawson: InlinePaymentIntentNextActionKonbiniStoresLawsonX667e6d70? = null

        /**
         * Ministop instruction details.
         */
        public var ministop: InlinePaymentIntentNextActionKonbiniStoresMinistopX9893f31a? = null

        /**
         * Seicomart instruction details.
         */
        public var seicomart: InlinePaymentIntentNextActionKonbiniStoresSeicomartX058fdecf? = null

        public fun build(): PaymentIntentNextActionKonbiniStores =
            PaymentIntentNextActionKonbiniStores(
                familymart = familymart,
                lawson = lawson,
                ministop = ministop,
                seicomart = seicomart,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): PaymentIntentNextActionKonbiniStores =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PaymentIntentNextActionKonbiniStores> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PaymentIntentNextActionKonbiniStores {
            val jsonDecoder = decoder.requireJsonDecoder("PaymentIntentNextActionKonbiniStores")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("PaymentIntentNextActionKonbiniStores must be a JSON object")
            return PaymentIntentNextActionKonbiniStores(
                familymart =
                    rawObject["familymart"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlinePaymentIntentNextActionKonbiniStoresFamilymartXdf5edf2f?>(
                                element,
                            )
                        }
                    },
                lawson =
                    rawObject["lawson"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlinePaymentIntentNextActionKonbiniStoresLawsonX667e6d70?>(
                                element,
                            )
                        }
                    },
                ministop =
                    rawObject["ministop"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlinePaymentIntentNextActionKonbiniStoresMinistopX9893f31a?>(
                                element,
                            )
                        }
                    },
                seicomart =
                    rawObject["seicomart"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlinePaymentIntentNextActionKonbiniStoresSeicomartX058fdecf?>(
                                element,
                            )
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: PaymentIntentNextActionKonbiniStores,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("PaymentIntentNextActionKonbiniStores")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.familymart?.let { put("familymart", json.encodeToJsonElement(it)) }
                    value.lawson?.let { put("lawson", json.encodeToJsonElement(it)) }
                    value.ministop?.let { put("ministop", json.encodeToJsonElement(it)) }
                    value.seicomart?.let { put("seicomart", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun paymentIntentNextActionKonbiniStores(
    block: PaymentIntentNextActionKonbiniStores.Builder.() -> Unit,
): PaymentIntentNextActionKonbiniStores = PaymentIntentNextActionKonbiniStores.build(block)
