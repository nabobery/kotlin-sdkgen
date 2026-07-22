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
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/gelato_session_email_options
 */
@Serializable(with = GelatoSessionEmailOptions.Serializer::class)
public class GelatoSessionEmailOptions(
    /**
     * Request one time password verification of `provided_details.email`.
     */
    public val requireVerification: Boolean? = null,
) {
    public class Builder {
        /**
         * Request one time password verification of `provided_details.email`.
         */
        public var requireVerification: Boolean? = null

        public fun build(): GelatoSessionEmailOptions =
            GelatoSessionEmailOptions(
                requireVerification = requireVerification,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): GelatoSessionEmailOptions = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<GelatoSessionEmailOptions> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): GelatoSessionEmailOptions {
            val jsonDecoder = decoder.requireJsonDecoder("GelatoSessionEmailOptions")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("GelatoSessionEmailOptions must be a JSON object")
            return GelatoSessionEmailOptions(
                requireVerification =
                    rawObject["require_verification"]?.let {
                        json.decodeFromJsonElement<Boolean>(
                            it,
                        )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: GelatoSessionEmailOptions,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("GelatoSessionEmailOptions")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.requireVerification?.let { put("require_verification", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun gelatoSessionEmailOptions(block: GelatoSessionEmailOptions.Builder.() -> Unit): GelatoSessionEmailOptions =
    GelatoSessionEmailOptions.build(block)
