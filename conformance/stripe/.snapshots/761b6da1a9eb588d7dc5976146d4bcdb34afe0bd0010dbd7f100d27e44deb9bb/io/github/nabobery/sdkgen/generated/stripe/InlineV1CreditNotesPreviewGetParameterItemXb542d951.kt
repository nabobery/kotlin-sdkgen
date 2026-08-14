package io.github.nabobery.sdkgen.generated.stripe

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
 * Generated model for sdkgen://source/openapi.json#/paths/~1v1~1credit_notes~1preview/get/parameters/6/schema/items.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1credit_notes~1preview/get/parameters/6/schema/items
 */
@Serializable(with = InlineV1CreditNotesPreviewGetParameterItemXb542d951.Serializer::class)
public class InlineV1CreditNotesPreviewGetParameterItemXb542d951(
  public val type: InlineV1CreditNotesPreviewGetParameterItemTypeX6d20630b,
  public val amount: Int? = null,
  public val description: String? = null,
  public val invoiceLineItem: String? = null,
  metadata: Map<String, String>? = null,
  public val quantity: Int? = null,
  public val taxAmounts: InlineV1CreditNotesPreviewGetParameterItemTaxAmountsX6bac37f9? = null,
  public val taxRates: InlineV1CreditNotesPreviewGetParameterItemTaxRatesXa47ff29f? = null,
  public val unitAmount: Int? = null,
  /**
   * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val unitAmountDecimal: String? = null,
) {
  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  public class Builder {
    private var typeValue: InlineV1CreditNotesPreviewGetParameterItemTypeX6d20630b? = null

    public var type: InlineV1CreditNotesPreviewGetParameterItemTypeX6d20630b
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

    public var taxAmounts: InlineV1CreditNotesPreviewGetParameterItemTaxAmountsX6bac37f9? = null

    public var taxRates: InlineV1CreditNotesPreviewGetParameterItemTaxRatesXa47ff29f? = null

    public var unitAmount: Int? = null

    /**
     * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var unitAmountDecimal: String? = null

    public fun build(): InlineV1CreditNotesPreviewGetParameterItemXb542d951 {
      check(typeValue != null) { "type is required" }
      return InlineV1CreditNotesPreviewGetParameterItemXb542d951(
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
    public fun build(block: Builder.() -> Unit): InlineV1CreditNotesPreviewGetParameterItemXb542d951 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CreditNotesPreviewGetParameterItemXb542d951> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CreditNotesPreviewGetParameterItemXb542d951 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CreditNotesPreviewGetParameterItemXb542d951")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CreditNotesPreviewGetParameterItemXb542d951 must be a JSON object")
      val type = json.decodeRequired<InlineV1CreditNotesPreviewGetParameterItemTypeX6d20630b>(rawObject, "type")
      return InlineV1CreditNotesPreviewGetParameterItemXb542d951(
        type = type,
        amount = rawObject["amount"]?.let { json.decodeFromJsonElement<Int>(it) },
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
        invoiceLineItem = rawObject["invoice_line_item"]?.let { json.decodeFromJsonElement<String>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
        quantity = rawObject["quantity"]?.let { json.decodeFromJsonElement<Int>(it) },
        taxAmounts = rawObject["tax_amounts"]?.let { json.decodeFromJsonElement<InlineV1CreditNotesPreviewGetParameterItemTaxAmountsX6bac37f9>(it) },
        taxRates = rawObject["tax_rates"]?.let { json.decodeFromJsonElement<InlineV1CreditNotesPreviewGetParameterItemTaxRatesXa47ff29f>(it) },
        unitAmount = rawObject["unit_amount"]?.let { json.decodeFromJsonElement<Int>(it) },
        unitAmountDecimal = rawObject["unit_amount_decimal"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CreditNotesPreviewGetParameterItemXb542d951) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CreditNotesPreviewGetParameterItemXb542d951")
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

public fun inlineV1CreditNotesPreviewGetParameterItemXb542d951(block: InlineV1CreditNotesPreviewGetParameterItemXb542d951.Builder.() -> Unit): InlineV1CreditNotesPreviewGetParameterItemXb542d951 = InlineV1CreditNotesPreviewGetParameterItemXb542d951.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1CreditNotesPreviewGetParameterItemXb542d951 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
