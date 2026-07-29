package com.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/settings/properties/card_issuing/properties/tos_acceptance.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/settings/properties/card_issuing/properties/tos_acceptance
 */
@Serializable(with = InlineV1AccountsPostRequestFormSettingsCardIssuingTosAcceptanceXf06ccaf9.Serializer::class)
public class InlineV1AccountsPostRequestFormSettingsCardIssuingTosAcceptanceXf06ccaf9(
  public val date: Int? = null,
  public val ip: String? = null,
  public val userAgent:
      InlineV1AccountsPostRequestFormSettingsCardIssuingUserAgentX3867a965? = null,
) {
  public class Builder {
    public var date: Int? = null

    public var ip: String? = null

    public var userAgent: InlineV1AccountsPostRequestFormSettingsCardIssuingUserAgentX3867a965? =
        null

    public fun build(): InlineV1AccountsPostRequestFormSettingsCardIssuingTosAcceptanceXf06ccaf9 = InlineV1AccountsPostRequestFormSettingsCardIssuingTosAcceptanceXf06ccaf9(
      date = date,
      ip = ip,
      userAgent = userAgent,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountsPostRequestFormSettingsCardIssuingTosAcceptanceXf06ccaf9 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1AccountsPostRequestFormSettingsCardIssuingTosAcceptanceXf06ccaf9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormSettingsCardIssuingTosAcceptanceXf06ccaf9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormSettingsCardIssuingTosAcceptanceXf06ccaf9")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsPostRequestFormSettingsCardIssuingTosAcceptanceXf06ccaf9 must be a JSON object")
      return InlineV1AccountsPostRequestFormSettingsCardIssuingTosAcceptanceXf06ccaf9(
        date = rawObject["date"]?.let { json.decodeFromJsonElement<Int>(it) },
        ip = rawObject["ip"]?.let { json.decodeFromJsonElement<String>(it) },
        userAgent = rawObject["user_agent"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormSettingsCardIssuingUserAgentX3867a965>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormSettingsCardIssuingTosAcceptanceXf06ccaf9) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPostRequestFormSettingsCardIssuingTosAcceptanceXf06ccaf9")
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

public fun inlineV1AccountsPostRequestFormSettingsCardIssuingTosAcceptanceXf06ccaf9(block: InlineV1AccountsPostRequestFormSettingsCardIssuingTosAcceptanceXf06ccaf9.Builder.() -> Unit): InlineV1AccountsPostRequestFormSettingsCardIssuingTosAcceptanceXf06ccaf9 = InlineV1AccountsPostRequestFormSettingsCardIssuingTosAcceptanceXf06ccaf9.build(block)
