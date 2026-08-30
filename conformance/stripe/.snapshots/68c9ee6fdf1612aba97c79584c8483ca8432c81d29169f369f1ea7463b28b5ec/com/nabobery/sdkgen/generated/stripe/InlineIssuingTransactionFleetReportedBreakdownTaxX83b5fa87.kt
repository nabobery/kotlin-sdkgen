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

public enum class InlineIssuingTransactionFleetReportedBreakdownTaxX83b5fa87Branch {
  IssuingTransactionFleetTaxData,
}

public sealed class InlineIssuingTransactionFleetReportedBreakdownTaxX83b5fa87DecodingException(
  message: String,
) : SerializationException(message)

public class InlineIssuingTransactionFleetReportedBreakdownTaxX83b5fa87NoMatchException(
  message: String,
) : InlineIssuingTransactionFleetReportedBreakdownTaxX83b5fa87DecodingException(message)

internal data class InlineIssuingTransactionFleetReportedBreakdownTaxX83b5fa87Inspection(
  public val matchesIssuingTransactionFleetTaxData: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesIssuingTransactionFleetTaxData).count { it }
}

/**
 * Information about tax included in this transaction.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_transaction_fleet_reported_breakdown/properties/tax
 */
@Serializable(with = InlineIssuingTransactionFleetReportedBreakdownTaxX83b5fa87.Serializer::class)
public class InlineIssuingTransactionFleetReportedBreakdownTaxX83b5fa87 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineIssuingTransactionFleetReportedBreakdownTaxX83b5fa87Inspection,
) {
  public val issuingTransactionFleetTaxData: IssuingTransactionFleetTaxDataView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesIssuingTransactionFleetTaxData) json.decodeFromJsonElement<IssuingTransactionFleetTaxDataView>(raw) else null }

  public val matchedBranches: Set<InlineIssuingTransactionFleetReportedBreakdownTaxX83b5fa87Branch>
    get() = buildSet {
      if (inspection.matchesIssuingTransactionFleetTaxData) add(InlineIssuingTransactionFleetReportedBreakdownTaxX83b5fa87Branch.IssuingTransactionFleetTaxData)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineIssuingTransactionFleetReportedBreakdownTaxX83b5fa87 {
      val inspection = inspectInlineIssuingTransactionFleetReportedBreakdownTaxX83b5fa87(raw)
      if (inspection.matchCount == 0) {
        throw InlineIssuingTransactionFleetReportedBreakdownTaxX83b5fa87NoMatchException("InlineIssuingTransactionFleetReportedBreakdownTaxX83b5fa87 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineIssuingTransactionFleetReportedBreakdownTaxX83b5fa87(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingTransactionFleetReportedBreakdownTaxX83b5fa87> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineIssuingTransactionFleetReportedBreakdownTaxX83b5fa87 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineIssuingTransactionFleetReportedBreakdownTaxX83b5fa87")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineIssuingTransactionFleetReportedBreakdownTaxX83b5fa87) {
      encoder.requireJsonEncoder("InlineIssuingTransactionFleetReportedBreakdownTaxX83b5fa87").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineIssuingTransactionFleetReportedBreakdownTaxX83b5fa87(element: JsonElement): InlineIssuingTransactionFleetReportedBreakdownTaxX83b5fa87Inspection {
  val raw = element as? JsonObject ?: return InlineIssuingTransactionFleetReportedBreakdownTaxX83b5fa87Inspection(
    matchesIssuingTransactionFleetTaxData = false,
    failures = listOf("IssuingTransactionFleetTaxData: expected JSON object"),
  )
  val matchesIssuingTransactionFleetTaxData = true
  return InlineIssuingTransactionFleetReportedBreakdownTaxX83b5fa87Inspection(
    matchesIssuingTransactionFleetTaxData = matchesIssuingTransactionFleetTaxData,
    failures = buildList {
      if (!matchesIssuingTransactionFleetTaxData) add("IssuingTransactionFleetTaxData: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
