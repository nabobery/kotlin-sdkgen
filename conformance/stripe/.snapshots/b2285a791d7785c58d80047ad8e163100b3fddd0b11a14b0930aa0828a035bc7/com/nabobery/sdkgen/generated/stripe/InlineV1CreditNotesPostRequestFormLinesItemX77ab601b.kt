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
 * sdkgen://source/openapi.json#/paths/~1v1~1credit_notes/post/requestBody/content/application~1x-www-form-urlencoded/sc
 * hema/properties/lines/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1credit_notes/post/requestBody/content/application~1x-www-form-urlencoded/sc
 * hema/properties/lines/items
 */
@Serializable(with = InlineV1CreditNotesPostRequestFormLinesItemX77ab601b.Serializer::class)
public class InlineV1CreditNotesPostRequestFormLinesItemX77ab601b(
  public val type: InlineV1CreditNotesPostRequestFormLinesItemTypeX82a24436,
  public val amount: Int? = null,
  public val description: String? = null,
  public val invoiceLineItem: String? = null,
  metadata: Map<String, String>? = null,
  public val quantity: Int? = null,
  public val taxAmounts: InlineV1CreditNotesPostRequestFormLinesItemTaxAmountsXf48d6eac? = null,
  public val taxRates: InlineV1CreditNotesPostRequestFormLinesItemTaxRatesX81dd0cc9? = null,
  public val unitAmount: Int? = null,
  /**
   * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val unitAmountDecimal: String? = null,
) {
  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  public class Builder {
    private var typeValue: InlineV1CreditNotesPostRequestFormLinesItemTypeX82a24436? = null

    public var type: InlineV1CreditNotesPostRequestFormLinesItemTypeX82a24436
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

    public var taxAmounts: InlineV1CreditNotesPostRequestFormLinesItemTaxAmountsXf48d6eac? = null

    public var taxRates: InlineV1CreditNotesPostRequestFormLinesItemTaxRatesX81dd0cc9? = null

    public var unitAmount: Int? = null

    /**
     * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var unitAmountDecimal: String? = null

    public fun build(): InlineV1CreditNotesPostRequestFormLinesItemX77ab601b {
      check(typeValue != null) { "type is required" }
      return InlineV1CreditNotesPostRequestFormLinesItemX77ab601b(
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
    public fun build(block: Builder.() -> Unit): InlineV1CreditNotesPostRequestFormLinesItemX77ab601b = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1CreditNotesPostRequestFormLinesItemX77ab601b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CreditNotesPostRequestFormLinesItemX77ab601b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CreditNotesPostRequestFormLinesItemX77ab601b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CreditNotesPostRequestFormLinesItemX77ab601b must be a JSON object")
      val type = json.decodeRequired<InlineV1CreditNotesPostRequestFormLinesItemTypeX82a24436>(rawObject, "type")
      return InlineV1CreditNotesPostRequestFormLinesItemX77ab601b(
        type = type,
        amount = rawObject["amount"]?.let { json.decodeFromJsonElement<Int>(it) },
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
        invoiceLineItem = rawObject["invoice_line_item"]?.let { json.decodeFromJsonElement<String>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
        quantity = rawObject["quantity"]?.let { json.decodeFromJsonElement<Int>(it) },
        taxAmounts = rawObject["tax_amounts"]?.let { json.decodeFromJsonElement<InlineV1CreditNotesPostRequestFormLinesItemTaxAmountsXf48d6eac>(it) },
        taxRates = rawObject["tax_rates"]?.let { json.decodeFromJsonElement<InlineV1CreditNotesPostRequestFormLinesItemTaxRatesX81dd0cc9>(it) },
        unitAmount = rawObject["unit_amount"]?.let { json.decodeFromJsonElement<Int>(it) },
        unitAmountDecimal = rawObject["unit_amount_decimal"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CreditNotesPostRequestFormLinesItemX77ab601b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CreditNotesPostRequestFormLinesItemX77ab601b")
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

public fun inlineV1CreditNotesPostRequestFormLinesItemX77ab601b(block: InlineV1CreditNotesPostRequestFormLinesItemX77ab601b.Builder.() -> Unit): InlineV1CreditNotesPostRequestFormLinesItemX77ab601b = InlineV1CreditNotesPostRequestFormLinesItemX77ab601b.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1CreditNotesPostRequestFormLinesItemX77ab601b is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
