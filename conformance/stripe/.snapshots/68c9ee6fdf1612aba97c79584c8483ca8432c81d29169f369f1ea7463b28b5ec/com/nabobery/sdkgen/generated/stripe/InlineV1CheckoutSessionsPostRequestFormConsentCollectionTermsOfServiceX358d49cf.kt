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
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/consent_collection/properties/terms_of_service.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/consent_collection/properties/terms_of_service
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormConsentCollectionTermsOfServiceX358d49cf.Serializer::class)
public sealed class InlineV1CheckoutSessionsPostRequestFormConsentCollectionTermsOfServiceX358d49cf {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineV1CheckoutSessionsPostRequestFormConsentCollectionTermsOfServiceX358d49cf() {
    public override val `value`: String = "none"
  }

  /**
   * Documented value. Wire value: `required`.
   */
  public data object Required : InlineV1CheckoutSessionsPostRequestFormConsentCollectionTermsOfServiceX358d49cf() {
    public override val `value`: String = "required"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CheckoutSessionsPostRequestFormConsentCollectionTermsOfServiceX358d49cf()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CheckoutSessionsPostRequestFormConsentCollectionTermsOfServiceX358d49cf = when (value) {
      None.value -> None
      Required.value -> Required
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormConsentCollectionTermsOfServiceX358d49cf> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1CheckoutSessionsPostRequestFormConsentCollectionTermsOfServiceX358d49cf", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormConsentCollectionTermsOfServiceX358d49cf = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormConsentCollectionTermsOfServiceX358d49cf) {
      encoder.encodeString(value.value)
    }
  }
}
