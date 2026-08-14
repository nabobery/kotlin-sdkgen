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

public enum class InlineIssuingAuthorizationFleetReportedBreakdownFuelXad619ce1Branch {
  IssuingAuthorizationFleetFuelPriceData,
}

public sealed class InlineIssuingAuthorizationFleetReportedBreakdownFuelXad619ce1DecodingException(
  message: String,
) : SerializationException(message)

public class InlineIssuingAuthorizationFleetReportedBreakdownFuelXad619ce1NoMatchException(
  message: String,
) : InlineIssuingAuthorizationFleetReportedBreakdownFuelXad619ce1DecodingException(message)

internal data class InlineIssuingAuthorizationFleetReportedBreakdownFuelXad619ce1Inspection(
  public val matchesIssuingAuthorizationFleetFuelPriceData: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesIssuingAuthorizationFleetFuelPriceData).count { it }
}

/**
 * Breakdown of fuel portion of the purchase.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/issuing_authorization_fleet_reported_breakdown/properties/fuel
 */
@Serializable(with = InlineIssuingAuthorizationFleetReportedBreakdownFuelXad619ce1.Serializer::class)
public class InlineIssuingAuthorizationFleetReportedBreakdownFuelXad619ce1 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineIssuingAuthorizationFleetReportedBreakdownFuelXad619ce1Inspection,
) {
  public val issuingAuthorizationFleetFuelPriceData: IssuingAuthorizationFleetFuelPriceDataView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesIssuingAuthorizationFleetFuelPriceData) json.decodeFromJsonElement<IssuingAuthorizationFleetFuelPriceDataView>(raw) else null }

  public val matchedBranches:
      Set<InlineIssuingAuthorizationFleetReportedBreakdownFuelXad619ce1Branch>
    get() = buildSet {
      if (inspection.matchesIssuingAuthorizationFleetFuelPriceData) add(InlineIssuingAuthorizationFleetReportedBreakdownFuelXad619ce1Branch.IssuingAuthorizationFleetFuelPriceData)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineIssuingAuthorizationFleetReportedBreakdownFuelXad619ce1 {
      val inspection = inspectInlineIssuingAuthorizationFleetReportedBreakdownFuelXad619ce1(raw)
      if (inspection.matchCount == 0) {
        throw InlineIssuingAuthorizationFleetReportedBreakdownFuelXad619ce1NoMatchException("InlineIssuingAuthorizationFleetReportedBreakdownFuelXad619ce1 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineIssuingAuthorizationFleetReportedBreakdownFuelXad619ce1(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingAuthorizationFleetReportedBreakdownFuelXad619ce1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineIssuingAuthorizationFleetReportedBreakdownFuelXad619ce1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineIssuingAuthorizationFleetReportedBreakdownFuelXad619ce1")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineIssuingAuthorizationFleetReportedBreakdownFuelXad619ce1) {
      encoder.requireJsonEncoder("InlineIssuingAuthorizationFleetReportedBreakdownFuelXad619ce1").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineIssuingAuthorizationFleetReportedBreakdownFuelXad619ce1(element: JsonElement): InlineIssuingAuthorizationFleetReportedBreakdownFuelXad619ce1Inspection {
  val raw = element as? JsonObject ?: return InlineIssuingAuthorizationFleetReportedBreakdownFuelXad619ce1Inspection(
    matchesIssuingAuthorizationFleetFuelPriceData = false,
    failures = listOf("IssuingAuthorizationFleetFuelPriceData: expected JSON object"),
  )
  val matchesIssuingAuthorizationFleetFuelPriceData = true
  return InlineIssuingAuthorizationFleetReportedBreakdownFuelXad619ce1Inspection(
    matchesIssuingAuthorizationFleetFuelPriceData = matchesIssuingAuthorizationFleetFuelPriceData,
    failures = buildList {
      if (!matchesIssuingAuthorizationFleetFuelPriceData) add("IssuingAuthorizationFleetFuelPriceData: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
