package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
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
 * A representation of an amount of money, consisting of an amount and a currency.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payments_primitives_payment_records_resource_amount
 */
@Serializable(with = PaymentsPrimitivesPaymentRecordsResourceAmount.Serializer::class)
public class PaymentsPrimitivesPaymentRecordsResourceAmount(
  /**
   * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a
   * [supported currency](https://stripe.com/docs/currencies).
   *
   * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val currency: String,
  /**
   * A positive integer representing the amount in the currency's [minor
   * unit](https://docs.stripe.com/currencies#zero-decimal). For example, `100` can represent 1 USD or 100 JPY.
   */
  public val `value`: Int,
) {
  public class Builder {
    private var currencyValue: String? = null

    public var currency: String
      get() = requireNotNull(currencyValue) { "currency is required" }
      set(`value`) {
        currencyValue = value
      }

    private var valueValue: Int? = null

    public var `value`: Int
      get() = requireNotNull(valueValue) { "value is required" }
      set(`value`) {
        valueValue = value
      }

    public fun build(): PaymentsPrimitivesPaymentRecordsResourceAmount {
      check(currencyValue != null) { "currency is required" }
      check(valueValue != null) { "value is required" }
      return PaymentsPrimitivesPaymentRecordsResourceAmount(
        currency = currency,
        value = value,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentsPrimitivesPaymentRecordsResourceAmount = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentsPrimitivesPaymentRecordsResourceAmount> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentsPrimitivesPaymentRecordsResourceAmount {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentsPrimitivesPaymentRecordsResourceAmount")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentsPrimitivesPaymentRecordsResourceAmount must be a JSON object")
      val currency = json.decodeRequired<String>(rawObject, "currency")
      val value = json.decodeRequired<Int>(rawObject, "value")
      return PaymentsPrimitivesPaymentRecordsResourceAmount(
        currency = currency,
        value = value,
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentsPrimitivesPaymentRecordsResourceAmount) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentsPrimitivesPaymentRecordsResourceAmount")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("currency", value.currency)
        put("value", json.encodeToJsonElement(value.value))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentsPrimitivesPaymentRecordsResourceAmount(block: PaymentsPrimitivesPaymentRecordsResourceAmount.Builder.() -> Unit): PaymentsPrimitivesPaymentRecordsResourceAmount = PaymentsPrimitivesPaymentRecordsResourceAmount.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentsPrimitivesPaymentRecordsResourceAmount is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
