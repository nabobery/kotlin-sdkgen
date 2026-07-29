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
 * If set to `required`, it requires cutomers to accept the terms of service before being able to pay. If set to `none`,
 * customers won't be shown a checkbox to accept the terms of service.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_links_resource_consent_collection/properties/terms_of_servic
 * e
 */
@Serializable(with = InlinePaymentLinksResourceConsentCollectionTermsOfServiceXf21a9a25.Serializer::class)
public sealed class InlinePaymentLinksResourceConsentCollectionTermsOfServiceXf21a9a25 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlinePaymentLinksResourceConsentCollectionTermsOfServiceXf21a9a25() {
    public override val `value`: String = "none"
  }

  /**
   * Documented value. Wire value: `required`.
   */
  public data object Required : InlinePaymentLinksResourceConsentCollectionTermsOfServiceXf21a9a25() {
    public override val `value`: String = "required"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentLinksResourceConsentCollectionTermsOfServiceXf21a9a25()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentLinksResourceConsentCollectionTermsOfServiceXf21a9a25 = when (value) {
      None.value -> None
      Required.value -> Required
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePaymentLinksResourceConsentCollectionTermsOfServiceXf21a9a25> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentLinksResourceConsentCollectionTermsOfServiceXf21a9a25", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentLinksResourceConsentCollectionTermsOfServiceXf21a9a25 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentLinksResourceConsentCollectionTermsOfServiceXf21a9a25) {
      encoder.encodeString(value.value)
    }
  }
}
