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

public enum class InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsX527d8145Branch {
  InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf1X81cdd5fb,
  InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf2X94d9fbde,
}

public sealed class InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsX527d8145DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsX527d8145NoMatchException(
  message: String,
) : InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsX527d8145DecodingException(message)

internal data class InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsX527d8145Inspection(
  public val matchesInlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf1X81cdd5fb:
      Boolean,
  public val matchesInlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf2X94d9fbde:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf1X81cdd5fb, matchesInlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf2X94d9fbde).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/items/items/properties/billing_thresholds.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/items/items/properties/billing_thresholds
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsX527d8145.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsX527d8145 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsX527d8145Inspection,
) {
  public val inlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf1X81cdd5fb:
      InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf1X81cdd5fb? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf1X81cdd5fb) json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf1X81cdd5fb>(raw) else null }

  public val inlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf2X94d9fbde:
      InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf2X94d9fbde? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf2X94d9fbde) json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf2X94d9fbde>(raw) else null }

  public val matchedBranches:
      Set<InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsX527d8145Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf1X81cdd5fb) add(InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsX527d8145Branch.InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf1X81cdd5fb)
      if (inspection.matchesInlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf2X94d9fbde) add(InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsX527d8145Branch.InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf2X94d9fbde)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsX527d8145 {
      val inspection = inspectInlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsX527d8145(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsX527d8145NoMatchException("InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsX527d8145 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsX527d8145(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsX527d8145> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsX527d8145 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsX527d8145")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsX527d8145) {
      encoder.requireJsonEncoder("InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsX527d8145").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsX527d8145(element: JsonElement): InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsX527d8145Inspection {
  val matchesInlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf1X81cdd5fb = element.isJsonDecodable<InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf1X81cdd5fb>()
  val matchesInlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf2X94d9fbde = element.isJsonDecodable<InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf2X94d9fbde>()
  return InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsX527d8145Inspection(
    matchesInlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf1X81cdd5fb = matchesInlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf1X81cdd5fb,
    matchesInlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf2X94d9fbde = matchesInlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf2X94d9fbde,
    failures = buildList {
      if (!matchesInlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf1X81cdd5fb) add("InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf1X81cdd5fb: value does not match InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf1X81cdd5fb")
      if (!matchesInlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf2X94d9fbde) add("InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf2X94d9fbde: value does not match InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf2X94d9fbde")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
