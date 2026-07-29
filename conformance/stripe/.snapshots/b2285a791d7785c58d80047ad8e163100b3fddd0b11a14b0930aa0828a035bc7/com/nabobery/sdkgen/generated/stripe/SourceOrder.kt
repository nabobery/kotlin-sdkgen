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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/source_order
 */
@Serializable(with = SourceOrder.Serializer::class)
public class SourceOrder(
  /**
   * A positive integer in the smallest currency unit (that is, 100 cents for $1.00, or 1 for ¥1, Japanese Yen being a
   * zero-decimal currency) representing the total amount for the order.
   */
  public val amount: Int,
  /**
   * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a
   * [supported currency](https://stripe.com/docs/currencies).
   *
   * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val currency: String,
  /**
   * The email address of the customer placing the order.
   */
  public val email: String? = null,
  items: List<SourceOrderItem>? = null,
  public val shipping: Shipping? = null,
) {
  /**
   * List of items constituting the order.
   */
  public val items: List<SourceOrderItem>? = items?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var amountValue: Int? = null

    public var amount: Int
      get() = requireNotNull(amountValue) { "amount is required" }
      set(`value`) {
        amountValue = value
      }

    private var currencyValue: String? = null

    public var currency: String
      get() = requireNotNull(currencyValue) { "currency is required" }
      set(`value`) {
        currencyValue = value
      }

    /**
     * The email address of the customer placing the order.
     */
    public var email: String? = null

    private var itemsValue: List<SourceOrderItem>? = null

    /**
     * List of items constituting the order.
     */
    public var items: List<SourceOrderItem>?
      get() = itemsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        itemsValue = value?.let { collection0 -> collection0.toList() }
      }

    public var shipping: Shipping? = null

    public fun build(): SourceOrder {
      check(amountValue != null) { "amount is required" }
      check(currencyValue != null) { "currency is required" }
      return SourceOrder(
        amount = amount,
        currency = currency,
        email = email,
        items = items,
        shipping = shipping,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SourceOrder = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<SourceOrder> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SourceOrder {
      val jsonDecoder = decoder.requireJsonDecoder("SourceOrder")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SourceOrder must be a JSON object")
      val amount = json.decodeRequired<Int>(rawObject, "amount")
      val currency = json.decodeRequired<String>(rawObject, "currency")
      return SourceOrder(
        amount = amount,
        currency = currency,
        email = rawObject["email"]?.let { json.decodeFromJsonElement<String>(it) },
        items = rawObject["items"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<SourceOrderItem>?>(element) },
        shipping = rawObject["shipping"]?.let { json.decodeFromJsonElement<Shipping>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SourceOrder) {
      val jsonEncoder = encoder.requireJsonEncoder("SourceOrder")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("amount", json.encodeToJsonElement(value.amount))
        put("currency", value.currency)
        value.email?.let { put("email", it) }
        value.items?.let { put("items", json.encodeToJsonElement(it)) }
        value.shipping?.let { put("shipping", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun sourceOrder(block: SourceOrder.Builder.() -> Unit): SourceOrder = SourceOrder.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("SourceOrder is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
