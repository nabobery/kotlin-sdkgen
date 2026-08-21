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
 * The version of 3D Secure that was used.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payments_primitives_payment_records_resource_payment_method_card_det
 * ails_resource_three_d_secure/properties/version
 */
@Serializable(with = InlinePaymentsPrimitivesPabc9bVersionXa265e284.Serializer::class)
public sealed class InlinePaymentsPrimitivesPabc9bVersionXa265e284 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `1.0.2`.
   */
  public data object _102 : InlinePaymentsPrimitivesPabc9bVersionXa265e284() {
    public override val `value`: String = "1.0.2"
  }

  /**
   * Documented value. Wire value: `2.1.0`.
   */
  public data object _210 : InlinePaymentsPrimitivesPabc9bVersionXa265e284() {
    public override val `value`: String = "2.1.0"
  }

  /**
   * Documented value. Wire value: `2.2.0`.
   */
  public data object _220 : InlinePaymentsPrimitivesPabc9bVersionXa265e284() {
    public override val `value`: String = "2.2.0"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentsPrimitivesPabc9bVersionXa265e284()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentsPrimitivesPabc9bVersionXa265e284 = when (value) {
      _102.value -> _102
      _210.value -> _210
      _220.value -> _220
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentsPrimitivesPabc9bVersionXa265e284> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentsPrimitivesPabc9bVersionXa265e284", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentsPrimitivesPabc9bVersionXa265e284 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentsPrimitivesPabc9bVersionXa265e284) {
      encoder.encodeString(value.value)
    }
  }
}
