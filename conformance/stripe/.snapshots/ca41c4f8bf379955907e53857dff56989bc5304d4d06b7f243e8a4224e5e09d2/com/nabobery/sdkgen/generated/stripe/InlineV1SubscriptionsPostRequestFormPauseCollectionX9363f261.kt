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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1SubscriptionsPostRequestFormPauseCollectionX9363f261Branch {
  InlineV1SubscriptionsPostRequestFormPauseCollectionAnyOf1Xa44f1c3f,
  InlineV1SubscriptionsPostRequestFormPauseCollectionAnyOf2Xccf086d5,
}

public sealed class InlineV1SubscriptionsPostRequestFormPauseCollectionX9363f261DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SubscriptionsPostRequestFormPauseCollectionX9363f261NoMatchException(
  message: String,
) : InlineV1SubscriptionsPostRequestFormPauseCollectionX9363f261DecodingException(message)

internal data class InlineV1SubscriptionsPostRequestFormPauseCollectionX9363f261Inspection(
  public val matchesInlineV1SubscriptionsPostRequestFormPauseCollectionAnyOf1Xa44f1c3f: Boolean,
  public val matchesInlineV1SubscriptionsPostRequestFormPauseCollectionAnyOf2Xccf086d5: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1SubscriptionsPostRequestFormPauseCollectionAnyOf1Xa44f1c3f, matchesInlineV1SubscriptionsPostRequestFormPauseCollectionAnyOf2Xccf086d5).count { it }
}

/**
 * If specified, payment collection for this subscription will be paused. Note that the subscription status will be
 * unchanged and will not be updated to `paused`. Learn more about [pausing
 * collection](https://docs.stripe.com/billing/subscriptions/pause-payment).
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/pause_collection
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormPauseCollectionX9363f261.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormPauseCollectionX9363f261 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1SubscriptionsPostRequestFormPauseCollectionX9363f261Inspection,
) {
  public val inlineV1SubscriptionsPostRequestFormPauseCollectionAnyOf1Xa44f1c3f:
      InlineV1SubscriptionsPostRequestFormPauseCollectionAnyOf1Xa44f1c3f? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionsPostRequestFormPauseCollectionAnyOf1Xa44f1c3f) json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPauseCollectionAnyOf1Xa44f1c3f>(raw) else null }

  public val inlineV1SubscriptionsPostRequestFormPauseCollectionAnyOf2Xccf086d5:
      InlineV1SubscriptionsPostRequestFormPauseCollectionAnyOf2Xccf086d5? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionsPostRequestFormPauseCollectionAnyOf2Xccf086d5) json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPauseCollectionAnyOf2Xccf086d5>(raw) else null }

  public val matchedBranches:
      Set<InlineV1SubscriptionsPostRequestFormPauseCollectionX9363f261Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1SubscriptionsPostRequestFormPauseCollectionAnyOf1Xa44f1c3f) add(InlineV1SubscriptionsPostRequestFormPauseCollectionX9363f261Branch.InlineV1SubscriptionsPostRequestFormPauseCollectionAnyOf1Xa44f1c3f)
      if (inspection.matchesInlineV1SubscriptionsPostRequestFormPauseCollectionAnyOf2Xccf086d5) add(InlineV1SubscriptionsPostRequestFormPauseCollectionX9363f261Branch.InlineV1SubscriptionsPostRequestFormPauseCollectionAnyOf2Xccf086d5)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SubscriptionsPostRequestFormPauseCollectionX9363f261 {
      val inspection = inspectInlineV1SubscriptionsPostRequestFormPauseCollectionX9363f261(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SubscriptionsPostRequestFormPauseCollectionX9363f261NoMatchException("InlineV1SubscriptionsPostRequestFormPauseCollectionX9363f261 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SubscriptionsPostRequestFormPauseCollectionX9363f261(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormPauseCollectionX9363f261> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormPauseCollectionX9363f261 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormPauseCollectionX9363f261")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormPauseCollectionX9363f261) {
      encoder.requireJsonEncoder("InlineV1SubscriptionsPostRequestFormPauseCollectionX9363f261").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SubscriptionsPostRequestFormPauseCollectionX9363f261(element: JsonElement): InlineV1SubscriptionsPostRequestFormPauseCollectionX9363f261Inspection {
  val matchesInlineV1SubscriptionsPostRequestFormPauseCollectionAnyOf1Xa44f1c3f = element.isJsonDecodable<InlineV1SubscriptionsPostRequestFormPauseCollectionAnyOf1Xa44f1c3f>()
  val matchesInlineV1SubscriptionsPostRequestFormPauseCollectionAnyOf2Xccf086d5 = element.isJsonDecodable<InlineV1SubscriptionsPostRequestFormPauseCollectionAnyOf2Xccf086d5>()
  return InlineV1SubscriptionsPostRequestFormPauseCollectionX9363f261Inspection(
    matchesInlineV1SubscriptionsPostRequestFormPauseCollectionAnyOf1Xa44f1c3f = matchesInlineV1SubscriptionsPostRequestFormPauseCollectionAnyOf1Xa44f1c3f,
    matchesInlineV1SubscriptionsPostRequestFormPauseCollectionAnyOf2Xccf086d5 = matchesInlineV1SubscriptionsPostRequestFormPauseCollectionAnyOf2Xccf086d5,
    failures = buildList {
      if (!matchesInlineV1SubscriptionsPostRequestFormPauseCollectionAnyOf1Xa44f1c3f) add("InlineV1SubscriptionsPostRequestFormPauseCollectionAnyOf1Xa44f1c3f: value does not match InlineV1SubscriptionsPostRequestFormPauseCollectionAnyOf1Xa44f1c3f")
      if (!matchesInlineV1SubscriptionsPostRequestFormPauseCollectionAnyOf2Xccf086d5) add("InlineV1SubscriptionsPostRequestFormPauseCollectionAnyOf2Xccf086d5: value does not match InlineV1SubscriptionsPostRequestFormPauseCollectionAnyOf2Xccf086d5")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
