package io.github.nabobery.sdkgen.generated.stripe

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
public data class PaymentLinksResourceConsentCollectionView(
  @SerialName("payment_method_reuse_agreement")
  public val paymentMethodReuseAgreement:
      InlinePaymentLinksResourceConsentCollectionPaymentMethodReuseAgreementX67a103a5? = null,
  public val promotions: InlinePaymentLinksResourceConsentCollectionPromotionsXcf01fe65? = null,
  @SerialName("terms_of_service")
  public val termsOfService:
      InlinePaymentLinksResourceConsentCollectionTermsOfServiceXf21a9a25? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_links_resource_consent_collection
 */
@Serializable(with = PaymentLinksResourceConsentCollection.Serializer::class)
public class PaymentLinksResourceConsentCollection(
  /**
   * Settings related to the payment method reuse text shown in the Checkout UI.
   */
  public val paymentMethodReuseAgreement:
      InlinePaymentLinksResourceConsentCollectionPaymentMethodReuseAgreementX67a103a5? = null,
  /**
   * If set to `auto`, enables the collection of customer consent for promotional communications.
   */
  public val promotions: InlinePaymentLinksResourceConsentCollectionPromotionsXcf01fe65? = null,
  /**
   * If set to `required`, it requires cutomers to accept the terms of service before being able to pay. If set to
   * `none`, customers won't be shown a checkbox to accept the terms of service.
   */
  public val termsOfService:
      InlinePaymentLinksResourceConsentCollectionTermsOfServiceXf21a9a25? = null,
) {
  public class Builder {
    /**
     * Settings related to the payment method reuse text shown in the Checkout UI.
     */
    public var paymentMethodReuseAgreement:
        InlinePaymentLinksResourceConsentCollectionPaymentMethodReuseAgreementX67a103a5? = null

    /**
     * If set to `auto`, enables the collection of customer consent for promotional communications.
     */
    public var promotions: InlinePaymentLinksResourceConsentCollectionPromotionsXcf01fe65? = null

    /**
     * If set to `required`, it requires cutomers to accept the terms of service before being able to pay. If set to
     * `none`, customers won't be shown a checkbox to accept the terms of service.
     */
    public var termsOfService: InlinePaymentLinksResourceConsentCollectionTermsOfServiceXf21a9a25? =
        null

    public fun build(): PaymentLinksResourceConsentCollection = PaymentLinksResourceConsentCollection(
      paymentMethodReuseAgreement = paymentMethodReuseAgreement,
      promotions = promotions,
      termsOfService = termsOfService,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentLinksResourceConsentCollection = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentLinksResourceConsentCollection> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentLinksResourceConsentCollection {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentLinksResourceConsentCollection")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentLinksResourceConsentCollection must be a JSON object")
      return PaymentLinksResourceConsentCollection(
        paymentMethodReuseAgreement = rawObject["payment_method_reuse_agreement"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentLinksResourceConsentCollectionPaymentMethodReuseAgreementX67a103a5?>(element) },
        promotions = rawObject["promotions"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentLinksResourceConsentCollectionPromotionsXcf01fe65?>(element) },
        termsOfService = rawObject["terms_of_service"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentLinksResourceConsentCollectionTermsOfServiceXf21a9a25?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentLinksResourceConsentCollection) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentLinksResourceConsentCollection")
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

public fun paymentLinksResourceConsentCollection(block: PaymentLinksResourceConsentCollection.Builder.() -> Unit): PaymentLinksResourceConsentCollection = PaymentLinksResourceConsentCollection.build(block)
