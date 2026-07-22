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
import kotlin.String
import kotlin.Unit

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations~1{configuration}/post/requestBody/content/applicat
 * ion~1x-www-form-urlencoded/schema/properties/wifi/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations~1{configuration}/post/requestBody/content/applicat
 * ion~1x-www-form-urlencoded/schema/properties/wifi/anyOf/0
 */
@Serializable(with = InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1Xc5b14eb2.Serializer::class)
public class InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1Xc5b14eb2(
    public val type: InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1TypeX5c1f984d,
    public val enterpriseEapPeap: InlineV1TerminalConfigurationsPostRequestFormWifiEnterpriseEapPeapX0f3e7eac? = null,
    public val enterpriseEapTls: InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1EnterpriseEapTlsX1b34f3c2? = null,
    public val personalPsk: InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1PersonalPskX2519a58f? = null,
) {
    public class Builder {
        private var typeValue: InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1TypeX5c1f984d? =
            null

        public var type: InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1TypeX5c1f984d
            get() = requireNotNull(typeValue) { "type is required" }
            set(`value`) {
                typeValue = value
            }

        public var enterpriseEapPeap:
            InlineV1TerminalConfigurationsPostRequestFormWifiEnterpriseEapPeapX0f3e7eac? = null

        public var enterpriseEapTls:
            InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1EnterpriseEapTlsX1b34f3c2? = null

        public var personalPsk:
            InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1PersonalPskX2519a58f? = null

        public fun build(): InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1Xc5b14eb2 {
            check(typeValue != null) { "type is required" }
            return InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1Xc5b14eb2(
                type = type,
                enterpriseEapPeap = enterpriseEapPeap,
                enterpriseEapTls = enterpriseEapTls,
                personalPsk = personalPsk,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1Xc5b14eb2 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1Xc5b14eb2> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1Xc5b14eb2 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1Xc5b14eb2",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1Xc5b14eb2 must be a JSON object",
                    )
            val type =
                json.decodeRequired<InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1TypeX5c1f984d>(
                    rawObject,
                    "type",
                )
            return InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1Xc5b14eb2(
                type = type,
                enterpriseEapPeap =
                    rawObject["enterprise_eap_peap"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormWifiEnterpriseEapPeapX0f3e7eac>(
                                it,
                            )
                    },
                enterpriseEapTls =
                    rawObject["enterprise_eap_tls"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1EnterpriseEapTlsX1b34f3c2>(
                                it,
                            )
                    },
                personalPsk =
                    rawObject["personal_psk"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1PersonalPskX2519a58f>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1Xc5b14eb2,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1Xc5b14eb2",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("type", json.encodeToJsonElement(value.type))
                    value.enterpriseEapPeap?.let { put("enterprise_eap_peap", json.encodeToJsonElement(it)) }
                    value.enterpriseEapTls?.let { put("enterprise_eap_tls", json.encodeToJsonElement(it)) }
                    value.personalPsk?.let { put("personal_psk", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1Xc5b14eb2(
    block: InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1Xc5b14eb2.Builder.() -> Unit,
): InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1Xc5b14eb2 =
    InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1Xc5b14eb2.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1Xc5b14eb2 is missing required property '" + name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
