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
 * Configuration for Customer creation during checkout.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_link/properties/customer_creation
 */
@Serializable(with = InlinePaymentLinkCustomerCreationX2f367cb7.Serializer::class)
public sealed class InlinePaymentLinkCustomerCreationX2f367cb7 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `always`.
   */
  public data object Always : InlinePaymentLinkCustomerCreationX2f367cb7() {
    public override val `value`: String = "always"
  }

  /**
   * Documented value. Wire value: `if_required`.
   */
  public data object IfRequired : InlinePaymentLinkCustomerCreationX2f367cb7() {
    public override val `value`: String = "if_required"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentLinkCustomerCreationX2f367cb7()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentLinkCustomerCreationX2f367cb7 = when (value) {
      Always.value -> Always
      IfRequired.value -> IfRequired
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentLinkCustomerCreationX2f367cb7> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentLinkCustomerCreationX2f367cb7", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentLinkCustomerCreationX2f367cb7 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentLinkCustomerCreationX2f367cb7) {
      encoder.encodeString(value.value)
    }
  }
}
