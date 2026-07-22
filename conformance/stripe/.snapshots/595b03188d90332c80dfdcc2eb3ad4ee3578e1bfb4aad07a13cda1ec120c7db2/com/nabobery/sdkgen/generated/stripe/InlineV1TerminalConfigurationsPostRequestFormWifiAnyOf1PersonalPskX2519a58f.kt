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
import kotlinx.serialization.json.put
import kotlin.String
import kotlin.Unit

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations~1{configuration}/post/requestBody/content/applicat
 * ion~1x-www-form-urlencoded/schema/properties/wifi/anyOf/0/properties/personal_psk.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations~1{configuration}/post/requestBody/content/applicat
 * ion~1x-www-form-urlencoded/schema/properties/wifi/anyOf/0/properties/personal_psk
 */
@Serializable(with = InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1PersonalPskX2519a58f.Serializer::class)
public class InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1PersonalPskX2519a58f(
    public val password: String,
    public val ssid: String,
) {
    public class Builder {
        private var passwordValue: String? = null

        public var password: String
            get() = requireNotNull(passwordValue) { "password is required" }
            set(`value`) {
                passwordValue = value
            }

        private var ssidValue: String? = null

        public var ssid: String
            get() = requireNotNull(ssidValue) { "ssid is required" }
            set(`value`) {
                ssidValue = value
            }

        public fun build(): InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1PersonalPskX2519a58f {
            check(passwordValue != null) { "password is required" }
            check(ssidValue != null) { "ssid is required" }
            return InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1PersonalPskX2519a58f(
                password = password,
                ssid = ssid,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1PersonalPskX2519a58f = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1PersonalPskX2519a58f> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1PersonalPskX2519a58f {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1PersonalPskX2519a58f",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1PersonalPskX2519a58f must be a JSON object",
                    )
            val password = json.decodeRequired<String>(rawObject, "password")
            val ssid = json.decodeRequired<String>(rawObject, "ssid")
            return InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1PersonalPskX2519a58f(
                password = password,
                ssid = ssid,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1PersonalPskX2519a58f,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1PersonalPskX2519a58f",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("password", value.password)
                    put("ssid", value.ssid)
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1PersonalPskX2519a58f(
    block: InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1PersonalPskX2519a58f.Builder.() -> Unit,
): InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1PersonalPskX2519a58f =
    InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1PersonalPskX2519a58f.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1PersonalPskX2519a58f is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
