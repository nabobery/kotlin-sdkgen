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
 * orm-urlencoded/schema/properties/restrictions/anyOf/0/properties/completed_sessions.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/restrictions/anyOf/0/properties/completed_sessions
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormRestrictionsAnyOf1CompletedSessionsX64d038e1.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormRestrictionsAnyOf1CompletedSessionsX64d038e1(
  public val limit: Int,
) {
  public class Builder {
    private var limitValue: Int? = null

    public var limit: Int
      get() = requireNotNull(limitValue) { "limit is required" }
      set(`value`) {
        limitValue = value
      }

    public fun build(): InlineV1PaymentLinksPostRequestFormRestrictionsAnyOf1CompletedSessionsX64d038e1 {
      check(limitValue != null) { "limit is required" }
      return InlineV1PaymentLinksPostRequestFormRestrictionsAnyOf1CompletedSessionsX64d038e1(
        limit = limit,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormRestrictionsAnyOf1CompletedSessionsX64d038e1 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormRestrictionsAnyOf1CompletedSessionsX64d038e1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormRestrictionsAnyOf1CompletedSessionsX64d038e1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentLinksPostRequestFormRestrictionsAnyOf1CompletedSessionsX64d038e1")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentLinksPostRequestFormRestrictionsAnyOf1CompletedSessionsX64d038e1 must be a JSON object")
      val limit = json.decodeRequired<Int>(rawObject, "limit")
      return InlineV1PaymentLinksPostRequestFormRestrictionsAnyOf1CompletedSessionsX64d038e1(
        limit = limit,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormRestrictionsAnyOf1CompletedSessionsX64d038e1) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentLinksPostRequestFormRestrictionsAnyOf1CompletedSessionsX64d038e1")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("limit", json.encodeToJsonElement(value.limit))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentLinksPostRequestFormRestrictionsAnyOf1CompletedSessionsX64d038e1(block: InlineV1PaymentLinksPostRequestFormRestrictionsAnyOf1CompletedSessionsX64d038e1.Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormRestrictionsAnyOf1CompletedSessionsX64d038e1 = InlineV1PaymentLinksPostRequestFormRestrictionsAnyOf1CompletedSessionsX64d038e1.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1PaymentLinksPostRequestFormRestrictionsAnyOf1CompletedSessionsX64d038e1 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
