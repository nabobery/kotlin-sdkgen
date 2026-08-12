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
 * ded/schema/properties/payment_method_options/properties/card/properties/request_overcapture.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/card/properties/request_overcapture
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormRequestOvercaptureX5c3be25e.Serializer::class)
public sealed class InlineV1CheckoutSessionsPostRequestFormRequestOvercaptureX5c3be25e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `if_available`.
   */
  public data object IfAvailable : InlineV1CheckoutSessionsPostRequestFormRequestOvercaptureX5c3be25e() {
    public override val `value`: String = "if_available"
  }

  /**
   * Documented value. Wire value: `never`.
   */
  public data object Never : InlineV1CheckoutSessionsPostRequestFormRequestOvercaptureX5c3be25e() {
    public override val `value`: String = "never"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CheckoutSessionsPostRequestFormRequestOvercaptureX5c3be25e()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CheckoutSessionsPostRequestFormRequestOvercaptureX5c3be25e = when (value) {
      IfAvailable.value -> IfAvailable
      Never.value -> Never
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormRequestOvercaptureX5c3be25e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1CheckoutSessionsPostRequestFormRequestOvercaptureX5c3be25e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormRequestOvercaptureX5c3be25e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormRequestOvercaptureX5c3be25e) {
      encoder.encodeString(value.value)
    }
  }
}
