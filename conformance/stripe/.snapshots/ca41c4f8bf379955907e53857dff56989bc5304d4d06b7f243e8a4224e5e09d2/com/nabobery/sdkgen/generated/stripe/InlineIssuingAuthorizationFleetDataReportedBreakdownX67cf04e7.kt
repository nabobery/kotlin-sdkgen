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

public enum class InlineIssuingAuthorizationFleetDataReportedBreakdownX67cf04e7Branch {
  IssuingAuthorizationFleetReportedBreakdown,
}

public sealed class InlineIssuingAuthorizationFleetDataReportedBreakdownX67cf04e7DecodingException(
  message: String,
) : SerializationException(message)

public class InlineIssuingAuthorizationFleetDataReportedBreakdownX67cf04e7NoMatchException(
  message: String,
) : InlineIssuingAuthorizationFleetDataReportedBreakdownX67cf04e7DecodingException(message)

internal data class InlineIssuingAuthorizationFleetDataReportedBreakdownX67cf04e7Inspection(
  public val matchesIssuingAuthorizationFleetReportedBreakdown: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesIssuingAuthorizationFleetReportedBreakdown).count { it }
}

/**
 * More information about the total amount. Typically this information is received from the merchant after the
 * authorization has been approved and the fuel dispensed. This information is not guaranteed to be accurate as some
 * merchants may provide unreliable data.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/issuing_authorization_fleet_data/properties/reported_breakdown
 */
@Serializable(with = InlineIssuingAuthorizationFleetDataReportedBreakdownX67cf04e7.Serializer::class)
public class InlineIssuingAuthorizationFleetDataReportedBreakdownX67cf04e7 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineIssuingAuthorizationFleetDataReportedBreakdownX67cf04e7Inspection,
) {
  public val issuingAuthorizationFleetReportedBreakdown:
      IssuingAuthorizationFleetReportedBreakdownView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesIssuingAuthorizationFleetReportedBreakdown) json.decodeFromJsonElement<IssuingAuthorizationFleetReportedBreakdownView>(raw) else null }

  public val matchedBranches:
      Set<InlineIssuingAuthorizationFleetDataReportedBreakdownX67cf04e7Branch>
    get() = buildSet {
      if (inspection.matchesIssuingAuthorizationFleetReportedBreakdown) add(InlineIssuingAuthorizationFleetDataReportedBreakdownX67cf04e7Branch.IssuingAuthorizationFleetReportedBreakdown)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineIssuingAuthorizationFleetDataReportedBreakdownX67cf04e7 {
      val inspection = inspectInlineIssuingAuthorizationFleetDataReportedBreakdownX67cf04e7(raw)
      if (inspection.matchCount == 0) {
        throw InlineIssuingAuthorizationFleetDataReportedBreakdownX67cf04e7NoMatchException("InlineIssuingAuthorizationFleetDataReportedBreakdownX67cf04e7 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineIssuingAuthorizationFleetDataReportedBreakdownX67cf04e7(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingAuthorizationFleetDataReportedBreakdownX67cf04e7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineIssuingAuthorizationFleetDataReportedBreakdownX67cf04e7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineIssuingAuthorizationFleetDataReportedBreakdownX67cf04e7")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineIssuingAuthorizationFleetDataReportedBreakdownX67cf04e7) {
      encoder.requireJsonEncoder("InlineIssuingAuthorizationFleetDataReportedBreakdownX67cf04e7").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineIssuingAuthorizationFleetDataReportedBreakdownX67cf04e7(element: JsonElement): InlineIssuingAuthorizationFleetDataReportedBreakdownX67cf04e7Inspection {
  val raw = element as? JsonObject ?: return InlineIssuingAuthorizationFleetDataReportedBreakdownX67cf04e7Inspection(
    matchesIssuingAuthorizationFleetReportedBreakdown = false,
    failures = listOf("IssuingAuthorizationFleetReportedBreakdown: expected JSON object"),
  )
  val matchesIssuingAuthorizationFleetReportedBreakdown = true
  return InlineIssuingAuthorizationFleetDataReportedBreakdownX67cf04e7Inspection(
    matchesIssuingAuthorizationFleetReportedBreakdown = matchesIssuingAuthorizationFleetReportedBreakdown,
    failures = buildList {
      if (!matchesIssuingAuthorizationFleetReportedBreakdown) add("IssuingAuthorizationFleetReportedBreakdown: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
