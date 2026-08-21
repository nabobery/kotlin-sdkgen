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

public enum class InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsXc768c06fBranch {
  InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf1X68fd3e50,
  InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf2X1081735f,
}

public sealed class InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsXc768c06fDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsXc768c06fNoMatchException(
  message: String,
) : InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsXc768c06fDecodingException(message)

internal data class InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsXc768c06fInspection(
  public val matchesInlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf1X68fd3e50:
      Boolean,
  public val matchesInlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf2X1081735f:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf1X68fd3e50, matchesInlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf2X1081735f).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/items/items/properties/billing_thresholds.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/items/items/properties/billing_thresholds
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsXc768c06f.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsXc768c06f internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsXc768c06fInspection,
) {
  public val inlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf1X68fd3e50:
      InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf1X68fd3e50? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf1X68fd3e50) json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf1X68fd3e50>(raw) else null }

  public val inlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf2X1081735f:
      InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf2X1081735f? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf2X1081735f) json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf2X1081735f>(raw) else null }

  public val matchedBranches:
      Set<InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsXc768c06fBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf1X68fd3e50) add(InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsXc768c06fBranch.InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf1X68fd3e50)
      if (inspection.matchesInlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf2X1081735f) add(InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsXc768c06fBranch.InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf2X1081735f)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsXc768c06f {
      val inspection = inspectInlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsXc768c06f(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsXc768c06fNoMatchException("InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsXc768c06f matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsXc768c06f(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsXc768c06f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsXc768c06f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsXc768c06f")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsXc768c06f) {
      encoder.requireJsonEncoder("InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsXc768c06f").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsXc768c06f(element: JsonElement): InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsXc768c06fInspection {
  val matchesInlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf1X68fd3e50 = element.isJsonDecodable<InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf1X68fd3e50>()
  val matchesInlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf2X1081735f = element.isJsonDecodable<InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf2X1081735f>()
  return InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsXc768c06fInspection(
    matchesInlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf1X68fd3e50 = matchesInlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf1X68fd3e50,
    matchesInlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf2X1081735f = matchesInlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf2X1081735f,
    failures = buildList {
      if (!matchesInlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf1X68fd3e50) add("InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf1X68fd3e50: value does not match InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf1X68fd3e50")
      if (!matchesInlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf2X1081735f) add("InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf2X1081735f: value does not match InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf2X1081735f")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
