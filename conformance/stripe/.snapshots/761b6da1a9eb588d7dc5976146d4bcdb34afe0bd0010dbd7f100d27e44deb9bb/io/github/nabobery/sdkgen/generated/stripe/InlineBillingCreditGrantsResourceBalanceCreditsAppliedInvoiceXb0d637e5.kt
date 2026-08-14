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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineBillingCreditGrantsResourceBalanceCreditsAppliedInvoiceXb0d637e5Branch {
  Branch1,
  Invoice,
}

public sealed class InlineBillingCreditGrantsResourceBalanceCreditsAppliedInvoiceXb0d637e5DecodingException(
  message: String,
) : SerializationException(message)

public class InlineBillingCreditGrantsResourceBalanceCreditsAppliedInvoiceXb0d637e5NoMatchException(
  message: String,
) : InlineBillingCreditGrantsResourceBalanceCreditsAppliedInvoiceXb0d637e5DecodingException(message)

internal data class InlineBillingCreditGrantsResourceBalanceCreditsAppliedInvoiceXb0d637e5Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInvoice: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInvoice).count { it }
}

/**
 * The invoice to which the billing credits were applied.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/billing_credit_grants_resource_balance_credits_applied/properties/in
 * voice
 */
@Serializable(with = InlineBillingCreditGrantsResourceBalanceCreditsAppliedInvoiceXb0d637e5.Serializer::class)
public class InlineBillingCreditGrantsResourceBalanceCreditsAppliedInvoiceXb0d637e5 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineBillingCreditGrantsResourceBalanceCreditsAppliedInvoiceXb0d637e5Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val invoice: Invoice? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInvoice) json.decodeFromJsonElement<Invoice>(raw) else null }

  public val matchedBranches:
      Set<InlineBillingCreditGrantsResourceBalanceCreditsAppliedInvoiceXb0d637e5Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineBillingCreditGrantsResourceBalanceCreditsAppliedInvoiceXb0d637e5Branch.Branch1)
      if (inspection.matchesInvoice) add(InlineBillingCreditGrantsResourceBalanceCreditsAppliedInvoiceXb0d637e5Branch.Invoice)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineBillingCreditGrantsResourceBalanceCreditsAppliedInvoiceXb0d637e5 {
      val inspection = inspectInlineBillingCreditGrantsResourceBalanceCreditsAppliedInvoiceXb0d637e5(raw)
      if (inspection.matchCount == 0) {
        throw InlineBillingCreditGrantsResourceBalanceCreditsAppliedInvoiceXb0d637e5NoMatchException("InlineBillingCreditGrantsResourceBalanceCreditsAppliedInvoiceXb0d637e5 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineBillingCreditGrantsResourceBalanceCreditsAppliedInvoiceXb0d637e5(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineBillingCreditGrantsResourceBalanceCreditsAppliedInvoiceXb0d637e5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineBillingCreditGrantsResourceBalanceCreditsAppliedInvoiceXb0d637e5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineBillingCreditGrantsResourceBalanceCreditsAppliedInvoiceXb0d637e5")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineBillingCreditGrantsResourceBalanceCreditsAppliedInvoiceXb0d637e5) {
      encoder.requireJsonEncoder("InlineBillingCreditGrantsResourceBalanceCreditsAppliedInvoiceXb0d637e5").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineBillingCreditGrantsResourceBalanceCreditsAppliedInvoiceXb0d637e5(element: JsonElement): InlineBillingCreditGrantsResourceBalanceCreditsAppliedInvoiceXb0d637e5Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInvoice = element.isJsonDecodable<Invoice>()
  return InlineBillingCreditGrantsResourceBalanceCreditsAppliedInvoiceXb0d637e5Inspection(
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
