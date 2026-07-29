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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class PaymentMethodDetailsCardWalletView(
  @SerialName("amex_express_checkout")
  public val amexExpressCheckout: JsonObject? = null,
  @SerialName("apple_pay")
  public val applePay: JsonObject? = null,
  @SerialName("dynamic_last4")
  public val dynamicLast4: String? = null,
  @SerialName("google_pay")
  public val googlePay: JsonObject? = null,
  public val link: JsonObject? = null,
  public val masterpass: PaymentMethodDetailsCardWalletMasterpass? = null,
  @SerialName("samsung_pay")
  public val samsungPay: JsonObject? = null,
  public val type: InlinePaymentMethodDetailsCardWalletTypeXc9b9a018,
  @SerialName("visa_checkout")
  public val visaCheckout: PaymentMethodDetailsCardWalletVisaCheckout? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details_card_wallet
 */
@Serializable(with = PaymentMethodDetailsCardWallet.Serializer::class)
public class PaymentMethodDetailsCardWallet(
  /**
   * The type of the card wallet, one of `amex_express_checkout`, `apple_pay`, `google_pay`, `masterpass`,
   * `samsung_pay`, `visa_checkout`, or `link`. An additional hash is included on the Wallet subhash with a name
   * matching this value. It contains additional information specific to the card wallet type.
   */
  public val type: InlinePaymentMethodDetailsCardWalletTypeXc9b9a018,
  public val amexExpressCheckout: JsonObject? = null,
  public val applePay: JsonObject? = null,
  /**
   * (For tokenized numbers only.) The last four digits of the device account number.
   */
  public val dynamicLast4: String? = null,
  public val googlePay: JsonObject? = null,
  public val link: JsonObject? = null,
  public val masterpass: PaymentMethodDetailsCardWalletMasterpass? = null,
  public val samsungPay: JsonObject? = null,
  public val visaCheckout: PaymentMethodDetailsCardWalletVisaCheckout? = null,
) {
  public class Builder {
    private var typeValue: InlinePaymentMethodDetailsCardWalletTypeXc9b9a018? = null

    public var type: InlinePaymentMethodDetailsCardWalletTypeXc9b9a018
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var amexExpressCheckout: JsonObject? = null

    public var applePay: JsonObject? = null

    /**
     * (For tokenized numbers only.) The last four digits of the device account number.
     */
    public var dynamicLast4: String? = null

    public var googlePay: JsonObject? = null

    public var link: JsonObject? = null

    public var masterpass: PaymentMethodDetailsCardWalletMasterpass? = null

    public var samsungPay: JsonObject? = null

    public var visaCheckout: PaymentMethodDetailsCardWalletVisaCheckout? = null

    public fun build(): PaymentMethodDetailsCardWallet {
      check(typeValue != null) { "type is required" }
      return PaymentMethodDetailsCardWallet(
        type = type,
        amexExpressCheckout = amexExpressCheckout,
        applePay = applePay,
        dynamicLast4 = dynamicLast4,
        googlePay = googlePay,
        link = link,
        masterpass = masterpass,
        samsungPay = samsungPay,
        visaCheckout = visaCheckout,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentMethodDetailsCardWallet = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<PaymentMethodDetailsCardWallet> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentMethodDetailsCardWallet {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodDetailsCardWallet")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentMethodDetailsCardWallet must be a JSON object")
      val type = json.decodeRequired<InlinePaymentMethodDetailsCardWalletTypeXc9b9a018>(rawObject, "type")
      return PaymentMethodDetailsCardWallet(
        type = type,
        amexExpressCheckout = rawObject["amex_express_checkout"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        applePay = rawObject["apple_pay"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        dynamicLast4 = rawObject["dynamic_last4"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        googlePay = rawObject["google_pay"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        link = rawObject["link"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        masterpass = rawObject["masterpass"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsCardWalletMasterpass>(it) },
        samsungPay = rawObject["samsung_pay"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        visaCheckout = rawObject["visa_checkout"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsCardWalletVisaCheckout>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentMethodDetailsCardWallet) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodDetailsCardWallet")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.amexExpressCheckout?.let { put("amex_express_checkout", json.encodeToJsonElement(it)) }
        value.applePay?.let { put("apple_pay", json.encodeToJsonElement(it)) }
        value.dynamicLast4?.let { put("dynamic_last4", it) }
        value.googlePay?.let { put("google_pay", json.encodeToJsonElement(it)) }
        value.link?.let { put("link", json.encodeToJsonElement(it)) }
        value.masterpass?.let { put("masterpass", json.encodeToJsonElement(it)) }
        value.samsungPay?.let { put("samsung_pay", json.encodeToJsonElement(it)) }
        value.visaCheckout?.let { put("visa_checkout", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentMethodDetailsCardWallet(block: PaymentMethodDetailsCardWallet.Builder.() -> Unit): PaymentMethodDetailsCardWallet = PaymentMethodDetailsCardWallet.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentMethodDetailsCardWallet is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
