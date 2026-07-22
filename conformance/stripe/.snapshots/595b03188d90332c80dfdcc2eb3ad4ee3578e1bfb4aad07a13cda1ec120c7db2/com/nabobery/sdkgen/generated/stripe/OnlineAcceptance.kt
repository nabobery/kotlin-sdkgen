package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put
import kotlin.String
import kotlin.Unit

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/online_acceptance
 */
@Serializable(with = OnlineAcceptance.Serializer::class)
public class OnlineAcceptance(
    /**
     * The customer accepts the mandate from this IP address.
     */
    public val ipAddress: String? = null,
    /**
     * The customer accepts the mandate using the user agent of the browser.
     */
    public val userAgent: String? = null,
) {
    public class Builder {
        /**
         * The customer accepts the mandate from this IP address.
         */
        public var ipAddress: String? = null

        /**
         * The customer accepts the mandate using the user agent of the browser.
         */
        public var userAgent: String? = null

        public fun build(): OnlineAcceptance =
            OnlineAcceptance(
                ipAddress = ipAddress,
                userAgent = userAgent,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): OnlineAcceptance = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<OnlineAcceptance> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): OnlineAcceptance {
            val jsonDecoder = decoder.requireJsonDecoder("OnlineAcceptance")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("OnlineAcceptance must be a JSON object")
            return OnlineAcceptance(
                ipAddress =
                    rawObject["ip_address"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                userAgent =
                    rawObject["user_agent"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: OnlineAcceptance,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("OnlineAcceptance")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.ipAddress?.let { put("ip_address", it) }
                    value.userAgent?.let { put("user_agent", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun onlineAcceptance(block: OnlineAcceptance.Builder.() -> Unit): OnlineAcceptance =
    OnlineAcceptance.build(block)
