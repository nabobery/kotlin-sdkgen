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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/pix/anyOf/0
 * .
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/pix/anyOf/0
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xf0e0aec9.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xf0e0aec9(
    public val expiresAfterSeconds: Int? = null,
    public val mandateOptions: InlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsX7fdb154a? = null,
) {
    public class Builder {
        public var expiresAfterSeconds: Int? = null

        public var mandateOptions:
            InlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsX7fdb154a? = null

        public fun build(): InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xf0e0aec9 =
            InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xf0e0aec9(
                expiresAfterSeconds = expiresAfterSeconds,
                mandateOptions = mandateOptions,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xf0e0aec9 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xf0e0aec9> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xf0e0aec9 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xf0e0aec9",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xf0e0aec9 must be a JSON object",
                    )
            return InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xf0e0aec9(
                expiresAfterSeconds = rawObject["expires_after_seconds"]?.let { json.decodeFromJsonElement<Int>(it) },
                mandateOptions =
                    rawObject["mandate_options"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsX7fdb154a>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xf0e0aec9,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xf0e0aec9",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.expiresAfterSeconds?.let { put("expires_after_seconds", json.encodeToJsonElement(it)) }
                    value.mandateOptions?.let { put("mandate_options", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xf0e0aec9(
    block: InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xf0e0aec9.Builder.() -> Unit,
): InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xf0e0aec9 =
    InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xf0e0aec9.build(block)
