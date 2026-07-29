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
 * Source: sdkgen://source/openapi.json#/components/schemas/source_order_item
 */
@Serializable(with = SourceOrderItem.Serializer::class)
public class SourceOrderItem(
  /**
   * The amount (price) for this order item.
   */
  public val amount: Int? = null,
  /**
   * This currency of this order item. Required when `amount` is present.
   */
  public val currency: String? = null,
  /**
   * Human-readable description for this order item.
   */
  public val description: String? = null,
  /**
   * The ID of the associated object for this line item. Expandable if not null (e.g., expandable to a SKU).
   */
  public val parent: String? = null,
  /**
   * The quantity of this order item. When type is `sku`, this is the number of instances of the SKU to be ordered.
   */
  public val quantity: Int? = null,
  /**
   * The type of this order item. Must be `sku`, `tax`, or `shipping`.
   */
  public val type: String? = null,
) {
  public class Builder {
    /**
     * The amount (price) for this order item.
     */
    public var amount: Int? = null

    /**
     * This currency of this order item. Required when `amount` is present.
     */
    public var currency: String? = null

    /**
     * Human-readable description for this order item.
     */
    public var description: String? = null

    /**
     * The ID of the associated object for this line item. Expandable if not null (e.g., expandable to a SKU).
     */
    public var parent: String? = null

    /**
     * The quantity of this order item. When type is `sku`, this is the number of instances of the SKU to be ordered.
     */
    public var quantity: Int? = null

    /**
     * The type of this order item. Must be `sku`, `tax`, or `shipping`.
     */
    public var type: String? = null

    public fun build(): SourceOrderItem = SourceOrderItem(
      amount = amount,
      currency = currency,
      description = description,
      parent = parent,
      quantity = quantity,
      type = type,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SourceOrderItem = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<SourceOrderItem> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SourceOrderItem {
      val jsonDecoder = decoder.requireJsonDecoder("SourceOrderItem")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SourceOrderItem must be a JSON object")
      return SourceOrderItem(
        amount = rawObject["amount"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        currency = rawObject["currency"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        description = rawObject["description"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        parent = rawObject["parent"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        quantity = rawObject["quantity"]?.let { json.decodeFromJsonElement<Int>(it) },
        type = rawObject["type"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SourceOrderItem) {
      val jsonEncoder = encoder.requireJsonEncoder("SourceOrderItem")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.amount?.let { put("amount", json.encodeToJsonElement(it)) }
        value.currency?.let { put("currency", it) }
        value.description?.let { put("description", it) }
        value.parent?.let { put("parent", it) }
        value.quantity?.let { put("quantity", json.encodeToJsonElement(it)) }
        value.type?.let { put("type", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun sourceOrderItem(block: SourceOrderItem.Builder.() -> Unit): SourceOrderItem = SourceOrderItem.build(block)
