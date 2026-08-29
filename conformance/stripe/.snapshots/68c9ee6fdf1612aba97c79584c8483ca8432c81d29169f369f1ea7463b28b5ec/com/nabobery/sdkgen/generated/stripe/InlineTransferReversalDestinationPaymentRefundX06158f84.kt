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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineTransferReversalDestinationPaymentRefundX06158f84Branch {
  Branch1,
  Refund,
}

public sealed class InlineTransferReversalDestinationPaymentRefundX06158f84DecodingException(
  message: String,
) : SerializationException(message)

public class InlineTransferReversalDestinationPaymentRefundX06158f84NoMatchException(
  message: String,
) : InlineTransferReversalDestinationPaymentRefundX06158f84DecodingException(message)

internal data class InlineTransferReversalDestinationPaymentRefundX06158f84Inspection(
  public val matchesBranch1: Boolean,
  public val matchesRefund: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesRefund).count { it }
}

/**
 * Linked payment refund for the transfer reversal.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/transfer_reversal/properties/destination_payment_refund
 */
@Serializable(with = InlineTransferReversalDestinationPaymentRefundX06158f84.Serializer::class)
public class InlineTransferReversalDestinationPaymentRefundX06158f84 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineTransferReversalDestinationPaymentRefundX06158f84Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val refund: Refund? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesRefund) json.decodeFromJsonElement<Refund>(raw) else null }

  public val matchedBranches: Set<InlineTransferReversalDestinationPaymentRefundX06158f84Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineTransferReversalDestinationPaymentRefundX06158f84Branch.Branch1)
      if (inspection.matchesRefund) add(InlineTransferReversalDestinationPaymentRefundX06158f84Branch.Refund)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineTransferReversalDestinationPaymentRefundX06158f84 {
      val inspection = inspectInlineTransferReversalDestinationPaymentRefundX06158f84(raw)
      if (inspection.matchCount == 0) {
        throw InlineTransferReversalDestinationPaymentRefundX06158f84NoMatchException("InlineTransferReversalDestinationPaymentRefundX06158f84 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineTransferReversalDestinationPaymentRefundX06158f84(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineTransferReversalDestinationPaymentRefundX06158f84> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineTransferReversalDestinationPaymentRefundX06158f84 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineTransferReversalDestinationPaymentRefundX06158f84")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineTransferReversalDestinationPaymentRefundX06158f84) {
      encoder.requireJsonEncoder("InlineTransferReversalDestinationPaymentRefundX06158f84").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineTransferReversalDestinationPaymentRefundX06158f84(element: JsonElement): InlineTransferReversalDestinationPaymentRefundX06158f84Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesRefund = element.isJsonDecodable<Refund>()
  return InlineTransferReversalDestinationPaymentRefundX06158f84Inspection(
    matchesBranch1 = matchesBranch1,
    matchesRefund = matchesRefund,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesRefund) add("Refund: value does not match Refund")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
