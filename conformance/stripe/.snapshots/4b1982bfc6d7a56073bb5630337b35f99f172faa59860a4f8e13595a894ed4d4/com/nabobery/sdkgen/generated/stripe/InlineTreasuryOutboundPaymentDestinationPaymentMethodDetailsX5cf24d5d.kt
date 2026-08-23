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

public enum class InlineTreasuryOutboundPaymentDestinationPaymentMethodDetailsX5cf24d5dBranch {
  OutboundPaymentsPaymentMethodDetails,
}

public sealed class InlineTreasuryOutboundPaymentDestinationPaymentMethodDetailsX5cf24d5dDecodingException(
  message: String,
) : SerializationException(message)

public class InlineTreasuryOutboundPaymentDestinationPaymentMethodDetailsX5cf24d5dNoMatchException(
  message: String,
) : InlineTreasuryOutboundPaymentDestinationPaymentMethodDetailsX5cf24d5dDecodingException(message)

internal data class InlineTreasuryOutboundPaymentDestinationPaymentMethodDetailsX5cf24d5dInspection(
  public val matchesOutboundPaymentsPaymentMethodDetails: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesOutboundPaymentsPaymentMethodDetails).count { it }
}

/**
 * Details about the PaymentMethod for an OutboundPayment.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/treasury.outbound_payment/properties/destination_payment_method_deta
 * ils
 */
@Serializable(with = InlineTreasuryOutboundPaymentDestinationPaymentMethodDetailsX5cf24d5d.Serializer::class)
public class InlineTreasuryOutboundPaymentDestinationPaymentMethodDetailsX5cf24d5d internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineTreasuryOutboundPaymentDestinationPaymentMethodDetailsX5cf24d5dInspection,
) {
  public val outboundPaymentsPaymentMethodDetails: OutboundPaymentsPaymentMethodDetailsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesOutboundPaymentsPaymentMethodDetails) json.decodeFromJsonElement<OutboundPaymentsPaymentMethodDetailsView>(raw) else null }

  public val matchedBranches:
      Set<InlineTreasuryOutboundPaymentDestinationPaymentMethodDetailsX5cf24d5dBranch>
    get() = buildSet {
      if (inspection.matchesOutboundPaymentsPaymentMethodDetails) add(InlineTreasuryOutboundPaymentDestinationPaymentMethodDetailsX5cf24d5dBranch.OutboundPaymentsPaymentMethodDetails)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineTreasuryOutboundPaymentDestinationPaymentMethodDetailsX5cf24d5d {
      val inspection = inspectInlineTreasuryOutboundPaymentDestinationPaymentMethodDetailsX5cf24d5d(raw)
      if (inspection.matchCount == 0) {
        throw InlineTreasuryOutboundPaymentDestinationPaymentMethodDetailsX5cf24d5dNoMatchException("InlineTreasuryOutboundPaymentDestinationPaymentMethodDetailsX5cf24d5d matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineTreasuryOutboundPaymentDestinationPaymentMethodDetailsX5cf24d5d(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineTreasuryOutboundPaymentDestinationPaymentMethodDetailsX5cf24d5d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineTreasuryOutboundPaymentDestinationPaymentMethodDetailsX5cf24d5d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineTreasuryOutboundPaymentDestinationPaymentMethodDetailsX5cf24d5d")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineTreasuryOutboundPaymentDestinationPaymentMethodDetailsX5cf24d5d) {
      encoder.requireJsonEncoder("InlineTreasuryOutboundPaymentDestinationPaymentMethodDetailsX5cf24d5d").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineTreasuryOutboundPaymentDestinationPaymentMethodDetailsX5cf24d5d(element: JsonElement): InlineTreasuryOutboundPaymentDestinationPaymentMethodDetailsX5cf24d5dInspection {
  val raw = element as? JsonObject ?: return InlineTreasuryOutboundPaymentDestinationPaymentMethodDetailsX5cf24d5dInspection(
    matchesOutboundPaymentsPaymentMethodDetails = false,
    failures = listOf("OutboundPaymentsPaymentMethodDetails: expected JSON object"),
  )
  val matchesOutboundPaymentsPaymentMethodDetails = raw["billing_details"] != null && raw["type"] != null
  return InlineTreasuryOutboundPaymentDestinationPaymentMethodDetailsX5cf24d5dInspection(
    matchesOutboundPaymentsPaymentMethodDetails = matchesOutboundPaymentsPaymentMethodDetails,
    failures = buildList {
      if (!matchesOutboundPaymentsPaymentMethodDetails) add("OutboundPaymentsPaymentMethodDetails: required properties 'billing_details', 'type' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
