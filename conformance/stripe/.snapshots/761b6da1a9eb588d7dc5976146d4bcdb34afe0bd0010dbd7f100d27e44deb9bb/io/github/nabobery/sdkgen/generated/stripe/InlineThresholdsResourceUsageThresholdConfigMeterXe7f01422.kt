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

public enum class InlineThresholdsResourceUsageThresholdConfigMeterXe7f01422Branch {
  Branch1,
  BillingMeter,
}

public sealed class InlineThresholdsResourceUsageThresholdConfigMeterXe7f01422DecodingException(
  message: String,
) : SerializationException(message)

public class InlineThresholdsResourceUsageThresholdConfigMeterXe7f01422NoMatchException(
  message: String,
) : InlineThresholdsResourceUsageThresholdConfigMeterXe7f01422DecodingException(message)

internal data class InlineThresholdsResourceUsageThresholdConfigMeterXe7f01422Inspection(
  public val matchesBranch1: Boolean,
  public val matchesBillingMeter: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesBillingMeter).count { it }
}

/**
 * The [Billing Meter](/api/billing/meter) ID whose usage is monitored.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/thresholds_resource_usage_threshold_config/properties/meter
 */
@Serializable(with = InlineThresholdsResourceUsageThresholdConfigMeterXe7f01422.Serializer::class)
public class InlineThresholdsResourceUsageThresholdConfigMeterXe7f01422 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineThresholdsResourceUsageThresholdConfigMeterXe7f01422Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val billingMeter: BillingMeter? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBillingMeter) json.decodeFromJsonElement<BillingMeter>(raw) else null }

  public val matchedBranches: Set<InlineThresholdsResourceUsageThresholdConfigMeterXe7f01422Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineThresholdsResourceUsageThresholdConfigMeterXe7f01422Branch.Branch1)
      if (inspection.matchesBillingMeter) add(InlineThresholdsResourceUsageThresholdConfigMeterXe7f01422Branch.BillingMeter)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineThresholdsResourceUsageThresholdConfigMeterXe7f01422 {
      val inspection = inspectInlineThresholdsResourceUsageThresholdConfigMeterXe7f01422(raw)
      if (inspection.matchCount == 0) {
        throw InlineThresholdsResourceUsageThresholdConfigMeterXe7f01422NoMatchException("InlineThresholdsResourceUsageThresholdConfigMeterXe7f01422 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineThresholdsResourceUsageThresholdConfigMeterXe7f01422(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineThresholdsResourceUsageThresholdConfigMeterXe7f01422> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineThresholdsResourceUsageThresholdConfigMeterXe7f01422 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineThresholdsResourceUsageThresholdConfigMeterXe7f01422")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineThresholdsResourceUsageThresholdConfigMeterXe7f01422) {
      encoder.requireJsonEncoder("InlineThresholdsResourceUsageThresholdConfigMeterXe7f01422").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineThresholdsResourceUsageThresholdConfigMeterXe7f01422(element: JsonElement): InlineThresholdsResourceUsageThresholdConfigMeterXe7f01422Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesBillingMeter = element.isJsonDecodable<BillingMeter>()
  return InlineThresholdsResourceUsageThresholdConfigMeterXe7f01422Inspection(
    matchesBranch1 = matchesBranch1,
    matchesBillingMeter = matchesBillingMeter,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesBillingMeter) add("BillingMeter: value does not match BillingMeter")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
