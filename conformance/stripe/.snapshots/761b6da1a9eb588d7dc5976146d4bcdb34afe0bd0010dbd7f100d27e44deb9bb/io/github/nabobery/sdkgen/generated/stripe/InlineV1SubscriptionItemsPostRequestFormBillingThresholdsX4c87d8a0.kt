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

public enum class InlineV1SubscriptionItemsPostRequestFormBillingThresholdsX4c87d8a0Branch {
  InlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf1X42422db0,
  InlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf2X5210fc5d,
}

public sealed class InlineV1SubscriptionItemsPostRequestFormBillingThresholdsX4c87d8a0DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SubscriptionItemsPostRequestFormBillingThresholdsX4c87d8a0NoMatchException(
  message: String,
) : InlineV1SubscriptionItemsPostRequestFormBillingThresholdsX4c87d8a0DecodingException(message)

internal data class InlineV1SubscriptionItemsPostRequestFormBillingThresholdsX4c87d8a0Inspection(
  public val matchesInlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf1X42422db0:
      Boolean,
  public val matchesInlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf2X5210fc5d:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf1X42422db0, matchesInlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf2X5210fc5d).count { it }
}

/**
 * Define thresholds at which an invoice will be sent, and the subscription advanced to a new billing period. Pass an
 * empty string to remove previously-defined thresholds.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_items~1{item}/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/billing_thresholds
 */
@Serializable(with = InlineV1SubscriptionItemsPostRequestFormBillingThresholdsX4c87d8a0.Serializer::class)
public class InlineV1SubscriptionItemsPostRequestFormBillingThresholdsX4c87d8a0 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1SubscriptionItemsPostRequestFormBillingThresholdsX4c87d8a0Inspection,
) {
  public val inlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf1X42422db0:
      InlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf1X42422db0? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf1X42422db0) json.decodeFromJsonElement<InlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf1X42422db0>(raw) else null }

  public val inlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf2X5210fc5d:
      InlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf2X5210fc5d? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf2X5210fc5d) json.decodeFromJsonElement<InlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf2X5210fc5d>(raw) else null }

  public val matchedBranches:
      Set<InlineV1SubscriptionItemsPostRequestFormBillingThresholdsX4c87d8a0Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf1X42422db0) add(InlineV1SubscriptionItemsPostRequestFormBillingThresholdsX4c87d8a0Branch.InlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf1X42422db0)
      if (inspection.matchesInlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf2X5210fc5d) add(InlineV1SubscriptionItemsPostRequestFormBillingThresholdsX4c87d8a0Branch.InlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf2X5210fc5d)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SubscriptionItemsPostRequestFormBillingThresholdsX4c87d8a0 {
      val inspection = inspectInlineV1SubscriptionItemsPostRequestFormBillingThresholdsX4c87d8a0(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SubscriptionItemsPostRequestFormBillingThresholdsX4c87d8a0NoMatchException("InlineV1SubscriptionItemsPostRequestFormBillingThresholdsX4c87d8a0 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SubscriptionItemsPostRequestFormBillingThresholdsX4c87d8a0(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionItemsPostRequestFormBillingThresholdsX4c87d8a0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionItemsPostRequestFormBillingThresholdsX4c87d8a0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionItemsPostRequestFormBillingThresholdsX4c87d8a0")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionItemsPostRequestFormBillingThresholdsX4c87d8a0) {
      encoder.requireJsonEncoder("InlineV1SubscriptionItemsPostRequestFormBillingThresholdsX4c87d8a0").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SubscriptionItemsPostRequestFormBillingThresholdsX4c87d8a0(element: JsonElement): InlineV1SubscriptionItemsPostRequestFormBillingThresholdsX4c87d8a0Inspection {
  val matchesInlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf1X42422db0 = element.isJsonDecodable<InlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf1X42422db0>()
  val matchesInlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf2X5210fc5d = element.isJsonDecodable<InlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf2X5210fc5d>()
  return InlineV1SubscriptionItemsPostRequestFormBillingThresholdsX4c87d8a0Inspection(
    matchesInlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf1X42422db0 = matchesInlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf1X42422db0,
    matchesInlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf2X5210fc5d = matchesInlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf2X5210fc5d,
    failures = buildList {
      if (!matchesInlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf1X42422db0) add("InlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf1X42422db0: value does not match InlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf1X42422db0")
      if (!matchesInlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf2X5210fc5d) add("InlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf2X5210fc5d: value does not match InlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf2X5210fc5d")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
