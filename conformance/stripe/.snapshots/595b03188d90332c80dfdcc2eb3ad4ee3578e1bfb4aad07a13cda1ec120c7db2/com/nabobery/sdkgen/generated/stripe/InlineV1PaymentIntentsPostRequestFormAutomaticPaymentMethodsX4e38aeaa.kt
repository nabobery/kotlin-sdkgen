package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * When you enable this parameter, this PaymentIntent accepts payment methods that you enable in the Dashboard and that
 * are compatible with this PaymentIntent's other parameters.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/automatic_payment_methods
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormAutomaticPaymentMethodsX4e38aeaa.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormAutomaticPaymentMethodsX4e38aeaa(
    public val enabled: Boolean,
    public val allowRedirects: InlineV1PaymentIntentsPostRequestFormAllowRedirectsXd0267ccc? = null,
) {
    public class Builder {
        private var enabledValue: Boolean? = null

        public var enabled: Boolean
            get() = requireNotNull(enabledValue) { "enabled is required" }
            set(`value`) {
                enabledValue = value
            }

        public var allowRedirects: InlineV1PaymentIntentsPostRequestFormAllowRedirectsXd0267ccc? = null

        public fun build(): InlineV1PaymentIntentsPostRequestFormAutomaticPaymentMethodsX4e38aeaa {
            check(enabledValue != null) { "enabled is required" }
            return InlineV1PaymentIntentsPostRequestFormAutomaticPaymentMethodsX4e38aeaa(
                enabled = enabled,
                allowRedirects = allowRedirects,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentIntentsPostRequestFormAutomaticPaymentMethodsX4e38aeaa = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormAutomaticPaymentMethodsX4e38aeaa> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsPostRequestFormAutomaticPaymentMethodsX4e38aeaa {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsPostRequestFormAutomaticPaymentMethodsX4e38aeaa",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentIntentsPostRequestFormAutomaticPaymentMethodsX4e38aeaa must be a JSON object",
                    )
            val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
            return InlineV1PaymentIntentsPostRequestFormAutomaticPaymentMethodsX4e38aeaa(
                enabled = enabled,
                allowRedirects =
                    rawObject["allow_redirects"]?.let {
                        json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormAllowRedirectsXd0267ccc>(it)
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormAutomaticPaymentMethodsX4e38aeaa,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentIntentsPostRequestFormAutomaticPaymentMethodsX4e38aeaa",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("enabled", json.encodeToJsonElement(value.enabled))
                    value.allowRedirects?.let { put("allow_redirects", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentIntentsPostRequestFormAutomaticPaymentMethodsX4e38aeaa(
    block: InlineV1PaymentIntentsPostRequestFormAutomaticPaymentMethodsX4e38aeaa.Builder.() -> Unit,
): InlineV1PaymentIntentsPostRequestFormAutomaticPaymentMethodsX4e38aeaa =
    InlineV1PaymentIntentsPostRequestFormAutomaticPaymentMethodsX4e38aeaa.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1PaymentIntentsPostRequestFormAutomaticPaymentMethodsX4e38aeaa is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
