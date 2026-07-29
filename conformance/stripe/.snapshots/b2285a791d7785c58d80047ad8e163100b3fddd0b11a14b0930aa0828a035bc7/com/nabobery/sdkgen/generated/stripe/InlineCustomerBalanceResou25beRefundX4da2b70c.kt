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

public enum class InlineCustomerBalanceResou25beRefundX4da2b70cBranch {
  Branch1,
  Refund,
}

public sealed class InlineCustomerBalanceResou25beRefundX4da2b70cDecodingException(
  message: String,
) : SerializationException(message)

public class InlineCustomerBalanceResou25beRefundX4da2b70cNoMatchException(
  message: String,
) : InlineCustomerBalanceResou25beRefundX4da2b70cDecodingException(message)

internal data class InlineCustomerBalanceResou25beRefundX4da2b70cInspection(
  public val matchesBranch1: Boolean,
  public val matchesRefund: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesRefund).count { it }
}

/**
 * The [Refund](https://docs.stripe.com/api/refunds/object) that moved these funds into the customer's cash balance.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/customer_balance_resource_cash_balance_transaction_resource_refunded
 * _from_payment_transaction/properties/refund
 */
@Serializable(with = InlineCustomerBalanceResou25beRefundX4da2b70c.Serializer::class)
public class InlineCustomerBalanceResou25beRefundX4da2b70c internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineCustomerBalanceResou25beRefundX4da2b70cInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val refund: Refund? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesRefund) json.decodeFromJsonElement<Refund>(raw) else null }

  public val matchedBranches: Set<InlineCustomerBalanceResou25beRefundX4da2b70cBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineCustomerBalanceResou25beRefundX4da2b70cBranch.Branch1)
      if (inspection.matchesRefund) add(InlineCustomerBalanceResou25beRefundX4da2b70cBranch.Refund)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineCustomerBalanceResou25beRefundX4da2b70c {
      val inspection = inspectInlineCustomerBalanceResou25beRefundX4da2b70c(raw)
      if (inspection.matchCount == 0) {
        throw InlineCustomerBalanceResou25beRefundX4da2b70cNoMatchException("InlineCustomerBalanceResou25beRefundX4da2b70c matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineCustomerBalanceResou25beRefundX4da2b70c(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineCustomerBalanceResou25beRefundX4da2b70c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCustomerBalanceResou25beRefundX4da2b70c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCustomerBalanceResou25beRefundX4da2b70c")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineCustomerBalanceResou25beRefundX4da2b70c) {
      encoder.requireJsonEncoder("InlineCustomerBalanceResou25beRefundX4da2b70c").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineCustomerBalanceResou25beRefundX4da2b70c(element: JsonElement): InlineCustomerBalanceResou25beRefundX4da2b70cInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesRefund = element.isJsonDecodable<Refund>()
  return InlineCustomerBalanceResou25beRefundX4da2b70cInspection(
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
