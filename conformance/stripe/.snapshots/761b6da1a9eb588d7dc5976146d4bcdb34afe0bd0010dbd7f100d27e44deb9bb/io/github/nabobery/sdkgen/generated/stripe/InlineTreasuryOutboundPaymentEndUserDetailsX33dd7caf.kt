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

public enum class InlineTreasuryOutboundPaymentEndUserDetailsX33dd7cafBranch {
  TreasuryOutboundPaymentsResourceOutboundPaymentResourceEndUserDetails,
}

public sealed class InlineTreasuryOutboundPaymentEndUserDetailsX33dd7cafDecodingException(
  message: String,
) : SerializationException(message)

public class InlineTreasuryOutboundPaymentEndUserDetailsX33dd7cafNoMatchException(
  message: String,
) : InlineTreasuryOutboundPaymentEndUserDetailsX33dd7cafDecodingException(message)

internal data class InlineTreasuryOutboundPaymentEndUserDetailsX33dd7cafInspection(
  public val matchesTreasuryOutboundPaymentsResourceOutboundPaymentResourceEndUserDetails: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesTreasuryOutboundPaymentsResourceOutboundPaymentResourceEndUserDetails).count { it }
}

/**
 * Details about the end user.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury.outbound_payment/properties/end_user_details
 */
@Serializable(with = InlineTreasuryOutboundPaymentEndUserDetailsX33dd7caf.Serializer::class)
public class InlineTreasuryOutboundPaymentEndUserDetailsX33dd7caf internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineTreasuryOutboundPaymentEndUserDetailsX33dd7cafInspection,
) {
  public val treasuryOutboundPaymentsResourceOutboundPaymentResourceEndUserDetails:
      TreasuryOutboundPaymentsResourceOutboundPaymentResourceEndUserDetailsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesTreasuryOutboundPaymentsResourceOutboundPaymentResourceEndUserDetails) json.decodeFromJsonElement<TreasuryOutboundPaymentsResourceOutboundPaymentResourceEndUserDetailsView>(raw) else null }

  public val matchedBranches: Set<InlineTreasuryOutboundPaymentEndUserDetailsX33dd7cafBranch>
    get() = buildSet {
      if (inspection.matchesTreasuryOutboundPaymentsResourceOutboundPaymentResourceEndUserDetails) add(InlineTreasuryOutboundPaymentEndUserDetailsX33dd7cafBranch.TreasuryOutboundPaymentsResourceOutboundPaymentResourceEndUserDetails)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineTreasuryOutboundPaymentEndUserDetailsX33dd7caf {
      val inspection = inspectInlineTreasuryOutboundPaymentEndUserDetailsX33dd7caf(raw)
      if (inspection.matchCount == 0) {
        throw InlineTreasuryOutboundPaymentEndUserDetailsX33dd7cafNoMatchException("InlineTreasuryOutboundPaymentEndUserDetailsX33dd7caf matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineTreasuryOutboundPaymentEndUserDetailsX33dd7caf(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineTreasuryOutboundPaymentEndUserDetailsX33dd7caf> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineTreasuryOutboundPaymentEndUserDetailsX33dd7caf {
      val jsonDecoder = decoder.requireJsonDecoder("InlineTreasuryOutboundPaymentEndUserDetailsX33dd7caf")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineTreasuryOutboundPaymentEndUserDetailsX33dd7caf) {
      encoder.requireJsonEncoder("InlineTreasuryOutboundPaymentEndUserDetailsX33dd7caf").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineTreasuryOutboundPaymentEndUserDetailsX33dd7caf(element: JsonElement): InlineTreasuryOutboundPaymentEndUserDetailsX33dd7cafInspection {
  val raw = element as? JsonObject ?: return InlineTreasuryOutboundPaymentEndUserDetailsX33dd7cafInspection(
    matchesTreasuryOutboundPaymentsResourceOutboundPaymentResourceEndUserDetails = false,
    failures = listOf("TreasuryOutboundPaymentsResourceOutboundPaymentResourceEndUserDetails: expected JSON object"),
  )
  val matchesTreasuryOutboundPaymentsResourceOutboundPaymentResourceEndUserDetails = raw["present"] != null
  return InlineTreasuryOutboundPaymentEndUserDetailsX33dd7cafInspection(
    matchesTreasuryOutboundPaymentsResourceOutboundPaymentResourceEndUserDetails = matchesTreasuryOutboundPaymentsResourceOutboundPaymentResourceEndUserDetails,
    failures = buildList {
      if (!matchesTreasuryOutboundPaymentsResourceOutboundPaymentResourceEndUserDetails) add("TreasuryOutboundPaymentsResourceOutboundPaymentResourceEndUserDetails: required properties 'present' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
