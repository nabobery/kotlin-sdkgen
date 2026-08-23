package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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

@Serializable
public data class PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceWalletView(
  @SerialName("apple_pay")
  public val applePay:
      PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceWalletResourceApplePay? = null,
  @SerialName("dynamic_last4")
  public val dynamicLast4: String? = null,
  @SerialName("google_pay")
  public val googlePay: JsonObject? = null,
  public val type: String,
)

/**
 *
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payments_primitives_payment_records_resource_payment_method_card_det
 * ails_resource_wallet
 */
@Serializable(with = PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceWallet.Serializer::class)
public class PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceWallet(
  /**
   * The type of the card wallet, one of `apple_pay` or `google_pay`. An additional hash is included on the Wallet
   * subhash with a name matching this value. It contains additional information specific to the card wallet type.
   */
  public val type: String,
  public val applePay:
      PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceWalletResourceApplePay? = null,
  /**
   * (For tokenized numbers only.) The last four digits of the device account number.
   */
  public val dynamicLast4: String? = null,
  public val googlePay: JsonObject? = null,
) {
  public class Builder {
    private var typeValue: String? = null

    public var type: String
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var applePay:
        PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceWalletResourceApplePay?
        = null

    /**
     * (For tokenized numbers only.) The last four digits of the device account number.
     */
    public var dynamicLast4: String? = null

    public var googlePay: JsonObject? = null

    public fun build(): PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceWallet {
      check(typeValue != null) { "type is required" }
      return PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceWallet(
        type = type,
        applePay = applePay,
        dynamicLast4 = dynamicLast4,
        googlePay = googlePay,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceWallet = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceWallet> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceWallet {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceWallet")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceWallet must be a JSON object")
      val type = json.decodeRequired<String>(rawObject, "type")
      return PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceWallet(
        type = type,
        applePay = rawObject["apple_pay"]?.let { json.decodeFromJsonElement<PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceWalletResourceApplePay>(it) },
        dynamicLast4 = rawObject["dynamic_last4"]?.let { json.decodeFromJsonElement<String>(it) },
        googlePay = rawObject["google_pay"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceWallet) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceWallet")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", value.type)
        value.applePay?.let { put("apple_pay", json.encodeToJsonElement(it)) }
        value.dynamicLast4?.let { put("dynamic_last4", it) }
        value.googlePay?.let { put("google_pay", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceWallet(block: PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceWallet.Builder.() -> Unit): PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceWallet = PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceWallet.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceWallet is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
