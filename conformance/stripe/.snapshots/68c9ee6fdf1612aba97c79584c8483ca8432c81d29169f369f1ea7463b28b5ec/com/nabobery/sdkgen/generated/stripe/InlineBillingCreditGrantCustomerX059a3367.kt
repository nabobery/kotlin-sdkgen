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

public enum class InlineBillingCreditGrantCustomerX059a3367Branch {
  Branch1,
  Customer,
  DeletedCustomer,
}

public sealed class InlineBillingCreditGrantCustomerX059a3367DecodingException(
  message: String,
) : SerializationException(message)

public class InlineBillingCreditGrantCustomerX059a3367NoMatchException(
  message: String,
) : InlineBillingCreditGrantCustomerX059a3367DecodingException(message)

internal data class InlineBillingCreditGrantCustomerX059a3367Inspection(
  public val matchesBranch1: Boolean,
  public val matchesCustomer: Boolean,
  public val matchesDeletedCustomer: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesCustomer, matchesDeletedCustomer).count { it }
}

/**
 * ID of the customer receiving the billing credits.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/billing.credit_grant/properties/customer
 */
@Serializable(with = InlineBillingCreditGrantCustomerX059a3367.Serializer::class)
public class InlineBillingCreditGrantCustomerX059a3367 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineBillingCreditGrantCustomerX059a3367Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val customer: Customer? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesCustomer) json.decodeFromJsonElement<Customer>(raw) else null }

  public val deletedCustomer: DeletedCustomer? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesDeletedCustomer) json.decodeFromJsonElement<DeletedCustomer>(raw) else null }

  public val matchedBranches: Set<InlineBillingCreditGrantCustomerX059a3367Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineBillingCreditGrantCustomerX059a3367Branch.Branch1)
      if (inspection.matchesCustomer) add(InlineBillingCreditGrantCustomerX059a3367Branch.Customer)
      if (inspection.matchesDeletedCustomer) add(InlineBillingCreditGrantCustomerX059a3367Branch.DeletedCustomer)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineBillingCreditGrantCustomerX059a3367 {
      val inspection = inspectInlineBillingCreditGrantCustomerX059a3367(raw)
      if (inspection.matchCount == 0) {
        throw InlineBillingCreditGrantCustomerX059a3367NoMatchException("InlineBillingCreditGrantCustomerX059a3367 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineBillingCreditGrantCustomerX059a3367(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineBillingCreditGrantCustomerX059a3367> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineBillingCreditGrantCustomerX059a3367 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineBillingCreditGrantCustomerX059a3367")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineBillingCreditGrantCustomerX059a3367) {
      encoder.requireJsonEncoder("InlineBillingCreditGrantCustomerX059a3367").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineBillingCreditGrantCustomerX059a3367(element: JsonElement): InlineBillingCreditGrantCustomerX059a3367Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesCustomer = element.isJsonDecodable<Customer>()
  val matchesDeletedCustomer = element.isJsonDecodable<DeletedCustomer>()
  return InlineBillingCreditGrantCustomerX059a3367Inspection(
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
