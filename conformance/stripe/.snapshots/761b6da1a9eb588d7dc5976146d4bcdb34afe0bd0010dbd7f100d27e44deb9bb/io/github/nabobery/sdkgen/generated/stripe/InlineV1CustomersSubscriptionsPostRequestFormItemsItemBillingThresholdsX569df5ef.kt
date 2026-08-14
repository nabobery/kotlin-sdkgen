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

public enum class InlineV1CustomersSubscriptionsPostRequestFormItemsItemBillingThresholdsX569df5efBranch {
  InlineV1CustomersSubscriptionsPostRequestFormItemsItemAnyOf1X6eb9b3bd,
  InlineV1CustomersSubscriptionsPostRequestFormItemsItemAnyOf2X1aa9fb36,
}

public sealed class InlineV1CustomersSubscriptionsPostRequestFormItemsItemBillingThresholdsX569df5efDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1CustomersSubscriptionsPostRequestFormItemsItemBillingThresholdsX569df5efNoMatchException(
  message: String,
) : InlineV1CustomersSubscriptionsPostRequestFormItemsItemBillingThresholdsX569df5efDecodingException(message)

internal data class InlineV1CustomersSubscriptionsPostRequestFormItemsItemBillingThresholdsX569df5efInspection(
  public val matchesInlineV1CustomersSubscriptionsPostRequestFormItemsItemAnyOf1X6eb9b3bd: Boolean,
  public val matchesInlineV1CustomersSubscriptionsPostRequestFormItemsItemAnyOf2X1aa9fb36: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1CustomersSubscriptionsPostRequestFormItemsItemAnyOf1X6eb9b3bd, matchesInlineV1CustomersSubscriptionsPostRequestFormItemsItemAnyOf2X1aa9fb36).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/items/items/properties/billing_thresholds.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/items/items/properties/billing_thresholds
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormItemsItemBillingThresholdsX569df5ef.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormItemsItemBillingThresholdsX569df5ef internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1CustomersSubscriptionsPostRequestFormItemsItemBillingThresholdsX569df5efInspection,
) {
  public val inlineV1CustomersSubscriptionsPostRequestFormItemsItemAnyOf1X6eb9b3bd:
      InlineV1CustomersSubscriptionsPostRequestFormItemsItemAnyOf1X6eb9b3bd? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormItemsItemAnyOf1X6eb9b3bd) json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormItemsItemAnyOf1X6eb9b3bd>(raw) else null }

  public val inlineV1CustomersSubscriptionsPostRequestFormItemsItemAnyOf2X1aa9fb36:
      InlineV1CustomersSubscriptionsPostRequestFormItemsItemAnyOf2X1aa9fb36? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormItemsItemAnyOf2X1aa9fb36) json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormItemsItemAnyOf2X1aa9fb36>(raw) else null }

  public val matchedBranches:
      Set<InlineV1CustomersSubscriptionsPostRequestFormItemsItemBillingThresholdsX569df5efBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormItemsItemAnyOf1X6eb9b3bd) add(InlineV1CustomersSubscriptionsPostRequestFormItemsItemBillingThresholdsX569df5efBranch.InlineV1CustomersSubscriptionsPostRequestFormItemsItemAnyOf1X6eb9b3bd)
      if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormItemsItemAnyOf2X1aa9fb36) add(InlineV1CustomersSubscriptionsPostRequestFormItemsItemBillingThresholdsX569df5efBranch.InlineV1CustomersSubscriptionsPostRequestFormItemsItemAnyOf2X1aa9fb36)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1CustomersSubscriptionsPostRequestFormItemsItemBillingThresholdsX569df5ef {
      val inspection = inspectInlineV1CustomersSubscriptionsPostRequestFormItemsItemBillingThresholdsX569df5ef(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1CustomersSubscriptionsPostRequestFormItemsItemBillingThresholdsX569df5efNoMatchException("InlineV1CustomersSubscriptionsPostRequestFormItemsItemBillingThresholdsX569df5ef matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1CustomersSubscriptionsPostRequestFormItemsItemBillingThresholdsX569df5ef(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormItemsItemBillingThresholdsX569df5ef> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormItemsItemBillingThresholdsX569df5ef {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersSubscriptionsPostRequestFormItemsItemBillingThresholdsX569df5ef")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormItemsItemBillingThresholdsX569df5ef) {
      encoder.requireJsonEncoder("InlineV1CustomersSubscriptionsPostRequestFormItemsItemBillingThresholdsX569df5ef").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1CustomersSubscriptionsPostRequestFormItemsItemBillingThresholdsX569df5ef(element: JsonElement): InlineV1CustomersSubscriptionsPostRequestFormItemsItemBillingThresholdsX569df5efInspection {
  val matchesInlineV1CustomersSubscriptionsPostRequestFormItemsItemAnyOf1X6eb9b3bd = element.isJsonDecodable<InlineV1CustomersSubscriptionsPostRequestFormItemsItemAnyOf1X6eb9b3bd>()
  val matchesInlineV1CustomersSubscriptionsPostRequestFormItemsItemAnyOf2X1aa9fb36 = element.isJsonDecodable<InlineV1CustomersSubscriptionsPostRequestFormItemsItemAnyOf2X1aa9fb36>()
  return InlineV1CustomersSubscriptionsPostRequestFormItemsItemBillingThresholdsX569df5efInspection(
    matchesInlineV1CustomersSubscriptionsPostRequestFormItemsItemAnyOf1X6eb9b3bd = matchesInlineV1CustomersSubscriptionsPostRequestFormItemsItemAnyOf1X6eb9b3bd,
    matchesInlineV1CustomersSubscriptionsPostRequestFormItemsItemAnyOf2X1aa9fb36 = matchesInlineV1CustomersSubscriptionsPostRequestFormItemsItemAnyOf2X1aa9fb36,
    failures = buildList {
      if (!matchesInlineV1CustomersSubscriptionsPostRequestFormItemsItemAnyOf1X6eb9b3bd) add("InlineV1CustomersSubscriptionsPostRequestFormItemsItemAnyOf1X6eb9b3bd: value does not match InlineV1CustomersSubscriptionsPostRequestFormItemsItemAnyOf1X6eb9b3bd")
      if (!matchesInlineV1CustomersSubscriptionsPostRequestFormItemsItemAnyOf2X1aa9fb36) add("InlineV1CustomersSubscriptionsPostRequestFormItemsItemAnyOf2X1aa9fb36: value does not match InlineV1CustomersSubscriptionsPostRequestFormItemsItemAnyOf2X1aa9fb36")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
