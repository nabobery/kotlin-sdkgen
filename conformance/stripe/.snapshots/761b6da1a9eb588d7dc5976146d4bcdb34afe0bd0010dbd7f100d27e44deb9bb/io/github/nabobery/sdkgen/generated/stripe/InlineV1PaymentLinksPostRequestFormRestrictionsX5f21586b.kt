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
 * Settings that restrict the usage of a payment link.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/restrictions
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormRestrictionsX5f21586b.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormRestrictionsX5f21586b(
  public val completedSessions:
      InlineV1PaymentLinksPostRequestFormRestrictionsCompletedSessionsX3240a5b8,
) {
  public class Builder {
    private var completedSessionsValue:
        InlineV1PaymentLinksPostRequestFormRestrictionsCompletedSessionsX3240a5b8? = null

    public var completedSessions:
        InlineV1PaymentLinksPostRequestFormRestrictionsCompletedSessionsX3240a5b8
      get() = requireNotNull(completedSessionsValue) { "completedSessions is required" }
      set(`value`) {
        completedSessionsValue = value
      }

    public fun build(): InlineV1PaymentLinksPostRequestFormRestrictionsX5f21586b {
      check(completedSessionsValue != null) { "completedSessions is required" }
      return InlineV1PaymentLinksPostRequestFormRestrictionsX5f21586b(
        completedSessions = completedSessions,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormRestrictionsX5f21586b = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormRestrictionsX5f21586b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormRestrictionsX5f21586b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentLinksPostRequestFormRestrictionsX5f21586b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentLinksPostRequestFormRestrictionsX5f21586b must be a JSON object")
      val completedSessions = json.decodeRequired<InlineV1PaymentLinksPostRequestFormRestrictionsCompletedSessionsX3240a5b8>(rawObject, "completed_sessions")
      return InlineV1PaymentLinksPostRequestFormRestrictionsX5f21586b(
        completedSessions = completedSessions,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormRestrictionsX5f21586b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentLinksPostRequestFormRestrictionsX5f21586b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("completed_sessions", json.encodeToJsonElement(value.completedSessions))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentLinksPostRequestFormRestrictionsX5f21586b(block: InlineV1PaymentLinksPostRequestFormRestrictionsX5f21586b.Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormRestrictionsX5f21586b = InlineV1PaymentLinksPostRequestFormRestrictionsX5f21586b.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1PaymentLinksPostRequestFormRestrictionsX5f21586b is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
