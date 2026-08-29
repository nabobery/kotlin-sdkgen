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
 * Configuration for collecting a payment method during checkout. Defaults to `always`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_link/properties/payment_method_collection
 */
@Serializable(with = InlinePaymentLinkPaymentMethodCollectionX19b2f8b5.Serializer::class)
public sealed class InlinePaymentLinkPaymentMethodCollectionX19b2f8b5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `always`.
   */
  public data object Always : InlinePaymentLinkPaymentMethodCollectionX19b2f8b5() {
    public override val `value`: String = "always"
  }

  /**
   * Documented value. Wire value: `if_required`.
   */
  public data object IfRequired : InlinePaymentLinkPaymentMethodCollectionX19b2f8b5() {
    public override val `value`: String = "if_required"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentLinkPaymentMethodCollectionX19b2f8b5()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentLinkPaymentMethodCollectionX19b2f8b5 = when (value) {
      Always.value -> Always
      IfRequired.value -> IfRequired
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentLinkPaymentMethodCollectionX19b2f8b5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentLinkPaymentMethodCollectionX19b2f8b5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentLinkPaymentMethodCollectionX19b2f8b5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentLinkPaymentMethodCollectionX19b2f8b5) {
      encoder.encodeString(value.value)
    }
  }
}
