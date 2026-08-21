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
 * funding type of the underlying payment method.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payments_primitives_payment_records_resource_payment_method_amazon_p
 * ay_details_resource_funding/properties/type
 */
@Serializable(with = InlinePaymentsPrimitivesPa0d2aTypeX62ab8d87.Serializer::class)
public sealed class InlinePaymentsPrimitivesPa0d2aTypeX62ab8d87 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `card`.
   */
  public data object Card : InlinePaymentsPrimitivesPa0d2aTypeX62ab8d87() {
    public override val `value`: String = "card"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentsPrimitivesPa0d2aTypeX62ab8d87()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentsPrimitivesPa0d2aTypeX62ab8d87 = when (value) {
      Card.value -> Card
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentsPrimitivesPa0d2aTypeX62ab8d87> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentsPrimitivesPa0d2aTypeX62ab8d87", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentsPrimitivesPa0d2aTypeX62ab8d87 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentsPrimitivesPa0d2aTypeX62ab8d87) {
      encoder.encodeString(value.value)
    }
  }
}
