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
 * Source: sdkgen://source/openapi.json#/components/schemas/checkout_card_payment_method_options
 */
@Serializable(with = CheckoutCardPaymentMethodOptions.Serializer::class)
public class CheckoutCardPaymentMethodOptions(
  /**
   * We strongly recommend that you rely on our SCA Engine to automatically prompt your customers for authentication
   * based on risk level and [other requirements](https://docs.stripe.com/strong-customer-authentication). However, if
   * you wish to request 3D Secure based on logic from your own fraud engine, provide this option. If not provided, this
   * value defaults to `automatic`. Read our guide on [manually requesting 3D
   * Secure](https://docs.stripe.com/payments/3d-secure/authentication-flow#manual-three-ds) for more information on how
   * this configuration interacts with Radar and our SCA Engine.
   */
  public val requestThreeDSecure:
      InlineCheckoutCardPaymentMethodOptionsRequestThreeDSecureXc282dfdb,
  /**
   * Controls when the funds will be captured from the customer's account.
   */
  public val captureMethod: InlineCheckoutCardPaymentMethodOptionsCaptureMethodXffcd4137? = null,
  public val installments: CheckoutCardInstallmentsOptions? = null,
  /**
   * Request ability to [capture beyond the standard authorization validity window](/payments/extended-authorization)
   * for this CheckoutSession.
   */
  public val requestExtendedAuthorization:
      InlineCheckoutCardPaymentMethodOptionsRequestExtendedAuthorizationX9adf265a? = null,
  /**
   * Request ability to [increment the authorization](/payments/incremental-authorization) for this CheckoutSession.
   */
  public val requestIncrementalAuthorization:
      InlineCheckoutCardPaymentMethodOptionsRequestIncrementalAuthorizationXdd14a51a? = null,
  /**
   * Request ability to make [multiple captures](/payments/multicapture) for this CheckoutSession.
   */
  public val requestMulticapture:
      InlineCheckoutCardPaymentMethodOptionsRequestMulticaptureX494ec730? = null,
  /**
   * Request ability to [overcapture](/payments/overcapture) for this CheckoutSession.
   */
  public val requestOvercapture:
      InlineCheckoutCardPaymentMethodOptionsRequestOvercaptureXbeaffb72? = null,
  public val restrictions: PaymentPagesPrivateCardPaymentMethodOptionsResourceRestrictions? = null,
  /**
   * Indicates that you intend to make future payments with this PaymentIntent's payment method.
   *
   * If you provide a Customer with the PaymentIntent, you can use this parameter to [attach the payment
   * method](/payments/save-during-payment) to the Customer after the PaymentIntent is confirmed and the customer
   * completes any required actions. If you don't provide a Customer, you can still
   * [attach](/api/payment_methods/attach) the payment method to a Customer after the transaction completes.
   *
   * If the payment method is `card_present` and isn't a digital wallet, Stripe creates and attaches a
   * [generated_card](/api/charges/object#charge_object-payment_method_details-card_present-generated_card) payment
   * method representing the card to the Customer instead.
   *
   * When processing card payments, Stripe uses `setup_future_usage` to help you comply with regional legislation and
   * network rules, such as [SCA](/strong-customer-authentication).
   */
  public val setupFutureUsage:
      InlineCheckoutCardPaymentMethodOptionsSetupFutureUsageX86d67e78? = null,
  /**
   * Provides information about a card payment that customers see on their statements. Concatenated with the Kana prefix
   * (shortened Kana descriptor) or Kana statement descriptor that’s set on the account to form the complete statement
   * descriptor. Maximum 22 characters. On card statements, the *concatenation* of both prefix and suffix (including
   * separators) will appear truncated to 22 characters.
   */
  public val statementDescriptorSuffixKana: String? = null,
  /**
   * Provides information about a card payment that customers see on their statements. Concatenated with the Kanji
   * prefix (shortened Kanji descriptor) or Kanji statement descriptor that’s set on the account to form the complete
   * statement descriptor. Maximum 17 characters. On card statements, the *concatenation* of both prefix and suffix
   * (including separators) will appear truncated to 17 characters.
   */
  public val statementDescriptorSuffixKanji: String? = null,
) {
  public class Builder {
    private var requestThreeDSecureValue:
        InlineCheckoutCardPaymentMethodOptionsRequestThreeDSecureXc282dfdb? = null

    public var requestThreeDSecure:
        InlineCheckoutCardPaymentMethodOptionsRequestThreeDSecureXc282dfdb
      get() = requireNotNull(requestThreeDSecureValue) { "requestThreeDSecure is required" }
      set(`value`) {
        requestThreeDSecureValue = value
      }

    /**
     * Controls when the funds will be captured from the customer's account.
     */
    public var captureMethod: InlineCheckoutCardPaymentMethodOptionsCaptureMethodXffcd4137? = null

    public var installments: CheckoutCardInstallmentsOptions? = null

    /**
     * Request ability to [capture beyond the standard authorization validity window](/payments/extended-authorization)
     * for this CheckoutSession.
     */
    public var requestExtendedAuthorization:
        InlineCheckoutCardPaymentMethodOptionsRequestExtendedAuthorizationX9adf265a? = null

    /**
     * Request ability to [increment the authorization](/payments/incremental-authorization) for this CheckoutSession.
     */
    public var requestIncrementalAuthorization:
        InlineCheckoutCardPaymentMethodOptionsRequestIncrementalAuthorizationXdd14a51a? = null

    /**
     * Request ability to make [multiple captures](/payments/multicapture) for this CheckoutSession.
     */
    public var requestMulticapture:
        InlineCheckoutCardPaymentMethodOptionsRequestMulticaptureX494ec730? = null

    /**
     * Request ability to [overcapture](/payments/overcapture) for this CheckoutSession.
     */
    public var requestOvercapture:
        InlineCheckoutCardPaymentMethodOptionsRequestOvercaptureXbeaffb72? = null

    public var restrictions: PaymentPagesPrivateCardPaymentMethodOptionsResourceRestrictions? = null

    /**
     * Indicates that you intend to make future payments with this PaymentIntent's payment method.
     *
     * If you provide a Customer with the PaymentIntent, you can use this parameter to [attach the payment
     * method](/payments/save-during-payment) to the Customer after the PaymentIntent is confirmed and the customer
     * completes any required actions. If you don't provide a Customer, you can still
     * [attach](/api/payment_methods/attach) the payment method to a Customer after the transaction completes.
     *
     * If the payment method is `card_present` and isn't a digital wallet, Stripe creates and attaches a
     * [generated_card](/api/charges/object#charge_object-payment_method_details-card_present-generated_card) payment
     * method representing the card to the Customer instead.
     *
     * When processing card payments, Stripe uses `setup_future_usage` to help you comply with regional legislation and
     * network rules, such as [SCA](/strong-customer-authentication).
     */
    public var setupFutureUsage: InlineCheckoutCardPaymentMethodOptionsSetupFutureUsageX86d67e78? =
        null

    /**
     * Provides information about a card payment that customers see on their statements. Concatenated with the Kana
     * prefix (shortened Kana descriptor) or Kana statement descriptor that’s set on the account to form the complete
     * statement descriptor. Maximum 22 characters. On card statements, the *concatenation* of both prefix and suffix
     * (including separators) will appear truncated to 22 characters.
     */
    public var statementDescriptorSuffixKana: String? = null

    /**
     * Provides information about a card payment that customers see on their statements. Concatenated with the Kanji
     * prefix (shortened Kanji descriptor) or Kanji statement descriptor that’s set on the account to form the complete
     * statement descriptor. Maximum 17 characters. On card statements, the *concatenation* of both prefix and suffix
     * (including separators) will appear truncated to 17 characters.
     */
    public var statementDescriptorSuffixKanji: String? = null

    public fun build(): CheckoutCardPaymentMethodOptions {
      check(requestThreeDSecureValue != null) { "requestThreeDSecure is required" }
      return CheckoutCardPaymentMethodOptions(
        requestThreeDSecure = requestThreeDSecure,
        captureMethod = captureMethod,
        installments = installments,
        requestExtendedAuthorization = requestExtendedAuthorization,
        requestIncrementalAuthorization = requestIncrementalAuthorization,
        requestMulticapture = requestMulticapture,
        requestOvercapture = requestOvercapture,
        restrictions = restrictions,
        setupFutureUsage = setupFutureUsage,
        statementDescriptorSuffixKana = statementDescriptorSuffixKana,
        statementDescriptorSuffixKanji = statementDescriptorSuffixKanji,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CheckoutCardPaymentMethodOptions = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<CheckoutCardPaymentMethodOptions> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CheckoutCardPaymentMethodOptions {
      val jsonDecoder = decoder.requireJsonDecoder("CheckoutCardPaymentMethodOptions")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CheckoutCardPaymentMethodOptions must be a JSON object")
      val requestThreeDSecure = json.decodeRequired<InlineCheckoutCardPaymentMethodOptionsRequestThreeDSecureXc282dfdb>(rawObject, "request_three_d_secure")
      return CheckoutCardPaymentMethodOptions(
        requestThreeDSecure = requestThreeDSecure,
        captureMethod = rawObject["capture_method"]?.let { json.decodeFromJsonElement<InlineCheckoutCardPaymentMethodOptionsCaptureMethodXffcd4137>(it) },
        installments = rawObject["installments"]?.let { json.decodeFromJsonElement<CheckoutCardInstallmentsOptions>(it) },
        requestExtendedAuthorization = rawObject["request_extended_authorization"]?.let { json.decodeFromJsonElement<InlineCheckoutCardPaymentMethodOptionsRequestExtendedAuthorizationX9adf265a>(it) },
        requestIncrementalAuthorization = rawObject["request_incremental_authorization"]?.let { json.decodeFromJsonElement<InlineCheckoutCardPaymentMethodOptionsRequestIncrementalAuthorizationXdd14a51a>(it) },
        requestMulticapture = rawObject["request_multicapture"]?.let { json.decodeFromJsonElement<InlineCheckoutCardPaymentMethodOptionsRequestMulticaptureX494ec730>(it) },
        requestOvercapture = rawObject["request_overcapture"]?.let { json.decodeFromJsonElement<InlineCheckoutCardPaymentMethodOptionsRequestOvercaptureXbeaffb72>(it) },
        restrictions = rawObject["restrictions"]?.let { json.decodeFromJsonElement<PaymentPagesPrivateCardPaymentMethodOptionsResourceRestrictions>(it) },
        setupFutureUsage = rawObject["setup_future_usage"]?.let { json.decodeFromJsonElement<InlineCheckoutCardPaymentMethodOptionsSetupFutureUsageX86d67e78>(it) },
        statementDescriptorSuffixKana = rawObject["statement_descriptor_suffix_kana"]?.let { json.decodeFromJsonElement<String>(it) },
        statementDescriptorSuffixKanji = rawObject["statement_descriptor_suffix_kanji"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: CheckoutCardPaymentMethodOptions) {
      val jsonEncoder = encoder.requireJsonEncoder("CheckoutCardPaymentMethodOptions")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("request_three_d_secure", json.encodeToJsonElement(value.requestThreeDSecure))
        value.captureMethod?.let { put("capture_method", json.encodeToJsonElement(it)) }
        value.installments?.let { put("installments", json.encodeToJsonElement(it)) }
        value.requestExtendedAuthorization?.let { put("request_extended_authorization", json.encodeToJsonElement(it)) }
        value.requestIncrementalAuthorization?.let { put("request_incremental_authorization", json.encodeToJsonElement(it)) }
        value.requestMulticapture?.let { put("request_multicapture", json.encodeToJsonElement(it)) }
        value.requestOvercapture?.let { put("request_overcapture", json.encodeToJsonElement(it)) }
        value.restrictions?.let { put("restrictions", json.encodeToJsonElement(it)) }
        value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
        value.statementDescriptorSuffixKana?.let { put("statement_descriptor_suffix_kana", it) }
        value.statementDescriptorSuffixKanji?.let { put("statement_descriptor_suffix_kanji", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun checkoutCardPaymentMethodOptions(block: CheckoutCardPaymentMethodOptions.Builder.() -> Unit): CheckoutCardPaymentMethodOptions = CheckoutCardPaymentMethodOptions.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CheckoutCardPaymentMethodOptions is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
