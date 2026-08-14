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

public enum class InlineBillingBillResourceInvoicingTaxesTaxTaxRateDetailsXd36f26bcBranch {
  BillingBillResourceInvoicingTaxesTaxRateDetails,
}

public sealed class InlineBillingBillResourceInvoicingTaxesTaxTaxRateDetailsXd36f26bcDecodingException(
  message: String,
) : SerializationException(message)

public class InlineBillingBillResourceInvoicingTaxesTaxTaxRateDetailsXd36f26bcNoMatchException(
  message: String,
) : InlineBillingBillResourceInvoicingTaxesTaxTaxRateDetailsXd36f26bcDecodingException(message)

internal data class InlineBillingBillResourceInvoicingTaxesTaxTaxRateDetailsXd36f26bcInspection(
  public val matchesBillingBillResourceInvoicingTaxesTaxRateDetails: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBillingBillResourceInvoicingTaxesTaxRateDetails).count { it }
}

/**
 * Additional details about the tax rate. Only present when `type` is `tax_rate_details`.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/billing_bill_resource_invoicing_taxes_tax/properties/tax_rate_detail
 * s
 */
@Serializable(with = InlineBillingBillResourceInvoicingTaxesTaxTaxRateDetailsXd36f26bc.Serializer::class)
public class InlineBillingBillResourceInvoicingTaxesTaxTaxRateDetailsXd36f26bc internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineBillingBillResourceInvoicingTaxesTaxTaxRateDetailsXd36f26bcInspection,
) {
  public val billingBillResourceInvoicingTaxesTaxRateDetails:
      BillingBillResourceInvoicingTaxesTaxRateDetailsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBillingBillResourceInvoicingTaxesTaxRateDetails) json.decodeFromJsonElement<BillingBillResourceInvoicingTaxesTaxRateDetailsView>(raw) else null }

  public val matchedBranches:
      Set<InlineBillingBillResourceInvoicingTaxesTaxTaxRateDetailsXd36f26bcBranch>
    get() = buildSet {
      if (inspection.matchesBillingBillResourceInvoicingTaxesTaxRateDetails) add(InlineBillingBillResourceInvoicingTaxesTaxTaxRateDetailsXd36f26bcBranch.BillingBillResourceInvoicingTaxesTaxRateDetails)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineBillingBillResourceInvoicingTaxesTaxTaxRateDetailsXd36f26bc {
      val inspection = inspectInlineBillingBillResourceInvoicingTaxesTaxTaxRateDetailsXd36f26bc(raw)
      if (inspection.matchCount == 0) {
        throw InlineBillingBillResourceInvoicingTaxesTaxTaxRateDetailsXd36f26bcNoMatchException("InlineBillingBillResourceInvoicingTaxesTaxTaxRateDetailsXd36f26bc matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineBillingBillResourceInvoicingTaxesTaxTaxRateDetailsXd36f26bc(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineBillingBillResourceInvoicingTaxesTaxTaxRateDetailsXd36f26bc> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineBillingBillResourceInvoicingTaxesTaxTaxRateDetailsXd36f26bc {
      val jsonDecoder = decoder.requireJsonDecoder("InlineBillingBillResourceInvoicingTaxesTaxTaxRateDetailsXd36f26bc")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineBillingBillResourceInvoicingTaxesTaxTaxRateDetailsXd36f26bc) {
      encoder.requireJsonEncoder("InlineBillingBillResourceInvoicingTaxesTaxTaxRateDetailsXd36f26bc").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineBillingBillResourceInvoicingTaxesTaxTaxRateDetailsXd36f26bc(element: JsonElement): InlineBillingBillResourceInvoicingTaxesTaxTaxRateDetailsXd36f26bcInspection {
  val raw = element as? JsonObject ?: return InlineBillingBillResourceInvoicingTaxesTaxTaxRateDetailsXd36f26bcInspection(
    matchesBillingBillResourceInvoicingTaxesTaxRateDetails = false,
    failures = listOf("BillingBillResourceInvoicingTaxesTaxRateDetails: expected JSON object"),
  )
  val matchesBillingBillResourceInvoicingTaxesTaxRateDetails = raw["tax_rate"] != null
  return InlineBillingBillResourceInvoicingTaxesTaxTaxRateDetailsXd36f26bcInspection(
    matchesBillingBillResourceInvoicingTaxesTaxRateDetails = matchesBillingBillResourceInvoicingTaxesTaxRateDetails,
    failures = buildList {
      if (!matchesBillingBillResourceInvoicingTaxesTaxRateDetails) add("BillingBillResourceInvoicingTaxesTaxRateDetails: required properties 'tax_rate' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
