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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/restrictions/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/restrictions/anyOf/0
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormRestrictionsAnyOf1Xf7724c97.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormRestrictionsAnyOf1Xf7724c97(
  public val completedSessions:
      InlineV1PaymentLinksPostRequestFormRestrictionsAnyOf1CompletedSessionsX64d038e1,
) {
  public class Builder {
    private var completedSessionsValue:
        InlineV1PaymentLinksPostRequestFormRestrictionsAnyOf1CompletedSessionsX64d038e1? = null

    public var completedSessions:
        InlineV1PaymentLinksPostRequestFormRestrictionsAnyOf1CompletedSessionsX64d038e1
      get() = requireNotNull(completedSessionsValue) { "completedSessions is required" }
      set(`value`) {
        completedSessionsValue = value
      }

    public fun build(): InlineV1PaymentLinksPostRequestFormRestrictionsAnyOf1Xf7724c97 {
      check(completedSessionsValue != null) { "completedSessions is required" }
      return InlineV1PaymentLinksPostRequestFormRestrictionsAnyOf1Xf7724c97(
        completedSessions = completedSessions,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormRestrictionsAnyOf1Xf7724c97 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormRestrictionsAnyOf1Xf7724c97> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormRestrictionsAnyOf1Xf7724c97 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentLinksPostRequestFormRestrictionsAnyOf1Xf7724c97")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentLinksPostRequestFormRestrictionsAnyOf1Xf7724c97 must be a JSON object")
      val completedSessions = json.decodeRequired<InlineV1PaymentLinksPostRequestFormRestrictionsAnyOf1CompletedSessionsX64d038e1>(rawObject, "completed_sessions")
      return InlineV1PaymentLinksPostRequestFormRestrictionsAnyOf1Xf7724c97(
        completedSessions = completedSessions,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormRestrictionsAnyOf1Xf7724c97) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentLinksPostRequestFormRestrictionsAnyOf1Xf7724c97")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("completed_sessions", json.encodeToJsonElement(value.completedSessions))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentLinksPostRequestFormRestrictionsAnyOf1Xf7724c97(block: InlineV1PaymentLinksPostRequestFormRestrictionsAnyOf1Xf7724c97.Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormRestrictionsAnyOf1Xf7724c97 = InlineV1PaymentLinksPostRequestFormRestrictionsAnyOf1Xf7724c97.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1PaymentLinksPostRequestFormRestrictionsAnyOf1Xf7724c97 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
