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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_settings/properties/payment_method_options/properties/upi/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_settings/properties/payment_method_options/properties/upi/anyOf/0
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xe3bd8676.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xe3bd8676(
    public val mandateOptions: InlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsX6e80e4d4? = null,
) {
    public class Builder {
        public var mandateOptions:
            InlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsX6e80e4d4? = null

        public fun build(): InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xe3bd8676 =
            InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xe3bd8676(
                mandateOptions = mandateOptions,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xe3bd8676 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xe3bd8676> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xe3bd8676 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xe3bd8676",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xe3bd8676 must be a JSON object",
                    )
            return InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xe3bd8676(
                mandateOptions =
                    rawObject["mandate_options"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsX6e80e4d4>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xe3bd8676,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xe3bd8676",
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

public fun inlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xe3bd8676(
    block: InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xe3bd8676.Builder.() -> Unit,
): InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xe3bd8676 =
    InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xe3bd8676.build(block)
