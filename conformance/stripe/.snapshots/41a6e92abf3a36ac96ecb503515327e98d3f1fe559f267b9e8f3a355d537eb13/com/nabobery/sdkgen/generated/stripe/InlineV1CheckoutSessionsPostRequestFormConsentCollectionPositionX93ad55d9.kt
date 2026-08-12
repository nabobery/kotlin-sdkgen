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
 * ded/schema/properties/consent_collection/properties/payment_method_reuse_agreement/properties/position.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/consent_collection/properties/payment_method_reuse_agreement/properties/position
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormConsentCollectionPositionX93ad55d9.Serializer::class)
public sealed class InlineV1CheckoutSessionsPostRequestFormConsentCollectionPositionX93ad55d9 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `auto`.
   */
  public data object Auto : InlineV1CheckoutSessionsPostRequestFormConsentCollectionPositionX93ad55d9() {
    public override val `value`: String = "auto"
  }

  /**
   * Documented value. Wire value: `hidden`.
   */
  public data object Hidden : InlineV1CheckoutSessionsPostRequestFormConsentCollectionPositionX93ad55d9() {
    public override val `value`: String = "hidden"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CheckoutSessionsPostRequestFormConsentCollectionPositionX93ad55d9()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CheckoutSessionsPostRequestFormConsentCollectionPositionX93ad55d9 = when (value) {
      Auto.value -> Auto
      Hidden.value -> Hidden
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormConsentCollectionPositionX93ad55d9> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1CheckoutSessionsPostRequestFormConsentCollectionPositionX93ad55d9", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormConsentCollectionPositionX93ad55d9 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormConsentCollectionPositionX93ad55d9) {
      encoder.encodeString(value.value)
    }
  }
}
