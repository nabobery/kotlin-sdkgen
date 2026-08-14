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

public enum class InlineIssuingTransactionFleetReportedBreakdownNonFuelX564913e3Branch {
  IssuingTransactionFleetNonFuelPriceData,
}

public sealed class InlineIssuingTransactionFleetReportedBreakdownNonFuelX564913e3DecodingException(
  message: String,
) : SerializationException(message)

public class InlineIssuingTransactionFleetReportedBreakdownNonFuelX564913e3NoMatchException(
  message: String,
) : InlineIssuingTransactionFleetReportedBreakdownNonFuelX564913e3DecodingException(message)

internal data class InlineIssuingTransactionFleetReportedBreakdownNonFuelX564913e3Inspection(
  public val matchesIssuingTransactionFleetNonFuelPriceData: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesIssuingTransactionFleetNonFuelPriceData).count { it }
}

/**
 * Breakdown of non-fuel portion of the purchase.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/issuing_transaction_fleet_reported_breakdown/properties/non_fuel
 */
@Serializable(with = InlineIssuingTransactionFleetReportedBreakdownNonFuelX564913e3.Serializer::class)
public class InlineIssuingTransactionFleetReportedBreakdownNonFuelX564913e3 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineIssuingTransactionFleetReportedBreakdownNonFuelX564913e3Inspection,
) {
  public val issuingTransactionFleetNonFuelPriceData: IssuingTransactionFleetNonFuelPriceDataView?
      by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesIssuingTransactionFleetNonFuelPriceData) json.decodeFromJsonElement<IssuingTransactionFleetNonFuelPriceDataView>(raw) else null }

  public val matchedBranches:
      Set<InlineIssuingTransactionFleetReportedBreakdownNonFuelX564913e3Branch>
    get() = buildSet {
      if (inspection.matchesIssuingTransactionFleetNonFuelPriceData) add(InlineIssuingTransactionFleetReportedBreakdownNonFuelX564913e3Branch.IssuingTransactionFleetNonFuelPriceData)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineIssuingTransactionFleetReportedBreakdownNonFuelX564913e3 {
      val inspection = inspectInlineIssuingTransactionFleetReportedBreakdownNonFuelX564913e3(raw)
      if (inspection.matchCount == 0) {
        throw InlineIssuingTransactionFleetReportedBreakdownNonFuelX564913e3NoMatchException("InlineIssuingTransactionFleetReportedBreakdownNonFuelX564913e3 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineIssuingTransactionFleetReportedBreakdownNonFuelX564913e3(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingTransactionFleetReportedBreakdownNonFuelX564913e3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineIssuingTransactionFleetReportedBreakdownNonFuelX564913e3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineIssuingTransactionFleetReportedBreakdownNonFuelX564913e3")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineIssuingTransactionFleetReportedBreakdownNonFuelX564913e3) {
      encoder.requireJsonEncoder("InlineIssuingTransactionFleetReportedBreakdownNonFuelX564913e3").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineIssuingTransactionFleetReportedBreakdownNonFuelX564913e3(element: JsonElement): InlineIssuingTransactionFleetReportedBreakdownNonFuelX564913e3Inspection {
  val raw = element as? JsonObject ?: return InlineIssuingTransactionFleetReportedBreakdownNonFuelX564913e3Inspection(
    matchesIssuingTransactionFleetNonFuelPriceData = false,
    failures = listOf("IssuingTransactionFleetNonFuelPriceData: expected JSON object"),
  )
  val matchesIssuingTransactionFleetNonFuelPriceData = true
  return InlineIssuingTransactionFleetReportedBreakdownNonFuelX564913e3Inspection(
    matchesIssuingTransactionFleetNonFuelPriceData = matchesIssuingTransactionFleetNonFuelPriceData,
    failures = buildList {
      if (!matchesIssuingTransactionFleetNonFuelPriceData) add("IssuingTransactionFleetNonFuelPriceData: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
