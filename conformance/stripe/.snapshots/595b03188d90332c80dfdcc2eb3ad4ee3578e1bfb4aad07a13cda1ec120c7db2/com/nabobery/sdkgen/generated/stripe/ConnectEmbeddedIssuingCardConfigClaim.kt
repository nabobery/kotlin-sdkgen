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
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/connect_embedded_issuing_card_config_claim
 */
@Serializable(with = ConnectEmbeddedIssuingCardConfigClaim.Serializer::class)
public class ConnectEmbeddedIssuingCardConfigClaim(
    /**
     * Whether the embedded component is enabled.
     */
    public val enabled: Boolean,
    public val features: ConnectEmbeddedIssuingCardFeatures,
) {
    public class Builder {
        private var enabledValue: Boolean? = null

        public var enabled: Boolean
            get() = requireNotNull(enabledValue) { "enabled is required" }
            set(`value`) {
                enabledValue = value
            }

        private var featuresValue: ConnectEmbeddedIssuingCardFeatures? = null

        public var features: ConnectEmbeddedIssuingCardFeatures
            get() = requireNotNull(featuresValue) { "features is required" }
            set(`value`) {
                featuresValue = value
            }

        public fun build(): ConnectEmbeddedIssuingCardConfigClaim {
            check(enabledValue != null) { "enabled is required" }
            check(featuresValue != null) { "features is required" }
            return ConnectEmbeddedIssuingCardConfigClaim(
                enabled = enabled,
                features = features,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): ConnectEmbeddedIssuingCardConfigClaim =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<ConnectEmbeddedIssuingCardConfigClaim> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): ConnectEmbeddedIssuingCardConfigClaim {
            val jsonDecoder = decoder.requireJsonDecoder("ConnectEmbeddedIssuingCardConfigClaim")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("ConnectEmbeddedIssuingCardConfigClaim must be a JSON object")
            val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
            val features = json.decodeRequired<ConnectEmbeddedIssuingCardFeatures>(rawObject, "features")
            return ConnectEmbeddedIssuingCardConfigClaim(
                enabled = enabled,
                features = features,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: ConnectEmbeddedIssuingCardConfigClaim,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("ConnectEmbeddedIssuingCardConfigClaim")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("enabled", json.encodeToJsonElement(value.enabled))
                    put("features", json.encodeToJsonElement(value.features))
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun connectEmbeddedIssuingCardConfigClaim(
    block: ConnectEmbeddedIssuingCardConfigClaim.Builder.() -> Unit,
): ConnectEmbeddedIssuingCardConfigClaim = ConnectEmbeddedIssuingCardConfigClaim.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "ConnectEmbeddedIssuingCardConfigClaim is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
