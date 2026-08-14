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
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/pause_collection/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/pause_collection/anyOf/0
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormPauseCollectionAnyOf1X42b75df5.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormPauseCollectionAnyOf1X42b75df5(
  public val behavior:
      InlineV1CustomersSubscriptionsPostRequestFormPauseCollectionBehaviorXdf428e23,
  public val resumesAt: Int? = null,
) {
  public class Builder {
    private var behaviorValue:
        InlineV1CustomersSubscriptionsPostRequestFormPauseCollectionBehaviorXdf428e23? = null

    public var behavior:
        InlineV1CustomersSubscriptionsPostRequestFormPauseCollectionBehaviorXdf428e23
      get() = requireNotNull(behaviorValue) { "behavior is required" }
      set(`value`) {
        behaviorValue = value
      }

    public var resumesAt: Int? = null

    public fun build(): InlineV1CustomersSubscriptionsPostRequestFormPauseCollectionAnyOf1X42b75df5 {
      check(behaviorValue != null) { "behavior is required" }
      return InlineV1CustomersSubscriptionsPostRequestFormPauseCollectionAnyOf1X42b75df5(
        behavior = behavior,
        resumesAt = resumesAt,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CustomersSubscriptionsPostRequestFormPauseCollectionAnyOf1X42b75df5 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormPauseCollectionAnyOf1X42b75df5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormPauseCollectionAnyOf1X42b75df5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersSubscriptionsPostRequestFormPauseCollectionAnyOf1X42b75df5")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CustomersSubscriptionsPostRequestFormPauseCollectionAnyOf1X42b75df5 must be a JSON object")
      val behavior = json.decodeRequired<InlineV1CustomersSubscriptionsPostRequestFormPauseCollectionBehaviorXdf428e23>(rawObject, "behavior")
      return InlineV1CustomersSubscriptionsPostRequestFormPauseCollectionAnyOf1X42b75df5(
        behavior = behavior,
        resumesAt = rawObject["resumes_at"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormPauseCollectionAnyOf1X42b75df5) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CustomersSubscriptionsPostRequestFormPauseCollectionAnyOf1X42b75df5")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("behavior", json.encodeToJsonElement(value.behavior))
        value.resumesAt?.let { put("resumes_at", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CustomersSubscriptionsPostRequestFormPauseCollectionAnyOf1X42b75df5(block: InlineV1CustomersSubscriptionsPostRequestFormPauseCollectionAnyOf1X42b75df5.Builder.() -> Unit): InlineV1CustomersSubscriptionsPostRequestFormPauseCollectionAnyOf1X42b75df5 = InlineV1CustomersSubscriptionsPostRequestFormPauseCollectionAnyOf1X42b75df5.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1CustomersSubscriptionsPostRequestFormPauseCollectionAnyOf1X42b75df5 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
