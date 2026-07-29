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
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1calculations/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/line_items/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1calculations/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/line_items/items
 */
@Serializable(with = InlineV1TaxCalculationsPostRequestFormLineItemsItemXb2c24cce.Serializer::class)
public class InlineV1TaxCalculationsPostRequestFormLineItemsItemXb2c24cce(
  public val amount: Int,
  metadata: Map<String, String>? = null,
  public val product: String? = null,
  public val quantity: Int? = null,
  public val reference: String? = null,
  public val taxBehavior:
      InlineV1TaxCalculationsPostRequestFormLineItemsItemTaxBehaviorXdb098a44? = null,
  public val taxCode: String? = null,
) {
  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  public class Builder {
    private var amountValue: Int? = null

    public var amount: Int
      get() = requireNotNull(amountValue) { "amount is required" }
      set(`value`) {
        amountValue = value
      }

    private var metadataValue: Map<String, String>? = null

    public var metadata: Map<String, String>?
      get() = metadataValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        metadataValue = value?.let { collection0 -> collection0.toMap() }
      }

    public var product: String? = null

    public var quantity: Int? = null

    public var reference: String? = null

    public var taxBehavior: InlineV1TaxCalculationsPostRequestFormLineItemsItemTaxBehaviorXdb098a44?
        = null

    public var taxCode: String? = null

    public fun build(): InlineV1TaxCalculationsPostRequestFormLineItemsItemXb2c24cce {
      check(amountValue != null) { "amount is required" }
      return InlineV1TaxCalculationsPostRequestFormLineItemsItemXb2c24cce(
        amount = amount,
        metadata = metadata,
        product = product,
        quantity = quantity,
        reference = reference,
        taxBehavior = taxBehavior,
        taxCode = taxCode,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TaxCalculationsPostRequestFormLineItemsItemXb2c24cce = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1TaxCalculationsPostRequestFormLineItemsItemXb2c24cce> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TaxCalculationsPostRequestFormLineItemsItemXb2c24cce {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TaxCalculationsPostRequestFormLineItemsItemXb2c24cce")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TaxCalculationsPostRequestFormLineItemsItemXb2c24cce must be a JSON object")
      val amount = json.decodeRequired<Int>(rawObject, "amount")
      return InlineV1TaxCalculationsPostRequestFormLineItemsItemXb2c24cce(
        amount = amount,
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
        product = rawObject["product"]?.let { json.decodeFromJsonElement<String>(it) },
        quantity = rawObject["quantity"]?.let { json.decodeFromJsonElement<Int>(it) },
        reference = rawObject["reference"]?.let { json.decodeFromJsonElement<String>(it) },
        taxBehavior = rawObject["tax_behavior"]?.let { json.decodeFromJsonElement<InlineV1TaxCalculationsPostRequestFormLineItemsItemTaxBehaviorXdb098a44>(it) },
        taxCode = rawObject["tax_code"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxCalculationsPostRequestFormLineItemsItemXb2c24cce) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TaxCalculationsPostRequestFormLineItemsItemXb2c24cce")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("amount", json.encodeToJsonElement(value.amount))
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.product?.let { put("product", it) }
        value.quantity?.let { put("quantity", json.encodeToJsonElement(it)) }
        value.reference?.let { put("reference", it) }
        value.taxBehavior?.let { put("tax_behavior", json.encodeToJsonElement(it)) }
        value.taxCode?.let { put("tax_code", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TaxCalculationsPostRequestFormLineItemsItemXb2c24cce(block: InlineV1TaxCalculationsPostRequestFormLineItemsItemXb2c24cce.Builder.() -> Unit): InlineV1TaxCalculationsPostRequestFormLineItemsItemXb2c24cce = InlineV1TaxCalculationsPostRequestFormLineItemsItemXb2c24cce.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TaxCalculationsPostRequestFormLineItemsItemXb2c24cce is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
