package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class BillingCreditGrantsResourceBalanceCreditsAppliedView(
  public val invoice: InlineBillingCreditGrantsResourceBalanceCreditsAppliedInvoiceXb0d637e5,
  @SerialName("invoice_line_item")
  public val invoiceLineItem: String,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/billing_credit_grants_resource_balance_credits_applied
 */
@Serializable(with = BillingCreditGrantsResourceBalanceCreditsApplied.Serializer::class)
public class BillingCreditGrantsResourceBalanceCreditsApplied(
  /**
   * The invoice to which the billing credits were applied.
   */
  public val invoice: InlineBillingCreditGrantsResourceBalanceCreditsAppliedInvoiceXb0d637e5,
  /**
   * The invoice line item to which the billing credits were applied.
   */
  public val invoiceLineItem: String,
) {
  public class Builder {
    private var invoiceValue:
        InlineBillingCreditGrantsResourceBalanceCreditsAppliedInvoiceXb0d637e5? = null

    public var invoice: InlineBillingCreditGrantsResourceBalanceCreditsAppliedInvoiceXb0d637e5
      get() = requireNotNull(invoiceValue) { "invoice is required" }
      set(`value`) {
        invoiceValue = value
      }

    private var invoiceLineItemValue: String? = null

    public var invoiceLineItem: String
      get() = requireNotNull(invoiceLineItemValue) { "invoiceLineItem is required" }
      set(`value`) {
        invoiceLineItemValue = value
      }

    public fun build(): BillingCreditGrantsResourceBalanceCreditsApplied {
      check(invoiceValue != null) { "invoice is required" }
      check(invoiceLineItemValue != null) { "invoiceLineItem is required" }
      return BillingCreditGrantsResourceBalanceCreditsApplied(
        invoice = invoice,
        invoiceLineItem = invoiceLineItem,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): BillingCreditGrantsResourceBalanceCreditsApplied = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<BillingCreditGrantsResourceBalanceCreditsApplied> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BillingCreditGrantsResourceBalanceCreditsApplied {
      val jsonDecoder = decoder.requireJsonDecoder("BillingCreditGrantsResourceBalanceCreditsApplied")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("BillingCreditGrantsResourceBalanceCreditsApplied must be a JSON object")
      val invoice = json.decodeRequired<InlineBillingCreditGrantsResourceBalanceCreditsAppliedInvoiceXb0d637e5>(rawObject, "invoice")
      val invoiceLineItem = json.decodeRequired<String>(rawObject, "invoice_line_item")
      return BillingCreditGrantsResourceBalanceCreditsApplied(
        invoice = invoice,
        invoiceLineItem = invoiceLineItem,
      )
    }

    override fun serialize(encoder: Encoder, `value`: BillingCreditGrantsResourceBalanceCreditsApplied) {
      val jsonEncoder = encoder.requireJsonEncoder("BillingCreditGrantsResourceBalanceCreditsApplied")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("invoice", json.encodeToJsonElement(value.invoice))
        put("invoice_line_item", value.invoiceLineItem)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun billingCreditGrantsResourceBalanceCreditsApplied(block: BillingCreditGrantsResourceBalanceCreditsApplied.Builder.() -> Unit): BillingCreditGrantsResourceBalanceCreditsApplied = BillingCreditGrantsResourceBalanceCreditsApplied.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("BillingCreditGrantsResourceBalanceCreditsApplied is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
