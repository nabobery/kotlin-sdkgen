package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.ConsistentCopyVisibility
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
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

@ConsistentCopyVisibility
@Serializable
public data class CardView internal constructor(
  public val account: InlineCardAccountX33cfa039? = null,
  @SerialName("address_city")
  public val addressCity: String? = null,
  @SerialName("address_country")
  public val addressCountry: String? = null,
  @SerialName("address_line1")
  public val addressLine1: String? = null,
  @SerialName("address_line1_check")
  public val addressLine1Check: String? = null,
  @SerialName("address_line2")
  public val addressLine2: String? = null,
  @SerialName("address_state")
  public val addressState: String? = null,
  @SerialName("address_zip")
  public val addressZip: String? = null,
  @SerialName("address_zip_check")
  public val addressZipCheck: String? = null,
  @SerialName("allow_redisplay")
  public val allowRedisplay: InlineCardAllowRedisplayXd3d09a26? = null,
  @SerialName("available_payout_methods")
  public val availablePayoutMethods: List<InlineCardAvailablePayoutMethodsItemX6e61c572>? = null,
  public val brand: String,
  public val country: String? = null,
  public val currency: String? = null,
  public val customer: InlineCardCustomerXcfc00c51? = null,
  @SerialName("cvc_check")
  public val cvcCheck: String? = null,
  @SerialName("default_for_currency")
  public val defaultForCurrency: Boolean? = null,
  @SerialName("dynamic_last4")
  public val dynamicLast4: String? = null,
  @SerialName("exp_month")
  public val expMonth: Int,
  @SerialName("exp_year")
  public val expYear: Int,
  public val fingerprint: String? = null,
  public val funding: String,
  public val id: String,
  public val iin: String? = null,
  public val last4: String,
  public val metadata: Map<String, String>? = null,
  public val name: String? = null,
  public val networks: TokenCardNetworks? = null,
  @SerialName("object")
  public val objectValue: InlineCardObjectValueX2c41d545,
  @SerialName("regulated_status")
  public val regulatedStatus: InlineCardRegulatedStatusX7571d715? = null,
  public val status: String? = null,
  @SerialName("tokenization_method")
  public val tokenizationMethod: String? = null,
)

/**
 * You can store multiple cards on a customer in order to charge the customer
 * later. You can also store multiple debit cards on a recipient in order to
 * transfer to those cards later.
 *
 * Related guide: [Card payments with Sources](https://docs.stripe.com/sources/cards)
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/card
 */
@Serializable(with = Card.Serializer::class)
public class Card(
  /**
   * Card brand. Can be `American Express`, `Cartes Bancaires`, `Diners Club`, `Discover`, `Eftpos Australia`,
   * `Girocard`, `JCB`, `MasterCard`, `UnionPay`, `Visa`, or `Unknown`.
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
   * Unique identifier for the object.
   */
  public val id: String,
  /**
   * The last four digits of the card.
   */
  public val last4: String,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineCardObjectValueX2c41d545,
  public val account: InlineCardAccountX33cfa039? = null,
  /**
   * City/District/Suburb/Town/Village.
   */
  public val addressCity: String? = null,
  /**
   * Billing address country, if provided when creating card.
   */
  public val addressCountry: String? = null,
  /**
   * Address line 1 (Street address/PO Box/Company name).
   */
  public val addressLine1: String? = null,
  /**
   * If `address_line1` was provided, results of the check: `pass`, `fail`, `unavailable`, or `unchecked`.
   */
  public val addressLine1Check: String? = null,
  /**
   * Address line 2 (Apartment/Suite/Unit/Building).
   */
  public val addressLine2: String? = null,
  /**
   * State/County/Province/Region.
   */
  public val addressState: String? = null,
  /**
   * ZIP or postal code.
   */
  public val addressZip: String? = null,
  /**
   * If `address_zip` was provided, results of the check: `pass`, `fail`, `unavailable`, or `unchecked`.
   */
  public val addressZipCheck: String? = null,
  /**
   * This field indicates whether this payment method can be shown again to its customer in a checkout flow. Stripe
   * products such as Checkout and Elements use this field to determine whether a payment method can be shown as a saved
   * payment method in a checkout flow. The field defaults to “unspecified”.
   */
  public val allowRedisplay: InlineCardAllowRedisplayXd3d09a26? = null,
  availablePayoutMethods: List<InlineCardAvailablePayoutMethodsItemX6e61c572>? = null,
  /**
   * Two-letter ISO code representing the country of the card. You could use this attribute to get a sense of the
   * international breakdown of cards you've collected.
   */
  public val country: String? = null,
  /**
   * Three-letter [ISO code for currency](https://www.iso.org/iso-4217-currency-codes.html) in lowercase. Must be a
   * [supported currency](https://docs.stripe.com/currencies). Only applicable on accounts (not customers or
   * recipients). The card can be used as a transfer destination for funds in this currency. This property is only
   * available when returned as an [External Account](/api/external_account_cards/object) where
   * [controller.is_controller](/api/accounts/object#account_object-controller-is_controller) is `true`.
   *
   * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val currency: String? = null,
  /**
   * The customer that this card belongs to. This attribute will not be in the card object if the card belongs to an
   * account or recipient instead.
   */
  public val customer: InlineCardCustomerXcfc00c51? = null,
  /**
   * If a CVC was provided, results of the check: `pass`, `fail`, `unavailable`, or `unchecked`. A result of unchecked
   * indicates that CVC was provided but hasn't been checked yet. Checks are typically performed when attaching a card
   * to a Customer object, or when creating a charge. For more details, see [Check if a card is valid without a
   * charge](https://support.stripe.com/questions/check-if-a-card-is-valid-without-a-charge).
   */
  public val cvcCheck: String? = null,
  /**
   * Whether this card is the default external account for its currency. This property is only available for accounts
   * where [controller.requirement_collection](/api/accounts/object#account_object-controller-requirement_collection) is
   * `application`, which includes Custom accounts.
   */
  public val defaultForCurrency: Boolean? = null,
  /**
   * (For tokenized numbers only.) The last four digits of the device account number.
   */
  public val dynamicLast4: String? = null,
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
   * Issuer identification number of the card.
   */
  public val iin: String? = null,
  metadata: Map<String, String>? = null,
  /**
   * Cardholder name.
   */
  public val name: String? = null,
  public val networks: TokenCardNetworks? = null,
  /**
   * Status of a card based on the card issuer.
   */
  public val regulatedStatus: InlineCardRegulatedStatusX7571d715? = null,
  /**
   * For external accounts that are cards, possible values are `new` and `errored`. If a payout fails, the status is set
   * to `errored` and [scheduled payouts](https://stripe.com/docs/payouts#payout-schedule) are stopped until account
   * details are updated.
   */
  public val status: String? = null,
  /**
   * If the card number is tokenized, this is the method that was used. Can be `android_pay` (includes Google Pay),
   * `apple_pay`, `masterpass`, `visa_checkout`, or null.
   */
  public val tokenizationMethod: String? = null,
) {
  /**
   * A set of available payout methods for this card. Only values from this set should be passed as the `method` when
   * creating a payout.
   */
  public val availablePayoutMethods: List<InlineCardAvailablePayoutMethodsItemX6e61c572>? =
      availablePayoutMethods?.let { collection0 -> collection0.toList() }

  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format.
   */
  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

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

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var last4Value: String? = null

    public var last4: String
      get() = requireNotNull(last4Value) { "last4 is required" }
      set(`value`) {
        last4Value = value
      }

    private var objectValueValue: InlineCardObjectValueX2c41d545? = null

    public var objectValue: InlineCardObjectValueX2c41d545
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    public var account: InlineCardAccountX33cfa039? = null

    /**
     * City/District/Suburb/Town/Village.
     */
    public var addressCity: String? = null

    /**
     * Billing address country, if provided when creating card.
     */
    public var addressCountry: String? = null

    /**
     * Address line 1 (Street address/PO Box/Company name).
     */
    public var addressLine1: String? = null

    /**
     * If `address_line1` was provided, results of the check: `pass`, `fail`, `unavailable`, or `unchecked`.
     */
    public var addressLine1Check: String? = null

    /**
     * Address line 2 (Apartment/Suite/Unit/Building).
     */
    public var addressLine2: String? = null

    /**
     * State/County/Province/Region.
     */
    public var addressState: String? = null

    /**
     * ZIP or postal code.
     */
    public var addressZip: String? = null

    /**
     * If `address_zip` was provided, results of the check: `pass`, `fail`, `unavailable`, or `unchecked`.
     */
    public var addressZipCheck: String? = null

    /**
     * This field indicates whether this payment method can be shown again to its customer in a checkout flow. Stripe
     * products such as Checkout and Elements use this field to determine whether a payment method can be shown as a
     * saved payment method in a checkout flow. The field defaults to “unspecified”.
     */
    public var allowRedisplay: InlineCardAllowRedisplayXd3d09a26? = null

    private var availablePayoutMethodsValue: List<InlineCardAvailablePayoutMethodsItemX6e61c572>? =
        null

    /**
     * A set of available payout methods for this card. Only values from this set should be passed as the `method` when
     * creating a payout.
     */
    public var availablePayoutMethods: List<InlineCardAvailablePayoutMethodsItemX6e61c572>?
      get() = availablePayoutMethodsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        availablePayoutMethodsValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Two-letter ISO code representing the country of the card. You could use this attribute to get a sense of the
     * international breakdown of cards you've collected.
     */
    public var country: String? = null

    /**
     * Three-letter [ISO code for currency](https://www.iso.org/iso-4217-currency-codes.html) in lowercase. Must be a
     * [supported currency](https://docs.stripe.com/currencies). Only applicable on accounts (not customers or
     * recipients). The card can be used as a transfer destination for funds in this currency. This property is only
     * available when returned as an [External Account](/api/external_account_cards/object) where
     * [controller.is_controller](/api/accounts/object#account_object-controller-is_controller) is `true`.
     *
     * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var currency: String? = null

    /**
     * The customer that this card belongs to. This attribute will not be in the card object if the card belongs to an
     * account or recipient instead.
     */
    public var customer: InlineCardCustomerXcfc00c51? = null

    /**
     * If a CVC was provided, results of the check: `pass`, `fail`, `unavailable`, or `unchecked`. A result of unchecked
     * indicates that CVC was provided but hasn't been checked yet. Checks are typically performed when attaching a card
     * to a Customer object, or when creating a charge. For more details, see [Check if a card is valid without a
     * charge](https://support.stripe.com/questions/check-if-a-card-is-valid-without-a-charge).
     */
    public var cvcCheck: String? = null

    /**
     * Whether this card is the default external account for its currency. This property is only available for accounts
     * where [controller.requirement_collection](/api/accounts/object#account_object-controller-requirement_collection)
     * is `application`, which includes Custom accounts.
     */
    public var defaultForCurrency: Boolean? = null

    /**
     * (For tokenized numbers only.) The last four digits of the device account number.
     */
    public var dynamicLast4: String? = null

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
     * Issuer identification number of the card.
     */
    public var iin: String? = null

    private var metadataValue: Map<String, String>? = null

    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
     * useful for storing additional information about the object in a structured format.
     */
    public var metadata: Map<String, String>?
      get() = metadataValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        metadataValue = value?.let { collection0 -> collection0.toMap() }
      }

    /**
     * Cardholder name.
     */
    public var name: String? = null

    public var networks: TokenCardNetworks? = null

    /**
     * Status of a card based on the card issuer.
     */
    public var regulatedStatus: InlineCardRegulatedStatusX7571d715? = null

    /**
     * For external accounts that are cards, possible values are `new` and `errored`. If a payout fails, the status is
     * set to `errored` and [scheduled payouts](https://stripe.com/docs/payouts#payout-schedule) are stopped until
     * account details are updated.
     */
    public var status: String? = null

    /**
     * If the card number is tokenized, this is the method that was used. Can be `android_pay` (includes Google Pay),
     * `apple_pay`, `masterpass`, `visa_checkout`, or null.
     */
    public var tokenizationMethod: String? = null

    public fun build(): Card {
      check(brandValue != null) { "brand is required" }
      check(expMonthValue != null) { "expMonth is required" }
      check(expYearValue != null) { "expYear is required" }
      check(fundingValue != null) { "funding is required" }
      check(idValue != null) { "id is required" }
      check(last4Value != null) { "last4 is required" }
      check(objectValueValue != null) { "objectValue is required" }
      return Card(
        brand = brand,
        expMonth = expMonth,
        expYear = expYear,
        funding = funding,
        id = id,
        last4 = last4,
        objectValue = objectValue,
        account = account,
        addressCity = addressCity,
        addressCountry = addressCountry,
        addressLine1 = addressLine1,
        addressLine1Check = addressLine1Check,
        addressLine2 = addressLine2,
        addressState = addressState,
        addressZip = addressZip,
        addressZipCheck = addressZipCheck,
        allowRedisplay = allowRedisplay,
        availablePayoutMethods = availablePayoutMethods,
        country = country,
        currency = currency,
        customer = customer,
        cvcCheck = cvcCheck,
        defaultForCurrency = defaultForCurrency,
        dynamicLast4 = dynamicLast4,
        fingerprint = fingerprint,
        iin = iin,
        metadata = metadata,
        name = name,
        networks = networks,
        regulatedStatus = regulatedStatus,
        status = status,
        tokenizationMethod = tokenizationMethod,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): Card = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<Card> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): Card {
      val jsonDecoder = decoder.requireJsonDecoder("Card")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("Card must be a JSON object")
      val brand = json.decodeRequired<String>(rawObject, "brand")
      val expMonth = json.decodeRequired<Int>(rawObject, "exp_month")
      val expYear = json.decodeRequired<Int>(rawObject, "exp_year")
      val funding = json.decodeRequired<String>(rawObject, "funding")
      val id = json.decodeRequired<String>(rawObject, "id")
      val last4 = json.decodeRequired<String>(rawObject, "last4")
      val objectValue = json.decodeRequired<InlineCardObjectValueX2c41d545>(rawObject, "object")
      return Card(
        brand = brand,
        expMonth = expMonth,
        expYear = expYear,
        funding = funding,
        id = id,
        last4 = last4,
        objectValue = objectValue,
        account = rawObject["account"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCardAccountX33cfa039?>(element) },
        addressCity = rawObject["address_city"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        addressCountry = rawObject["address_country"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        addressLine1 = rawObject["address_line1"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        addressLine1Check = rawObject["address_line1_check"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        addressLine2 = rawObject["address_line2"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        addressState = rawObject["address_state"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        addressZip = rawObject["address_zip"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        addressZipCheck = rawObject["address_zip_check"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        allowRedisplay = rawObject["allow_redisplay"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCardAllowRedisplayXd3d09a26?>(element) },
        availablePayoutMethods = rawObject["available_payout_methods"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<InlineCardAvailablePayoutMethodsItemX6e61c572>?>(element) },
        country = rawObject["country"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        currency = rawObject["currency"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        customer = rawObject["customer"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCardCustomerXcfc00c51?>(element) },
        cvcCheck = rawObject["cvc_check"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        defaultForCurrency = rawObject["default_for_currency"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Boolean?>(element) },
        dynamicLast4 = rawObject["dynamic_last4"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        fingerprint = rawObject["fingerprint"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        iin = rawObject["iin"]?.let { json.decodeFromJsonElement<String>(it) },
        metadata = rawObject["metadata"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Map<String, String>?>(element) },
        name = rawObject["name"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        networks = rawObject["networks"]?.let { json.decodeFromJsonElement<TokenCardNetworks>(it) },
        regulatedStatus = rawObject["regulated_status"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCardRegulatedStatusX7571d715?>(element) },
        status = rawObject["status"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        tokenizationMethod = rawObject["tokenization_method"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: Card) {
      val jsonEncoder = encoder.requireJsonEncoder("Card")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("brand", value.brand)
        put("exp_month", json.encodeToJsonElement(value.expMonth))
        put("exp_year", json.encodeToJsonElement(value.expYear))
        put("funding", value.funding)
        put("id", value.id)
        put("last4", value.last4)
        put("object", json.encodeToJsonElement(value.objectValue))
        value.account?.let { put("account", json.encodeToJsonElement(it)) }
        value.addressCity?.let { put("address_city", it) }
        value.addressCountry?.let { put("address_country", it) }
        value.addressLine1?.let { put("address_line1", it) }
        value.addressLine1Check?.let { put("address_line1_check", it) }
        value.addressLine2?.let { put("address_line2", it) }
        value.addressState?.let { put("address_state", it) }
        value.addressZip?.let { put("address_zip", it) }
        value.addressZipCheck?.let { put("address_zip_check", it) }
        value.allowRedisplay?.let { put("allow_redisplay", json.encodeToJsonElement(it)) }
        value.availablePayoutMethods?.let { put("available_payout_methods", json.encodeToJsonElement(it)) }
        value.country?.let { put("country", it) }
        value.currency?.let { put("currency", it) }
        value.customer?.let { put("customer", json.encodeToJsonElement(it)) }
        value.cvcCheck?.let { put("cvc_check", it) }
        value.defaultForCurrency?.let { put("default_for_currency", json.encodeToJsonElement(it)) }
        value.dynamicLast4?.let { put("dynamic_last4", it) }
        value.fingerprint?.let { put("fingerprint", it) }
        value.iin?.let { put("iin", it) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.name?.let { put("name", it) }
        value.networks?.let { put("networks", json.encodeToJsonElement(it)) }
        value.regulatedStatus?.let { put("regulated_status", json.encodeToJsonElement(it)) }
        value.status?.let { put("status", it) }
        value.tokenizationMethod?.let { put("tokenization_method", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun card(block: Card.Builder.() -> Unit): Card = Card.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("Card is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
