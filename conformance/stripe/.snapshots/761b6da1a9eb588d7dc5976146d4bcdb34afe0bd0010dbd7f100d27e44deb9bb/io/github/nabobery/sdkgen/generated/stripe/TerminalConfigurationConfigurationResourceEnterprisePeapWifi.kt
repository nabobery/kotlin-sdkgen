package io.github.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/components/schemas/terminal_configuration_configuration_resource_enterprise_peap_wifi
 */
@Serializable(with = TerminalConfigurationConfigurationResourceEnterprisePeapWifi.Serializer::class)
public class TerminalConfigurationConfigurationResourceEnterprisePeapWifi(
  /**
   * Password for connecting to the WiFi network
   */
  public val password: String,
  /**
   * Name of the WiFi network
   */
  public val ssid: String,
  /**
   * Username for connecting to the WiFi network
   */
  public val username: String,
  /**
   * A File ID representing a PEM file containing the server certificate
   */
  public val caCertificateFile: String? = null,
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

    private var usernameValue: String? = null

    public var username: String
      get() = requireNotNull(usernameValue) { "username is required" }
      set(`value`) {
        usernameValue = value
      }

    /**
     * A File ID representing a PEM file containing the server certificate
     */
    public var caCertificateFile: String? = null

    public fun build(): TerminalConfigurationConfigurationResourceEnterprisePeapWifi {
      check(passwordValue != null) { "password is required" }
      check(ssidValue != null) { "ssid is required" }
      check(usernameValue != null) { "username is required" }
      return TerminalConfigurationConfigurationResourceEnterprisePeapWifi(
        password = password,
        ssid = ssid,
        username = username,
        caCertificateFile = caCertificateFile,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TerminalConfigurationConfigurationResourceEnterprisePeapWifi = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<TerminalConfigurationConfigurationResourceEnterprisePeapWifi> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TerminalConfigurationConfigurationResourceEnterprisePeapWifi {
      val jsonDecoder = decoder.requireJsonDecoder("TerminalConfigurationConfigurationResourceEnterprisePeapWifi")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TerminalConfigurationConfigurationResourceEnterprisePeapWifi must be a JSON object")
      val password = json.decodeRequired<String>(rawObject, "password")
      val ssid = json.decodeRequired<String>(rawObject, "ssid")
      val username = json.decodeRequired<String>(rawObject, "username")
      return TerminalConfigurationConfigurationResourceEnterprisePeapWifi(
        password = password,
        ssid = ssid,
        username = username,
        caCertificateFile = rawObject["ca_certificate_file"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TerminalConfigurationConfigurationResourceEnterprisePeapWifi) {
      val jsonEncoder = encoder.requireJsonEncoder("TerminalConfigurationConfigurationResourceEnterprisePeapWifi")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("password", value.password)
        put("ssid", value.ssid)
        put("username", value.username)
        value.caCertificateFile?.let { put("ca_certificate_file", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun terminalConfigurationConfigurationResourceEnterprisePeapWifi(block: TerminalConfigurationConfigurationResourceEnterprisePeapWifi.Builder.() -> Unit): TerminalConfigurationConfigurationResourceEnterprisePeapWifi = TerminalConfigurationConfigurationResourceEnterprisePeapWifi.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TerminalConfigurationConfigurationResourceEnterprisePeapWifi is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
