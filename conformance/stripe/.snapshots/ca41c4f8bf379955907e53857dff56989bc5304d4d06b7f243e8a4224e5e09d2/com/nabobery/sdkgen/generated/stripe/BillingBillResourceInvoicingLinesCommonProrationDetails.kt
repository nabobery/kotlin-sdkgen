package com.nabobery.sdkgen.generated.stripe

import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class BillingBillResourceInvoicingLinesCommonProrationDetailsView(
  @SerialName("credited_items")
  public val creditedItems: InlineBillingBillResourceI2ab7CreditedItemsX25e33ab9? = null,
)

/**
 *
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/billing_bill_resource_invoicing_lines_common_proration_details
 */
@Serializable(with = BillingBillResourceInvoicingLinesCommonProrationDetails.Serializer::class)
public class BillingBillResourceInvoicingLinesCommonProrationDetails(
  /**
   * For a credit proration `line_item`, the original debit line_items to which the credit proration applies.
   */
  public val creditedItems: InlineBillingBillResourceI2ab7CreditedItemsX25e33ab9? = null,
) {
  public class Builder {
    /**
     * For a credit proration `line_item`, the original debit line_items to which the credit proration applies.
     */
    public var creditedItems: InlineBillingBillResourceI2ab7CreditedItemsX25e33ab9? = null

    public fun build(): BillingBillResourceInvoicingLinesCommonProrationDetails = BillingBillResourceInvoicingLinesCommonProrationDetails(
      creditedItems = creditedItems,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): BillingBillResourceInvoicingLinesCommonProrationDetails = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<BillingBillResourceInvoicingLinesCommonProrationDetails> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BillingBillResourceInvoicingLinesCommonProrationDetails {
      val jsonDecoder = decoder.requireJsonDecoder("BillingBillResourceInvoicingLinesCommonProrationDetails")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("BillingBillResourceInvoicingLinesCommonProrationDetails must be a JSON object")
      return BillingBillResourceInvoicingLinesCommonProrationDetails(
        creditedItems = rawObject["credited_items"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineBillingBillResourceI2ab7CreditedItemsX25e33ab9?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: BillingBillResourceInvoicingLinesCommonProrationDetails) {
      val jsonEncoder = encoder.requireJsonEncoder("BillingBillResourceInvoicingLinesCommonProrationDetails")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.creditedItems?.let { put("credited_items", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun billingBillResourceInvoicingLinesCommonProrationDetails(block: BillingBillResourceInvoicingLinesCommonProrationDetails.Builder.() -> Unit): BillingBillResourceInvoicingLinesCommonProrationDetails = BillingBillResourceInvoicingLinesCommonProrationDetails.build(block)
