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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/wifi/anyOf/0/properties/enterprise_eap_tls.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/wifi/anyOf/0/properties/enterprise_eap_tls
 */
@Serializable(with = InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1EnterpriseEapTlsX6e01ac54.Serializer::class)
public class InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1EnterpriseEapTlsX6e01ac54(
  public val clientCertificateFile: String,
  public val privateKeyFile: String,
  public val ssid: String,
  public val caCertificateFile: String? = null,
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

    public var caCertificateFile: String? = null

    public var privateKeyFilePassword: String? = null

    public fun build(): InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1EnterpriseEapTlsX6e01ac54 {
      check(clientCertificateFileValue != null) { "clientCertificateFile is required" }
      check(privateKeyFileValue != null) { "privateKeyFile is required" }
      check(ssidValue != null) { "ssid is required" }
      return InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1EnterpriseEapTlsX6e01ac54(
        clientCertificateFile = clientCertificateFile,
        privateKeyFile = privateKeyFile,
        ssid = ssid,
        caCertificateFile = caCertificateFile,
        privateKeyFilePassword = privateKeyFilePassword,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1EnterpriseEapTlsX6e01ac54 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1EnterpriseEapTlsX6e01ac54> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1EnterpriseEapTlsX6e01ac54 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1EnterpriseEapTlsX6e01ac54")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1EnterpriseEapTlsX6e01ac54 must be a JSON object")
      val clientCertificateFile = json.decodeRequired<String>(rawObject, "client_certificate_file")
      val privateKeyFile = json.decodeRequired<String>(rawObject, "private_key_file")
      val ssid = json.decodeRequired<String>(rawObject, "ssid")
      return InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1EnterpriseEapTlsX6e01ac54(
        clientCertificateFile = clientCertificateFile,
        privateKeyFile = privateKeyFile,
        ssid = ssid,
        caCertificateFile = rawObject["ca_certificate_file"]?.let { json.decodeFromJsonElement<String>(it) },
        privateKeyFilePassword = rawObject["private_key_file_password"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1EnterpriseEapTlsX6e01ac54) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1EnterpriseEapTlsX6e01ac54")
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

public fun inlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1EnterpriseEapTlsX6e01ac54(block: InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1EnterpriseEapTlsX6e01ac54.Builder.() -> Unit): InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1EnterpriseEapTlsX6e01ac54 = InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1EnterpriseEapTlsX6e01ac54.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1EnterpriseEapTlsX6e01ac54 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
