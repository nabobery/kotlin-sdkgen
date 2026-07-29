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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/after_completion/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/after_completion/properties/type
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormAfterCompletionTypeXcb71b089.Serializer::class)
public sealed class InlineV1PaymentLinksPostRequestFormAfterCompletionTypeXcb71b089 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `hosted_confirmation`.
   */
  public data object HostedConfirmation : InlineV1PaymentLinksPostRequestFormAfterCompletionTypeXcb71b089() {
    public override val `value`: String = "hosted_confirmation"
  }

  /**
   * Documented value. Wire value: `redirect`.
   */
  public data object Redirect : InlineV1PaymentLinksPostRequestFormAfterCompletionTypeXcb71b089() {
    public override val `value`: String = "redirect"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentLinksPostRequestFormAfterCompletionTypeXcb71b089()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentLinksPostRequestFormAfterCompletionTypeXcb71b089 = when (value) {
      HostedConfirmation.value -> HostedConfirmation
      Redirect.value -> Redirect
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormAfterCompletionTypeXcb71b089> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1PaymentLinksPostRequestFormAfterCompletionTypeXcb71b089", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormAfterCompletionTypeXcb71b089 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormAfterCompletionTypeXcb71b089) {
      encoder.encodeString(value.value)
    }
  }
}
