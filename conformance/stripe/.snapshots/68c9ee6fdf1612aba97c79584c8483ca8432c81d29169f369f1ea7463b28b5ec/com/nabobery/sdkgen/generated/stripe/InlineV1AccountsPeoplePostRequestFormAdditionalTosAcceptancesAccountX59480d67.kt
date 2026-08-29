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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1people~1{person}/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/additional_tos_acceptances/properties/account.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1people~1{person}/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/additional_tos_acceptances/properties/account
 */
@Serializable(with = InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesAccountX59480d67.Serializer::class)
public class InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesAccountX59480d67(
  public val date: Int? = null,
  public val ip: String? = null,
  public val userAgent:
      InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesUserAgentX625b5c58? = null,
) {
  public class Builder {
    public var date: Int? = null

    public var ip: String? = null

    public var userAgent:
        InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesUserAgentX625b5c58? = null

    public fun build(): InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesAccountX59480d67 = InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesAccountX59480d67(
      date = date,
      ip = ip,
      userAgent = userAgent,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesAccountX59480d67 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesAccountX59480d67> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesAccountX59480d67 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesAccountX59480d67")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesAccountX59480d67 must be a JSON object")
      return InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesAccountX59480d67(
        date = rawObject["date"]?.let { json.decodeFromJsonElement<Int>(it) },
        ip = rawObject["ip"]?.let { json.decodeFromJsonElement<String>(it) },
        userAgent = rawObject["user_agent"]?.let { json.decodeFromJsonElement<InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesUserAgentX625b5c58>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesAccountX59480d67) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesAccountX59480d67")
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

public fun inlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesAccountX59480d67(block: InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesAccountX59480d67.Builder.() -> Unit): InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesAccountX59480d67 = InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesAccountX59480d67.build(block)
