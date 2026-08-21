package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/consent_collection/properties/terms_of_service.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/consent_collection/properties/terms_of_service
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormConsentCollectionTermsOfServiceX0f2411f4.Serializer::class)
public sealed class InlineV1PaymentLinksPostRequestFormConsentCollectionTermsOfServiceX0f2411f4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineV1PaymentLinksPostRequestFormConsentCollectionTermsOfServiceX0f2411f4() {
    public override val `value`: String = "none"
  }

  /**
   * Documented value. Wire value: `required`.
   */
  public data object Required : InlineV1PaymentLinksPostRequestFormConsentCollectionTermsOfServiceX0f2411f4() {
    public override val `value`: String = "required"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentLinksPostRequestFormConsentCollectionTermsOfServiceX0f2411f4()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentLinksPostRequestFormConsentCollectionTermsOfServiceX0f2411f4 = when (value) {
      None.value -> None
      Required.value -> Required
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormConsentCollectionTermsOfServiceX0f2411f4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1PaymentLinksPostRequestFormConsentCollectionTermsOfServiceX0f2411f4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormConsentCollectionTermsOfServiceX0f2411f4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormConsentCollectionTermsOfServiceX0f2411f4) {
      encoder.encodeString(value.value)
    }
  }
}
