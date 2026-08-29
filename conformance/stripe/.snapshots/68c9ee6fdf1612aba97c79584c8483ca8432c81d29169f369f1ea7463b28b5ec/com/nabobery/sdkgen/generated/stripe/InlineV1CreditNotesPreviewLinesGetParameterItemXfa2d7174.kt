package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlinx.serialization.KSerializer
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

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1credit_notes~1preview~1lines/get/parameters/8/schema/items.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1credit_notes~1preview~1lines/get/parameters/8/schema/items
 */
@Serializable(with = InlineV1CreditNotesPreviewLinesGetParameterItemXfa2d7174.Serializer::class)
public class InlineV1CreditNotesPreviewLinesGetParameterItemXfa2d7174(
  public val type: InlineV1CreditNotesPreviewLinesGetParameterItemTypeX0a0bcf3c,
  public val amount: Int? = null,
  public val description: String? = null,
  public val invoiceLineItem: String? = null,
  metadata: Map<String, String>? = null,
  public val quantity: Int? = null,
  public val taxAmounts: InlineV1CreditNotesPreviewLinesGetParameterItemTaxAmountsX472a93fc? = null,
  public val taxRates: InlineV1CreditNotesPreviewLinesGetParameterItemTaxRatesX5c880810? = null,
  public val unitAmount: Int? = null,
  /**
   * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val unitAmountDecimal: String? = null,
) {
  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  public class Builder {
    private var typeValue: InlineV1CreditNotesPreviewLinesGetParameterItemTypeX0a0bcf3c? = null

    public var type: InlineV1CreditNotesPreviewLinesGetParameterItemTypeX0a0bcf3c
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var amount: Int? = null

    public var description: String? = null

    public var invoiceLineItem: String? = null

    private var metadataValue: Map<String, String>? = null

    public var metadata: Map<String, String>?
      get() = metadataValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        metadataValue = value?.let { collection0 -> collection0.toMap() }
      }

    public var quantity: Int? = null

    public var taxAmounts: InlineV1CreditNotesPreviewLinesGetParameterItemTaxAmountsX472a93fc? =
        null

    public var taxRates: InlineV1CreditNotesPreviewLinesGetParameterItemTaxRatesX5c880810? = null

    public var unitAmount: Int? = null

    /**
     * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var unitAmountDecimal: String? = null

    public fun build(): InlineV1CreditNotesPreviewLinesGetParameterItemXfa2d7174 {
      check(typeValue != null) { "type is required" }
      return InlineV1CreditNotesPreviewLinesGetParameterItemXfa2d7174(
        type = type,
        amount = amount,
        description = description,
        invoiceLineItem = invoiceLineItem,
        metadata = metadata,
        quantity = quantity,
        taxAmounts = taxAmounts,
        taxRates = taxRates,
        unitAmount = unitAmount,
        unitAmountDecimal = unitAmountDecimal,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CreditNotesPreviewLinesGetParameterItemXfa2d7174 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CreditNotesPreviewLinesGetParameterItemXfa2d7174> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CreditNotesPreviewLinesGetParameterItemXfa2d7174 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CreditNotesPreviewLinesGetParameterItemXfa2d7174")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CreditNotesPreviewLinesGetParameterItemXfa2d7174 must be a JSON object")
      val type = json.decodeRequired<InlineV1CreditNotesPreviewLinesGetParameterItemTypeX0a0bcf3c>(rawObject, "type")
      return InlineV1CreditNotesPreviewLinesGetParameterItemXfa2d7174(
        type = type,
        amount = rawObject["amount"]?.let { json.decodeFromJsonElement<Int>(it) },
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
        invoiceLineItem = rawObject["invoice_line_item"]?.let { json.decodeFromJsonElement<String>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
        quantity = rawObject["quantity"]?.let { json.decodeFromJsonElement<Int>(it) },
        taxAmounts = rawObject["tax_amounts"]?.let { json.decodeFromJsonElement<InlineV1CreditNotesPreviewLinesGetParameterItemTaxAmountsX472a93fc>(it) },
        taxRates = rawObject["tax_rates"]?.let { json.decodeFromJsonElement<InlineV1CreditNotesPreviewLinesGetParameterItemTaxRatesX5c880810>(it) },
        unitAmount = rawObject["unit_amount"]?.let { json.decodeFromJsonElement<Int>(it) },
        unitAmountDecimal = rawObject["unit_amount_decimal"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CreditNotesPreviewLinesGetParameterItemXfa2d7174) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CreditNotesPreviewLinesGetParameterItemXfa2d7174")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.amount?.let { put("amount", json.encodeToJsonElement(it)) }
        value.description?.let { put("description", it) }
        value.invoiceLineItem?.let { put("invoice_line_item", it) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.quantity?.let { put("quantity", json.encodeToJsonElement(it)) }
        value.taxAmounts?.let { put("tax_amounts", json.encodeToJsonElement(it)) }
        value.taxRates?.let { put("tax_rates", json.encodeToJsonElement(it)) }
        value.unitAmount?.let { put("unit_amount", json.encodeToJsonElement(it)) }
        value.unitAmountDecimal?.let { put("unit_amount_decimal", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CreditNotesPreviewLinesGetParameterItemXfa2d7174(block: InlineV1CreditNotesPreviewLinesGetParameterItemXfa2d7174.Builder.() -> Unit): InlineV1CreditNotesPreviewLinesGetParameterItemXfa2d7174 = InlineV1CreditNotesPreviewLinesGetParameterItemXfa2d7174.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1CreditNotesPreviewLinesGetParameterItemXfa2d7174 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
