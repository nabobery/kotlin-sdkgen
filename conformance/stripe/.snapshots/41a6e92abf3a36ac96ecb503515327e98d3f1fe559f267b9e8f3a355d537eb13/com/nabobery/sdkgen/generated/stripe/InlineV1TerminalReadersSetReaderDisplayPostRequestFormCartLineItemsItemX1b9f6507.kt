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
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1readers~1{reader}~1set_reader_display/post/requestBody/content/ap
 * plication~1x-www-form-urlencoded/schema/properties/cart/properties/line_items/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1readers~1{reader}~1set_reader_display/post/requestBody/content/ap
 * plication~1x-www-form-urlencoded/schema/properties/cart/properties/line_items/items
 */
@Serializable(with = InlineV1TerminalReadersSetReaderDisplayPostRequestFormCartLineItemsItemX1b9f6507.Serializer::class)
public class InlineV1TerminalReadersSetReaderDisplayPostRequestFormCartLineItemsItemX1b9f6507(
  public val amount: Int,
  public val description: String,
  public val quantity: Int,
) {
  public class Builder {
    private var amountValue: Int? = null

    public var amount: Int
      get() = requireNotNull(amountValue) { "amount is required" }
      set(`value`) {
        amountValue = value
      }

    private var descriptionValue: String? = null

    public var description: String
      get() = requireNotNull(descriptionValue) { "description is required" }
      set(`value`) {
        descriptionValue = value
      }

    private var quantityValue: Int? = null

    public var quantity: Int
      get() = requireNotNull(quantityValue) { "quantity is required" }
      set(`value`) {
        quantityValue = value
      }

    public fun build(): InlineV1TerminalReadersSetReaderDisplayPostRequestFormCartLineItemsItemX1b9f6507 {
      check(amountValue != null) { "amount is required" }
      check(descriptionValue != null) { "description is required" }
      check(quantityValue != null) { "quantity is required" }
      return InlineV1TerminalReadersSetReaderDisplayPostRequestFormCartLineItemsItemX1b9f6507(
        amount = amount,
        description = description,
        quantity = quantity,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TerminalReadersSetReaderDisplayPostRequestFormCartLineItemsItemX1b9f6507 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TerminalReadersSetReaderDisplayPostRequestFormCartLineItemsItemX1b9f6507> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TerminalReadersSetReaderDisplayPostRequestFormCartLineItemsItemX1b9f6507 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TerminalReadersSetReaderDisplayPostRequestFormCartLineItemsItemX1b9f6507")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TerminalReadersSetReaderDisplayPostRequestFormCartLineItemsItemX1b9f6507 must be a JSON object")
      val amount = json.decodeRequired<Int>(rawObject, "amount")
      val description = json.decodeRequired<String>(rawObject, "description")
      val quantity = json.decodeRequired<Int>(rawObject, "quantity")
      return InlineV1TerminalReadersSetReaderDisplayPostRequestFormCartLineItemsItemX1b9f6507(
        amount = amount,
        description = description,
        quantity = quantity,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalReadersSetReaderDisplayPostRequestFormCartLineItemsItemX1b9f6507) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TerminalReadersSetReaderDisplayPostRequestFormCartLineItemsItemX1b9f6507")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("amount", json.encodeToJsonElement(value.amount))
        put("description", value.description)
        put("quantity", json.encodeToJsonElement(value.quantity))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TerminalReadersSetReaderDisplayPostRequestFormCartLineItemsItemX1b9f6507(block: InlineV1TerminalReadersSetReaderDisplayPostRequestFormCartLineItemsItemX1b9f6507.Builder.() -> Unit): InlineV1TerminalReadersSetReaderDisplayPostRequestFormCartLineItemsItemX1b9f6507 = InlineV1TerminalReadersSetReaderDisplayPostRequestFormCartLineItemsItemX1b9f6507.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TerminalReadersSetReaderDisplayPostRequestFormCartLineItemsItemX1b9f6507 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
