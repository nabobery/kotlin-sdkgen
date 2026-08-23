package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
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
 * Source: sdkgen://source/openapi.json#/components/schemas/invoice_mandate_options_payto
 */
@Serializable(with = InvoiceMandateOptionsPayto.Serializer::class)
public class InvoiceMandateOptionsPayto(
  /**
   * The maximum amount that can be collected in a single invoice. If you don't specify a maximum, then there is no
   * limit.
   */
  public val amount: Int? = null,
  /**
   * Only `maximum` is supported.
   */
  public val amountType: InlineInvoiceMandateOptionsPaytoAmountTypeX50c97cfc? = null,
  /**
   * The purpose for which payments are made. Has a default value based on your merchant category code.
   */
  public val purpose: InlineInvoiceMandateOptionsPaytoPurposeX001732ff? = null,
) {
  public class Builder {
    /**
     * The maximum amount that can be collected in a single invoice. If you don't specify a maximum, then there is no
     * limit.
     */
    public var amount: Int? = null

    /**
     * Only `maximum` is supported.
     */
    public var amountType: InlineInvoiceMandateOptionsPaytoAmountTypeX50c97cfc? = null

    /**
     * The purpose for which payments are made. Has a default value based on your merchant category code.
     */
    public var purpose: InlineInvoiceMandateOptionsPaytoPurposeX001732ff? = null

    public fun build(): InvoiceMandateOptionsPayto = InvoiceMandateOptionsPayto(
      amount = amount,
      amountType = amountType,
      purpose = purpose,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InvoiceMandateOptionsPayto = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InvoiceMandateOptionsPayto> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InvoiceMandateOptionsPayto {
      val jsonDecoder = decoder.requireJsonDecoder("InvoiceMandateOptionsPayto")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InvoiceMandateOptionsPayto must be a JSON object")
      return InvoiceMandateOptionsPayto(
        amount = rawObject["amount"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        amountType = rawObject["amount_type"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineInvoiceMandateOptionsPaytoAmountTypeX50c97cfc?>(element) },
        purpose = rawObject["purpose"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineInvoiceMandateOptionsPaytoPurposeX001732ff?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InvoiceMandateOptionsPayto) {
      val jsonEncoder = encoder.requireJsonEncoder("InvoiceMandateOptionsPayto")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.amount?.let { put("amount", json.encodeToJsonElement(it)) }
        value.amountType?.let { put("amount_type", json.encodeToJsonElement(it)) }
        value.purpose?.let { put("purpose", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun invoiceMandateOptionsPayto(block: InvoiceMandateOptionsPayto.Builder.() -> Unit): InvoiceMandateOptionsPayto = InvoiceMandateOptionsPayto.build(block)
