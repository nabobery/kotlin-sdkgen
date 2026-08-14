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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class BillingBillResourceInvoicingParentsInvoiceParentView(
  @SerialName("quote_details")
  public val quoteDetails:
      InlineBillingBillResourceInvoicingParentsInvoiceParentQuoteDetailsX2f177d36? = null,
  @SerialName("subscription_details")
  public val subscriptionDetails:
      InlineBillingBillResourceI0765SubscriptionDetailsXc39ddbdd? = null,
  public val type: InlineBillingBillResourceInvoicingParentsInvoiceParentTypeXf9027e83,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/billing_bill_resource_invoicing_parents_invoice_parent
 */
@Serializable(with = BillingBillResourceInvoicingParentsInvoiceParent.Serializer::class)
public class BillingBillResourceInvoicingParentsInvoiceParent(
  /**
   * The type of parent that generated this invoice
   */
  public val type: InlineBillingBillResourceInvoicingParentsInvoiceParentTypeXf9027e83,
  /**
   * Details about the quote that generated this invoice
   */
  public val quoteDetails:
      InlineBillingBillResourceInvoicingParentsInvoiceParentQuoteDetailsX2f177d36? = null,
  /**
   * Details about the subscription that generated this invoice
   */
  public val subscriptionDetails:
      InlineBillingBillResourceI0765SubscriptionDetailsXc39ddbdd? = null,
) {
  public class Builder {
    private var typeValue: InlineBillingBillResourceInvoicingParentsInvoiceParentTypeXf9027e83? =
        null

    public var type: InlineBillingBillResourceInvoicingParentsInvoiceParentTypeXf9027e83
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    /**
     * Details about the quote that generated this invoice
     */
    public var quoteDetails:
        InlineBillingBillResourceInvoicingParentsInvoiceParentQuoteDetailsX2f177d36? = null

    /**
     * Details about the subscription that generated this invoice
     */
    public var subscriptionDetails: InlineBillingBillResourceI0765SubscriptionDetailsXc39ddbdd? =
        null

    public fun build(): BillingBillResourceInvoicingParentsInvoiceParent {
      check(typeValue != null) { "type is required" }
      return BillingBillResourceInvoicingParentsInvoiceParent(
        type = type,
        quoteDetails = quoteDetails,
        subscriptionDetails = subscriptionDetails,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): BillingBillResourceInvoicingParentsInvoiceParent = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<BillingBillResourceInvoicingParentsInvoiceParent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BillingBillResourceInvoicingParentsInvoiceParent {
      val jsonDecoder = decoder.requireJsonDecoder("BillingBillResourceInvoicingParentsInvoiceParent")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("BillingBillResourceInvoicingParentsInvoiceParent must be a JSON object")
      val type = json.decodeRequired<InlineBillingBillResourceInvoicingParentsInvoiceParentTypeXf9027e83>(rawObject, "type")
      return BillingBillResourceInvoicingParentsInvoiceParent(
        type = type,
        quoteDetails = rawObject["quote_details"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineBillingBillResourceInvoicingParentsInvoiceParentQuoteDetailsX2f177d36?>(element) },
        subscriptionDetails = rawObject["subscription_details"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineBillingBillResourceI0765SubscriptionDetailsXc39ddbdd?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: BillingBillResourceInvoicingParentsInvoiceParent) {
      val jsonEncoder = encoder.requireJsonEncoder("BillingBillResourceInvoicingParentsInvoiceParent")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.quoteDetails?.let { put("quote_details", json.encodeToJsonElement(it)) }
        value.subscriptionDetails?.let { put("subscription_details", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun billingBillResourceInvoicingParentsInvoiceParent(block: BillingBillResourceInvoicingParentsInvoiceParent.Builder.() -> Unit): BillingBillResourceInvoicingParentsInvoiceParent = BillingBillResourceInvoicingParentsInvoiceParent.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("BillingBillResourceInvoicingParentsInvoiceParent is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
