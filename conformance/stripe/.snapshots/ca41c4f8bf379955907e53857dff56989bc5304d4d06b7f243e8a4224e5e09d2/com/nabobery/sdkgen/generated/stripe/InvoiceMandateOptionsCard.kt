package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
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

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoice_mandate_options_card
 */
@Serializable(with = InvoiceMandateOptionsCard.Serializer::class)
public class InvoiceMandateOptionsCard(
  /**
   * Amount to be charged for future payments, specified in the presentment currency.
   */
  public val amount: Int? = null,
  /**
   * One of `fixed` or `maximum`. If `fixed`, the `amount` param refers to the exact amount to be charged in future
   * payments. If `maximum`, the amount charged can be up to the value passed for the `amount` param.
   */
  public val amountType: InlineInvoiceMandateOptionsCardAmountTypeX6ac78e8e? = null,
  /**
   * A description of the mandate or subscription that is meant to be displayed to the customer.
   */
  public val description: String? = null,
) {
  public class Builder {
    /**
     * Amount to be charged for future payments, specified in the presentment currency.
     */
    public var amount: Int? = null

    /**
     * One of `fixed` or `maximum`. If `fixed`, the `amount` param refers to the exact amount to be charged in future
     * payments. If `maximum`, the amount charged can be up to the value passed for the `amount` param.
     */
    public var amountType: InlineInvoiceMandateOptionsCardAmountTypeX6ac78e8e? = null

    /**
     * A description of the mandate or subscription that is meant to be displayed to the customer.
     */
    public var description: String? = null

    public fun build(): InvoiceMandateOptionsCard = InvoiceMandateOptionsCard(
      amount = amount,
      amountType = amountType,
      description = description,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InvoiceMandateOptionsCard = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InvoiceMandateOptionsCard> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InvoiceMandateOptionsCard {
      val jsonDecoder = decoder.requireJsonDecoder("InvoiceMandateOptionsCard")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InvoiceMandateOptionsCard must be a JSON object")
      return InvoiceMandateOptionsCard(
        amount = rawObject["amount"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        amountType = rawObject["amount_type"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineInvoiceMandateOptionsCardAmountTypeX6ac78e8e?>(element) },
        description = rawObject["description"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InvoiceMandateOptionsCard) {
      val jsonEncoder = encoder.requireJsonEncoder("InvoiceMandateOptionsCard")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.amount?.let { put("amount", json.encodeToJsonElement(it)) }
        value.amountType?.let { put("amount_type", json.encodeToJsonElement(it)) }
        value.description?.let { put("description", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun invoiceMandateOptionsCard(block: InvoiceMandateOptionsCard.Builder.() -> Unit): InvoiceMandateOptionsCard = InvoiceMandateOptionsCard.build(block)
