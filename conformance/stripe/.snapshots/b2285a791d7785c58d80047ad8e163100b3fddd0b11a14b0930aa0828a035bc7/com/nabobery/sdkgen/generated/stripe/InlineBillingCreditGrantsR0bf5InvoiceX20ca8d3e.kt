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

public enum class InlineBillingCreditGrantsR0bf5InvoiceX20ca8d3eBranch {
  Branch1,
  Invoice,
}

public sealed class InlineBillingCreditGrantsR0bf5InvoiceX20ca8d3eDecodingException(
  message: String,
) : SerializationException(message)

public class InlineBillingCreditGrantsR0bf5InvoiceX20ca8d3eNoMatchException(
  message: String,
) : InlineBillingCreditGrantsR0bf5InvoiceX20ca8d3eDecodingException(message)

internal data class InlineBillingCreditGrantsR0bf5InvoiceX20ca8d3eInspection(
  public val matchesBranch1: Boolean,
  public val matchesInvoice: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInvoice).count { it }
}

/**
 * The invoice to which the reinstated billing credits were originally applied.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/billing_credit_grants_resource_balance_credits_application_invoice_v
 * oided/properties/invoice
 */
@Serializable(with = InlineBillingCreditGrantsR0bf5InvoiceX20ca8d3e.Serializer::class)
public class InlineBillingCreditGrantsR0bf5InvoiceX20ca8d3e internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineBillingCreditGrantsR0bf5InvoiceX20ca8d3eInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val invoice: Invoice? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInvoice) json.decodeFromJsonElement<Invoice>(raw) else null }

  public val matchedBranches: Set<InlineBillingCreditGrantsR0bf5InvoiceX20ca8d3eBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineBillingCreditGrantsR0bf5InvoiceX20ca8d3eBranch.Branch1)
      if (inspection.matchesInvoice) add(InlineBillingCreditGrantsR0bf5InvoiceX20ca8d3eBranch.Invoice)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineBillingCreditGrantsR0bf5InvoiceX20ca8d3e {
      val inspection = inspectInlineBillingCreditGrantsR0bf5InvoiceX20ca8d3e(raw)
      if (inspection.matchCount == 0) {
        throw InlineBillingCreditGrantsR0bf5InvoiceX20ca8d3eNoMatchException("InlineBillingCreditGrantsR0bf5InvoiceX20ca8d3e matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineBillingCreditGrantsR0bf5InvoiceX20ca8d3e(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineBillingCreditGrantsR0bf5InvoiceX20ca8d3e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineBillingCreditGrantsR0bf5InvoiceX20ca8d3e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineBillingCreditGrantsR0bf5InvoiceX20ca8d3e")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineBillingCreditGrantsR0bf5InvoiceX20ca8d3e) {
      encoder.requireJsonEncoder("InlineBillingCreditGrantsR0bf5InvoiceX20ca8d3e").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineBillingCreditGrantsR0bf5InvoiceX20ca8d3e(element: JsonElement): InlineBillingCreditGrantsR0bf5InvoiceX20ca8d3eInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInvoice = element.isJsonDecodable<Invoice>()
  return InlineBillingCreditGrantsR0bf5InvoiceX20ca8d3eInspection(
    matchesBranch1 = matchesBranch1,
    matchesInvoice = matchesInvoice,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInvoice) add("Invoice: value does not match Invoice")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
