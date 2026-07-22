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
 * ed/schema/properties/components/properties/buy_button.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customer_sessions/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/components/properties/buy_button
 */
@Serializable(with = InlineV1CustomerSessionsPostRequestFormComponentsBuyButtonX59955717.Serializer::class)
public class InlineV1CustomerSessionsPostRequestFormComponentsBuyButtonX59955717(
    public val enabled: Boolean,
) {
    public class Builder {
        private var enabledValue: Boolean? = null

        public var enabled: Boolean
            get() = requireNotNull(enabledValue) { "enabled is required" }
            set(`value`) {
                enabledValue = value
            }

        public fun build(): InlineV1CustomerSessionsPostRequestFormComponentsBuyButtonX59955717 {
            check(enabledValue != null) { "enabled is required" }
            return InlineV1CustomerSessionsPostRequestFormComponentsBuyButtonX59955717(
                enabled = enabled,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1CustomerSessionsPostRequestFormComponentsBuyButtonX59955717 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1CustomerSessionsPostRequestFormComponentsBuyButtonX59955717> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1CustomerSessionsPostRequestFormComponentsBuyButtonX59955717 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1CustomerSessionsPostRequestFormComponentsBuyButtonX59955717",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1CustomerSessionsPostRequestFormComponentsBuyButtonX59955717 must be a JSON object",
                    )
            val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
            return InlineV1CustomerSessionsPostRequestFormComponentsBuyButtonX59955717(
                enabled = enabled,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CustomerSessionsPostRequestFormComponentsBuyButtonX59955717,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1CustomerSessionsPostRequestFormComponentsBuyButtonX59955717",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("enabled", json.encodeToJsonElement(value.enabled))
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1CustomerSessionsPostRequestFormComponentsBuyButtonX59955717(
    block: InlineV1CustomerSessionsPostRequestFormComponentsBuyButtonX59955717.Builder.() -> Unit,
): InlineV1CustomerSessionsPostRequestFormComponentsBuyButtonX59955717 =
    InlineV1CustomerSessionsPostRequestFormComponentsBuyButtonX59955717.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1CustomerSessionsPostRequestFormComponentsBuyButtonX59955717 is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
