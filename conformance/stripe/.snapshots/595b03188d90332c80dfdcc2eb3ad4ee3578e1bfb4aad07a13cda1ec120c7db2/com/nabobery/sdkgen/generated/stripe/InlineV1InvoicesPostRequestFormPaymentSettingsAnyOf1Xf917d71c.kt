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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/payment_settings/properties/payment_method_options/properties/card/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/payment_settings/properties/payment_method_options/properties/card/anyOf/0
 */
@Serializable(with = InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xf917d71c.Serializer::class)
public class InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xf917d71c(
    public val installments: InlineV1InvoicesPostRequestFormPaymentSettingsInstallmentsXa1d5a2b2? = null,
    public val requestThreeDSecure: InlineV1InvoicesPostRequestFormPaymentSettingsRequestThreeDSecureX8db59852? = null,
) {
    public class Builder {
        public var installments: InlineV1InvoicesPostRequestFormPaymentSettingsInstallmentsXa1d5a2b2? =
            null

        public var requestThreeDSecure:
            InlineV1InvoicesPostRequestFormPaymentSettingsRequestThreeDSecureX8db59852? = null

        public fun build(): InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xf917d71c =
            InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xf917d71c(
                installments = installments,
                requestThreeDSecure = requestThreeDSecure,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xf917d71c =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xf917d71c> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xf917d71c {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xf917d71c",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xf917d71c must be a JSON object",
                    )
            return InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xf917d71c(
                installments =
                    rawObject["installments"]?.let {
                        json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsInstallmentsXa1d5a2b2>(
                            it,
                        )
                    },
                requestThreeDSecure =
                    rawObject["request_three_d_secure"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsRequestThreeDSecureX8db59852>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xf917d71c,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xf917d71c",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.installments?.let { put("installments", json.encodeToJsonElement(it)) }
                    value.requestThreeDSecure?.let { put("request_three_d_secure", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xf917d71c(
    block: InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xf917d71c.Builder.() -> Unit,
): InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xf917d71c =
    InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xf917d71c.build(block)
