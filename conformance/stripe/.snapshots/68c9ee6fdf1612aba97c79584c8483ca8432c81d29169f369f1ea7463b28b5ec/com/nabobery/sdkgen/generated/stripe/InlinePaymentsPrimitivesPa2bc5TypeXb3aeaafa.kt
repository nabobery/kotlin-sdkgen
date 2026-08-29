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
 * Type of installment plan, one of `fixed_count`, `revolving`, or `bonus`.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payments_primitives_payment_records_resource_payment_method_card_det
 * ails_resource_installment_plan/properties/type
 */
@Serializable(with = InlinePaymentsPrimitivesPa2bc5TypeXb3aeaafa.Serializer::class)
public sealed class InlinePaymentsPrimitivesPa2bc5TypeXb3aeaafa {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `bonus`.
   */
  public data object Bonus : InlinePaymentsPrimitivesPa2bc5TypeXb3aeaafa() {
    public override val `value`: String = "bonus"
  }

  /**
   * Documented value. Wire value: `fixed_count`.
   */
  public data object FixedCount : InlinePaymentsPrimitivesPa2bc5TypeXb3aeaafa() {
    public override val `value`: String = "fixed_count"
  }

  /**
   * Documented value. Wire value: `revolving`.
   */
  public data object Revolving : InlinePaymentsPrimitivesPa2bc5TypeXb3aeaafa() {
    public override val `value`: String = "revolving"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentsPrimitivesPa2bc5TypeXb3aeaafa()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentsPrimitivesPa2bc5TypeXb3aeaafa = when (value) {
      Bonus.value -> Bonus
      FixedCount.value -> FixedCount
      Revolving.value -> Revolving
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentsPrimitivesPa2bc5TypeXb3aeaafa> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentsPrimitivesPa2bc5TypeXb3aeaafa", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentsPrimitivesPa2bc5TypeXb3aeaafa = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentsPrimitivesPa2bc5TypeXb3aeaafa) {
      encoder.encodeString(value.value)
    }
  }
}
