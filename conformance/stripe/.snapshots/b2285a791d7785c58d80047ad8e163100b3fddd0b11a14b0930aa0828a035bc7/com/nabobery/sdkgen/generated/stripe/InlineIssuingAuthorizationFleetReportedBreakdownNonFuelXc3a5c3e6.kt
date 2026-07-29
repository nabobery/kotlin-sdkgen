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

public enum class InlineIssuingAuthorizationFleetReportedBreakdownNonFuelXc3a5c3e6Branch {
  IssuingAuthorizationFleetNonFuelPriceData,
}

public sealed class InlineIssuingAuthorizationFleetReportedBreakdownNonFuelXc3a5c3e6DecodingException(
  message: String,
) : SerializationException(message)

public class InlineIssuingAuthorizationFleetReportedBreakdownNonFuelXc3a5c3e6NoMatchException(
  message: String,
) : InlineIssuingAuthorizationFleetReportedBreakdownNonFuelXc3a5c3e6DecodingException(message)

internal data class InlineIssuingAuthorizationFleetReportedBreakdownNonFuelXc3a5c3e6Inspection(
  public val matchesIssuingAuthorizationFleetNonFuelPriceData: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesIssuingAuthorizationFleetNonFuelPriceData).count { it }
}

/**
 * Breakdown of non-fuel portion of the purchase.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/issuing_authorization_fleet_reported_breakdown/properties/non_fuel
 */
@Serializable(with = InlineIssuingAuthorizationFleetReportedBreakdownNonFuelXc3a5c3e6.Serializer::class)
public class InlineIssuingAuthorizationFleetReportedBreakdownNonFuelXc3a5c3e6 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineIssuingAuthorizationFleetReportedBreakdownNonFuelXc3a5c3e6Inspection,
) {
  public val issuingAuthorizationFleetNonFuelPriceData:
      IssuingAuthorizationFleetNonFuelPriceDataView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesIssuingAuthorizationFleetNonFuelPriceData) json.decodeFromJsonElement<IssuingAuthorizationFleetNonFuelPriceDataView>(raw) else null }

  public val matchedBranches:
      Set<InlineIssuingAuthorizationFleetReportedBreakdownNonFuelXc3a5c3e6Branch>
    get() = buildSet {
      if (inspection.matchesIssuingAuthorizationFleetNonFuelPriceData) add(InlineIssuingAuthorizationFleetReportedBreakdownNonFuelXc3a5c3e6Branch.IssuingAuthorizationFleetNonFuelPriceData)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineIssuingAuthorizationFleetReportedBreakdownNonFuelXc3a5c3e6 {
      val inspection = inspectInlineIssuingAuthorizationFleetReportedBreakdownNonFuelXc3a5c3e6(raw)
      if (inspection.matchCount == 0) {
        throw InlineIssuingAuthorizationFleetReportedBreakdownNonFuelXc3a5c3e6NoMatchException("InlineIssuingAuthorizationFleetReportedBreakdownNonFuelXc3a5c3e6 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineIssuingAuthorizationFleetReportedBreakdownNonFuelXc3a5c3e6(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineIssuingAuthorizationFleetReportedBreakdownNonFuelXc3a5c3e6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineIssuingAuthorizationFleetReportedBreakdownNonFuelXc3a5c3e6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineIssuingAuthorizationFleetReportedBreakdownNonFuelXc3a5c3e6")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineIssuingAuthorizationFleetReportedBreakdownNonFuelXc3a5c3e6) {
      encoder.requireJsonEncoder("InlineIssuingAuthorizationFleetReportedBreakdownNonFuelXc3a5c3e6").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineIssuingAuthorizationFleetReportedBreakdownNonFuelXc3a5c3e6(element: JsonElement): InlineIssuingAuthorizationFleetReportedBreakdownNonFuelXc3a5c3e6Inspection {
  val raw = element as? JsonObject ?: return InlineIssuingAuthorizationFleetReportedBreakdownNonFuelXc3a5c3e6Inspection(
    matchesIssuingAuthorizationFleetNonFuelPriceData = false,
    failures = listOf("IssuingAuthorizationFleetNonFuelPriceData: expected JSON object"),
  )
  val matchesIssuingAuthorizationFleetNonFuelPriceData = true
  return InlineIssuingAuthorizationFleetReportedBreakdownNonFuelXc3a5c3e6Inspection(
    matchesIssuingAuthorizationFleetNonFuelPriceData = matchesIssuingAuthorizationFleetNonFuelPriceData,
    failures = buildList {
      if (!matchesIssuingAuthorizationFleetNonFuelPriceData) add("IssuingAuthorizationFleetNonFuelPriceData: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
