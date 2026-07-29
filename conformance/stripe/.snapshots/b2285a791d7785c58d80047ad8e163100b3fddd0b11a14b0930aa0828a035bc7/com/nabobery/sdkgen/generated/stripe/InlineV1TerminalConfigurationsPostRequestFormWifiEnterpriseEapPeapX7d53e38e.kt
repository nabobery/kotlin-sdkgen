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
 * rlencoded/schema/properties/wifi/anyOf/0/properties/enterprise_eap_peap.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/wifi/anyOf/0/properties/enterprise_eap_peap
 */
@Serializable(with = InlineV1TerminalConfigurationsPostRequestFormWifiEnterpriseEapPeapX7d53e38e.Serializer::class)
public class InlineV1TerminalConfigurationsPostRequestFormWifiEnterpriseEapPeapX7d53e38e(
  public val password: String,
  public val ssid: String,
  public val username: String,
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

    public var caCertificateFile: String? = null

    public fun build(): InlineV1TerminalConfigurationsPostRequestFormWifiEnterpriseEapPeapX7d53e38e {
      check(passwordValue != null) { "password is required" }
      check(ssidValue != null) { "ssid is required" }
      check(usernameValue != null) { "username is required" }
      return InlineV1TerminalConfigurationsPostRequestFormWifiEnterpriseEapPeapX7d53e38e(
        password = password,
        ssid = ssid,
        username = username,
        caCertificateFile = caCertificateFile,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TerminalConfigurationsPostRequestFormWifiEnterpriseEapPeapX7d53e38e = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1TerminalConfigurationsPostRequestFormWifiEnterpriseEapPeapX7d53e38e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TerminalConfigurationsPostRequestFormWifiEnterpriseEapPeapX7d53e38e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TerminalConfigurationsPostRequestFormWifiEnterpriseEapPeapX7d53e38e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TerminalConfigurationsPostRequestFormWifiEnterpriseEapPeapX7d53e38e must be a JSON object")
      val password = json.decodeRequired<String>(rawObject, "password")
      val ssid = json.decodeRequired<String>(rawObject, "ssid")
      val username = json.decodeRequired<String>(rawObject, "username")
      return InlineV1TerminalConfigurationsPostRequestFormWifiEnterpriseEapPeapX7d53e38e(
        password = password,
        ssid = ssid,
        username = username,
        caCertificateFile = rawObject["ca_certificate_file"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalConfigurationsPostRequestFormWifiEnterpriseEapPeapX7d53e38e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TerminalConfigurationsPostRequestFormWifiEnterpriseEapPeapX7d53e38e")
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

public fun inlineV1TerminalConfigurationsPostRequestFormWifiEnterpriseEapPeapX7d53e38e(block: InlineV1TerminalConfigurationsPostRequestFormWifiEnterpriseEapPeapX7d53e38e.Builder.() -> Unit): InlineV1TerminalConfigurationsPostRequestFormWifiEnterpriseEapPeapX7d53e38e = InlineV1TerminalConfigurationsPostRequestFormWifiEnterpriseEapPeapX7d53e38e.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TerminalConfigurationsPostRequestFormWifiEnterpriseEapPeapX7d53e38e is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
