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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_options_customer_balance_eu_bank_account
 */
@Serializable(with = PaymentMethodOptionsCustomerBalanceEuBankAccount.Serializer::class)
public class PaymentMethodOptionsCustomerBalanceEuBankAccount(
  /**
   * The desired country code of the bank account information. Permitted values include: `DE`, `FR`, `IE`, or `NL`.
   */
  public val country: InlinePaymentMethodOptionsCustomerBalanceEuBankAccountCountryXa4573c9a,
) {
  public class Builder {
    private var countryValue:
        InlinePaymentMethodOptionsCustomerBalanceEuBankAccountCountryXa4573c9a? = null

    public var country: InlinePaymentMethodOptionsCustomerBalanceEuBankAccountCountryXa4573c9a
      get() = requireNotNull(countryValue) { "country is required" }
      set(`value`) {
        countryValue = value
      }

    public fun build(): PaymentMethodOptionsCustomerBalanceEuBankAccount {
      check(countryValue != null) { "country is required" }
      return PaymentMethodOptionsCustomerBalanceEuBankAccount(
        country = country,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentMethodOptionsCustomerBalanceEuBankAccount = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentMethodOptionsCustomerBalanceEuBankAccount> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentMethodOptionsCustomerBalanceEuBankAccount {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodOptionsCustomerBalanceEuBankAccount")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentMethodOptionsCustomerBalanceEuBankAccount must be a JSON object")
      val country = json.decodeRequired<InlinePaymentMethodOptionsCustomerBalanceEuBankAccountCountryXa4573c9a>(rawObject, "country")
      return PaymentMethodOptionsCustomerBalanceEuBankAccount(
        country = country,
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentMethodOptionsCustomerBalanceEuBankAccount) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodOptionsCustomerBalanceEuBankAccount")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("country", json.encodeToJsonElement(value.country))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentMethodOptionsCustomerBalanceEuBankAccount(block: PaymentMethodOptionsCustomerBalanceEuBankAccount.Builder.() -> Unit): PaymentMethodOptionsCustomerBalanceEuBankAccount = PaymentMethodOptionsCustomerBalanceEuBankAccount.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentMethodOptionsCustomerBalanceEuBankAccount is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
