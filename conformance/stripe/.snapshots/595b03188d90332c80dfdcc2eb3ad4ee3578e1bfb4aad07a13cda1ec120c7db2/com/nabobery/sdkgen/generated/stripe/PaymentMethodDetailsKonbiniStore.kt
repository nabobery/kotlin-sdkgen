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

@Serializable
public data class PaymentMethodDetailsKonbiniStoreView(
    public val chain: InlinePaymentMethodDetailsKonbiniStoreChainXb550e3bd? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details_konbini_store
 */
@Serializable(with = PaymentMethodDetailsKonbiniStore.Serializer::class)
public class PaymentMethodDetailsKonbiniStore(
    /**
     * The name of the convenience store chain where the payment was completed.
     */
    public val chain: InlinePaymentMethodDetailsKonbiniStoreChainXb550e3bd? = null,
) {
    public class Builder {
        /**
         * The name of the convenience store chain where the payment was completed.
         */
        public var chain: InlinePaymentMethodDetailsKonbiniStoreChainXb550e3bd? = null

        public fun build(): PaymentMethodDetailsKonbiniStore =
            PaymentMethodDetailsKonbiniStore(
                chain = chain,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): PaymentMethodDetailsKonbiniStore = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PaymentMethodDetailsKonbiniStore> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PaymentMethodDetailsKonbiniStore {
            val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodDetailsKonbiniStore")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("PaymentMethodDetailsKonbiniStore must be a JSON object")
            return PaymentMethodDetailsKonbiniStore(
                chain =
                    rawObject["chain"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlinePaymentMethodDetailsKonbiniStoreChainXb550e3bd?>(element)
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: PaymentMethodDetailsKonbiniStore,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodDetailsKonbiniStore")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.chain?.let { put("chain", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun paymentMethodDetailsKonbiniStore(
    block: PaymentMethodDetailsKonbiniStore.Builder.() -> Unit,
): PaymentMethodDetailsKonbiniStore = PaymentMethodDetailsKonbiniStore.build(block)
