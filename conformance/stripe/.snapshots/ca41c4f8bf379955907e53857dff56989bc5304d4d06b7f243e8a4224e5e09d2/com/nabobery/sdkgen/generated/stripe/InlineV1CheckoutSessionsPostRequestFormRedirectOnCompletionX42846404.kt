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
 * This parameter applies to `ui_mode: embedded_page`. Learn more about the [redirect
 * behavior](https://docs.stripe.com/payments/checkout/custom-success-page?payment-ui=embedded-form) of embedded
 * sessions. Defaults to `always`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/redirect_on_completion
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormRedirectOnCompletionX42846404.Serializer::class)
public sealed class InlineV1CheckoutSessionsPostRequestFormRedirectOnCompletionX42846404 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `always`.
   */
  public data object Always : InlineV1CheckoutSessionsPostRequestFormRedirectOnCompletionX42846404() {
    public override val `value`: String = "always"
  }

  /**
   * Documented value. Wire value: `if_required`.
   */
  public data object IfRequired : InlineV1CheckoutSessionsPostRequestFormRedirectOnCompletionX42846404() {
    public override val `value`: String = "if_required"
  }

  /**
   * Documented value. Wire value: `never`.
   */
  public data object Never : InlineV1CheckoutSessionsPostRequestFormRedirectOnCompletionX42846404() {
    public override val `value`: String = "never"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CheckoutSessionsPostRequestFormRedirectOnCompletionX42846404()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CheckoutSessionsPostRequestFormRedirectOnCompletionX42846404 = when (value) {
      Always.value -> Always
      IfRequired.value -> IfRequired
      Never.value -> Never
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormRedirectOnCompletionX42846404> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1CheckoutSessionsPostRequestFormRedirectOnCompletionX42846404", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormRedirectOnCompletionX42846404 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormRedirectOnCompletionX42846404) {
      encoder.encodeString(value.value)
    }
  }
}
