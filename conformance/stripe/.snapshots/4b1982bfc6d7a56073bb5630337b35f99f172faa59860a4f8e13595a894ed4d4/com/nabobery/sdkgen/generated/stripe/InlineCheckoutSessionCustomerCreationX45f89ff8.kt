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
 * Configure whether a Checkout Session creates a Customer when the Checkout Session completes.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/checkout.session/properties/customer_creation
 */
@Serializable(with = InlineCheckoutSessionCustomerCreationX45f89ff8.Serializer::class)
public sealed class InlineCheckoutSessionCustomerCreationX45f89ff8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `always`.
   */
  public data object Always : InlineCheckoutSessionCustomerCreationX45f89ff8() {
    public override val `value`: String = "always"
  }

  /**
   * Documented value. Wire value: `if_required`.
   */
  public data object IfRequired : InlineCheckoutSessionCustomerCreationX45f89ff8() {
    public override val `value`: String = "if_required"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCheckoutSessionCustomerCreationX45f89ff8()

  public companion object {
    public fun fromValue(`value`: String): InlineCheckoutSessionCustomerCreationX45f89ff8 = when (value) {
      Always.value -> Always
      IfRequired.value -> IfRequired
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCheckoutSessionCustomerCreationX45f89ff8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineCheckoutSessionCustomerCreationX45f89ff8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCheckoutSessionCustomerCreationX45f89ff8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCheckoutSessionCustomerCreationX45f89ff8) {
      encoder.encodeString(value.value)
    }
  }
}
