package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class SubscriptionsResourcePauseCollectionView(
  public val behavior: InlineSubscriptionsResourcePauseCollectionBehaviorX60bc805d,
  @SerialName("resumes_at")
  public val resumesAt: Int? = null,
)

/**
 * The Pause Collection settings determine how we will pause collection for this subscription and for how long the
 * subscription
 * should be paused.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/subscriptions_resource_pause_collection
 */
@Serializable(with = SubscriptionsResourcePauseCollection.Serializer::class)
public class SubscriptionsResourcePauseCollection(
  /**
   * The payment collection behavior for this subscription while paused.
   */
  public val behavior: InlineSubscriptionsResourcePauseCollectionBehaviorX60bc805d,
  /**
   * The time after which the subscription will resume collecting payments.
   */
  public val resumesAt: Int? = null,
) {
  public class Builder {
    private var behaviorValue: InlineSubscriptionsResourcePauseCollectionBehaviorX60bc805d? = null

    public var behavior: InlineSubscriptionsResourcePauseCollectionBehaviorX60bc805d
      get() = requireNotNull(behaviorValue) { "behavior is required" }
      set(`value`) {
        behaviorValue = value
      }

    /**
     * The time after which the subscription will resume collecting payments.
     */
    public var resumesAt: Int? = null

    public fun build(): SubscriptionsResourcePauseCollection {
      check(behaviorValue != null) { "behavior is required" }
      return SubscriptionsResourcePauseCollection(
        behavior = behavior,
        resumesAt = resumesAt,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SubscriptionsResourcePauseCollection = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<SubscriptionsResourcePauseCollection> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SubscriptionsResourcePauseCollection {
      val jsonDecoder = decoder.requireJsonDecoder("SubscriptionsResourcePauseCollection")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SubscriptionsResourcePauseCollection must be a JSON object")
      val behavior = json.decodeRequired<InlineSubscriptionsResourcePauseCollectionBehaviorX60bc805d>(rawObject, "behavior")
      return SubscriptionsResourcePauseCollection(
        behavior = behavior,
        resumesAt = rawObject["resumes_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SubscriptionsResourcePauseCollection) {
      val jsonEncoder = encoder.requireJsonEncoder("SubscriptionsResourcePauseCollection")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("behavior", json.encodeToJsonElement(value.behavior))
        value.resumesAt?.let { put("resumes_at", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun subscriptionsResourcePauseCollection(block: SubscriptionsResourcePauseCollection.Builder.() -> Unit): SubscriptionsResourcePauseCollection = SubscriptionsResourcePauseCollection.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("SubscriptionsResourcePauseCollection is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
