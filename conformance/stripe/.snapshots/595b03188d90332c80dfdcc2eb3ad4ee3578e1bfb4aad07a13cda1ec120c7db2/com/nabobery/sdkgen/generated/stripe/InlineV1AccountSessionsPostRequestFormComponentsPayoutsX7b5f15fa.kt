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
 * sdkgen://source/openapi.json#/paths/~1v1~1account_sessions/post/requestBody/content/application~1x-www-form-urlencode
 * d/schema/properties/components/properties/payouts.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1account_sessions/post/requestBody/content/application~1x-www-form-urlencode
 * d/schema/properties/components/properties/payouts
 */
@Serializable(with = InlineV1AccountSessionsPostRequestFormComponentsPayoutsX7b5f15fa.Serializer::class)
public class InlineV1AccountSessionsPostRequestFormComponentsPayoutsX7b5f15fa(
    public val enabled: Boolean,
    public val features: InlineV1AccountSessionsPostRequestFormComponentsPayoutsFeaturesX69818aca? = null,
) {
    public class Builder {
        private var enabledValue: Boolean? = null

        public var enabled: Boolean
            get() = requireNotNull(enabledValue) { "enabled is required" }
            set(`value`) {
                enabledValue = value
            }

        public var features: InlineV1AccountSessionsPostRequestFormComponentsPayoutsFeaturesX69818aca? =
            null

        public fun build(): InlineV1AccountSessionsPostRequestFormComponentsPayoutsX7b5f15fa {
            check(enabledValue != null) { "enabled is required" }
            return InlineV1AccountSessionsPostRequestFormComponentsPayoutsX7b5f15fa(
                enabled = enabled,
                features = features,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1AccountSessionsPostRequestFormComponentsPayoutsX7b5f15fa =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1AccountSessionsPostRequestFormComponentsPayoutsX7b5f15fa> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1AccountSessionsPostRequestFormComponentsPayoutsX7b5f15fa {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1AccountSessionsPostRequestFormComponentsPayoutsX7b5f15fa",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1AccountSessionsPostRequestFormComponentsPayoutsX7b5f15fa must be a JSON object",
                    )
            val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
            return InlineV1AccountSessionsPostRequestFormComponentsPayoutsX7b5f15fa(
                enabled = enabled,
                features =
                    rawObject["features"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1AccountSessionsPostRequestFormComponentsPayoutsFeaturesX69818aca>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountSessionsPostRequestFormComponentsPayoutsX7b5f15fa,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1AccountSessionsPostRequestFormComponentsPayoutsX7b5f15fa",
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

public fun inlineV1AccountSessionsPostRequestFormComponentsPayoutsX7b5f15fa(
    block: InlineV1AccountSessionsPostRequestFormComponentsPayoutsX7b5f15fa.Builder.() -> Unit,
): InlineV1AccountSessionsPostRequestFormComponentsPayoutsX7b5f15fa =
    InlineV1AccountSessionsPostRequestFormComponentsPayoutsX7b5f15fa.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1AccountSessionsPostRequestFormComponentsPayoutsX7b5f15fa is missing required property '" + name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
