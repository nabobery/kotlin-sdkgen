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
 * Configure whether a Checkout Session should collect a payment method. Defaults to `always`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/checkout.session/properties/payment_method_collection
 */
@Serializable(with = InlineCheckoutSessionPaymentMethodCollectionX18402ff1.Serializer::class)
public sealed class InlineCheckoutSessionPaymentMethodCollectionX18402ff1 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `always`.
   */
  public data object Always : InlineCheckoutSessionPaymentMethodCollectionX18402ff1() {
    public override val `value`: String = "always"
  }

  /**
   * Documented value. Wire value: `if_required`.
   */
  public data object IfRequired : InlineCheckoutSessionPaymentMethodCollectionX18402ff1() {
    public override val `value`: String = "if_required"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCheckoutSessionPaymentMethodCollectionX18402ff1()

  public companion object {
    public fun fromValue(`value`: String): InlineCheckoutSessionPaymentMethodCollectionX18402ff1 = when (value) {
      Always.value -> Always
      IfRequired.value -> IfRequired
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineCheckoutSessionPaymentMethodCollectionX18402ff1> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineCheckoutSessionPaymentMethodCollectionX18402ff1", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCheckoutSessionPaymentMethodCollectionX18402ff1 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCheckoutSessionPaymentMethodCollectionX18402ff1) {
      encoder.encodeString(value.value)
    }
  }
}
