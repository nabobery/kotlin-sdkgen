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

public enum class InlineTreasuryInboundTransferOriginPaymentMethodDetailsX62835ed2Branch {
  InboundTransfers,
}

public sealed class InlineTreasuryInboundTransferOriginPaymentMethodDetailsX62835ed2DecodingException(
  message: String,
) : SerializationException(message)

public class InlineTreasuryInboundTransferOriginPaymentMethodDetailsX62835ed2NoMatchException(
  message: String,
) : InlineTreasuryInboundTransferOriginPaymentMethodDetailsX62835ed2DecodingException(message)

internal data class InlineTreasuryInboundTransferOriginPaymentMethodDetailsX62835ed2Inspection(
  public val matchesInboundTransfers: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInboundTransfers).count { it }
}

/**
 * Details about the PaymentMethod for an InboundTransfer.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/treasury.inbound_transfer/properties/origin_payment_method_details
 */
@Serializable(with = InlineTreasuryInboundTransferOriginPaymentMethodDetailsX62835ed2.Serializer::class)
public class InlineTreasuryInboundTransferOriginPaymentMethodDetailsX62835ed2 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineTreasuryInboundTransferOriginPaymentMethodDetailsX62835ed2Inspection,
) {
  public val inboundTransfers: InboundTransfersView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInboundTransfers) json.decodeFromJsonElement<InboundTransfersView>(raw) else null }

  public val matchedBranches:
      Set<InlineTreasuryInboundTransferOriginPaymentMethodDetailsX62835ed2Branch>
    get() = buildSet {
      if (inspection.matchesInboundTransfers) add(InlineTreasuryInboundTransferOriginPaymentMethodDetailsX62835ed2Branch.InboundTransfers)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineTreasuryInboundTransferOriginPaymentMethodDetailsX62835ed2 {
      val inspection = inspectInlineTreasuryInboundTransferOriginPaymentMethodDetailsX62835ed2(raw)
      if (inspection.matchCount == 0) {
        throw InlineTreasuryInboundTransferOriginPaymentMethodDetailsX62835ed2NoMatchException("InlineTreasuryInboundTransferOriginPaymentMethodDetailsX62835ed2 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineTreasuryInboundTransferOriginPaymentMethodDetailsX62835ed2(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineTreasuryInboundTransferOriginPaymentMethodDetailsX62835ed2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineTreasuryInboundTransferOriginPaymentMethodDetailsX62835ed2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineTreasuryInboundTransferOriginPaymentMethodDetailsX62835ed2")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineTreasuryInboundTransferOriginPaymentMethodDetailsX62835ed2) {
      encoder.requireJsonEncoder("InlineTreasuryInboundTransferOriginPaymentMethodDetailsX62835ed2").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineTreasuryInboundTransferOriginPaymentMethodDetailsX62835ed2(element: JsonElement): InlineTreasuryInboundTransferOriginPaymentMethodDetailsX62835ed2Inspection {
  val raw = element as? JsonObject ?: return InlineTreasuryInboundTransferOriginPaymentMethodDetailsX62835ed2Inspection(
    matchesInboundTransfers = false,
    failures = listOf("InboundTransfers: expected JSON object"),
  )
  val matchesInboundTransfers = raw["billing_details"] != null && raw["type"] != null
  return InlineTreasuryInboundTransferOriginPaymentMethodDetailsX62835ed2Inspection(
    matchesInboundTransfers = matchesInboundTransfers,
    failures = buildList {
      if (!matchesInboundTransfers) add("InboundTransfers: required properties 'billing_details', 'type' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
