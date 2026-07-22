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
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/terminal_configuration_configuration_resource_wifi_config
 */
@Serializable(with = TerminalConfigurationConfigurationResourceWifiConfig.Serializer::class)
public class TerminalConfigurationConfigurationResourceWifiConfig(
    /**
     * Security type of the WiFi network. The hash with the corresponding name contains the credentials for this security
     * type.
     */
    public val type: InlineTerminalConfigurationConfigurationResourceWifiConfigTypeXbf775f83,
    public val enterpriseEapPeap: TerminalConfigurationConfigurationResourceEnterprisePeapWifi? = null,
    public val enterpriseEapTls: TerminalConfigurationConfigurationResourceEnterpriseTlsWifi? = null,
    public val personalPsk: TerminalConfigurationConfigurationResourcePersonalPskWifi? = null,
) {
    public class Builder {
        private var typeValue: InlineTerminalConfigurationConfigurationResourceWifiConfigTypeXbf775f83? =
            null

        public var type: InlineTerminalConfigurationConfigurationResourceWifiConfigTypeXbf775f83
            get() = requireNotNull(typeValue) { "type is required" }
            set(`value`) {
                typeValue = value
            }

        public var enterpriseEapPeap: TerminalConfigurationConfigurationResourceEnterprisePeapWifi? =
            null

        public var enterpriseEapTls: TerminalConfigurationConfigurationResourceEnterpriseTlsWifi? = null

        public var personalPsk: TerminalConfigurationConfigurationResourcePersonalPskWifi? = null

        public fun build(): TerminalConfigurationConfigurationResourceWifiConfig {
            check(typeValue != null) { "type is required" }
            return TerminalConfigurationConfigurationResourceWifiConfig(
                type = type,
                enterpriseEapPeap = enterpriseEapPeap,
                enterpriseEapTls = enterpriseEapTls,
                personalPsk = personalPsk,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): TerminalConfigurationConfigurationResourceWifiConfig =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<TerminalConfigurationConfigurationResourceWifiConfig> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): TerminalConfigurationConfigurationResourceWifiConfig {
            val jsonDecoder = decoder.requireJsonDecoder("TerminalConfigurationConfigurationResourceWifiConfig")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "TerminalConfigurationConfigurationResourceWifiConfig must be a JSON object",
                    )
            val type =
                json.decodeRequired<InlineTerminalConfigurationConfigurationResourceWifiConfigTypeXbf775f83>(
                    rawObject,
                    "type",
                )
            return TerminalConfigurationConfigurationResourceWifiConfig(
                type = type,
                enterpriseEapPeap =
                    rawObject["enterprise_eap_peap"]?.let {
                        json.decodeFromJsonElement<TerminalConfigurationConfigurationResourceEnterprisePeapWifi>(it)
                    },
                enterpriseEapTls =
                    rawObject["enterprise_eap_tls"]?.let {
                        json.decodeFromJsonElement<TerminalConfigurationConfigurationResourceEnterpriseTlsWifi>(it)
                    },
                personalPsk =
                    rawObject["personal_psk"]?.let {
                        json.decodeFromJsonElement<TerminalConfigurationConfigurationResourcePersonalPskWifi>(it)
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: TerminalConfigurationConfigurationResourceWifiConfig,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("TerminalConfigurationConfigurationResourceWifiConfig")
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

public fun terminalConfigurationConfigurationResourceWifiConfig(
    block: TerminalConfigurationConfigurationResourceWifiConfig.Builder.() -> Unit,
): TerminalConfigurationConfigurationResourceWifiConfig =
    TerminalConfigurationConfigurationResourceWifiConfig.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "TerminalConfigurationConfigurationResourceWifiConfig is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
