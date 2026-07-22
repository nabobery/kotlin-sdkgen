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
 * chema/properties/payment_settings/properties/payment_method_options/properties/acss_debit/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_settings/properties/payment_method_options/properties/acss_debit/anyOf/0
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X316ba7ad.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X316ba7ad(
    public val mandateOptions: InlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsX3ee889e8? = null,
    public val verificationMethod: InlineV1SubscriptionsPostRequestFormPaymentSettingsVerificationMethodX8fd91a6d? = null,
) {
    public class Builder {
        public var mandateOptions:
            InlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsX3ee889e8? = null

        public var verificationMethod:
            InlineV1SubscriptionsPostRequestFormPaymentSettingsVerificationMethodX8fd91a6d? = null

        public fun build(): InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X316ba7ad =
            InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X316ba7ad(
                mandateOptions = mandateOptions,
                verificationMethod = verificationMethod,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X316ba7ad = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X316ba7ad> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X316ba7ad {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X316ba7ad",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X316ba7ad must be a JSON object",
                    )
            return InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X316ba7ad(
                mandateOptions =
                    rawObject["mandate_options"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsX3ee889e8>(
                                it,
                            )
                    },
                verificationMethod =
                    rawObject["verification_method"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsVerificationMethodX8fd91a6d>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X316ba7ad,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X316ba7ad",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.mandateOptions?.let { put("mandate_options", json.encodeToJsonElement(it)) }
                    value.verificationMethod?.let { put("verification_method", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X316ba7ad(
    block: InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X316ba7ad.Builder.() -> Unit,
): InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X316ba7ad =
    InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X316ba7ad.build(block)
