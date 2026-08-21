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
 * sdkgen://source/openapi.json#/components/schemas/terminal_configuration_configuration_resource_enterprise_tls_wifi
 */
@Serializable(with = TerminalConfigurationConfigurationResourceEnterpriseTlsWifi.Serializer::class)
public class TerminalConfigurationConfigurationResourceEnterpriseTlsWifi(
  /**
   * A File ID representing a PEM file containing the client certificate
   */
  public val clientCertificateFile: String,
  /**
   * A File ID representing a PEM file containing the client RSA private key
   */
  public val privateKeyFile: String,
  /**
   * Name of the WiFi network
   */
  public val ssid: String,
  /**
   * A File ID representing a PEM file containing the server certificate
   */
  public val caCertificateFile: String? = null,
  /**
   * Password for the private key file
   */
  public val privateKeyFilePassword: String? = null,
) {
  public class Builder {
    private var clientCertificateFileValue: String? = null

    public var clientCertificateFile: String
      get() = requireNotNull(clientCertificateFileValue) { "clientCertificateFile is required" }
      set(`value`) {
        clientCertificateFileValue = value
      }

    private var privateKeyFileValue: String? = null

    public var privateKeyFile: String
      get() = requireNotNull(privateKeyFileValue) { "privateKeyFile is required" }
      set(`value`) {
        privateKeyFileValue = value
      }

    private var ssidValue: String? = null

    public var ssid: String
      get() = requireNotNull(ssidValue) { "ssid is required" }
      set(`value`) {
        ssidValue = value
      }

    /**
     * A File ID representing a PEM file containing the server certificate
     */
    public var caCertificateFile: String? = null

    /**
     * Password for the private key file
     */
    public var privateKeyFilePassword: String? = null

    public fun build(): TerminalConfigurationConfigurationResourceEnterpriseTlsWifi {
      check(clientCertificateFileValue != null) { "clientCertificateFile is required" }
      check(privateKeyFileValue != null) { "privateKeyFile is required" }
      check(ssidValue != null) { "ssid is required" }
      return TerminalConfigurationConfigurationResourceEnterpriseTlsWifi(
        clientCertificateFile = clientCertificateFile,
        privateKeyFile = privateKeyFile,
        ssid = ssid,
        caCertificateFile = caCertificateFile,
        privateKeyFilePassword = privateKeyFilePassword,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TerminalConfigurationConfigurationResourceEnterpriseTlsWifi = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<TerminalConfigurationConfigurationResourceEnterpriseTlsWifi> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TerminalConfigurationConfigurationResourceEnterpriseTlsWifi {
      val jsonDecoder = decoder.requireJsonDecoder("TerminalConfigurationConfigurationResourceEnterpriseTlsWifi")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TerminalConfigurationConfigurationResourceEnterpriseTlsWifi must be a JSON object")
      val clientCertificateFile = json.decodeRequired<String>(rawObject, "client_certificate_file")
      val privateKeyFile = json.decodeRequired<String>(rawObject, "private_key_file")
      val ssid = json.decodeRequired<String>(rawObject, "ssid")
      return TerminalConfigurationConfigurationResourceEnterpriseTlsWifi(
        clientCertificateFile = clientCertificateFile,
        privateKeyFile = privateKeyFile,
        ssid = ssid,
        caCertificateFile = rawObject["ca_certificate_file"]?.let { json.decodeFromJsonElement<String>(it) },
        privateKeyFilePassword = rawObject["private_key_file_password"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TerminalConfigurationConfigurationResourceEnterpriseTlsWifi) {
      val jsonEncoder = encoder.requireJsonEncoder("TerminalConfigurationConfigurationResourceEnterpriseTlsWifi")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("client_certificate_file", value.clientCertificateFile)
        put("private_key_file", value.privateKeyFile)
        put("ssid", value.ssid)
        value.caCertificateFile?.let { put("ca_certificate_file", it) }
        value.privateKeyFilePassword?.let { put("private_key_file_password", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun terminalConfigurationConfigurationResourceEnterpriseTlsWifi(block: TerminalConfigurationConfigurationResourceEnterpriseTlsWifi.Builder.() -> Unit): TerminalConfigurationConfigurationResourceEnterpriseTlsWifi = TerminalConfigurationConfigurationResourceEnterpriseTlsWifi.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TerminalConfigurationConfigurationResourceEnterpriseTlsWifi is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
