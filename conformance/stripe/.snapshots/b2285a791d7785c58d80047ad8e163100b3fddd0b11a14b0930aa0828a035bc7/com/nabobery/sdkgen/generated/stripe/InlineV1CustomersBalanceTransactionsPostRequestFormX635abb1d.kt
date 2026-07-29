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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1balance_transactions/post/requestBody/content/applic
 * ation~1x-www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1balance_transactions/post/requestBody/content/applic
 * ation~1x-www-form-urlencoded/schema
 */
@Serializable(with = InlineV1CustomersBalanceTransactionsPostRequestFormX635abb1d.Serializer::class)
public class InlineV1CustomersBalanceTransactionsPostRequestFormX635abb1d(
  /**
   * The integer amount in **cents (or local equivalent)** to apply to the customer's credit balance.
   */
  public val amount: Int,
  /**
   * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a
   * [supported currency](https://stripe.com/docs/currencies). Specifies the
   * [`invoice_credit_balance`](https://docs.stripe.com/api/customers/object#customer_object-invoice_credit_balance)
   * that this transaction will apply to. If the customer's `currency` is not set, it will be updated to this value.
   *
   * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val currency: String,
  /**
   * An arbitrary string attached to the object. Often useful for displaying to users.
   */
  public val description: String? = null,
  expand: List<String>? = null,
  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format. Individual keys can be unset by posting
   * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
   */
  public val metadata: InlineV1CustomersBalanceTransactionsPostRequestFormMetadataXdddf617d? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

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
     * An arbitrary string attached to the object. Often useful for displaying to users.
     */
    public var description: String? = null

    private var expandValue: List<String>? = null

    /**
     * Specifies which fields in the response should be expanded.
     */
    public var expand: List<String>?
      get() = expandValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        expandValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
     * useful for storing additional information about the object in a structured format. Individual keys can be unset
     * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
     */
    public var metadata: InlineV1CustomersBalanceTransactionsPostRequestFormMetadataXdddf617d? =
        null

    public fun build(): InlineV1CustomersBalanceTransactionsPostRequestFormX635abb1d {
      check(amountValue != null) { "amount is required" }
      check(currencyValue != null) { "currency is required" }
      return InlineV1CustomersBalanceTransactionsPostRequestFormX635abb1d(
        amount = amount,
        currency = currency,
        description = description,
        expand = expand,
        metadata = metadata,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CustomersBalanceTransactionsPostRequestFormX635abb1d = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1CustomersBalanceTransactionsPostRequestFormX635abb1d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersBalanceTransactionsPostRequestFormX635abb1d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersBalanceTransactionsPostRequestFormX635abb1d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CustomersBalanceTransactionsPostRequestFormX635abb1d must be a JSON object")
      val amount = json.decodeRequired<Int>(rawObject, "amount")
      val currency = json.decodeRequired<String>(rawObject, "currency")
      return InlineV1CustomersBalanceTransactionsPostRequestFormX635abb1d(
        amount = amount,
        currency = currency,
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineV1CustomersBalanceTransactionsPostRequestFormMetadataXdddf617d>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersBalanceTransactionsPostRequestFormX635abb1d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CustomersBalanceTransactionsPostRequestFormX635abb1d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("amount", json.encodeToJsonElement(value.amount))
        put("currency", value.currency)
        value.description?.let { put("description", it) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CustomersBalanceTransactionsPostRequestFormX635abb1d(block: InlineV1CustomersBalanceTransactionsPostRequestFormX635abb1d.Builder.() -> Unit): InlineV1CustomersBalanceTransactionsPostRequestFormX635abb1d = InlineV1CustomersBalanceTransactionsPostRequestFormX635abb1d.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1CustomersBalanceTransactionsPostRequestFormX635abb1d is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
