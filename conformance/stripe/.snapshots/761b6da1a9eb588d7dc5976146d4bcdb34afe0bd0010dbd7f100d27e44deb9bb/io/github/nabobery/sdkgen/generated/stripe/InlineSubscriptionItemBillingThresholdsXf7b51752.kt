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
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineSubscriptionItemBillingThresholdsXf7b51752Branch {
  SubscriptionItemBillingThresholds,
}

public sealed class InlineSubscriptionItemBillingThresholdsXf7b51752DecodingException(
  message: String,
) : SerializationException(message)

public class InlineSubscriptionItemBillingThresholdsXf7b51752NoMatchException(
  message: String,
) : InlineSubscriptionItemBillingThresholdsXf7b51752DecodingException(message)

internal data class InlineSubscriptionItemBillingThresholdsXf7b51752Inspection(
  public val matchesSubscriptionItemBillingThresholds: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesSubscriptionItemBillingThresholds).count { it }
}

/**
 * Define thresholds at which an invoice will be sent, and the related subscription advanced to a new billing period
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/subscription_item/properties/billing_thresholds
 */
@Serializable(with = InlineSubscriptionItemBillingThresholdsXf7b51752.Serializer::class)
public class InlineSubscriptionItemBillingThresholdsXf7b51752 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineSubscriptionItemBillingThresholdsXf7b51752Inspection,
) {
  public val subscriptionItemBillingThresholds: SubscriptionItemBillingThresholdsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesSubscriptionItemBillingThresholds) json.decodeFromJsonElement<SubscriptionItemBillingThresholdsView>(raw) else null }

  public val matchedBranches: Set<InlineSubscriptionItemBillingThresholdsXf7b51752Branch>
    get() = buildSet {
      if (inspection.matchesSubscriptionItemBillingThresholds) add(InlineSubscriptionItemBillingThresholdsXf7b51752Branch.SubscriptionItemBillingThresholds)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineSubscriptionItemBillingThresholdsXf7b51752 {
      val inspection = inspectInlineSubscriptionItemBillingThresholdsXf7b51752(raw)
      if (inspection.matchCount == 0) {
        throw InlineSubscriptionItemBillingThresholdsXf7b51752NoMatchException("InlineSubscriptionItemBillingThresholdsXf7b51752 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineSubscriptionItemBillingThresholdsXf7b51752(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineSubscriptionItemBillingThresholdsXf7b51752> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSubscriptionItemBillingThresholdsXf7b51752 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSubscriptionItemBillingThresholdsXf7b51752")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineSubscriptionItemBillingThresholdsXf7b51752) {
      encoder.requireJsonEncoder("InlineSubscriptionItemBillingThresholdsXf7b51752").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineSubscriptionItemBillingThresholdsXf7b51752(element: JsonElement): InlineSubscriptionItemBillingThresholdsXf7b51752Inspection {
  val raw = element as? JsonObject ?: return InlineSubscriptionItemBillingThresholdsXf7b51752Inspection(
    matchesSubscriptionItemBillingThresholds = false,
    failures = listOf("SubscriptionItemBillingThresholds: expected JSON object"),
  )
  val matchesSubscriptionItemBillingThresholds = true
  return InlineSubscriptionItemBillingThresholdsXf7b51752Inspection(
    matchesSubscriptionItemBillingThresholds = matchesSubscriptionItemBillingThresholds,
    failures = buildList {
      if (!matchesSubscriptionItemBillingThresholds) add("SubscriptionItemBillingThresholds: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
