package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/settings/properties/card_issuing/properties/tos_acceptance.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/settings/properties/card_issuing/properties/tos_acceptance
 */
@Serializable(with = InlineV1AccountsPostRequestFormSettingsCardIssuingTosAcceptanceXceb37aae.Serializer::class)
public class InlineV1AccountsPostRequestFormSettingsCardIssuingTosAcceptanceXceb37aae(
  public val date: Int? = null,
  public val ip: String? = null,
  public val userAgent:
      InlineV1AccountsPostRequestFormSettingsCardIssuingUserAgentXc178d3d3? = null,
) {
  public class Builder {
    public var date: Int? = null

    public var ip: String? = null

    public var userAgent: InlineV1AccountsPostRequestFormSettingsCardIssuingUserAgentXc178d3d3? =
        null

    public fun build(): InlineV1AccountsPostRequestFormSettingsCardIssuingTosAcceptanceXceb37aae = InlineV1AccountsPostRequestFormSettingsCardIssuingTosAcceptanceXceb37aae(
      date = date,
      ip = ip,
      userAgent = userAgent,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountsPostRequestFormSettingsCardIssuingTosAcceptanceXceb37aae = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1AccountsPostRequestFormSettingsCardIssuingTosAcceptanceXceb37aae> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormSettingsCardIssuingTosAcceptanceXceb37aae {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormSettingsCardIssuingTosAcceptanceXceb37aae")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsPostRequestFormSettingsCardIssuingTosAcceptanceXceb37aae must be a JSON object")
      return InlineV1AccountsPostRequestFormSettingsCardIssuingTosAcceptanceXceb37aae(
        date = rawObject["date"]?.let { json.decodeFromJsonElement<Int>(it) },
        ip = rawObject["ip"]?.let { json.decodeFromJsonElement<String>(it) },
        userAgent = rawObject["user_agent"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormSettingsCardIssuingUserAgentXc178d3d3>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormSettingsCardIssuingTosAcceptanceXceb37aae) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPostRequestFormSettingsCardIssuingTosAcceptanceXceb37aae")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.date?.let { put("date", json.encodeToJsonElement(it)) }
        value.ip?.let { put("ip", it) }
        value.userAgent?.let { put("user_agent", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountsPostRequestFormSettingsCardIssuingTosAcceptanceXceb37aae(block: InlineV1AccountsPostRequestFormSettingsCardIssuingTosAcceptanceXceb37aae.Builder.() -> Unit): InlineV1AccountsPostRequestFormSettingsCardIssuingTosAcceptanceXceb37aae = InlineV1AccountsPostRequestFormSettingsCardIssuingTosAcceptanceXceb37aae.build(block)
