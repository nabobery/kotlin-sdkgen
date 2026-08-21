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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_card
 */
@Serializable(with = PaymentMethodCard.Serializer::class)
public class PaymentMethodCard(
  /**
   * Card brand. Can be `amex`, `cartes_bancaires`, `diners`, `discover`, `eftpos_au`, `jcb`, `link`, `mastercard`,
   * `unionpay`, `visa` or `unknown`.
   */
  public val brand: String,
  /**
   * Two-digit number representing the card's expiration month.
   */
  public val expMonth: Int,
  /**
   * Four-digit number representing the card's expiration year.
   */
  public val expYear: Int,
  /**
   * Card funding type. Can be `credit`, `debit`, `prepaid`, or `unknown`.
   */
  public val funding: String,
  /**
   * The last four digits of the card.
   */
  public val last4: String,
  /**
   * Checks on Card address and CVC if provided.
   */
  public val checks: InlinePaymentMethodCardChecksXeaf46337? = null,
  /**
   * Two-letter ISO code representing the country of the card. You could use this attribute to get a sense of the
   * international breakdown of cards you've collected.
   */
  public val country: String? = null,
  /**
   * The brand to use when displaying the card, this accounts for customer's brand choice on dual-branded cards. Can be
   * `american_express`, `cartes_bancaires`, `diners_club`, `discover`, `eftpos_australia`, `interac`, `jcb`,
   * `mastercard`, `union_pay`, `visa`, or `other` and may contain more values in the future.
   */
  public val displayBrand: String? = null,
  /**
   * Uniquely identifies this particular card number. You can use this attribute to check whether two customers who’ve
   * signed up with you are using the same card number, for example. For payment methods that tokenize card information
   * (Apple Pay, Google Pay), the tokenized number might be provided instead of the underlying card number.
   *
   * *As of May 1, 2021, card fingerprint in India for Connect changed to allow two fingerprints for the same card---one
   * for India and one for the rest of the world.*
   */
  public val fingerprint: String? = null,
  /**
   * Details of the original PaymentMethod that created this object.
   */
  public val generatedFrom: InlinePaymentMethodCardGeneratedFromX734e0d2d? = null,
  /**
   * Contains information about card networks that can be used to process the payment.
   */
  public val networks: InlinePaymentMethodCardNetworksXd1a77c6e? = null,
  /**
   * Status of a card based on the card issuer.
   */
  public val regulatedStatus: InlinePaymentMethodCardRegulatedStatusX09fde27f? = null,
  /**
   * Contains details on how this Card may be used for 3D Secure authentication.
   */
  public val threeDSecureUsage: InlinePaymentMethodCardThreeDSecureUsageXbfee3c7f? = null,
  /**
   * If this Card is part of a card wallet, this contains the details of the card wallet.
   */
  public val wallet: InlinePaymentMethodCardWalletXbb510817? = null,
) {
  public class Builder {
    private var brandValue: String? = null

    public var brand: String
      get() = requireNotNull(brandValue) { "brand is required" }
      set(`value`) {
        brandValue = value
      }

    private var expMonthValue: Int? = null

    public var expMonth: Int
      get() = requireNotNull(expMonthValue) { "expMonth is required" }
      set(`value`) {
        expMonthValue = value
      }

    private var expYearValue: Int? = null

    public var expYear: Int
      get() = requireNotNull(expYearValue) { "expYear is required" }
      set(`value`) {
        expYearValue = value
      }

    private var fundingValue: String? = null

    public var funding: String
      get() = requireNotNull(fundingValue) { "funding is required" }
      set(`value`) {
        fundingValue = value
      }

    private var last4Value: String? = null

    public var last4: String
      get() = requireNotNull(last4Value) { "last4 is required" }
      set(`value`) {
        last4Value = value
      }

    /**
     * Checks on Card address and CVC if provided.
     */
    public var checks: InlinePaymentMethodCardChecksXeaf46337? = null

    /**
     * Two-letter ISO code representing the country of the card. You could use this attribute to get a sense of the
     * international breakdown of cards you've collected.
     */
    public var country: String? = null

    /**
     * The brand to use when displaying the card, this accounts for customer's brand choice on dual-branded cards. Can
     * be `american_express`, `cartes_bancaires`, `diners_club`, `discover`, `eftpos_australia`, `interac`, `jcb`,
     * `mastercard`, `union_pay`, `visa`, or `other` and may contain more values in the future.
     */
    public var displayBrand: String? = null

    /**
     * Uniquely identifies this particular card number. You can use this attribute to check whether two customers who’ve
     * signed up with you are using the same card number, for example. For payment methods that tokenize card
     * information (Apple Pay, Google Pay), the tokenized number might be provided instead of the underlying card
     * number.
     *
     * *As of May 1, 2021, card fingerprint in India for Connect changed to allow two fingerprints for the same
     * card---one for India and one for the rest of the world.*
     */
    public var fingerprint: String? = null

    /**
     * Details of the original PaymentMethod that created this object.
     */
    public var generatedFrom: InlinePaymentMethodCardGeneratedFromX734e0d2d? = null

    /**
     * Contains information about card networks that can be used to process the payment.
     */
    public var networks: InlinePaymentMethodCardNetworksXd1a77c6e? = null

    /**
     * Status of a card based on the card issuer.
     */
    public var regulatedStatus: InlinePaymentMethodCardRegulatedStatusX09fde27f? = null

    /**
     * Contains details on how this Card may be used for 3D Secure authentication.
     */
    public var threeDSecureUsage: InlinePaymentMethodCardThreeDSecureUsageXbfee3c7f? = null

    /**
     * If this Card is part of a card wallet, this contains the details of the card wallet.
     */
    public var wallet: InlinePaymentMethodCardWalletXbb510817? = null

    public fun build(): PaymentMethodCard {
      check(brandValue != null) { "brand is required" }
      check(expMonthValue != null) { "expMonth is required" }
      check(expYearValue != null) { "expYear is required" }
      check(fundingValue != null) { "funding is required" }
      check(last4Value != null) { "last4 is required" }
      return PaymentMethodCard(
        brand = brand,
        expMonth = expMonth,
        expYear = expYear,
        funding = funding,
        last4 = last4,
        checks = checks,
        country = country,
        displayBrand = displayBrand,
        fingerprint = fingerprint,
        generatedFrom = generatedFrom,
        networks = networks,
        regulatedStatus = regulatedStatus,
        threeDSecureUsage = threeDSecureUsage,
        wallet = wallet,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentMethodCard = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentMethodCard> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentMethodCard {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodCard")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentMethodCard must be a JSON object")
      val brand = json.decodeRequired<String>(rawObject, "brand")
      val expMonth = json.decodeRequired<Int>(rawObject, "exp_month")
      val expYear = json.decodeRequired<Int>(rawObject, "exp_year")
      val funding = json.decodeRequired<String>(rawObject, "funding")
      val last4 = json.decodeRequired<String>(rawObject, "last4")
      return PaymentMethodCard(
        brand = brand,
        expMonth = expMonth,
        expYear = expYear,
        funding = funding,
        last4 = last4,
        checks = rawObject["checks"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentMethodCardChecksXeaf46337?>(element) },
        country = rawObject["country"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        displayBrand = rawObject["display_brand"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        fingerprint = rawObject["fingerprint"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        generatedFrom = rawObject["generated_from"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentMethodCardGeneratedFromX734e0d2d?>(element) },
        networks = rawObject["networks"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentMethodCardNetworksXd1a77c6e?>(element) },
        regulatedStatus = rawObject["regulated_status"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentMethodCardRegulatedStatusX09fde27f?>(element) },
        threeDSecureUsage = rawObject["three_d_secure_usage"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentMethodCardThreeDSecureUsageXbfee3c7f?>(element) },
        wallet = rawObject["wallet"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentMethodCardWalletXbb510817?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentMethodCard) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodCard")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("brand", value.brand)
        put("exp_month", json.encodeToJsonElement(value.expMonth))
        put("exp_year", json.encodeToJsonElement(value.expYear))
        put("funding", value.funding)
        put("last4", value.last4)
        value.checks?.let { put("checks", json.encodeToJsonElement(it)) }
        value.country?.let { put("country", it) }
        value.displayBrand?.let { put("display_brand", it) }
        value.fingerprint?.let { put("fingerprint", it) }
        value.generatedFrom?.let { put("generated_from", json.encodeToJsonElement(it)) }
        value.networks?.let { put("networks", json.encodeToJsonElement(it)) }
        value.regulatedStatus?.let { put("regulated_status", json.encodeToJsonElement(it)) }
        value.threeDSecureUsage?.let { put("three_d_secure_usage", json.encodeToJsonElement(it)) }
        value.wallet?.let { put("wallet", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentMethodCard(block: PaymentMethodCard.Builder.() -> Unit): PaymentMethodCard = PaymentMethodCard.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentMethodCard is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
