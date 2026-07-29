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
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/line_items/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/line_items/items
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormLineItemsItemX363558c4.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormLineItemsItemX363558c4(
  public val id: String,
  public val adjustableQuantity:
      InlineV1PaymentLinksPostRequestFormLineItemsItemAdjustableQuantityX54c231e1? = null,
  public val quantity: Int? = null,
) {
  public class Builder {
    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    public var adjustableQuantity:
        InlineV1PaymentLinksPostRequestFormLineItemsItemAdjustableQuantityX54c231e1? = null

    public var quantity: Int? = null

    public fun build(): InlineV1PaymentLinksPostRequestFormLineItemsItemX363558c4 {
      check(idValue != null) { "id is required" }
      return InlineV1PaymentLinksPostRequestFormLineItemsItemX363558c4(
        id = id,
        adjustableQuantity = adjustableQuantity,
        quantity = quantity,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormLineItemsItemX363558c4 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormLineItemsItemX363558c4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormLineItemsItemX363558c4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentLinksPostRequestFormLineItemsItemX363558c4")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentLinksPostRequestFormLineItemsItemX363558c4 must be a JSON object")
      val id = json.decodeRequired<String>(rawObject, "id")
      return InlineV1PaymentLinksPostRequestFormLineItemsItemX363558c4(
        id = id,
        adjustableQuantity = rawObject["adjustable_quantity"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormLineItemsItemAdjustableQuantityX54c231e1>(it) },
        quantity = rawObject["quantity"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormLineItemsItemX363558c4) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentLinksPostRequestFormLineItemsItemX363558c4")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("id", value.id)
        value.adjustableQuantity?.let { put("adjustable_quantity", json.encodeToJsonElement(it)) }
        value.quantity?.let { put("quantity", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentLinksPostRequestFormLineItemsItemX363558c4(block: InlineV1PaymentLinksPostRequestFormLineItemsItemX363558c4.Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormLineItemsItemX363558c4 = InlineV1PaymentLinksPostRequestFormLineItemsItemX363558c4.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1PaymentLinksPostRequestFormLineItemsItemX363558c4 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
