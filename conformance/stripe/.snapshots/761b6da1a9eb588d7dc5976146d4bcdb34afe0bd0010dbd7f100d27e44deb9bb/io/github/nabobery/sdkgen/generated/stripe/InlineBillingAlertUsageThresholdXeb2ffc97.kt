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

public enum class InlineBillingAlertUsageThresholdXeb2ffc97Branch {
  ThresholdsResourceUsageThresholdConfig,
}

public sealed class InlineBillingAlertUsageThresholdXeb2ffc97DecodingException(
  message: String,
) : SerializationException(message)

public class InlineBillingAlertUsageThresholdXeb2ffc97NoMatchException(
  message: String,
) : InlineBillingAlertUsageThresholdXeb2ffc97DecodingException(message)

internal data class InlineBillingAlertUsageThresholdXeb2ffc97Inspection(
  public val matchesThresholdsResourceUsageThresholdConfig: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesThresholdsResourceUsageThresholdConfig).count { it }
}

/**
 * Encapsulates configuration of the alert to monitor usage on a specific [Billing
 * Meter](https://docs.stripe.com/api/billing/meter).
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/billing.alert/properties/usage_threshold
 */
@Serializable(with = InlineBillingAlertUsageThresholdXeb2ffc97.Serializer::class)
public class InlineBillingAlertUsageThresholdXeb2ffc97 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineBillingAlertUsageThresholdXeb2ffc97Inspection,
) {
  public val thresholdsResourceUsageThresholdConfig: ThresholdsResourceUsageThresholdConfigView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesThresholdsResourceUsageThresholdConfig) json.decodeFromJsonElement<ThresholdsResourceUsageThresholdConfigView>(raw) else null }

  public val matchedBranches: Set<InlineBillingAlertUsageThresholdXeb2ffc97Branch>
    get() = buildSet {
      if (inspection.matchesThresholdsResourceUsageThresholdConfig) add(InlineBillingAlertUsageThresholdXeb2ffc97Branch.ThresholdsResourceUsageThresholdConfig)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineBillingAlertUsageThresholdXeb2ffc97 {
      val inspection = inspectInlineBillingAlertUsageThresholdXeb2ffc97(raw)
      if (inspection.matchCount == 0) {
        throw InlineBillingAlertUsageThresholdXeb2ffc97NoMatchException("InlineBillingAlertUsageThresholdXeb2ffc97 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineBillingAlertUsageThresholdXeb2ffc97(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineBillingAlertUsageThresholdXeb2ffc97> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineBillingAlertUsageThresholdXeb2ffc97 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineBillingAlertUsageThresholdXeb2ffc97")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineBillingAlertUsageThresholdXeb2ffc97) {
      encoder.requireJsonEncoder("InlineBillingAlertUsageThresholdXeb2ffc97").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineBillingAlertUsageThresholdXeb2ffc97(element: JsonElement): InlineBillingAlertUsageThresholdXeb2ffc97Inspection {
  val raw = element as? JsonObject ?: return InlineBillingAlertUsageThresholdXeb2ffc97Inspection(
    matchesThresholdsResourceUsageThresholdConfig = false,
    failures = listOf("ThresholdsResourceUsageThresholdConfig: expected JSON object"),
  )
  val matchesThresholdsResourceUsageThresholdConfig = raw["gte"] != null && raw["meter"] != null && raw["recurrence"] != null
  return InlineBillingAlertUsageThresholdXeb2ffc97Inspection(
    matchesThresholdsResourceUsageThresholdConfig = matchesThresholdsResourceUsageThresholdConfig,
    failures = buildList {
      if (!matchesThresholdsResourceUsageThresholdConfig) add("ThresholdsResourceUsageThresholdConfig: required properties 'gte', 'meter', 'recurrence' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
