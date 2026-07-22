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
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/payto/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/payto/anyOf/0
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X9018025e.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X9018025e(
    public val mandateOptions: InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX026a69fb? = null,
) {
    public class Builder {
        public var mandateOptions: InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX026a69fb? =
            null

        public fun build(): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X9018025e =
            InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X9018025e(
                mandateOptions = mandateOptions,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X9018025e = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X9018025e> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X9018025e {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X9018025e",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X9018025e must be a JSON object",
                    )
            return InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X9018025e(
                mandateOptions =
                    rawObject["mandate_options"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX026a69fb>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X9018025e,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X9018025e",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.mandateOptions?.let { put("mandate_options", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X9018025e(
    block: InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X9018025e.Builder.() -> Unit,
): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X9018025e =
    InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X9018025e.build(block)
