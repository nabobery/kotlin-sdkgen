package com.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/components/schemas/customer_balance_resource_cash_balance_transaction_resource_unapplie
 * d_from_payment_transaction
 */
@Serializable(with = CustomerBalanceResourceCashBalanceTransactionResourceUnappliedFromPaymentTransaction.Serializer::class)
public class CustomerBalanceResourceCashBalanceTransactionResourceUnappliedFromPaymentTransaction(
  /**
   * The [Payment Intent](https://docs.stripe.com/api/payment_intents/object) that funds were unapplied from.
   */
  public val paymentIntent: InlineCustomerBalanceResou4f2cPaymentIntentX0d166ba8,
) {
  public class Builder {
    private var paymentIntentValue: InlineCustomerBalanceResou4f2cPaymentIntentX0d166ba8? = null

    public var paymentIntent: InlineCustomerBalanceResou4f2cPaymentIntentX0d166ba8
      get() = requireNotNull(paymentIntentValue) { "paymentIntent is required" }
      set(`value`) {
        paymentIntentValue = value
      }

    public fun build(): CustomerBalanceResourceCashBalanceTransactionResourceUnappliedFromPaymentTransaction {
      check(paymentIntentValue != null) { "paymentIntent is required" }
      return CustomerBalanceResourceCashBalanceTransactionResourceUnappliedFromPaymentTransaction(
        paymentIntent = paymentIntent,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CustomerBalanceResourceCashBalanceTransactionResourceUnappliedFromPaymentTransaction = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<CustomerBalanceResourceCashBalanceTransactionResourceUnappliedFromPaymentTransaction> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CustomerBalanceResourceCashBalanceTransactionResourceUnappliedFromPaymentTransaction {
      val jsonDecoder = decoder.requireJsonDecoder("CustomerBalanceResourceCashBalanceTransactionResourceUnappliedFromPaymentTransaction")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CustomerBalanceResourceCashBalanceTransactionResourceUnappliedFromPaymentTransaction must be a JSON object")
      val paymentIntent = json.decodeRequired<InlineCustomerBalanceResou4f2cPaymentIntentX0d166ba8>(rawObject, "payment_intent")
      return CustomerBalanceResourceCashBalanceTransactionResourceUnappliedFromPaymentTransaction(
        paymentIntent = paymentIntent,
      )
    }

    override fun serialize(encoder: Encoder, `value`: CustomerBalanceResourceCashBalanceTransactionResourceUnappliedFromPaymentTransaction) {
      val jsonEncoder = encoder.requireJsonEncoder("CustomerBalanceResourceCashBalanceTransactionResourceUnappliedFromPaymentTransaction")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("payment_intent", json.encodeToJsonElement(value.paymentIntent))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun customerBalanceResourceCashBalanceTransactionResourceUnappliedFromPaymentTransaction(block: CustomerBalanceResourceCashBalanceTransactionResourceUnappliedFromPaymentTransaction.Builder.() -> Unit): CustomerBalanceResourceCashBalanceTransactionResourceUnappliedFromPaymentTransaction = CustomerBalanceResourceCashBalanceTransactionResourceUnappliedFromPaymentTransaction.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CustomerBalanceResourceCashBalanceTransactionResourceUnappliedFromPaymentTransaction is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
