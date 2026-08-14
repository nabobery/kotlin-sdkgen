package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class PaymentIntentPaymentMethodOptionsCardView(
  @SerialName("capture_method")
  public val captureMethod:
      InlinePaymentIntentPaymentMethodOptionsCardCaptureMethodXfca17306? = null,
  public val installments: InlinePaymentIntentPaymentMethodOptionsCardInstallmentsX59a01bf9? = null,
  @SerialName("mandate_options")
  public val mandateOptions:
      InlinePaymentIntentPaymentMethodOptionsCardMandateOptionsX0b4df26f? = null,
  public val network: InlinePaymentIntentPaymentMethodOptionsCardNetworkX0acd3a60? = null,
  @SerialName("request_extended_authorization")
  public val requestExtendedAuthorization:
      InlinePaymentIntentPaymentMethodOptionsCardRequestExtendedAuthorizationXf3b5b57d? = null,
  @SerialName("request_incremental_authorization")
  public val requestIncrementalAuthorization:
      InlinePaymentIntentPayment42bfRequestIncrementalAu57cdX0331026a? = null,
  @SerialName("request_multicapture")
  public val requestMulticapture:
      InlinePaymentIntentPaymentMethodOptionsCardRequestMulticaptureXcbbc4e7e? = null,
  @SerialName("request_overcapture")
  public val requestOvercapture:
      InlinePaymentIntentPaymentMethodOptionsCardRequestOvercaptureXcd6cdbce? = null,
  @SerialName("request_three_d_secure")
  public val requestThreeDSecure:
      InlinePaymentIntentPaymentMethodOptionsCardRequestThreeDSecureX468a01a4? = null,
  @SerialName("require_cvc_recollection")
  public val requireCvcRecollection: Boolean? = null,
  @SerialName("setup_future_usage")
  public val setupFutureUsage:
      InlinePaymentIntentPaymentMethodOptionsCardSetupFutureUsageX4dda0f45? = null,
  @SerialName("statement_descriptor_suffix_kana")
  public val statementDescriptorSuffixKana: String? = null,
  @SerialName("statement_descriptor_suffix_kanji")
  public val statementDescriptorSuffixKanji: String? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options_card
 */
@Serializable(with = PaymentIntentPaymentMethodOptionsCard.Serializer::class)
public class PaymentIntentPaymentMethodOptionsCard(
  /**
   * Controls when the funds will be captured from the customer's account.
   */
  public val captureMethod:
      InlinePaymentIntentPaymentMethodOptionsCardCaptureMethodXfca17306? = null,
  /**
   * Installment details for this payment.
   *
   * For more information, see the [installments integration guide](https://docs.stripe.com/payments/installments).
   */
  public val installments: InlinePaymentIntentPaymentMethodOptionsCardInstallmentsX59a01bf9? = null,
  /**
   * Configuration options for setting up an eMandate for cards issued in India.
   */
  public val mandateOptions:
      InlinePaymentIntentPaymentMethodOptionsCardMandateOptionsX0b4df26f? = null,
  /**
   * Selected network to process this payment intent on. Depends on the available networks of the card attached to the
   * payment intent. Can be only set confirm-time.
   */
  public val network: InlinePaymentIntentPaymentMethodOptionsCardNetworkX0acd3a60? = null,
  /**
   * Request ability to [capture beyond the standard authorization validity
   * window](https://docs.stripe.com/payments/extended-authorization) for this PaymentIntent.
   */
  public val requestExtendedAuthorization:
      InlinePaymentIntentPaymentMethodOptionsCardRequestExtendedAuthorizationXf3b5b57d? = null,
  /**
   * Request ability to [increment the authorization](https://docs.stripe.com/payments/incremental-authorization) for
   * this PaymentIntent.
   */
  public val requestIncrementalAuthorization:
      InlinePaymentIntentPayment42bfRequestIncrementalAu57cdX0331026a? = null,
  /**
   * Request ability to make [multiple captures](https://docs.stripe.com/payments/multicapture) for this PaymentIntent.
   */
  public val requestMulticapture:
      InlinePaymentIntentPaymentMethodOptionsCardRequestMulticaptureXcbbc4e7e? = null,
  /**
   * Request ability to [overcapture](https://docs.stripe.com/payments/overcapture) for this PaymentIntent.
   */
  public val requestOvercapture:
      InlinePaymentIntentPaymentMethodOptionsCardRequestOvercaptureXcd6cdbce? = null,
  /**
   * We strongly recommend that you rely on our SCA Engine to automatically prompt your customers for authentication
   * based on risk level and [other requirements](https://docs.stripe.com/strong-customer-authentication). However, if
   * you wish to request 3D Secure based on logic from your own fraud engine, provide this option. If not provided, this
   * value defaults to `automatic`. Read our guide on [manually requesting 3D
   * Secure](https://docs.stripe.com/payments/3d-secure/authentication-flow#manual-three-ds) for more information on how
   * this configuration interacts with Radar and our SCA Engine.
   */
  public val requestThreeDSecure:
      InlinePaymentIntentPaymentMethodOptionsCardRequestThreeDSecureX468a01a4? = null,
  /**
   * When enabled, using a card that is attached to a customer will require the CVC to be provided again (i.e. using the
   * cvc_token parameter).
   */
  public val requireCvcRecollection: Boolean? = null,
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
      InlinePaymentIntentPaymentMethodOptionsCardSetupFutureUsageX4dda0f45? = null,
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
    /**
     * Controls when the funds will be captured from the customer's account.
     */
    public var captureMethod: InlinePaymentIntentPaymentMethodOptionsCardCaptureMethodXfca17306? =
        null

    /**
     * Installment details for this payment.
     *
     * For more information, see the [installments integration guide](https://docs.stripe.com/payments/installments).
     */
    public var installments: InlinePaymentIntentPaymentMethodOptionsCardInstallmentsX59a01bf9? =
        null

    /**
     * Configuration options for setting up an eMandate for cards issued in India.
     */
    public var mandateOptions: InlinePaymentIntentPaymentMethodOptionsCardMandateOptionsX0b4df26f? =
        null

    /**
     * Selected network to process this payment intent on. Depends on the available networks of the card attached to the
     * payment intent. Can be only set confirm-time.
     */
    public var network: InlinePaymentIntentPaymentMethodOptionsCardNetworkX0acd3a60? = null

    /**
     * Request ability to [capture beyond the standard authorization validity
     * window](https://docs.stripe.com/payments/extended-authorization) for this PaymentIntent.
     */
    public var requestExtendedAuthorization:
        InlinePaymentIntentPaymentMethodOptionsCardRequestExtendedAuthorizationXf3b5b57d? = null

    /**
     * Request ability to [increment the authorization](https://docs.stripe.com/payments/incremental-authorization) for
     * this PaymentIntent.
     */
    public var requestIncrementalAuthorization:
        InlinePaymentIntentPayment42bfRequestIncrementalAu57cdX0331026a? = null

    /**
     * Request ability to make [multiple captures](https://docs.stripe.com/payments/multicapture) for this
     * PaymentIntent.
     */
    public var requestMulticapture:
        InlinePaymentIntentPaymentMethodOptionsCardRequestMulticaptureXcbbc4e7e? = null

    /**
     * Request ability to [overcapture](https://docs.stripe.com/payments/overcapture) for this PaymentIntent.
     */
    public var requestOvercapture:
        InlinePaymentIntentPaymentMethodOptionsCardRequestOvercaptureXcd6cdbce? = null

    /**
     * We strongly recommend that you rely on our SCA Engine to automatically prompt your customers for authentication
     * based on risk level and [other requirements](https://docs.stripe.com/strong-customer-authentication). However, if
     * you wish to request 3D Secure based on logic from your own fraud engine, provide this option. If not provided,
     * this value defaults to `automatic`. Read our guide on [manually requesting 3D
     * Secure](https://docs.stripe.com/payments/3d-secure/authentication-flow#manual-three-ds) for more information on
     * how this configuration interacts with Radar and our SCA Engine.
     */
    public var requestThreeDSecure:
        InlinePaymentIntentPaymentMethodOptionsCardRequestThreeDSecureX468a01a4? = null

    /**
     * When enabled, using a card that is attached to a customer will require the CVC to be provided again (i.e. using
     * the cvc_token parameter).
     */
    public var requireCvcRecollection: Boolean? = null

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
    public var setupFutureUsage:
        InlinePaymentIntentPaymentMethodOptionsCardSetupFutureUsageX4dda0f45? = null

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

    public fun build(): PaymentIntentPaymentMethodOptionsCard = PaymentIntentPaymentMethodOptionsCard(
      captureMethod = captureMethod,
      installments = installments,
      mandateOptions = mandateOptions,
      network = network,
      requestExtendedAuthorization = requestExtendedAuthorization,
      requestIncrementalAuthorization = requestIncrementalAuthorization,
      requestMulticapture = requestMulticapture,
      requestOvercapture = requestOvercapture,
      requestThreeDSecure = requestThreeDSecure,
      requireCvcRecollection = requireCvcRecollection,
      setupFutureUsage = setupFutureUsage,
      statementDescriptorSuffixKana = statementDescriptorSuffixKana,
      statementDescriptorSuffixKanji = statementDescriptorSuffixKanji,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentIntentPaymentMethodOptionsCard = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentIntentPaymentMethodOptionsCard> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentIntentPaymentMethodOptionsCard {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentIntentPaymentMethodOptionsCard")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentIntentPaymentMethodOptionsCard must be a JSON object")
      return PaymentIntentPaymentMethodOptionsCard(
        captureMethod = rawObject["capture_method"]?.let { json.decodeFromJsonElement<InlinePaymentIntentPaymentMethodOptionsCardCaptureMethodXfca17306>(it) },
        installments = rawObject["installments"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentIntentPaymentMethodOptionsCardInstallmentsX59a01bf9?>(element) },
        mandateOptions = rawObject["mandate_options"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentIntentPaymentMethodOptionsCardMandateOptionsX0b4df26f?>(element) },
        network = rawObject["network"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentIntentPaymentMethodOptionsCardNetworkX0acd3a60?>(element) },
        requestExtendedAuthorization = rawObject["request_extended_authorization"]?.let { json.decodeFromJsonElement<InlinePaymentIntentPaymentMethodOptionsCardRequestExtendedAuthorizationXf3b5b57d>(it) },
        requestIncrementalAuthorization = rawObject["request_incremental_authorization"]?.let { json.decodeFromJsonElement<InlinePaymentIntentPayment42bfRequestIncrementalAu57cdX0331026a>(it) },
        requestMulticapture = rawObject["request_multicapture"]?.let { json.decodeFromJsonElement<InlinePaymentIntentPaymentMethodOptionsCardRequestMulticaptureXcbbc4e7e>(it) },
        requestOvercapture = rawObject["request_overcapture"]?.let { json.decodeFromJsonElement<InlinePaymentIntentPaymentMethodOptionsCardRequestOvercaptureXcd6cdbce>(it) },
        requestThreeDSecure = rawObject["request_three_d_secure"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentIntentPaymentMethodOptionsCardRequestThreeDSecureX468a01a4?>(element) },
        requireCvcRecollection = rawObject["require_cvc_recollection"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        setupFutureUsage = rawObject["setup_future_usage"]?.let { json.decodeFromJsonElement<InlinePaymentIntentPaymentMethodOptionsCardSetupFutureUsageX4dda0f45>(it) },
        statementDescriptorSuffixKana = rawObject["statement_descriptor_suffix_kana"]?.let { json.decodeFromJsonElement<String>(it) },
        statementDescriptorSuffixKanji = rawObject["statement_descriptor_suffix_kanji"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentIntentPaymentMethodOptionsCard) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentIntentPaymentMethodOptionsCard")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.captureMethod?.let { put("capture_method", json.encodeToJsonElement(it)) }
        value.installments?.let { put("installments", json.encodeToJsonElement(it)) }
        value.mandateOptions?.let { put("mandate_options", json.encodeToJsonElement(it)) }
        value.network?.let { put("network", json.encodeToJsonElement(it)) }
        value.requestExtendedAuthorization?.let { put("request_extended_authorization", json.encodeToJsonElement(it)) }
        value.requestIncrementalAuthorization?.let { put("request_incremental_authorization", json.encodeToJsonElement(it)) }
        value.requestMulticapture?.let { put("request_multicapture", json.encodeToJsonElement(it)) }
        value.requestOvercapture?.let { put("request_overcapture", json.encodeToJsonElement(it)) }
        value.requestThreeDSecure?.let { put("request_three_d_secure", json.encodeToJsonElement(it)) }
        value.requireCvcRecollection?.let { put("require_cvc_recollection", json.encodeToJsonElement(it)) }
        value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
        value.statementDescriptorSuffixKana?.let { put("statement_descriptor_suffix_kana", it) }
        value.statementDescriptorSuffixKanji?.let { put("statement_descriptor_suffix_kanji", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentIntentPaymentMethodOptionsCard(block: PaymentIntentPaymentMethodOptionsCard.Builder.() -> Unit): PaymentIntentPaymentMethodOptionsCard = PaymentIntentPaymentMethodOptionsCard.build(block)
