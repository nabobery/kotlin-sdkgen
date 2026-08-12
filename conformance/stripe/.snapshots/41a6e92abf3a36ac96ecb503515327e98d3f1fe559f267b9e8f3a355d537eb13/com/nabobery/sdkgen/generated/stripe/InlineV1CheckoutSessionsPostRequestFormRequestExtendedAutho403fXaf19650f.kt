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
 * ded/schema/properties/payment_method_options/properties/card/properties/request_extended_authorization.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/card/properties/request_extended_authorization
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormRequestExtendedAutho403fXaf19650f.Serializer::class)
public sealed class InlineV1CheckoutSessionsPostRequestFormRequestExtendedAutho403fXaf19650f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `if_available`.
   */
  public data object IfAvailable : InlineV1CheckoutSessionsPostRequestFormRequestExtendedAutho403fXaf19650f() {
    public override val `value`: String = "if_available"
  }

  /**
   * Documented value. Wire value: `never`.
   */
  public data object Never : InlineV1CheckoutSessionsPostRequestFormRequestExtendedAutho403fXaf19650f() {
    public override val `value`: String = "never"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CheckoutSessionsPostRequestFormRequestExtendedAutho403fXaf19650f()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CheckoutSessionsPostRequestFormRequestExtendedAutho403fXaf19650f = when (value) {
      IfAvailable.value -> IfAvailable
      Never.value -> Never
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormRequestExtendedAutho403fXaf19650f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1CheckoutSessionsPostRequestFormRequestExtendedAutho403fXaf19650f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormRequestExtendedAutho403fXaf19650f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormRequestExtendedAutho403fXaf19650f) {
      encoder.encodeString(value.value)
    }
  }
}
