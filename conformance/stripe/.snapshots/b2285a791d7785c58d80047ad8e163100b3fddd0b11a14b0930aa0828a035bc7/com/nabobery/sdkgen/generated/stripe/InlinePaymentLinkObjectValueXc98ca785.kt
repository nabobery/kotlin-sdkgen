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
 * String representing the object's type. Objects of the same type share the same value.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_link/properties/object
 */
@Serializable(with = InlinePaymentLinkObjectValueXc98ca785.Serializer::class)
public sealed class InlinePaymentLinkObjectValueXc98ca785 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `payment_link`.
   */
  public data object PaymentLink : InlinePaymentLinkObjectValueXc98ca785() {
    public override val `value`: String = "payment_link"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentLinkObjectValueXc98ca785()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentLinkObjectValueXc98ca785 = when (value) {
      PaymentLink.value -> PaymentLink
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePaymentLinkObjectValueXc98ca785> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentLinkObjectValueXc98ca785", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentLinkObjectValueXc98ca785 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentLinkObjectValueXc98ca785) {
      encoder.encodeString(value.value)
    }
  }
}
