package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
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

/**
 *
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/terminal_configuration_configuration_resource_personal_psk_wifi
 */
@Serializable(with = TerminalConfigurationConfigurationResourcePersonalPskWifi.Serializer::class)
public class TerminalConfigurationConfigurationResourcePersonalPskWifi(
  /**
   * Password for connecting to the WiFi network
   */
  public val password: String,
  /**
   * Name of the WiFi network
   */
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

    public fun build(): TerminalConfigurationConfigurationResourcePersonalPskWifi {
      check(passwordValue != null) { "password is required" }
      check(ssidValue != null) { "ssid is required" }
      return TerminalConfigurationConfigurationResourcePersonalPskWifi(
        password = password,
        ssid = ssid,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TerminalConfigurationConfigurationResourcePersonalPskWifi = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<TerminalConfigurationConfigurationResourcePersonalPskWifi> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TerminalConfigurationConfigurationResourcePersonalPskWifi {
      val jsonDecoder = decoder.requireJsonDecoder("TerminalConfigurationConfigurationResourcePersonalPskWifi")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TerminalConfigurationConfigurationResourcePersonalPskWifi must be a JSON object")
      val password = json.decodeRequired<String>(rawObject, "password")
      val ssid = json.decodeRequired<String>(rawObject, "ssid")
      return TerminalConfigurationConfigurationResourcePersonalPskWifi(
        password = password,
        ssid = ssid,
      )
    }

    override fun serialize(encoder: Encoder, `value`: TerminalConfigurationConfigurationResourcePersonalPskWifi) {
      val jsonEncoder = encoder.requireJsonEncoder("TerminalConfigurationConfigurationResourcePersonalPskWifi")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("password", value.password)
        put("ssid", value.ssid)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun terminalConfigurationConfigurationResourcePersonalPskWifi(block: TerminalConfigurationConfigurationResourcePersonalPskWifi.Builder.() -> Unit): TerminalConfigurationConfigurationResourcePersonalPskWifi = TerminalConfigurationConfigurationResourcePersonalPskWifi.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TerminalConfigurationConfigurationResourcePersonalPskWifi is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
