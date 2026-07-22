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
 * d/schema/properties/components/properties/disputes_list.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1account_sessions/post/requestBody/content/application~1x-www-form-urlencode
 * d/schema/properties/components/properties/disputes_list
 */
@Serializable(with = InlineV1AccountSessionsPostRequestFormComponentsDisputesListXf3ff1ba6.Serializer::class)
public class InlineV1AccountSessionsPostRequestFormComponentsDisputesListXf3ff1ba6(
    public val enabled: Boolean,
    public val features: InlineV1AccountSessionsPostRequestFormComponentsDisputesListFeaturesX7aa976ae? = null,
) {
    public class Builder {
        private var enabledValue: Boolean? = null

        public var enabled: Boolean
            get() = requireNotNull(enabledValue) { "enabled is required" }
            set(`value`) {
                enabledValue = value
            }

        public var features:
            InlineV1AccountSessionsPostRequestFormComponentsDisputesListFeaturesX7aa976ae? = null

        public fun build(): InlineV1AccountSessionsPostRequestFormComponentsDisputesListXf3ff1ba6 {
            check(enabledValue != null) { "enabled is required" }
            return InlineV1AccountSessionsPostRequestFormComponentsDisputesListXf3ff1ba6(
                enabled = enabled,
                features = features,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1AccountSessionsPostRequestFormComponentsDisputesListXf3ff1ba6 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1AccountSessionsPostRequestFormComponentsDisputesListXf3ff1ba6> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1AccountSessionsPostRequestFormComponentsDisputesListXf3ff1ba6 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1AccountSessionsPostRequestFormComponentsDisputesListXf3ff1ba6",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1AccountSessionsPostRequestFormComponentsDisputesListXf3ff1ba6 must be a JSON object",
                    )
            val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
            return InlineV1AccountSessionsPostRequestFormComponentsDisputesListXf3ff1ba6(
                enabled = enabled,
                features =
                    rawObject["features"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1AccountSessionsPostRequestFormComponentsDisputesListFeaturesX7aa976ae>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountSessionsPostRequestFormComponentsDisputesListXf3ff1ba6,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1AccountSessionsPostRequestFormComponentsDisputesListXf3ff1ba6",
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

public fun inlineV1AccountSessionsPostRequestFormComponentsDisputesListXf3ff1ba6(
    block: InlineV1AccountSessionsPostRequestFormComponentsDisputesListXf3ff1ba6.Builder.() -> Unit,
): InlineV1AccountSessionsPostRequestFormComponentsDisputesListXf3ff1ba6 =
    InlineV1AccountSessionsPostRequestFormComponentsDisputesListXf3ff1ba6.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1AccountSessionsPostRequestFormComponentsDisputesListXf3ff1ba6 is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
