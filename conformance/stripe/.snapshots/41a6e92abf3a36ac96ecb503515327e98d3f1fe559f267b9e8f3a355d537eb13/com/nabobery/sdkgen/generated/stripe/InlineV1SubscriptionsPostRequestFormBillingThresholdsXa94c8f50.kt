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

public enum class InlineV1SubscriptionsPostRequestFormBillingThresholdsXa94c8f50Branch {
  InlineV1SubscriptionsPostRequestFormBillingThresholdsAnyOf1X684ca4a0,
  InlineV1SubscriptionsPostRequestFormBillingThresholdsAnyOf2Xb00c6378,
}

public sealed class InlineV1SubscriptionsPostRequestFormBillingThresholdsXa94c8f50DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SubscriptionsPostRequestFormBillingThresholdsXa94c8f50NoMatchException(
  message: String,
) : InlineV1SubscriptionsPostRequestFormBillingThresholdsXa94c8f50DecodingException(message)

internal data class InlineV1SubscriptionsPostRequestFormBillingThresholdsXa94c8f50Inspection(
  public val matchesInlineV1SubscriptionsPostRequestFormBillingThresholdsAnyOf1X684ca4a0: Boolean,
  public val matchesInlineV1SubscriptionsPostRequestFormBillingThresholdsAnyOf2Xb00c6378: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1SubscriptionsPostRequestFormBillingThresholdsAnyOf1X684ca4a0, matchesInlineV1SubscriptionsPostRequestFormBillingThresholdsAnyOf2Xb00c6378).count { it }
}

/**
 * Define thresholds at which an invoice will be sent, and the subscription advanced to a new billing period. When
 * updating, pass an empty string to remove previously-defined thresholds.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/billing_thresholds
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormBillingThresholdsXa94c8f50.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormBillingThresholdsXa94c8f50 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1SubscriptionsPostRequestFormBillingThresholdsXa94c8f50Inspection,
) {
  public val inlineV1SubscriptionsPostRequestFormBillingThresholdsAnyOf1X684ca4a0:
      InlineV1SubscriptionsPostRequestFormBillingThresholdsAnyOf1X684ca4a0? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionsPostRequestFormBillingThresholdsAnyOf1X684ca4a0) json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormBillingThresholdsAnyOf1X684ca4a0>(raw) else null }

  public val inlineV1SubscriptionsPostRequestFormBillingThresholdsAnyOf2Xb00c6378:
      InlineV1SubscriptionsPostRequestFormBillingThresholdsAnyOf2Xb00c6378? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionsPostRequestFormBillingThresholdsAnyOf2Xb00c6378) json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormBillingThresholdsAnyOf2Xb00c6378>(raw) else null }

  public val matchedBranches:
      Set<InlineV1SubscriptionsPostRequestFormBillingThresholdsXa94c8f50Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1SubscriptionsPostRequestFormBillingThresholdsAnyOf1X684ca4a0) add(InlineV1SubscriptionsPostRequestFormBillingThresholdsXa94c8f50Branch.InlineV1SubscriptionsPostRequestFormBillingThresholdsAnyOf1X684ca4a0)
      if (inspection.matchesInlineV1SubscriptionsPostRequestFormBillingThresholdsAnyOf2Xb00c6378) add(InlineV1SubscriptionsPostRequestFormBillingThresholdsXa94c8f50Branch.InlineV1SubscriptionsPostRequestFormBillingThresholdsAnyOf2Xb00c6378)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SubscriptionsPostRequestFormBillingThresholdsXa94c8f50 {
      val inspection = inspectInlineV1SubscriptionsPostRequestFormBillingThresholdsXa94c8f50(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SubscriptionsPostRequestFormBillingThresholdsXa94c8f50NoMatchException("InlineV1SubscriptionsPostRequestFormBillingThresholdsXa94c8f50 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SubscriptionsPostRequestFormBillingThresholdsXa94c8f50(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormBillingThresholdsXa94c8f50> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormBillingThresholdsXa94c8f50 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormBillingThresholdsXa94c8f50")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormBillingThresholdsXa94c8f50) {
      encoder.requireJsonEncoder("InlineV1SubscriptionsPostRequestFormBillingThresholdsXa94c8f50").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SubscriptionsPostRequestFormBillingThresholdsXa94c8f50(element: JsonElement): InlineV1SubscriptionsPostRequestFormBillingThresholdsXa94c8f50Inspection {
  val matchesInlineV1SubscriptionsPostRequestFormBillingThresholdsAnyOf1X684ca4a0 = element.isJsonDecodable<InlineV1SubscriptionsPostRequestFormBillingThresholdsAnyOf1X684ca4a0>()
  val matchesInlineV1SubscriptionsPostRequestFormBillingThresholdsAnyOf2Xb00c6378 = element.isJsonDecodable<InlineV1SubscriptionsPostRequestFormBillingThresholdsAnyOf2Xb00c6378>()
  return InlineV1SubscriptionsPostRequestFormBillingThresholdsXa94c8f50Inspection(
    matchesInlineV1SubscriptionsPostRequestFormBillingThresholdsAnyOf1X684ca4a0 = matchesInlineV1SubscriptionsPostRequestFormBillingThresholdsAnyOf1X684ca4a0,
    matchesInlineV1SubscriptionsPostRequestFormBillingThresholdsAnyOf2Xb00c6378 = matchesInlineV1SubscriptionsPostRequestFormBillingThresholdsAnyOf2Xb00c6378,
    failures = buildList {
      if (!matchesInlineV1SubscriptionsPostRequestFormBillingThresholdsAnyOf1X684ca4a0) add("InlineV1SubscriptionsPostRequestFormBillingThresholdsAnyOf1X684ca4a0: value does not match InlineV1SubscriptionsPostRequestFormBillingThresholdsAnyOf1X684ca4a0")
      if (!matchesInlineV1SubscriptionsPostRequestFormBillingThresholdsAnyOf2Xb00c6378) add("InlineV1SubscriptionsPostRequestFormBillingThresholdsAnyOf2Xb00c6378: value does not match InlineV1SubscriptionsPostRequestFormBillingThresholdsAnyOf2Xb00c6378")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
