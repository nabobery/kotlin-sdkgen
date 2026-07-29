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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1apply_customer_balance/post/requestBody/content/
 * application~1x-www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1apply_customer_balance/post/requestBody/content/
 * application~1x-www-form-urlencoded/schema
 */
@Serializable(with = InlineV1PaymentIntentsApplyCustomerBalancePostRequestFormXa54e4156.Serializer::class)
public class InlineV1PaymentIntentsApplyCustomerBalancePostRequestFormXa54e4156(
  /**
   * Amount that you intend to apply to this PaymentIntent from the customer’s cash balance. If the PaymentIntent was
   * created by an Invoice, the full amount of the PaymentIntent is applied regardless of this parameter.
   *
   * A positive integer representing how much to charge in the [smallest currency
   * unit](https://docs.stripe.com/currencies#zero-decimal) (for example, 100 cents to charge 1 USD or 100 to charge 100
   * JPY, a zero-decimal currency). The maximum amount is the amount of the PaymentIntent.
   *
   * When you omit the amount, it defaults to the remaining amount requested on the PaymentIntent.
   */
  public val amount: Int? = null,
  /**
   * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a
   * [supported currency](https://stripe.com/docs/currencies).
   *
   * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val currency: String? = null,
  expand: List<String>? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    /**
     * Amount that you intend to apply to this PaymentIntent from the customer’s cash balance. If the PaymentIntent was
     * created by an Invoice, the full amount of the PaymentIntent is applied regardless of this parameter.
     *
     * A positive integer representing how much to charge in the [smallest currency
     * unit](https://docs.stripe.com/currencies#zero-decimal) (for example, 100 cents to charge 1 USD or 100 to charge
     * 100 JPY, a zero-decimal currency). The maximum amount is the amount of the PaymentIntent.
     *
     * When you omit the amount, it defaults to the remaining amount requested on the PaymentIntent.
     */
    public var amount: Int? = null

    /**
     * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a
     * [supported currency](https://stripe.com/docs/currencies).
     *
     * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var currency: String? = null

    private var expandValue: List<String>? = null

    /**
     * Specifies which fields in the response should be expanded.
     */
    public var expand: List<String>?
      get() = expandValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        expandValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineV1PaymentIntentsApplyCustomerBalancePostRequestFormXa54e4156 = InlineV1PaymentIntentsApplyCustomerBalancePostRequestFormXa54e4156(
      amount = amount,
      currency = currency,
      expand = expand,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsApplyCustomerBalancePostRequestFormXa54e4156 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsApplyCustomerBalancePostRequestFormXa54e4156> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsApplyCustomerBalancePostRequestFormXa54e4156 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsApplyCustomerBalancePostRequestFormXa54e4156")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsApplyCustomerBalancePostRequestFormXa54e4156 must be a JSON object")
      return InlineV1PaymentIntentsApplyCustomerBalancePostRequestFormXa54e4156(
        amount = rawObject["amount"]?.let { json.decodeFromJsonElement<Int>(it) },
        currency = rawObject["currency"]?.let { json.decodeFromJsonElement<String>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsApplyCustomerBalancePostRequestFormXa54e4156) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsApplyCustomerBalancePostRequestFormXa54e4156")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.amount?.let { put("amount", json.encodeToJsonElement(it)) }
        value.currency?.let { put("currency", it) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsApplyCustomerBalancePostRequestFormXa54e4156(block: InlineV1PaymentIntentsApplyCustomerBalancePostRequestFormXa54e4156.Builder.() -> Unit): InlineV1PaymentIntentsApplyCustomerBalancePostRequestFormXa54e4156 = InlineV1PaymentIntentsApplyCustomerBalancePostRequestFormXa54e4156.build(block)
