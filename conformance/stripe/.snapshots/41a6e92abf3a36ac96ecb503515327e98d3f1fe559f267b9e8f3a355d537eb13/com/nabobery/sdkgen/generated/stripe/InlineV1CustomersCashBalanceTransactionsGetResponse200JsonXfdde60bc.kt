package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
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
 * Customers with certain payments enabled have a cash balance, representing funds that were paid
 * by the customer to a merchant, but have not yet been allocated to a payment. Cash Balance Transactions
 * represent when funds are moved into or out of this balance. This includes funding by the customer, allocation
 * to payments, and refunds to the customer.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1cash_balance_transactions/get/responses/200/content/
 * application~1json/schema
 */
@Serializable(with = InlineV1CustomersCashBalanceTransactionsGetResponse200JsonXfdde60bc.Serializer::class)
public class InlineV1CustomersCashBalanceTransactionsGetResponse200JsonXfdde60bc(
  `data`: List<CustomerCashBalanceTransaction>,
  /**
   * True if this list has another page of items after this one that can be fetched.
   */
  public val hasMore: Boolean,
  /**
   * String representing the object's type. Objects of the same type share the same value. Always has the value `list`.
   */
  public val objectValue:
      InlineV1CustomersCashBalanceTransactionsGetResponse200JsonObjectValueX6908e996,
  /**
   * The URL where this list can be accessed.
   */
  public val url: String,
) {
  /**
   * Details about each object.
   */
  public val `data`: List<CustomerCashBalanceTransaction> = data.toList()

  public class Builder {
    private var dataValue: List<CustomerCashBalanceTransaction>? = null

    public var `data`: List<CustomerCashBalanceTransaction>
      get() = requireNotNull(dataValue) { "data is required" }.toList()
      set(`value`) {
        dataValue = value.toList()
      }

    private var hasMoreValue: Boolean? = null

    public var hasMore: Boolean
      get() = requireNotNull(hasMoreValue) { "hasMore is required" }
      set(`value`) {
        hasMoreValue = value
      }

    private var objectValueValue:
        InlineV1CustomersCashBalanceTransactionsGetResponse200JsonObjectValueX6908e996? = null

    public var objectValue:
        InlineV1CustomersCashBalanceTransactionsGetResponse200JsonObjectValueX6908e996
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    public fun build(): InlineV1CustomersCashBalanceTransactionsGetResponse200JsonXfdde60bc {
      check(dataValue != null) { "data is required" }
      check(hasMoreValue != null) { "hasMore is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(urlValue != null) { "url is required" }
      return InlineV1CustomersCashBalanceTransactionsGetResponse200JsonXfdde60bc(
        data = data,
        hasMore = hasMore,
        objectValue = objectValue,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CustomersCashBalanceTransactionsGetResponse200JsonXfdde60bc = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CustomersCashBalanceTransactionsGetResponse200JsonXfdde60bc> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersCashBalanceTransactionsGetResponse200JsonXfdde60bc {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersCashBalanceTransactionsGetResponse200JsonXfdde60bc")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CustomersCashBalanceTransactionsGetResponse200JsonXfdde60bc must be a JSON object")
      val data = json.decodeRequired<List<CustomerCashBalanceTransaction>>(rawObject, "data")
      val hasMore = json.decodeRequired<Boolean>(rawObject, "has_more")
      val objectValue = json.decodeRequired<InlineV1CustomersCashBalanceTransactionsGetResponse200JsonObjectValueX6908e996>(rawObject, "object")
      val url = json.decodeRequired<String>(rawObject, "url")
      return InlineV1CustomersCashBalanceTransactionsGetResponse200JsonXfdde60bc(
        data = data,
        hasMore = hasMore,
        objectValue = objectValue,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersCashBalanceTransactionsGetResponse200JsonXfdde60bc) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CustomersCashBalanceTransactionsGetResponse200JsonXfdde60bc")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", json.encodeToJsonElement(value.data))
        put("has_more", json.encodeToJsonElement(value.hasMore))
        put("object", json.encodeToJsonElement(value.objectValue))
        put("url", value.url)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CustomersCashBalanceTransactionsGetResponse200JsonXfdde60bc(block: InlineV1CustomersCashBalanceTransactionsGetResponse200JsonXfdde60bc.Builder.() -> Unit): InlineV1CustomersCashBalanceTransactionsGetResponse200JsonXfdde60bc = InlineV1CustomersCashBalanceTransactionsGetResponse200JsonXfdde60bc.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1CustomersCashBalanceTransactionsGetResponse200JsonXfdde60bc is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
