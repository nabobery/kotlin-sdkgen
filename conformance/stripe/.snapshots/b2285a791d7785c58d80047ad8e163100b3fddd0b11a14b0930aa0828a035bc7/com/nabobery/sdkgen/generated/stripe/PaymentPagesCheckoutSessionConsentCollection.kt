package com.nabobery.sdkgen.generated.stripe

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
public data class PaymentPagesCheckoutSessionConsentCollectionView(
  @SerialName("payment_method_reuse_agreement")
  public val paymentMethodReuseAgreement:
      InlinePaymentPagesCheckout09ddPaymentMethodReuseAgcb24X6e2377f9? = null,
  public val promotions:
      InlinePaymentPagesCheckoutSessionConsentCollectionPromotionsX48634417? = null,
  @SerialName("terms_of_service")
  public val termsOfService:
      InlinePaymentPagesCheckoutSessionConsentCollectionTermsOfServiceX0312229e? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_pages_checkout_session_consent_collection
 */
@Serializable(with = PaymentPagesCheckoutSessionConsentCollection.Serializer::class)
public class PaymentPagesCheckoutSessionConsentCollection(
  /**
   * If set to `hidden`, it will hide legal text related to the reuse of a payment method.
   */
  public val paymentMethodReuseAgreement:
      InlinePaymentPagesCheckout09ddPaymentMethodReuseAgcb24X6e2377f9? = null,
  /**
   * If set to `auto`, enables the collection of customer consent for promotional communications. The Checkout
   * Session will determine whether to display an option to opt into promotional communication
   * from the merchant depending on the customer's locale. Only available to US merchants and US customers.
   */
  public val promotions:
      InlinePaymentPagesCheckoutSessionConsentCollectionPromotionsX48634417? = null,
  /**
   * If set to `required`, it requires customers to accept the terms of service before being able to pay.
   */
  public val termsOfService:
      InlinePaymentPagesCheckoutSessionConsentCollectionTermsOfServiceX0312229e? = null,
) {
  public class Builder {
    /**
     * If set to `hidden`, it will hide legal text related to the reuse of a payment method.
     */
    public var paymentMethodReuseAgreement:
        InlinePaymentPagesCheckout09ddPaymentMethodReuseAgcb24X6e2377f9? = null

    /**
     * If set to `auto`, enables the collection of customer consent for promotional communications. The Checkout
     * Session will determine whether to display an option to opt into promotional communication
     * from the merchant depending on the customer's locale. Only available to US merchants and US customers.
     */
    public var promotions: InlinePaymentPagesCheckoutSessionConsentCollectionPromotionsX48634417? =
        null

    /**
     * If set to `required`, it requires customers to accept the terms of service before being able to pay.
     */
    public var termsOfService:
        InlinePaymentPagesCheckoutSessionConsentCollectionTermsOfServiceX0312229e? = null

    public fun build(): PaymentPagesCheckoutSessionConsentCollection = PaymentPagesCheckoutSessionConsentCollection(
      paymentMethodReuseAgreement = paymentMethodReuseAgreement,
      promotions = promotions,
      termsOfService = termsOfService,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentPagesCheckoutSessionConsentCollection = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<PaymentPagesCheckoutSessionConsentCollection> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentPagesCheckoutSessionConsentCollection {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentPagesCheckoutSessionConsentCollection")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentPagesCheckoutSessionConsentCollection must be a JSON object")
      return PaymentPagesCheckoutSessionConsentCollection(
        paymentMethodReuseAgreement = rawObject["payment_method_reuse_agreement"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentPagesCheckout09ddPaymentMethodReuseAgcb24X6e2377f9?>(element) },
        promotions = rawObject["promotions"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentPagesCheckoutSessionConsentCollectionPromotionsX48634417?>(element) },
        termsOfService = rawObject["terms_of_service"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentPagesCheckoutSessionConsentCollectionTermsOfServiceX0312229e?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentPagesCheckoutSessionConsentCollection) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentPagesCheckoutSessionConsentCollection")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.paymentMethodReuseAgreement?.let { put("payment_method_reuse_agreement", json.encodeToJsonElement(it)) }
        value.promotions?.let { put("promotions", json.encodeToJsonElement(it)) }
        value.termsOfService?.let { put("terms_of_service", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentPagesCheckoutSessionConsentCollection(block: PaymentPagesCheckoutSessionConsentCollection.Builder.() -> Unit): PaymentPagesCheckoutSessionConsentCollection = PaymentPagesCheckoutSessionConsentCollection.build(block)
