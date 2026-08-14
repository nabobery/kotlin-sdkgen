package io.github.nabobery.sdkgen.generated.stripe

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
 *
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/customer_balance_resource_cash_balance_transaction_resource_applied_
 * to_payment_transaction
 */
@Serializable(with = CustomerBalanceResourceCashBalanceTransactionResourceAppliedToPaymentTransaction.Serializer::class)
public class CustomerBalanceResourceCashBalanceTransactionResourceAppliedToPaymentTransaction(
  /**
   * The [Payment Intent](https://docs.stripe.com/api/payment_intents/object) that funds were applied to.
   */
  public val paymentIntent: InlineCustomerBalanceResou9e8cPaymentIntentX4b2cc7d8,
) {
  public class Builder {
    private var paymentIntentValue: InlineCustomerBalanceResou9e8cPaymentIntentX4b2cc7d8? = null

    public var paymentIntent: InlineCustomerBalanceResou9e8cPaymentIntentX4b2cc7d8
      get() = requireNotNull(paymentIntentValue) { "paymentIntent is required" }
      set(`value`) {
        paymentIntentValue = value
      }

    public fun build(): CustomerBalanceResourceCashBalanceTransactionResourceAppliedToPaymentTransaction {
      check(paymentIntentValue != null) { "paymentIntent is required" }
      return CustomerBalanceResourceCashBalanceTransactionResourceAppliedToPaymentTransaction(
        paymentIntent = paymentIntent,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CustomerBalanceResourceCashBalanceTransactionResourceAppliedToPaymentTransaction = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<CustomerBalanceResourceCashBalanceTransactionResourceAppliedToPaymentTransaction> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CustomerBalanceResourceCashBalanceTransactionResourceAppliedToPaymentTransaction {
      val jsonDecoder = decoder.requireJsonDecoder("CustomerBalanceResourceCashBalanceTransactionResourceAppliedToPaymentTransaction")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CustomerBalanceResourceCashBalanceTransactionResourceAppliedToPaymentTransaction must be a JSON object")
      val paymentIntent = json.decodeRequired<InlineCustomerBalanceResou9e8cPaymentIntentX4b2cc7d8>(rawObject, "payment_intent")
      return CustomerBalanceResourceCashBalanceTransactionResourceAppliedToPaymentTransaction(
        paymentIntent = paymentIntent,
      )
    }

    override fun serialize(encoder: Encoder, `value`: CustomerBalanceResourceCashBalanceTransactionResourceAppliedToPaymentTransaction) {
      val jsonEncoder = encoder.requireJsonEncoder("CustomerBalanceResourceCashBalanceTransactionResourceAppliedToPaymentTransaction")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("payment_intent", json.encodeToJsonElement(value.paymentIntent))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun customerBalanceResourceCashBalanceTransactionResourceAppliedToPaymentTransaction(block: CustomerBalanceResourceCashBalanceTransactionResourceAppliedToPaymentTransaction.Builder.() -> Unit): CustomerBalanceResourceCashBalanceTransactionResourceAppliedToPaymentTransaction = CustomerBalanceResourceCashBalanceTransactionResourceAppliedToPaymentTransaction.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CustomerBalanceResourceCashBalanceTransactionResourceAppliedToPaymentTransaction is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
