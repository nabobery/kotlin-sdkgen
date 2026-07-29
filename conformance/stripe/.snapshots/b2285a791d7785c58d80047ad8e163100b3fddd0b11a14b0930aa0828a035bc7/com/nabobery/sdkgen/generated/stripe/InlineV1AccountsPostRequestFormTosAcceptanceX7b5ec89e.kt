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
 * Details on the account's acceptance of the [Stripe Services Agreement](/connect/updating-accounts#tos-acceptance).
 * This property can only be updated for accounts where
 * [controller.requirement_collection](/api/accounts/object#account_object-controller-requirement_collection) is
 * `application`, which includes Custom accounts. This property defaults to a `full` service agreement when empty.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/tos_acceptance
 */
@Serializable(with = InlineV1AccountsPostRequestFormTosAcceptanceX7b5ec89e.Serializer::class)
public class InlineV1AccountsPostRequestFormTosAcceptanceX7b5ec89e(
  public val date: Int? = null,
  public val ip: String? = null,
  public val serviceAgreement: String? = null,
  public val userAgent: String? = null,
) {
  public class Builder {
    public var date: Int? = null

    public var ip: String? = null

    public var serviceAgreement: String? = null

    public var userAgent: String? = null

    public fun build(): InlineV1AccountsPostRequestFormTosAcceptanceX7b5ec89e = InlineV1AccountsPostRequestFormTosAcceptanceX7b5ec89e(
      date = date,
      ip = ip,
      serviceAgreement = serviceAgreement,
      userAgent = userAgent,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountsPostRequestFormTosAcceptanceX7b5ec89e = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1AccountsPostRequestFormTosAcceptanceX7b5ec89e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormTosAcceptanceX7b5ec89e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormTosAcceptanceX7b5ec89e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsPostRequestFormTosAcceptanceX7b5ec89e must be a JSON object")
      return InlineV1AccountsPostRequestFormTosAcceptanceX7b5ec89e(
        date = rawObject["date"]?.let { json.decodeFromJsonElement<Int>(it) },
        ip = rawObject["ip"]?.let { json.decodeFromJsonElement<String>(it) },
        serviceAgreement = rawObject["service_agreement"]?.let { json.decodeFromJsonElement<String>(it) },
        userAgent = rawObject["user_agent"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormTosAcceptanceX7b5ec89e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPostRequestFormTosAcceptanceX7b5ec89e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.date?.let { put("date", json.encodeToJsonElement(it)) }
        value.ip?.let { put("ip", it) }
        value.serviceAgreement?.let { put("service_agreement", it) }
        value.userAgent?.let { put("user_agent", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountsPostRequestFormTosAcceptanceX7b5ec89e(block: InlineV1AccountsPostRequestFormTosAcceptanceX7b5ec89e.Builder.() -> Unit): InlineV1AccountsPostRequestFormTosAcceptanceX7b5ec89e = InlineV1AccountsPostRequestFormTosAcceptanceX7b5ec89e.build(block)
