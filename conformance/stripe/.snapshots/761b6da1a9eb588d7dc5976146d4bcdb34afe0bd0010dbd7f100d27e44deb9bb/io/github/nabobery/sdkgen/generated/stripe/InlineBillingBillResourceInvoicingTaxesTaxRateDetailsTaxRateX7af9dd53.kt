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

public enum class InlineBillingBillResourceInvoicingTaxesTaxRateDetailsTaxRateX7af9dd53Branch {
  Branch1,
  TaxRate,
}

public sealed class InlineBillingBillResourceInvoicingTaxesTaxRateDetailsTaxRateX7af9dd53DecodingException(
  message: String,
) : SerializationException(message)

public class InlineBillingBillResourceInvoicingTaxesTaxRateDetailsTaxRateX7af9dd53NoMatchException(
  message: String,
) : InlineBillingBillResourceInvoicingTaxesTaxRateDetailsTaxRateX7af9dd53DecodingException(message)

internal data class InlineBillingBillResourceInvoicingTaxesTaxRateDetailsTaxRateX7af9dd53Inspection(
  public val matchesBranch1: Boolean,
  public val matchesTaxRate: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesTaxRate).count { it }
}

/**
 * ID of the tax rate
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/billing_bill_resource_invoicing_taxes_tax_rate_details/properties/ta
 * x_rate
 */
@Serializable(with = InlineBillingBillResourceInvoicingTaxesTaxRateDetailsTaxRateX7af9dd53.Serializer::class)
public class InlineBillingBillResourceInvoicingTaxesTaxRateDetailsTaxRateX7af9dd53 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineBillingBillResourceInvoicingTaxesTaxRateDetailsTaxRateX7af9dd53Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val taxRate: TaxRate? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesTaxRate) json.decodeFromJsonElement<TaxRate>(raw) else null }

  public val matchedBranches:
      Set<InlineBillingBillResourceInvoicingTaxesTaxRateDetailsTaxRateX7af9dd53Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineBillingBillResourceInvoicingTaxesTaxRateDetailsTaxRateX7af9dd53Branch.Branch1)
      if (inspection.matchesTaxRate) add(InlineBillingBillResourceInvoicingTaxesTaxRateDetailsTaxRateX7af9dd53Branch.TaxRate)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineBillingBillResourceInvoicingTaxesTaxRateDetailsTaxRateX7af9dd53 {
      val inspection = inspectInlineBillingBillResourceInvoicingTaxesTaxRateDetailsTaxRateX7af9dd53(raw)
      if (inspection.matchCount == 0) {
        throw InlineBillingBillResourceInvoicingTaxesTaxRateDetailsTaxRateX7af9dd53NoMatchException("InlineBillingBillResourceInvoicingTaxesTaxRateDetailsTaxRateX7af9dd53 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineBillingBillResourceInvoicingTaxesTaxRateDetailsTaxRateX7af9dd53(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineBillingBillResourceInvoicingTaxesTaxRateDetailsTaxRateX7af9dd53> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineBillingBillResourceInvoicingTaxesTaxRateDetailsTaxRateX7af9dd53 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineBillingBillResourceInvoicingTaxesTaxRateDetailsTaxRateX7af9dd53")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineBillingBillResourceInvoicingTaxesTaxRateDetailsTaxRateX7af9dd53) {
      encoder.requireJsonEncoder("InlineBillingBillResourceInvoicingTaxesTaxRateDetailsTaxRateX7af9dd53").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineBillingBillResourceInvoicingTaxesTaxRateDetailsTaxRateX7af9dd53(element: JsonElement): InlineBillingBillResourceInvoicingTaxesTaxRateDetailsTaxRateX7af9dd53Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesTaxRate = element.isJsonDecodable<TaxRate>()
  return InlineBillingBillResourceInvoicingTaxesTaxRateDetailsTaxRateX7af9dd53Inspection(
    matchesBranch1 = matchesBranch1,
    matchesTaxRate = matchesTaxRate,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesTaxRate) add("TaxRate: value does not match TaxRate")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
