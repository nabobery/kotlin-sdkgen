package io.github.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1customers~1{customer}~1fund_cash_balance/post/requestBody/con
 * tent/application~1x-www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1customers~1{customer}~1fund_cash_balance/post/requestBody/con
 * tent/application~1x-www-form-urlencoded/schema
 */
@Serializable(with = InlineV1TestHelpersCustomersFundCashBalancePostRequestFormX455b73c8.Serializer::class)
public class InlineV1TestHelpersCustomersFundCashBalancePostRequestFormX455b73c8(
  /**
   * Amount to be used for this test cash balance transaction. A positive integer representing how much to fund in the
   * [smallest currency unit](https://docs.stripe.com/currencies#zero-decimal) (e.g., 100 cents to fund $1.00 or 100 to
   * fund ¥100, a zero-decimal currency).
   */
  public val amount: Int,
  /**
   * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a
   * [supported currency](https://stripe.com/docs/currencies).
   *
   * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val currency: String,
  expand: List<String>? = null,
  /**
   * A description of the test funding. This simulates free-text references supplied by customers when making bank
   * transfers to their cash balance. You can use this to test how Stripe's [reconciliation
   * algorithm](https://docs.stripe.com/payments/customer-balance/reconciliation) applies to different user inputs.
   */
  public val reference: String? = null,
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
     * A description of the test funding. This simulates free-text references supplied by customers when making bank
     * transfers to their cash balance. You can use this to test how Stripe's [reconciliation
     * algorithm](https://docs.stripe.com/payments/customer-balance/reconciliation) applies to different user inputs.
     */
    public var reference: String? = null

    public fun build(): InlineV1TestHelpersCustomersFundCashBalancePostRequestFormX455b73c8 {
      check(amountValue != null) { "amount is required" }
      check(currencyValue != null) { "currency is required" }
      return InlineV1TestHelpersCustomersFundCashBalancePostRequestFormX455b73c8(
        amount = amount,
        currency = currency,
        expand = expand,
        reference = reference,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TestHelpersCustomersFundCashBalancePostRequestFormX455b73c8 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TestHelpersCustomersFundCashBalancePostRequestFormX455b73c8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersCustomersFundCashBalancePostRequestFormX455b73c8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TestHelpersCustomersFundCashBalancePostRequestFormX455b73c8")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TestHelpersCustomersFundCashBalancePostRequestFormX455b73c8 must be a JSON object")
      val amount = json.decodeRequired<Int>(rawObject, "amount")
      val currency = json.decodeRequired<String>(rawObject, "currency")
      return InlineV1TestHelpersCustomersFundCashBalancePostRequestFormX455b73c8(
        amount = amount,
        currency = currency,
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        reference = rawObject["reference"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersCustomersFundCashBalancePostRequestFormX455b73c8) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TestHelpersCustomersFundCashBalancePostRequestFormX455b73c8")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("amount", json.encodeToJsonElement(value.amount))
        put("currency", value.currency)
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.reference?.let { put("reference", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TestHelpersCustomersFundCashBalancePostRequestFormX455b73c8(block: InlineV1TestHelpersCustomersFundCashBalancePostRequestFormX455b73c8.Builder.() -> Unit): InlineV1TestHelpersCustomersFundCashBalancePostRequestFormX455b73c8 = InlineV1TestHelpersCustomersFundCashBalancePostRequestFormX455b73c8.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TestHelpersCustomersFundCashBalancePostRequestFormX455b73c8 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
