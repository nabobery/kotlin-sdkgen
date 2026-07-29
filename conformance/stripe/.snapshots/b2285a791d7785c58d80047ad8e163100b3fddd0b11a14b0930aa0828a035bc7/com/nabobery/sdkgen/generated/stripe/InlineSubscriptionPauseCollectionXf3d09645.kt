package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineSubscriptionPauseCollectionXf3d09645Branch {
  SubscriptionsResourcePauseCollection,
}

public sealed class InlineSubscriptionPauseCollectionXf3d09645DecodingException(
  message: String,
) : SerializationException(message)

public class InlineSubscriptionPauseCollectionXf3d09645NoMatchException(
  message: String,
) : InlineSubscriptionPauseCollectionXf3d09645DecodingException(message)

internal data class InlineSubscriptionPauseCollectionXf3d09645Inspection(
  public val matchesSubscriptionsResourcePauseCollection: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesSubscriptionsResourcePauseCollection).count { it }
}

/**
 * If specified, payment collection for this subscription will be paused. Note that the subscription status will be
 * unchanged and will not be updated to `paused`. Learn more about [pausing
 * collection](https://docs.stripe.com/billing/subscriptions/pause-payment).
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/subscription/properties/pause_collection
 */
@Serializable(with = InlineSubscriptionPauseCollectionXf3d09645.Serializer::class)
public class InlineSubscriptionPauseCollectionXf3d09645 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineSubscriptionPauseCollectionXf3d09645Inspection,
) {
  public val subscriptionsResourcePauseCollection: SubscriptionsResourcePauseCollectionView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesSubscriptionsResourcePauseCollection) json.decodeFromJsonElement<SubscriptionsResourcePauseCollectionView>(raw) else null }

  public val matchedBranches: Set<InlineSubscriptionPauseCollectionXf3d09645Branch>
    get() = buildSet {
      if (inspection.matchesSubscriptionsResourcePauseCollection) add(InlineSubscriptionPauseCollectionXf3d09645Branch.SubscriptionsResourcePauseCollection)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineSubscriptionPauseCollectionXf3d09645 {
      val inspection = inspectInlineSubscriptionPauseCollectionXf3d09645(raw)
      if (inspection.matchCount == 0) {
        throw InlineSubscriptionPauseCollectionXf3d09645NoMatchException("InlineSubscriptionPauseCollectionXf3d09645 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineSubscriptionPauseCollectionXf3d09645(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineSubscriptionPauseCollectionXf3d09645> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSubscriptionPauseCollectionXf3d09645 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSubscriptionPauseCollectionXf3d09645")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineSubscriptionPauseCollectionXf3d09645) {
      encoder.requireJsonEncoder("InlineSubscriptionPauseCollectionXf3d09645").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineSubscriptionPauseCollectionXf3d09645(element: JsonElement): InlineSubscriptionPauseCollectionXf3d09645Inspection {
  val raw = element as? JsonObject ?: return InlineSubscriptionPauseCollectionXf3d09645Inspection(
    matchesSubscriptionsResourcePauseCollection = false,
    failures = listOf("SubscriptionsResourcePauseCollection: expected JSON object"),
  )
  val matchesSubscriptionsResourcePauseCollection = raw["behavior"] != null
  return InlineSubscriptionPauseCollectionXf3d09645Inspection(
    matchesSubscriptionsResourcePauseCollection = matchesSubscriptionsResourcePauseCollection,
    failures = buildList {
      if (!matchesSubscriptionsResourcePauseCollection) add("SubscriptionsResourcePauseCollection: required properties 'behavior' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
