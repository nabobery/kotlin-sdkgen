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
 * sdkgen://source/openapi.json#/components/schemas/payment_pages_checkout_session_saved_payment_method_options/properti
 * es/allow_redisplay_filters/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_pages_checkout_session_saved_payment_method_options/properti
 * es/allow_redisplay_filters/items
 */
@Serializable(with = InlinePaymentPagesCheckoutca5aAllowRedisplayFiltersItemXf1cd964d.Serializer::class)
public sealed class InlinePaymentPagesCheckoutca5aAllowRedisplayFiltersItemXf1cd964d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `always`.
   */
  public data object Always : InlinePaymentPagesCheckoutca5aAllowRedisplayFiltersItemXf1cd964d() {
    public override val `value`: String = "always"
  }

  /**
   * Documented value. Wire value: `limited`.
   */
  public data object Limited : InlinePaymentPagesCheckoutca5aAllowRedisplayFiltersItemXf1cd964d() {
    public override val `value`: String = "limited"
  }

  /**
   * Documented value. Wire value: `unspecified`.
   */
  public data object Unspecified : InlinePaymentPagesCheckoutca5aAllowRedisplayFiltersItemXf1cd964d() {
    public override val `value`: String = "unspecified"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentPagesCheckoutca5aAllowRedisplayFiltersItemXf1cd964d()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentPagesCheckoutca5aAllowRedisplayFiltersItemXf1cd964d = when (value) {
      Always.value -> Always
      Limited.value -> Limited
      Unspecified.value -> Unspecified
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentPagesCheckoutca5aAllowRedisplayFiltersItemXf1cd964d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentPagesCheckoutca5aAllowRedisplayFiltersItemXf1cd964d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentPagesCheckoutca5aAllowRedisplayFiltersItemXf1cd964d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentPagesCheckoutca5aAllowRedisplayFiltersItemXf1cd964d) {
      encoder.encodeString(value.value)
    }
  }
}
