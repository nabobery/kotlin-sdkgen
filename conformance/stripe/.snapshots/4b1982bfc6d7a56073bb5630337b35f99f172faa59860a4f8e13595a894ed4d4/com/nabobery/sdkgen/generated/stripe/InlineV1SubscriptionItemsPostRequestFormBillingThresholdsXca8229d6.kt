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

public enum class InlineV1SubscriptionItemsPostRequestFormBillingThresholdsXca8229d6Branch {
  InlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf1X21cb3a93,
  InlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf2X9ff01178,
}

public sealed class InlineV1SubscriptionItemsPostRequestFormBillingThresholdsXca8229d6DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SubscriptionItemsPostRequestFormBillingThresholdsXca8229d6NoMatchException(
  message: String,
) : InlineV1SubscriptionItemsPostRequestFormBillingThresholdsXca8229d6DecodingException(message)

internal data class InlineV1SubscriptionItemsPostRequestFormBillingThresholdsXca8229d6Inspection(
  public val matchesInlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf1X21cb3a93:
      Boolean,
  public val matchesInlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf2X9ff01178:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf1X21cb3a93, matchesInlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf2X9ff01178).count { it }
}

/**
 * Define thresholds at which an invoice will be sent, and the subscription advanced to a new billing period. Pass an
 * empty string to remove previously-defined thresholds.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_items/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/billing_thresholds
 */
@Serializable(with = InlineV1SubscriptionItemsPostRequestFormBillingThresholdsXca8229d6.Serializer::class)
public class InlineV1SubscriptionItemsPostRequestFormBillingThresholdsXca8229d6 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1SubscriptionItemsPostRequestFormBillingThresholdsXca8229d6Inspection,
) {
  public val inlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf1X21cb3a93:
      InlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf1X21cb3a93? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf1X21cb3a93) json.decodeFromJsonElement<InlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf1X21cb3a93>(raw) else null }

  public val inlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf2X9ff01178:
      InlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf2X9ff01178? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf2X9ff01178) json.decodeFromJsonElement<InlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf2X9ff01178>(raw) else null }

  public val matchedBranches:
      Set<InlineV1SubscriptionItemsPostRequestFormBillingThresholdsXca8229d6Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf1X21cb3a93) add(InlineV1SubscriptionItemsPostRequestFormBillingThresholdsXca8229d6Branch.InlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf1X21cb3a93)
      if (inspection.matchesInlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf2X9ff01178) add(InlineV1SubscriptionItemsPostRequestFormBillingThresholdsXca8229d6Branch.InlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf2X9ff01178)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SubscriptionItemsPostRequestFormBillingThresholdsXca8229d6 {
      val inspection = inspectInlineV1SubscriptionItemsPostRequestFormBillingThresholdsXca8229d6(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SubscriptionItemsPostRequestFormBillingThresholdsXca8229d6NoMatchException("InlineV1SubscriptionItemsPostRequestFormBillingThresholdsXca8229d6 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SubscriptionItemsPostRequestFormBillingThresholdsXca8229d6(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionItemsPostRequestFormBillingThresholdsXca8229d6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionItemsPostRequestFormBillingThresholdsXca8229d6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionItemsPostRequestFormBillingThresholdsXca8229d6")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionItemsPostRequestFormBillingThresholdsXca8229d6) {
      encoder.requireJsonEncoder("InlineV1SubscriptionItemsPostRequestFormBillingThresholdsXca8229d6").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SubscriptionItemsPostRequestFormBillingThresholdsXca8229d6(element: JsonElement): InlineV1SubscriptionItemsPostRequestFormBillingThresholdsXca8229d6Inspection {
  val matchesInlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf1X21cb3a93 = element.isJsonDecodable<InlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf1X21cb3a93>()
  val matchesInlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf2X9ff01178 = element.isJsonDecodable<InlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf2X9ff01178>()
  return InlineV1SubscriptionItemsPostRequestFormBillingThresholdsXca8229d6Inspection(
    matchesInlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf1X21cb3a93 = matchesInlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf1X21cb3a93,
    matchesInlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf2X9ff01178 = matchesInlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf2X9ff01178,
    failures = buildList {
      if (!matchesInlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf1X21cb3a93) add("InlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf1X21cb3a93: value does not match InlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf1X21cb3a93")
      if (!matchesInlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf2X9ff01178) add("InlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf2X9ff01178: value does not match InlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf2X9ff01178")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
