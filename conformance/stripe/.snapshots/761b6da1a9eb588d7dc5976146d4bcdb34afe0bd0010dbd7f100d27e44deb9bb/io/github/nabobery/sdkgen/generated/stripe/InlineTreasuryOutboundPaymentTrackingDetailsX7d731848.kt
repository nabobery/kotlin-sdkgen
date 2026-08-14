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

public enum class InlineTreasuryOutboundPaymentTrackingDetailsX7d731848Branch {
  TreasuryOutboundPaymentsResourceOutboundPaymentResourceTrackingDetails,
}

public sealed class InlineTreasuryOutboundPaymentTrackingDetailsX7d731848DecodingException(
  message: String,
) : SerializationException(message)

public class InlineTreasuryOutboundPaymentTrackingDetailsX7d731848NoMatchException(
  message: String,
) : InlineTreasuryOutboundPaymentTrackingDetailsX7d731848DecodingException(message)

internal data class InlineTreasuryOutboundPaymentTrackingDetailsX7d731848Inspection(
  public val matchesTreasuryOutboundPaymentsResourceOutboundPaymentResourceTrackingDetails: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesTreasuryOutboundPaymentsResourceOutboundPaymentResourceTrackingDetails).count { it }
}

/**
 * Details about network-specific tracking information if available.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury.outbound_payment/properties/tracking_details
 */
@Serializable(with = InlineTreasuryOutboundPaymentTrackingDetailsX7d731848.Serializer::class)
public class InlineTreasuryOutboundPaymentTrackingDetailsX7d731848 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineTreasuryOutboundPaymentTrackingDetailsX7d731848Inspection,
) {
  public val treasuryOutboundPaymentsResourceOutboundPaymentResourceTrackingDetails:
      TreasuryOutboundPaymentsResourceOutboundPaymentResourceTrackingDetailsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesTreasuryOutboundPaymentsResourceOutboundPaymentResourceTrackingDetails) json.decodeFromJsonElement<TreasuryOutboundPaymentsResourceOutboundPaymentResourceTrackingDetailsView>(raw) else null }

  public val matchedBranches: Set<InlineTreasuryOutboundPaymentTrackingDetailsX7d731848Branch>
    get() = buildSet {
      if (inspection.matchesTreasuryOutboundPaymentsResourceOutboundPaymentResourceTrackingDetails) add(InlineTreasuryOutboundPaymentTrackingDetailsX7d731848Branch.TreasuryOutboundPaymentsResourceOutboundPaymentResourceTrackingDetails)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineTreasuryOutboundPaymentTrackingDetailsX7d731848 {
      val inspection = inspectInlineTreasuryOutboundPaymentTrackingDetailsX7d731848(raw)
      if (inspection.matchCount == 0) {
        throw InlineTreasuryOutboundPaymentTrackingDetailsX7d731848NoMatchException("InlineTreasuryOutboundPaymentTrackingDetailsX7d731848 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineTreasuryOutboundPaymentTrackingDetailsX7d731848(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineTreasuryOutboundPaymentTrackingDetailsX7d731848> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineTreasuryOutboundPaymentTrackingDetailsX7d731848 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineTreasuryOutboundPaymentTrackingDetailsX7d731848")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineTreasuryOutboundPaymentTrackingDetailsX7d731848) {
      encoder.requireJsonEncoder("InlineTreasuryOutboundPaymentTrackingDetailsX7d731848").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineTreasuryOutboundPaymentTrackingDetailsX7d731848(element: JsonElement): InlineTreasuryOutboundPaymentTrackingDetailsX7d731848Inspection {
  val raw = element as? JsonObject ?: return InlineTreasuryOutboundPaymentTrackingDetailsX7d731848Inspection(
    matchesTreasuryOutboundPaymentsResourceOutboundPaymentResourceTrackingDetails = false,
    failures = listOf("TreasuryOutboundPaymentsResourceOutboundPaymentResourceTrackingDetails: expected JSON object"),
  )
  val matchesTreasuryOutboundPaymentsResourceOutboundPaymentResourceTrackingDetails = raw["type"] != null
  return InlineTreasuryOutboundPaymentTrackingDetailsX7d731848Inspection(
    matchesTreasuryOutboundPaymentsResourceOutboundPaymentResourceTrackingDetails = matchesTreasuryOutboundPaymentsResourceOutboundPaymentResourceTrackingDetails,
    failures = buildList {
      if (!matchesTreasuryOutboundPaymentsResourceOutboundPaymentResourceTrackingDetails) add("TreasuryOutboundPaymentsResourceOutboundPaymentResourceTrackingDetails: required properties 'type' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
