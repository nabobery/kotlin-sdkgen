package com.nabobery.sdkgen.generated.stripe

import kotlin.ConsistentCopyVisibility
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@ConsistentCopyVisibility
@Serializable
public data class TerminalReaderReaderResourceCartView internal constructor(
  public val currency: String,
  @SerialName("line_items")
  public val lineItems: List<TerminalReaderReaderResourceLineItem>,
  public val tax: Int? = null,
  public val total: Int,
)

/**
 * Represents a cart to be displayed on the reader
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/terminal_reader_reader_resource_cart
 */
@Serializable(with = TerminalReaderReaderResourceCart.Serializer::class)
public class TerminalReaderReaderResourceCart(
  /**
   * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a
   * [supported currency](https://stripe.com/docs/currencies).
   *
   * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val currency: String,
  lineItems: List<TerminalReaderReaderResourceLineItem>,
  /**
   * Total amount for the entire cart, including tax. A positive integer in the [smallest currency
   * unit](https://docs.stripe.com/currencies#zero-decimal).
   */
  public val total: Int,
  /**
   * Tax amount for the entire cart. A positive integer in the [smallest currency
   * unit](https://docs.stripe.com/currencies#zero-decimal).
   */
  public val tax: Int? = null,
) {
  /**
   * List of line items in the cart.
   */
  public val lineItems: List<TerminalReaderReaderResourceLineItem> = lineItems.toList()

  public class Builder {
    private var currencyValue: String? = null

    public var currency: String
      get() = requireNotNull(currencyValue) { "currency is required" }
      set(`value`) {
        currencyValue = value
      }

    private var lineItemsValue: List<TerminalReaderReaderResourceLineItem>? = null

    public var lineItems: List<TerminalReaderReaderResourceLineItem>
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

    /**
     * Tax amount for the entire cart. A positive integer in the [smallest currency
     * unit](https://docs.stripe.com/currencies#zero-decimal).
     */
    public var tax: Int? = null

    public fun build(): TerminalReaderReaderResourceCart {
      check(currencyValue != null) { "currency is required" }
      check(lineItemsValue != null) { "lineItems is required" }
      check(totalValue != null) { "total is required" }
      return TerminalReaderReaderResourceCart(
        currency = currency,
        lineItems = lineItems,
        total = total,
        tax = tax,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TerminalReaderReaderResourceCart = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<TerminalReaderReaderResourceCart> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TerminalReaderReaderResourceCart {
      val jsonDecoder = decoder.requireJsonDecoder("TerminalReaderReaderResourceCart")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TerminalReaderReaderResourceCart must be a JSON object")
      val currency = json.decodeRequired<String>(rawObject, "currency")
      val lineItems = json.decodeRequired<List<TerminalReaderReaderResourceLineItem>>(rawObject, "line_items")
      val total = json.decodeRequired<Int>(rawObject, "total")
      return TerminalReaderReaderResourceCart(
        currency = currency,
        lineItems = lineItems,
        total = total,
        tax = rawObject["tax"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TerminalReaderReaderResourceCart) {
      val jsonEncoder = encoder.requireJsonEncoder("TerminalReaderReaderResourceCart")
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

public fun terminalReaderReaderResourceCart(block: TerminalReaderReaderResourceCart.Builder.() -> Unit): TerminalReaderReaderResourceCart = TerminalReaderReaderResourceCart.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TerminalReaderReaderResourceCart is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
