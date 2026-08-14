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

public enum class InlineIssuingAuthorizationFleetReportedBreakdownTaxX7563a019Branch {
  IssuingAuthorizationFleetTaxData,
}

public sealed class InlineIssuingAuthorizationFleetReportedBreakdownTaxX7563a019DecodingException(
  message: String,
) : SerializationException(message)

public class InlineIssuingAuthorizationFleetReportedBreakdownTaxX7563a019NoMatchException(
  message: String,
) : InlineIssuingAuthorizationFleetReportedBreakdownTaxX7563a019DecodingException(message)

internal data class InlineIssuingAuthorizationFleetReportedBreakdownTaxX7563a019Inspection(
  public val matchesIssuingAuthorizationFleetTaxData: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesIssuingAuthorizationFleetTaxData).count { it }
}

/**
 * Information about tax included in this transaction.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/issuing_authorization_fleet_reported_breakdown/properties/tax
 */
@Serializable(with = InlineIssuingAuthorizationFleetReportedBreakdownTaxX7563a019.Serializer::class)
public class InlineIssuingAuthorizationFleetReportedBreakdownTaxX7563a019 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineIssuingAuthorizationFleetReportedBreakdownTaxX7563a019Inspection,
) {
  public val issuingAuthorizationFleetTaxData: IssuingAuthorizationFleetTaxDataView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesIssuingAuthorizationFleetTaxData) json.decodeFromJsonElement<IssuingAuthorizationFleetTaxDataView>(raw) else null }

  public val matchedBranches:
      Set<InlineIssuingAuthorizationFleetReportedBreakdownTaxX7563a019Branch>
    get() = buildSet {
      if (inspection.matchesIssuingAuthorizationFleetTaxData) add(InlineIssuingAuthorizationFleetReportedBreakdownTaxX7563a019Branch.IssuingAuthorizationFleetTaxData)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineIssuingAuthorizationFleetReportedBreakdownTaxX7563a019 {
      val inspection = inspectInlineIssuingAuthorizationFleetReportedBreakdownTaxX7563a019(raw)
      if (inspection.matchCount == 0) {
        throw InlineIssuingAuthorizationFleetReportedBreakdownTaxX7563a019NoMatchException("InlineIssuingAuthorizationFleetReportedBreakdownTaxX7563a019 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineIssuingAuthorizationFleetReportedBreakdownTaxX7563a019(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingAuthorizationFleetReportedBreakdownTaxX7563a019> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineIssuingAuthorizationFleetReportedBreakdownTaxX7563a019 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineIssuingAuthorizationFleetReportedBreakdownTaxX7563a019")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineIssuingAuthorizationFleetReportedBreakdownTaxX7563a019) {
      encoder.requireJsonEncoder("InlineIssuingAuthorizationFleetReportedBreakdownTaxX7563a019").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineIssuingAuthorizationFleetReportedBreakdownTaxX7563a019(element: JsonElement): InlineIssuingAuthorizationFleetReportedBreakdownTaxX7563a019Inspection {
  val raw = element as? JsonObject ?: return InlineIssuingAuthorizationFleetReportedBreakdownTaxX7563a019Inspection(
    matchesIssuingAuthorizationFleetTaxData = false,
    failures = listOf("IssuingAuthorizationFleetTaxData: expected JSON object"),
  )
  val matchesIssuingAuthorizationFleetTaxData = true
  return InlineIssuingAuthorizationFleetReportedBreakdownTaxX7563a019Inspection(
    matchesIssuingAuthorizationFleetTaxData = matchesIssuingAuthorizationFleetTaxData,
    failures = buildList {
      if (!matchesIssuingAuthorizationFleetTaxData) add("IssuingAuthorizationFleetTaxData: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
