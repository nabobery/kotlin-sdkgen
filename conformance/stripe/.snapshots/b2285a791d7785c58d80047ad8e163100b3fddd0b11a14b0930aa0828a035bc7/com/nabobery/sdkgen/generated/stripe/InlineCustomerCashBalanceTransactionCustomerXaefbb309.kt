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

public enum class InlineCustomerCashBalanceTransactionCustomerXaefbb309Branch {
  Branch1,
  Customer,
}

public sealed class InlineCustomerCashBalanceTransactionCustomerXaefbb309DecodingException(
  message: String,
) : SerializationException(message)

public class InlineCustomerCashBalanceTransactionCustomerXaefbb309NoMatchException(
  message: String,
) : InlineCustomerCashBalanceTransactionCustomerXaefbb309DecodingException(message)

internal data class InlineCustomerCashBalanceTransactionCustomerXaefbb309Inspection(
  public val matchesBranch1: Boolean,
  public val matchesCustomer: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesCustomer).count { it }
}

/**
 * The customer whose available cash balance changed as a result of this transaction.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/customer_cash_balance_transaction/properties/customer
 */
@Serializable(with = InlineCustomerCashBalanceTransactionCustomerXaefbb309.Serializer::class)
public class InlineCustomerCashBalanceTransactionCustomerXaefbb309 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineCustomerCashBalanceTransactionCustomerXaefbb309Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val customer: Customer? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesCustomer) json.decodeFromJsonElement<Customer>(raw) else null }

  public val matchedBranches: Set<InlineCustomerCashBalanceTransactionCustomerXaefbb309Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineCustomerCashBalanceTransactionCustomerXaefbb309Branch.Branch1)
      if (inspection.matchesCustomer) add(InlineCustomerCashBalanceTransactionCustomerXaefbb309Branch.Customer)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineCustomerCashBalanceTransactionCustomerXaefbb309 {
      val inspection = inspectInlineCustomerCashBalanceTransactionCustomerXaefbb309(raw)
      if (inspection.matchCount == 0) {
        throw InlineCustomerCashBalanceTransactionCustomerXaefbb309NoMatchException("InlineCustomerCashBalanceTransactionCustomerXaefbb309 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineCustomerCashBalanceTransactionCustomerXaefbb309(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineCustomerCashBalanceTransactionCustomerXaefbb309> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCustomerCashBalanceTransactionCustomerXaefbb309 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCustomerCashBalanceTransactionCustomerXaefbb309")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineCustomerCashBalanceTransactionCustomerXaefbb309) {
      encoder.requireJsonEncoder("InlineCustomerCashBalanceTransactionCustomerXaefbb309").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineCustomerCashBalanceTransactionCustomerXaefbb309(element: JsonElement): InlineCustomerCashBalanceTransactionCustomerXaefbb309Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesCustomer = element.isJsonDecodable<Customer>()
  return InlineCustomerCashBalanceTransactionCustomerXaefbb309Inspection(
    matchesBranch1 = matchesBranch1,
    matchesCustomer = matchesCustomer,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesCustomer) add("Customer: value does not match Customer")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
