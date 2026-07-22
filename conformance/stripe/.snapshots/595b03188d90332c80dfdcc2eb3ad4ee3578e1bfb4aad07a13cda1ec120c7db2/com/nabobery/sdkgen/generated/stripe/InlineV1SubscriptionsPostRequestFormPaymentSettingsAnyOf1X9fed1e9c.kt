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
 * chema/properties/payment_settings/properties/payment_method_options/properties/bancontact/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_settings/properties/payment_method_options/properties/bancontact/anyOf/0
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X9fed1e9c.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X9fed1e9c(
    public val preferredLanguage: InlineV1SubscriptionsPostRequestFormPaymentSettingsPreferredLanguageXdfb41e96? = null,
) {
    public class Builder {
        public var preferredLanguage:
            InlineV1SubscriptionsPostRequestFormPaymentSettingsPreferredLanguageXdfb41e96? = null

        public fun build(): InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X9fed1e9c =
            InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X9fed1e9c(
                preferredLanguage = preferredLanguage,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X9fed1e9c = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X9fed1e9c> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X9fed1e9c {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X9fed1e9c",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X9fed1e9c must be a JSON object",
                    )
            return InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X9fed1e9c(
                preferredLanguage =
                    rawObject["preferred_language"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsPreferredLanguageXdfb41e96>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X9fed1e9c,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X9fed1e9c",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.preferredLanguage?.let { put("preferred_language", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X9fed1e9c(
    block: InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X9fed1e9c.Builder.() -> Unit,
): InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X9fed1e9c =
    InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X9fed1e9c.build(block)
