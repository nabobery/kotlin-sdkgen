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
 * chema/properties/after_completion/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/after_completion/properties/type
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormAfterCompletionTypeXa04bab19.Serializer::class)
public sealed class InlineV1PaymentLinksPostRequestFormAfterCompletionTypeXa04bab19 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `hosted_confirmation`.
   */
  public data object HostedConfirmation : InlineV1PaymentLinksPostRequestFormAfterCompletionTypeXa04bab19() {
    public override val `value`: String = "hosted_confirmation"
  }

  /**
   * Documented value. Wire value: `redirect`.
   */
  public data object Redirect : InlineV1PaymentLinksPostRequestFormAfterCompletionTypeXa04bab19() {
    public override val `value`: String = "redirect"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentLinksPostRequestFormAfterCompletionTypeXa04bab19()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentLinksPostRequestFormAfterCompletionTypeXa04bab19 = when (value) {
      HostedConfirmation.value -> HostedConfirmation
      Redirect.value -> Redirect
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormAfterCompletionTypeXa04bab19> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1PaymentLinksPostRequestFormAfterCompletionTypeXa04bab19", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormAfterCompletionTypeXa04bab19 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormAfterCompletionTypeXa04bab19) {
      encoder.encodeString(value.value)
    }
  }
}
