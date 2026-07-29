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

public enum class InlineSubscriptionSchedulePhaseConfigurationBillingThresholdsXe926a827Branch {
  SubscriptionBillingThresholds,
}

public sealed class InlineSubscriptionSchedulePhaseConfigurationBillingThresholdsXe926a827DecodingException(
  message: String,
) : SerializationException(message)

public class InlineSubscriptionSchedulePhaseConfigurationBillingThresholdsXe926a827NoMatchException(
  message: String,
) : InlineSubscriptionSchedulePhaseConfigurationBillingThresholdsXe926a827DecodingException(message)

internal data class InlineSubscriptionSchedulePhaseConfigurationBillingThresholdsXe926a827Inspection(
  public val matchesSubscriptionBillingThresholds: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesSubscriptionBillingThresholds).count { it }
}

/**
 * Define thresholds at which an invoice will be sent, and the subscription advanced to a new billing period
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/subscription_schedule_phase_configuration/properties/billing_thresho
 * lds
 */
@Serializable(with = InlineSubscriptionSchedulePhaseConfigurationBillingThresholdsXe926a827.Serializer::class)
public class InlineSubscriptionSchedulePhaseConfigurationBillingThresholdsXe926a827 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineSubscriptionSchedulePhaseConfigurationBillingThresholdsXe926a827Inspection,
) {
  public val subscriptionBillingThresholds: SubscriptionBillingThresholdsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesSubscriptionBillingThresholds) json.decodeFromJsonElement<SubscriptionBillingThresholdsView>(raw) else null }

  public val matchedBranches:
      Set<InlineSubscriptionSchedulePhaseConfigurationBillingThresholdsXe926a827Branch>
    get() = buildSet {
      if (inspection.matchesSubscriptionBillingThresholds) add(InlineSubscriptionSchedulePhaseConfigurationBillingThresholdsXe926a827Branch.SubscriptionBillingThresholds)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineSubscriptionSchedulePhaseConfigurationBillingThresholdsXe926a827 {
      val inspection = inspectInlineSubscriptionSchedulePhaseConfigurationBillingThresholdsXe926a827(raw)
      if (inspection.matchCount == 0) {
        throw InlineSubscriptionSchedulePhaseConfigurationBillingThresholdsXe926a827NoMatchException("InlineSubscriptionSchedulePhaseConfigurationBillingThresholdsXe926a827 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineSubscriptionSchedulePhaseConfigurationBillingThresholdsXe926a827(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineSubscriptionSchedulePhaseConfigurationBillingThresholdsXe926a827> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSubscriptionSchedulePhaseConfigurationBillingThresholdsXe926a827 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSubscriptionSchedulePhaseConfigurationBillingThresholdsXe926a827")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineSubscriptionSchedulePhaseConfigurationBillingThresholdsXe926a827) {
      encoder.requireJsonEncoder("InlineSubscriptionSchedulePhaseConfigurationBillingThresholdsXe926a827").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineSubscriptionSchedulePhaseConfigurationBillingThresholdsXe926a827(element: JsonElement): InlineSubscriptionSchedulePhaseConfigurationBillingThresholdsXe926a827Inspection {
  val raw = element as? JsonObject ?: return InlineSubscriptionSchedulePhaseConfigurationBillingThresholdsXe926a827Inspection(
    matchesSubscriptionBillingThresholds = false,
    failures = listOf("SubscriptionBillingThresholds: expected JSON object"),
  )
  val matchesSubscriptionBillingThresholds = true
  return InlineSubscriptionSchedulePhaseConfigurationBillingThresholdsXe926a827Inspection(
    matchesSubscriptionBillingThresholds = matchesSubscriptionBillingThresholds,
    failures = buildList {
      if (!matchesSubscriptionBillingThresholds) add("SubscriptionBillingThresholds: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
