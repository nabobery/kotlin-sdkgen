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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_settings
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormPaymentSettingsX4fbccb44.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormPaymentSettingsX4fbccb44(
    public val paymentMethodOptions:
        InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodOptionsX819582f2? = null,
    public val paymentMethodTypes: InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodTypesX11076b40? = null,
    public val saveDefaultPaymentMethod: InlineV1SubscriptionsPostRequestFormSaveDefaultPaymentMethodX79879152? = null,
) {
    public class Builder {
        public var paymentMethodOptions:
            InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodOptionsX819582f2? = null

        public var paymentMethodTypes:
            InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodTypesX11076b40? = null

        public var saveDefaultPaymentMethod:
            InlineV1SubscriptionsPostRequestFormSaveDefaultPaymentMethodX79879152? = null

        public fun build(): InlineV1SubscriptionsPostRequestFormPaymentSettingsX4fbccb44 =
            InlineV1SubscriptionsPostRequestFormPaymentSettingsX4fbccb44(
                paymentMethodOptions = paymentMethodOptions,
                paymentMethodTypes = paymentMethodTypes,
                saveDefaultPaymentMethod = saveDefaultPaymentMethod,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1SubscriptionsPostRequestFormPaymentSettingsX4fbccb44 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormPaymentSettingsX4fbccb44> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormPaymentSettingsX4fbccb44 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormPaymentSettingsX4fbccb44")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1SubscriptionsPostRequestFormPaymentSettingsX4fbccb44 must be a JSON object",
                    )
            return InlineV1SubscriptionsPostRequestFormPaymentSettingsX4fbccb44(
                paymentMethodOptions =
                    rawObject["payment_method_options"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodOptionsX819582f2>(
                                it,
                            )
                    },
                paymentMethodTypes =
                    rawObject["payment_method_types"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodTypesX11076b40>(
                                it,
                            )
                    },
                saveDefaultPaymentMethod =
                    rawObject["save_default_payment_method"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormSaveDefaultPaymentMethodX79879152>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionsPostRequestFormPaymentSettingsX4fbccb44,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1SubscriptionsPostRequestFormPaymentSettingsX4fbccb44")
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

public fun inlineV1SubscriptionsPostRequestFormPaymentSettingsX4fbccb44(
    block: InlineV1SubscriptionsPostRequestFormPaymentSettingsX4fbccb44.Builder.() -> Unit,
): InlineV1SubscriptionsPostRequestFormPaymentSettingsX4fbccb44 =
    InlineV1SubscriptionsPostRequestFormPaymentSettingsX4fbccb44.build(block)
