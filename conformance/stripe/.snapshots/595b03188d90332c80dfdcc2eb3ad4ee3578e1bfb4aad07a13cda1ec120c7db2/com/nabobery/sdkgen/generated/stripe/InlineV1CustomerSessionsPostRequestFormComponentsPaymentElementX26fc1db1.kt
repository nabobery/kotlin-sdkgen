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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1customer_sessions/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/components/properties/payment_element.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customer_sessions/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/components/properties/payment_element
 */
@Serializable(with = InlineV1CustomerSessionsPostRequestFormComponentsPaymentElementX26fc1db1.Serializer::class)
public class InlineV1CustomerSessionsPostRequestFormComponentsPaymentElementX26fc1db1(
    public val enabled: Boolean,
    public val features: InlineV1CustomerSessionsPostRequestFormComponentsPaymentElementFeaturesXc41d18cf? = null,
) {
    public class Builder {
        private var enabledValue: Boolean? = null

        public var enabled: Boolean
            get() = requireNotNull(enabledValue) { "enabled is required" }
            set(`value`) {
                enabledValue = value
            }

        public var features:
            InlineV1CustomerSessionsPostRequestFormComponentsPaymentElementFeaturesXc41d18cf? = null

        public fun build(): InlineV1CustomerSessionsPostRequestFormComponentsPaymentElementX26fc1db1 {
            check(enabledValue != null) { "enabled is required" }
            return InlineV1CustomerSessionsPostRequestFormComponentsPaymentElementX26fc1db1(
                enabled = enabled,
                features = features,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1CustomerSessionsPostRequestFormComponentsPaymentElementX26fc1db1 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1CustomerSessionsPostRequestFormComponentsPaymentElementX26fc1db1> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1CustomerSessionsPostRequestFormComponentsPaymentElementX26fc1db1 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1CustomerSessionsPostRequestFormComponentsPaymentElementX26fc1db1",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1CustomerSessionsPostRequestFormComponentsPaymentElementX26fc1db1 must be a JSON object",
                    )
            val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
            return InlineV1CustomerSessionsPostRequestFormComponentsPaymentElementX26fc1db1(
                enabled = enabled,
                features =
                    rawObject["features"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1CustomerSessionsPostRequestFormComponentsPaymentElementFeaturesXc41d18cf>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CustomerSessionsPostRequestFormComponentsPaymentElementX26fc1db1,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1CustomerSessionsPostRequestFormComponentsPaymentElementX26fc1db1",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("enabled", json.encodeToJsonElement(value.enabled))
                    value.features?.let { put("features", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1CustomerSessionsPostRequestFormComponentsPaymentElementX26fc1db1(
    block: InlineV1CustomerSessionsPostRequestFormComponentsPaymentElementX26fc1db1.Builder.() -> Unit,
): InlineV1CustomerSessionsPostRequestFormComponentsPaymentElementX26fc1db1 =
    InlineV1CustomerSessionsPostRequestFormComponentsPaymentElementX26fc1db1.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1CustomerSessionsPostRequestFormComponentsPaymentElementX26fc1db1 is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
