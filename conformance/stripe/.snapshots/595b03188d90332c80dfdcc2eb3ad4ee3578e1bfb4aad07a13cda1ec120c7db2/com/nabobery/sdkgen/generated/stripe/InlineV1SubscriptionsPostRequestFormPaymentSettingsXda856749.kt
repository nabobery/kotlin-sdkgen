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
 * Payment settings to pass to invoices created by the subscription.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/payment_settings
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormPaymentSettingsXda856749.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormPaymentSettingsXda856749(
    public val paymentMethodOptions:
        InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodOptionsX6c2cb372? = null,
    public val paymentMethodTypes: InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodTypesX6f59c585? = null,
    public val saveDefaultPaymentMethod: InlineV1SubscriptionsPostRequestFormSaveDefaultPaymentMethodXa7be33b3? = null,
) {
    public class Builder {
        public var paymentMethodOptions:
            InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodOptionsX6c2cb372? = null

        public var paymentMethodTypes:
            InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodTypesX6f59c585? = null

        public var saveDefaultPaymentMethod:
            InlineV1SubscriptionsPostRequestFormSaveDefaultPaymentMethodXa7be33b3? = null

        public fun build(): InlineV1SubscriptionsPostRequestFormPaymentSettingsXda856749 =
            InlineV1SubscriptionsPostRequestFormPaymentSettingsXda856749(
                paymentMethodOptions = paymentMethodOptions,
                paymentMethodTypes = paymentMethodTypes,
                saveDefaultPaymentMethod = saveDefaultPaymentMethod,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1SubscriptionsPostRequestFormPaymentSettingsXda856749 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormPaymentSettingsXda856749> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormPaymentSettingsXda856749 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormPaymentSettingsXda856749")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1SubscriptionsPostRequestFormPaymentSettingsXda856749 must be a JSON object",
                    )
            return InlineV1SubscriptionsPostRequestFormPaymentSettingsXda856749(
                paymentMethodOptions =
                    rawObject["payment_method_options"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodOptionsX6c2cb372>(
                                it,
                            )
                    },
                paymentMethodTypes =
                    rawObject["payment_method_types"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodTypesX6f59c585>(
                                it,
                            )
                    },
                saveDefaultPaymentMethod =
                    rawObject["save_default_payment_method"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormSaveDefaultPaymentMethodXa7be33b3>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionsPostRequestFormPaymentSettingsXda856749,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1SubscriptionsPostRequestFormPaymentSettingsXda856749")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.paymentMethodOptions?.let { put("payment_method_options", json.encodeToJsonElement(it)) }
                    value.paymentMethodTypes?.let { put("payment_method_types", json.encodeToJsonElement(it)) }
                    value.saveDefaultPaymentMethod?.let {
                        put(
                            "save_default_payment_method",
                            json.encodeToJsonElement(it),
                        )
                    }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1SubscriptionsPostRequestFormPaymentSettingsXda856749(
    block: InlineV1SubscriptionsPostRequestFormPaymentSettingsXda856749.Builder.() -> Unit,
): InlineV1SubscriptionsPostRequestFormPaymentSettingsXda856749 =
    InlineV1SubscriptionsPostRequestFormPaymentSettingsXda856749.build(block)
