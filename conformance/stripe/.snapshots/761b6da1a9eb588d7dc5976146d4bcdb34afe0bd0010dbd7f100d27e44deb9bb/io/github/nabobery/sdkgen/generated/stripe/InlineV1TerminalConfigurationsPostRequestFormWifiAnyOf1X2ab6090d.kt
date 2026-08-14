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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/wifi/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/wifi/anyOf/0
 */
@Serializable(with = InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1X2ab6090d.Serializer::class)
public class InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1X2ab6090d(
  public val type: InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1TypeXee52254e,
  public val enterpriseEapPeap:
      InlineV1TerminalConfigurationsPostRequestFormWifiEnterpriseEapPeapX7d53e38e? = null,
  public val enterpriseEapTls:
      InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1EnterpriseEapTlsX6e01ac54? = null,
  public val personalPsk:
      InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1PersonalPskXa64e96c8? = null,
) {
  public class Builder {
    private var typeValue: InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1TypeXee52254e? =
        null

    public var type: InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1TypeXee52254e
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var enterpriseEapPeap:
        InlineV1TerminalConfigurationsPostRequestFormWifiEnterpriseEapPeapX7d53e38e? = null

    public var enterpriseEapTls:
        InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1EnterpriseEapTlsX6e01ac54? = null

    public var personalPsk:
        InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1PersonalPskXa64e96c8? = null

    public fun build(): InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1X2ab6090d {
      check(typeValue != null) { "type is required" }
      return InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1X2ab6090d(
        type = type,
        enterpriseEapPeap = enterpriseEapPeap,
        enterpriseEapTls = enterpriseEapTls,
        personalPsk = personalPsk,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1X2ab6090d = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1X2ab6090d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1X2ab6090d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1X2ab6090d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1X2ab6090d must be a JSON object")
      val type = json.decodeRequired<InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1TypeXee52254e>(rawObject, "type")
      return InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1X2ab6090d(
        type = type,
        enterpriseEapPeap = rawObject["enterprise_eap_peap"]?.let { json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormWifiEnterpriseEapPeapX7d53e38e>(it) },
        enterpriseEapTls = rawObject["enterprise_eap_tls"]?.let { json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1EnterpriseEapTlsX6e01ac54>(it) },
        personalPsk = rawObject["personal_psk"]?.let { json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1PersonalPskXa64e96c8>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1X2ab6090d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1X2ab6090d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.enterpriseEapPeap?.let { put("enterprise_eap_peap", json.encodeToJsonElement(it)) }
        value.enterpriseEapTls?.let { put("enterprise_eap_tls", json.encodeToJsonElement(it)) }
        value.personalPsk?.let { put("personal_psk", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1X2ab6090d(block: InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1X2ab6090d.Builder.() -> Unit): InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1X2ab6090d = InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1X2ab6090d.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1X2ab6090d is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
