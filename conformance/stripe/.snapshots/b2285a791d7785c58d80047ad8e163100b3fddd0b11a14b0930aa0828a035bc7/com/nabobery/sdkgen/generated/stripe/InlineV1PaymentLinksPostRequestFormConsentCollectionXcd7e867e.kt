package com.nabobery.sdkgen.generated.stripe

import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Configure fields to gather active consent from customers.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/consent_collection
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormConsentCollectionXcd7e867e.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormConsentCollectionXcd7e867e(
  public val paymentMethodReuseAgreement:
      InlineV1PaymentLinksPostRequestFormPaymentMethodReuseAgcb24X2d1787e1? = null,
  public val promotions:
      InlineV1PaymentLinksPostRequestFormConsentCollectionPromotionsX099b4fd2? = null,
  public val termsOfService:
      InlineV1PaymentLinksPostRequestFormConsentCollectionTermsOfServiceX0f2411f4? = null,
) {
  public class Builder {
    public var paymentMethodReuseAgreement:
        InlineV1PaymentLinksPostRequestFormPaymentMethodReuseAgcb24X2d1787e1? = null

    public var promotions: InlineV1PaymentLinksPostRequestFormConsentCollectionPromotionsX099b4fd2?
        = null

    public var termsOfService:
        InlineV1PaymentLinksPostRequestFormConsentCollectionTermsOfServiceX0f2411f4? = null

    public fun build(): InlineV1PaymentLinksPostRequestFormConsentCollectionXcd7e867e = InlineV1PaymentLinksPostRequestFormConsentCollectionXcd7e867e(
      paymentMethodReuseAgreement = paymentMethodReuseAgreement,
      promotions = promotions,
      termsOfService = termsOfService,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormConsentCollectionXcd7e867e = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormConsentCollectionXcd7e867e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormConsentCollectionXcd7e867e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentLinksPostRequestFormConsentCollectionXcd7e867e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentLinksPostRequestFormConsentCollectionXcd7e867e must be a JSON object")
      return InlineV1PaymentLinksPostRequestFormConsentCollectionXcd7e867e(
        paymentMethodReuseAgreement = rawObject["payment_method_reuse_agreement"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormPaymentMethodReuseAgcb24X2d1787e1>(it) },
        promotions = rawObject["promotions"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormConsentCollectionPromotionsX099b4fd2>(it) },
        termsOfService = rawObject["terms_of_service"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormConsentCollectionTermsOfServiceX0f2411f4>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormConsentCollectionXcd7e867e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentLinksPostRequestFormConsentCollectionXcd7e867e")
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

public fun inlineV1PaymentLinksPostRequestFormConsentCollectionXcd7e867e(block: InlineV1PaymentLinksPostRequestFormConsentCollectionXcd7e867e.Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormConsentCollectionXcd7e867e = InlineV1PaymentLinksPostRequestFormConsentCollectionXcd7e867e.build(block)
