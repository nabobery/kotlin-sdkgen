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

public enum class InlineSubscriptionScheduleConfigurationItemBillingThresholdsX55f2ab3aBranch {
  SubscriptionItemBillingThresholds,
}

public sealed class InlineSubscriptionScheduleConfigurationItemBillingThresholdsX55f2ab3aDecodingException(
  message: String,
) : SerializationException(message)

public class InlineSubscriptionScheduleConfigurationItemBillingThresholdsX55f2ab3aNoMatchException(
  message: String,
) : InlineSubscriptionScheduleConfigurationItemBillingThresholdsX55f2ab3aDecodingException(message)

internal data class InlineSubscriptionScheduleConfigurationItemBillingThresholdsX55f2ab3aInspection(
  public val matchesSubscriptionItemBillingThresholds: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesSubscriptionItemBillingThresholds).count { it }
}

/**
 * Define thresholds at which an invoice will be sent, and the related subscription advanced to a new billing period
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/subscription_schedule_configuration_item/properties/billing_threshol
 * ds
 */
@Serializable(with = InlineSubscriptionScheduleConfigurationItemBillingThresholdsX55f2ab3a.Serializer::class)
public class InlineSubscriptionScheduleConfigurationItemBillingThresholdsX55f2ab3a internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineSubscriptionScheduleConfigurationItemBillingThresholdsX55f2ab3aInspection,
) {
  public val subscriptionItemBillingThresholds: SubscriptionItemBillingThresholdsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesSubscriptionItemBillingThresholds) json.decodeFromJsonElement<SubscriptionItemBillingThresholdsView>(raw) else null }

  public val matchedBranches:
      Set<InlineSubscriptionScheduleConfigurationItemBillingThresholdsX55f2ab3aBranch>
    get() = buildSet {
      if (inspection.matchesSubscriptionItemBillingThresholds) add(InlineSubscriptionScheduleConfigurationItemBillingThresholdsX55f2ab3aBranch.SubscriptionItemBillingThresholds)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineSubscriptionScheduleConfigurationItemBillingThresholdsX55f2ab3a {
      val inspection = inspectInlineSubscriptionScheduleConfigurationItemBillingThresholdsX55f2ab3a(raw)
      if (inspection.matchCount == 0) {
        throw InlineSubscriptionScheduleConfigurationItemBillingThresholdsX55f2ab3aNoMatchException("InlineSubscriptionScheduleConfigurationItemBillingThresholdsX55f2ab3a matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineSubscriptionScheduleConfigurationItemBillingThresholdsX55f2ab3a(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineSubscriptionScheduleConfigurationItemBillingThresholdsX55f2ab3a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSubscriptionScheduleConfigurationItemBillingThresholdsX55f2ab3a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSubscriptionScheduleConfigurationItemBillingThresholdsX55f2ab3a")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineSubscriptionScheduleConfigurationItemBillingThresholdsX55f2ab3a) {
      encoder.requireJsonEncoder("InlineSubscriptionScheduleConfigurationItemBillingThresholdsX55f2ab3a").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineSubscriptionScheduleConfigurationItemBillingThresholdsX55f2ab3a(element: JsonElement): InlineSubscriptionScheduleConfigurationItemBillingThresholdsX55f2ab3aInspection {
  val raw = element as? JsonObject ?: return InlineSubscriptionScheduleConfigurationItemBillingThresholdsX55f2ab3aInspection(
    matchesSubscriptionItemBillingThresholds = false,
    failures = listOf("SubscriptionItemBillingThresholds: expected JSON object"),
  )
  val matchesSubscriptionItemBillingThresholds = true
  return InlineSubscriptionScheduleConfigurationItemBillingThresholdsX55f2ab3aInspection(
    matchesSubscriptionItemBillingThresholds = matchesSubscriptionItemBillingThresholds,
    failures = buildList {
      if (!matchesSubscriptionItemBillingThresholds) add("SubscriptionItemBillingThresholds: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
