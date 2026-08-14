package io.github.nabobery.sdkgen.generated.stripe

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

public enum class InlineV1CustomersSubscriptionsPostRequestFormItemsItemBillingThresholdsXe48a9d41Branch {
  InlineV1CustomersSubscriptionsPostRequestFormItemsItemAnyOf1X2ad461ca,
  InlineV1CustomersSubscriptionsPostRequestFormItemsItemAnyOf2X7f174039,
}

public sealed class InlineV1CustomersSubscriptionsPostRequestFormItemsItemBillingThresholdsXe48a9d41DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1CustomersSubscriptionsPostRequestFormItemsItemBillingThresholdsXe48a9d41NoMatchException(
  message: String,
) : InlineV1CustomersSubscriptionsPostRequestFormItemsItemBillingThresholdsXe48a9d41DecodingException(message)

internal data class InlineV1CustomersSubscriptionsPostRequestFormItemsItemBillingThresholdsXe48a9d41Inspection(
  public val matchesInlineV1CustomersSubscriptionsPostRequestFormItemsItemAnyOf1X2ad461ca: Boolean,
  public val matchesInlineV1CustomersSubscriptionsPostRequestFormItemsItemAnyOf2X7f174039: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1CustomersSubscriptionsPostRequestFormItemsItemAnyOf1X2ad461ca, matchesInlineV1CustomersSubscriptionsPostRequestFormItemsItemAnyOf2X7f174039).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/items/items/properties/billing_thresholds.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/items/items/properties/billing_thresholds
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormItemsItemBillingThresholdsXe48a9d41.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormItemsItemBillingThresholdsXe48a9d41 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1CustomersSubscriptionsPostRequestFormItemsItemBillingThresholdsXe48a9d41Inspection,
) {
  public val inlineV1CustomersSubscriptionsPostRequestFormItemsItemAnyOf1X2ad461ca:
      InlineV1CustomersSubscriptionsPostRequestFormItemsItemAnyOf1X2ad461ca? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormItemsItemAnyOf1X2ad461ca) json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormItemsItemAnyOf1X2ad461ca>(raw) else null }

  public val inlineV1CustomersSubscriptionsPostRequestFormItemsItemAnyOf2X7f174039:
      InlineV1CustomersSubscriptionsPostRequestFormItemsItemAnyOf2X7f174039? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormItemsItemAnyOf2X7f174039) json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormItemsItemAnyOf2X7f174039>(raw) else null }

  public val matchedBranches:
      Set<InlineV1CustomersSubscriptionsPostRequestFormItemsItemBillingThresholdsXe48a9d41Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormItemsItemAnyOf1X2ad461ca) add(InlineV1CustomersSubscriptionsPostRequestFormItemsItemBillingThresholdsXe48a9d41Branch.InlineV1CustomersSubscriptionsPostRequestFormItemsItemAnyOf1X2ad461ca)
      if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormItemsItemAnyOf2X7f174039) add(InlineV1CustomersSubscriptionsPostRequestFormItemsItemBillingThresholdsXe48a9d41Branch.InlineV1CustomersSubscriptionsPostRequestFormItemsItemAnyOf2X7f174039)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1CustomersSubscriptionsPostRequestFormItemsItemBillingThresholdsXe48a9d41 {
      val inspection = inspectInlineV1CustomersSubscriptionsPostRequestFormItemsItemBillingThresholdsXe48a9d41(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1CustomersSubscriptionsPostRequestFormItemsItemBillingThresholdsXe48a9d41NoMatchException("InlineV1CustomersSubscriptionsPostRequestFormItemsItemBillingThresholdsXe48a9d41 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1CustomersSubscriptionsPostRequestFormItemsItemBillingThresholdsXe48a9d41(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormItemsItemBillingThresholdsXe48a9d41> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormItemsItemBillingThresholdsXe48a9d41 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersSubscriptionsPostRequestFormItemsItemBillingThresholdsXe48a9d41")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormItemsItemBillingThresholdsXe48a9d41) {
      encoder.requireJsonEncoder("InlineV1CustomersSubscriptionsPostRequestFormItemsItemBillingThresholdsXe48a9d41").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1CustomersSubscriptionsPostRequestFormItemsItemBillingThresholdsXe48a9d41(element: JsonElement): InlineV1CustomersSubscriptionsPostRequestFormItemsItemBillingThresholdsXe48a9d41Inspection {
  val matchesInlineV1CustomersSubscriptionsPostRequestFormItemsItemAnyOf1X2ad461ca = element.isJsonDecodable<InlineV1CustomersSubscriptionsPostRequestFormItemsItemAnyOf1X2ad461ca>()
  val matchesInlineV1CustomersSubscriptionsPostRequestFormItemsItemAnyOf2X7f174039 = element.isJsonDecodable<InlineV1CustomersSubscriptionsPostRequestFormItemsItemAnyOf2X7f174039>()
  return InlineV1CustomersSubscriptionsPostRequestFormItemsItemBillingThresholdsXe48a9d41Inspection(
    matchesInlineV1CustomersSubscriptionsPostRequestFormItemsItemAnyOf1X2ad461ca = matchesInlineV1CustomersSubscriptionsPostRequestFormItemsItemAnyOf1X2ad461ca,
    matchesInlineV1CustomersSubscriptionsPostRequestFormItemsItemAnyOf2X7f174039 = matchesInlineV1CustomersSubscriptionsPostRequestFormItemsItemAnyOf2X7f174039,
    failures = buildList {
      if (!matchesInlineV1CustomersSubscriptionsPostRequestFormItemsItemAnyOf1X2ad461ca) add("InlineV1CustomersSubscriptionsPostRequestFormItemsItemAnyOf1X2ad461ca: value does not match InlineV1CustomersSubscriptionsPostRequestFormItemsItemAnyOf1X2ad461ca")
      if (!matchesInlineV1CustomersSubscriptionsPostRequestFormItemsItemAnyOf2X7f174039) add("InlineV1CustomersSubscriptionsPostRequestFormItemsItemAnyOf2X7f174039: value does not match InlineV1CustomersSubscriptionsPostRequestFormItemsItemAnyOf2X7f174039")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
