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
import kotlinx.serialization.json.put
import kotlin.String
import kotlin.Unit

/**
 * Options to configure Radar. See [Radar Session](https://docs.stripe.com/radar/radar-session) for more information.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_methods/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/radar_options
 */
@Serializable(with = InlineV1PaymentMethodsPostRequestFormRadarOptionsX0857dd01.Serializer::class)
public class InlineV1PaymentMethodsPostRequestFormRadarOptionsX0857dd01(
    public val session: String? = null,
) {
    public class Builder {
        public var session: String? = null

        public fun build(): InlineV1PaymentMethodsPostRequestFormRadarOptionsX0857dd01 =
            InlineV1PaymentMethodsPostRequestFormRadarOptionsX0857dd01(
                session = session,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodsPostRequestFormRadarOptionsX0857dd01 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentMethodsPostRequestFormRadarOptionsX0857dd01> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1PaymentMethodsPostRequestFormRadarOptionsX0857dd01 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodsPostRequestFormRadarOptionsX0857dd01")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentMethodsPostRequestFormRadarOptionsX0857dd01 must be a JSON object",
                    )
            return InlineV1PaymentMethodsPostRequestFormRadarOptionsX0857dd01(
                session = rawObject["session"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentMethodsPostRequestFormRadarOptionsX0857dd01,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodsPostRequestFormRadarOptionsX0857dd01")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.session?.let { put("session", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentMethodsPostRequestFormRadarOptionsX0857dd01(
    block: InlineV1PaymentMethodsPostRequestFormRadarOptionsX0857dd01.Builder.() -> Unit,
): InlineV1PaymentMethodsPostRequestFormRadarOptionsX0857dd01 =
    InlineV1PaymentMethodsPostRequestFormRadarOptionsX0857dd01.build(block)
