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
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1treasury~1received_credits/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1treasury~1received_credits/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema
 */
@Serializable(with = InlineV1TestHelpersTreasuryReceivedCreditsPostRequestFormX388af435.Serializer::class)
public class InlineV1TestHelpersTreasuryReceivedCreditsPostRequestFormX388af435(
  /**
   * Amount (in cents) to be transferred.
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
   * The FinancialAccount to send funds to.
   */
  public val financialAccount: String,
  /**
   * Specifies the network rails to be used. If not set, will default to the PaymentMethod's preferred network. See the
   * [docs](https://docs.stripe.com/treasury/money-movement/timelines) to learn more about money movement timelines for
   * each network type.
   */
  public val network: InlineV1TestHelpersTreasuryReceivedCreditsPostRequestFormNetworkX26503d6c,
  /**
   * An arbitrary string attached to the object. Often useful for displaying to users.
   */
  public val description: String? = null,
  expand: List<String>? = null,
  /**
   * Initiating payment method details for the object.
   */
  public val initiatingPaymentMethodDetails:
      InlineV1TestHelpersTreasured25PostRequestFormInitiatingPaymentMetfafcXa025364f? = null,
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

    private var financialAccountValue: String? = null

    public var financialAccount: String
      get() = requireNotNull(financialAccountValue) { "financialAccount is required" }
      set(`value`) {
        financialAccountValue = value
      }

    private var networkValue:
        InlineV1TestHelpersTreasuryReceivedCreditsPostRequestFormNetworkX26503d6c? = null

    public var network: InlineV1TestHelpersTreasuryReceivedCreditsPostRequestFormNetworkX26503d6c
      get() = requireNotNull(networkValue) { "network is required" }
      set(`value`) {
        networkValue = value
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
     * Initiating payment method details for the object.
     */
    public var initiatingPaymentMethodDetails:
        InlineV1TestHelpersTreasured25PostRequestFormInitiatingPaymentMetfafcXa025364f? = null

    public fun build(): InlineV1TestHelpersTreasuryReceivedCreditsPostRequestFormX388af435 {
      check(amountValue != null) { "amount is required" }
      check(currencyValue != null) { "currency is required" }
      check(financialAccountValue != null) { "financialAccount is required" }
      check(networkValue != null) { "network is required" }
      return InlineV1TestHelpersTreasuryReceivedCreditsPostRequestFormX388af435(
        amount = amount,
        currency = currency,
        financialAccount = financialAccount,
        network = network,
        description = description,
        expand = expand,
        initiatingPaymentMethodDetails = initiatingPaymentMethodDetails,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TestHelpersTreasuryReceivedCreditsPostRequestFormX388af435 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TestHelpersTreasuryReceivedCreditsPostRequestFormX388af435> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersTreasuryReceivedCreditsPostRequestFormX388af435 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TestHelpersTreasuryReceivedCreditsPostRequestFormX388af435")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TestHelpersTreasuryReceivedCreditsPostRequestFormX388af435 must be a JSON object")
      val amount = json.decodeRequired<Int>(rawObject, "amount")
      val currency = json.decodeRequired<String>(rawObject, "currency")
      val financialAccount = json.decodeRequired<String>(rawObject, "financial_account")
      val network = json.decodeRequired<InlineV1TestHelpersTreasuryReceivedCreditsPostRequestFormNetworkX26503d6c>(rawObject, "network")
      return InlineV1TestHelpersTreasuryReceivedCreditsPostRequestFormX388af435(
        amount = amount,
        currency = currency,
        financialAccount = financialAccount,
        network = network,
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        initiatingPaymentMethodDetails = rawObject["initiating_payment_method_details"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersTreasured25PostRequestFormInitiatingPaymentMetfafcXa025364f>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersTreasuryReceivedCreditsPostRequestFormX388af435) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TestHelpersTreasuryReceivedCreditsPostRequestFormX388af435")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("amount", json.encodeToJsonElement(value.amount))
        put("currency", value.currency)
        put("financial_account", value.financialAccount)
        put("network", json.encodeToJsonElement(value.network))
        value.description?.let { put("description", it) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.initiatingPaymentMethodDetails?.let { put("initiating_payment_method_details", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TestHelpersTreasuryReceivedCreditsPostRequestFormX388af435(block: InlineV1TestHelpersTreasuryReceivedCreditsPostRequestFormX388af435.Builder.() -> Unit): InlineV1TestHelpersTreasuryReceivedCreditsPostRequestFormX388af435 = InlineV1TestHelpersTreasuryReceivedCreditsPostRequestFormX388af435.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TestHelpersTreasuryReceivedCreditsPostRequestFormX388af435 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
