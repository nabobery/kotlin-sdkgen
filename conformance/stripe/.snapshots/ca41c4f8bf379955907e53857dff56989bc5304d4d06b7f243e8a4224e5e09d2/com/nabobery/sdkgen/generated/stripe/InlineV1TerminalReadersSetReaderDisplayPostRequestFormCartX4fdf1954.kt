package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * Cart details to display on the reader screen, including line items, amounts, and currency.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1readers~1{reader}~1set_reader_display/post/requestBody/content/ap
 * plication~1x-www-form-urlencoded/schema/properties/cart
 */
@Serializable(with = InlineV1TerminalReadersSetReaderDisplayPostRequestFormCartX4fdf1954.Serializer::class)
public class InlineV1TerminalReadersSetReaderDisplayPostRequestFormCartX4fdf1954(
  /**
   * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val currency: String,
  lineItems: List<InlineV1TerminalReadersSetReaderDisplayPostRequestFormCartLineItemsItemX1b9f6507>,
  public val total: Int,
  public val tax: Int? = null,
) {
  public val lineItems:
      List<InlineV1TerminalReadersSetReaderDisplayPostRequestFormCartLineItemsItemX1b9f6507> =
      lineItems.toList()

  public class Builder {
    private var currencyValue: String? = null

    public var currency: String
      get() = requireNotNull(currencyValue) { "currency is required" }
      set(`value`) {
        currencyValue = value
      }

    private var lineItemsValue:
        List<InlineV1TerminalReadersSetReaderDisplayPostRequestFormCartLineItemsItemX1b9f6507>? =
        null

    public var lineItems:
        List<InlineV1TerminalReadersSetReaderDisplayPostRequestFormCartLineItemsItemX1b9f6507>
      get() = requireNotNull(lineItemsValue) { "lineItems is required" }.toList()
      set(`value`) {
        lineItemsValue = value.toList()
      }

    private var totalValue: Int? = null

    public var total: Int
      get() = requireNotNull(totalValue) { "total is required" }
      set(`value`) {
        totalValue = value
      }

    public var tax: Int? = null

    public fun build(): InlineV1TerminalReadersSetReaderDisplayPostRequestFormCartX4fdf1954 {
      check(currencyValue != null) { "currency is required" }
      check(lineItemsValue != null) { "lineItems is required" }
      check(totalValue != null) { "total is required" }
      return InlineV1TerminalReadersSetReaderDisplayPostRequestFormCartX4fdf1954(
        currency = currency,
        lineItems = lineItems,
        total = total,
        tax = tax,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TerminalReadersSetReaderDisplayPostRequestFormCartX4fdf1954 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TerminalReadersSetReaderDisplayPostRequestFormCartX4fdf1954> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TerminalReadersSetReaderDisplayPostRequestFormCartX4fdf1954 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TerminalReadersSetReaderDisplayPostRequestFormCartX4fdf1954")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TerminalReadersSetReaderDisplayPostRequestFormCartX4fdf1954 must be a JSON object")
      val currency = json.decodeRequired<String>(rawObject, "currency")
      val lineItems = json.decodeRequired<List<InlineV1TerminalReadersSetReaderDisplayPostRequestFormCartLineItemsItemX1b9f6507>>(rawObject, "line_items")
      val total = json.decodeRequired<Int>(rawObject, "total")
      return InlineV1TerminalReadersSetReaderDisplayPostRequestFormCartX4fdf1954(
        currency = currency,
        lineItems = lineItems,
        total = total,
        tax = rawObject["tax"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalReadersSetReaderDisplayPostRequestFormCartX4fdf1954) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TerminalReadersSetReaderDisplayPostRequestFormCartX4fdf1954")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("currency", value.currency)
        put("line_items", json.encodeToJsonElement(value.lineItems))
        put("total", json.encodeToJsonElement(value.total))
        value.tax?.let { put("tax", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TerminalReadersSetReaderDisplayPostRequestFormCartX4fdf1954(block: InlineV1TerminalReadersSetReaderDisplayPostRequestFormCartX4fdf1954.Builder.() -> Unit): InlineV1TerminalReadersSetReaderDisplayPostRequestFormCartX4fdf1954 = InlineV1TerminalReadersSetReaderDisplayPostRequestFormCartX4fdf1954.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TerminalReadersSetReaderDisplayPostRequestFormCartX4fdf1954 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
