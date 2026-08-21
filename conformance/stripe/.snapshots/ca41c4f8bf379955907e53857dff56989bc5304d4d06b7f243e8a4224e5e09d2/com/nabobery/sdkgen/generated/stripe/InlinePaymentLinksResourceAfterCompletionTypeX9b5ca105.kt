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
 * The specified behavior after the purchase is complete.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_links_resource_after_completion/properties/type
 */
@Serializable(with = InlinePaymentLinksResourceAfterCompletionTypeX9b5ca105.Serializer::class)
public sealed class InlinePaymentLinksResourceAfterCompletionTypeX9b5ca105 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `hosted_confirmation`.
   */
  public data object HostedConfirmation : InlinePaymentLinksResourceAfterCompletionTypeX9b5ca105() {
    public override val `value`: String = "hosted_confirmation"
  }

  /**
   * Documented value. Wire value: `redirect`.
   */
  public data object Redirect : InlinePaymentLinksResourceAfterCompletionTypeX9b5ca105() {
    public override val `value`: String = "redirect"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentLinksResourceAfterCompletionTypeX9b5ca105()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentLinksResourceAfterCompletionTypeX9b5ca105 = when (value) {
      HostedConfirmation.value -> HostedConfirmation
      Redirect.value -> Redirect
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentLinksResourceAfterCompletionTypeX9b5ca105> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentLinksResourceAfterCompletionTypeX9b5ca105", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentLinksResourceAfterCompletionTypeX9b5ca105 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentLinksResourceAfterCompletionTypeX9b5ca105) {
      encoder.encodeString(value.value)
    }
  }
}
