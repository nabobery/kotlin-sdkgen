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
 * If you provide a value for `address.line1`, the check result is one of `pass`, `fail`, `unavailable`, or `unchecked`.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payments_primitives_payment_records_resource_payment_method_card_det
 * ails_resource_checks/properties/address_line1_check
 */
@Serializable(with = InlinePaymentsPrimitivesPa4682AddressLine1CheckX96e8577e.Serializer::class)
public sealed class InlinePaymentsPrimitivesPa4682AddressLine1CheckX96e8577e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `fail`.
   */
  public data object Fail : InlinePaymentsPrimitivesPa4682AddressLine1CheckX96e8577e() {
    public override val `value`: String = "fail"
  }

  /**
   * Documented value. Wire value: `pass`.
   */
  public data object Pass : InlinePaymentsPrimitivesPa4682AddressLine1CheckX96e8577e() {
    public override val `value`: String = "pass"
  }

  /**
   * Documented value. Wire value: `unavailable`.
   */
  public data object Unavailable : InlinePaymentsPrimitivesPa4682AddressLine1CheckX96e8577e() {
    public override val `value`: String = "unavailable"
  }

  /**
   * Documented value. Wire value: `unchecked`.
   */
  public data object Unchecked : InlinePaymentsPrimitivesPa4682AddressLine1CheckX96e8577e() {
    public override val `value`: String = "unchecked"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentsPrimitivesPa4682AddressLine1CheckX96e8577e()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentsPrimitivesPa4682AddressLine1CheckX96e8577e = when (value) {
      Fail.value -> Fail
      Pass.value -> Pass
      Unavailable.value -> Unavailable
      Unchecked.value -> Unchecked
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePaymentsPrimitivesPa4682AddressLine1CheckX96e8577e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentsPrimitivesPa4682AddressLine1CheckX96e8577e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentsPrimitivesPa4682AddressLine1CheckX96e8577e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentsPrimitivesPa4682AddressLine1CheckX96e8577e) {
      encoder.encodeString(value.value)
    }
  }
}
