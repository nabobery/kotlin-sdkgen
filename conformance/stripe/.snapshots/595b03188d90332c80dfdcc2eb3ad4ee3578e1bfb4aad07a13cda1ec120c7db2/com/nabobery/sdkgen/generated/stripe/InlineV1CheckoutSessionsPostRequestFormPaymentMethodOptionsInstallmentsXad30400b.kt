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
import kotlin.Boolean
import kotlin.Unit

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/card/properties/installments.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/card/properties/installments
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsInstallmentsXad30400b.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsInstallmentsXad30400b(
    public val enabled: Boolean? = null,
) {
    public class Builder {
        public var enabled: Boolean? = null

        public fun build(): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsInstallmentsXad30400b =
            InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsInstallmentsXad30400b(
                enabled = enabled,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsInstallmentsXad30400b =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsInstallmentsXad30400b> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsInstallmentsXad30400b {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsInstallmentsXad30400b",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsInstallmentsXad30400b must be a JSON object",
                    )
            return InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsInstallmentsXad30400b(
                enabled = rawObject["enabled"]?.let { json.decodeFromJsonElement<Boolean>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsInstallmentsXad30400b,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsInstallmentsXad30400b",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.enabled?.let { put("enabled", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsInstallmentsXad30400b(
    block: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsInstallmentsXad30400b.Builder.() -> Unit,
): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsInstallmentsXad30400b =
    InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsInstallmentsXad30400b.build(block)
