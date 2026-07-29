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

public enum class InlineBillingCreditBalanceSummaryCustomerXd7a27b43Branch {
  Branch1,
  Customer,
  DeletedCustomer,
}

public sealed class InlineBillingCreditBalanceSummaryCustomerXd7a27b43DecodingException(
  message: String,
) : SerializationException(message)

public class InlineBillingCreditBalanceSummaryCustomerXd7a27b43NoMatchException(
  message: String,
) : InlineBillingCreditBalanceSummaryCustomerXd7a27b43DecodingException(message)

internal data class InlineBillingCreditBalanceSummaryCustomerXd7a27b43Inspection(
  public val matchesBranch1: Boolean,
  public val matchesCustomer: Boolean,
  public val matchesDeletedCustomer: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesCustomer, matchesDeletedCustomer).count { it }
}

/**
 * The customer the balance is for.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/billing.credit_balance_summary/properties/customer
 */
@Serializable(with = InlineBillingCreditBalanceSummaryCustomerXd7a27b43.Serializer::class)
public class InlineBillingCreditBalanceSummaryCustomerXd7a27b43 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineBillingCreditBalanceSummaryCustomerXd7a27b43Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val customer: Customer? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesCustomer) json.decodeFromJsonElement<Customer>(raw) else null }

  public val deletedCustomer: DeletedCustomer? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesDeletedCustomer) json.decodeFromJsonElement<DeletedCustomer>(raw) else null }

  public val matchedBranches: Set<InlineBillingCreditBalanceSummaryCustomerXd7a27b43Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineBillingCreditBalanceSummaryCustomerXd7a27b43Branch.Branch1)
      if (inspection.matchesCustomer) add(InlineBillingCreditBalanceSummaryCustomerXd7a27b43Branch.Customer)
      if (inspection.matchesDeletedCustomer) add(InlineBillingCreditBalanceSummaryCustomerXd7a27b43Branch.DeletedCustomer)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineBillingCreditBalanceSummaryCustomerXd7a27b43 {
      val inspection = inspectInlineBillingCreditBalanceSummaryCustomerXd7a27b43(raw)
      if (inspection.matchCount == 0) {
        throw InlineBillingCreditBalanceSummaryCustomerXd7a27b43NoMatchException("InlineBillingCreditBalanceSummaryCustomerXd7a27b43 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineBillingCreditBalanceSummaryCustomerXd7a27b43(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineBillingCreditBalanceSummaryCustomerXd7a27b43> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineBillingCreditBalanceSummaryCustomerXd7a27b43 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineBillingCreditBalanceSummaryCustomerXd7a27b43")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineBillingCreditBalanceSummaryCustomerXd7a27b43) {
      encoder.requireJsonEncoder("InlineBillingCreditBalanceSummaryCustomerXd7a27b43").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineBillingCreditBalanceSummaryCustomerXd7a27b43(element: JsonElement): InlineBillingCreditBalanceSummaryCustomerXd7a27b43Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesCustomer = element.isJsonDecodable<Customer>()
  val matchesDeletedCustomer = element.isJsonDecodable<DeletedCustomer>()
  return InlineBillingCreditBalanceSummaryCustomerXd7a27b43Inspection(
    matchesBranch1 = matchesBranch1,
    matchesCustomer = matchesCustomer,
    matchesDeletedCustomer = matchesDeletedCustomer,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesCustomer) add("Customer: value does not match Customer")
      if (!matchesDeletedCustomer) add("DeletedCustomer: value does not match DeletedCustomer")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
