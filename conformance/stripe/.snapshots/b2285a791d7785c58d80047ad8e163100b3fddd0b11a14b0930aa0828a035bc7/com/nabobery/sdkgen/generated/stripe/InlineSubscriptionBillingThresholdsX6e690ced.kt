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

public enum class InlineSubscriptionBillingThresholdsX6e690cedBranch {
  SubscriptionBillingThresholds,
}

public sealed class InlineSubscriptionBillingThresholdsX6e690cedDecodingException(
  message: String,
) : SerializationException(message)

public class InlineSubscriptionBillingThresholdsX6e690cedNoMatchException(
  message: String,
) : InlineSubscriptionBillingThresholdsX6e690cedDecodingException(message)

internal data class InlineSubscriptionBillingThresholdsX6e690cedInspection(
  public val matchesSubscriptionBillingThresholds: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesSubscriptionBillingThresholds).count { it }
}

/**
 * Define thresholds at which an invoice will be sent, and the subscription advanced to a new billing period
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/subscription/properties/billing_thresholds
 */
@Serializable(with = InlineSubscriptionBillingThresholdsX6e690ced.Serializer::class)
public class InlineSubscriptionBillingThresholdsX6e690ced internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineSubscriptionBillingThresholdsX6e690cedInspection,
) {
  public val subscriptionBillingThresholds: SubscriptionBillingThresholdsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesSubscriptionBillingThresholds) json.decodeFromJsonElement<SubscriptionBillingThresholdsView>(raw) else null }

  public val matchedBranches: Set<InlineSubscriptionBillingThresholdsX6e690cedBranch>
    get() = buildSet {
      if (inspection.matchesSubscriptionBillingThresholds) add(InlineSubscriptionBillingThresholdsX6e690cedBranch.SubscriptionBillingThresholds)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineSubscriptionBillingThresholdsX6e690ced {
      val inspection = inspectInlineSubscriptionBillingThresholdsX6e690ced(raw)
      if (inspection.matchCount == 0) {
        throw InlineSubscriptionBillingThresholdsX6e690cedNoMatchException("InlineSubscriptionBillingThresholdsX6e690ced matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineSubscriptionBillingThresholdsX6e690ced(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineSubscriptionBillingThresholdsX6e690ced> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSubscriptionBillingThresholdsX6e690ced {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSubscriptionBillingThresholdsX6e690ced")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineSubscriptionBillingThresholdsX6e690ced) {
      encoder.requireJsonEncoder("InlineSubscriptionBillingThresholdsX6e690ced").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineSubscriptionBillingThresholdsX6e690ced(element: JsonElement): InlineSubscriptionBillingThresholdsX6e690cedInspection {
  val raw = element as? JsonObject ?: return InlineSubscriptionBillingThresholdsX6e690cedInspection(
    matchesSubscriptionBillingThresholds = false,
    failures = listOf("SubscriptionBillingThresholds: expected JSON object"),
  )
  val matchesSubscriptionBillingThresholds = true
  return InlineSubscriptionBillingThresholdsX6e690cedInspection(
    matchesSubscriptionBillingThresholds = matchesSubscriptionBillingThresholds,
    failures = buildList {
      if (!matchesSubscriptionBillingThresholds) add("SubscriptionBillingThresholds: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
