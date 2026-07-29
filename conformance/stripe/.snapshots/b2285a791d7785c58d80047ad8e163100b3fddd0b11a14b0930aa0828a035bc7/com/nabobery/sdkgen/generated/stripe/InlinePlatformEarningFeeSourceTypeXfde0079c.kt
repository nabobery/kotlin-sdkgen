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
 * Type of object that created the application fee.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/platform_earning_fee_source/properties/type
 */
@Serializable(with = InlinePlatformEarningFeeSourceTypeXfde0079c.Serializer::class)
public sealed class InlinePlatformEarningFeeSourceTypeXfde0079c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `charge`.
   */
  public data object Charge : InlinePlatformEarningFeeSourceTypeXfde0079c() {
    public override val `value`: String = "charge"
  }

  /**
   * Documented value. Wire value: `payout`.
   */
  public data object Payout : InlinePlatformEarningFeeSourceTypeXfde0079c() {
    public override val `value`: String = "payout"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePlatformEarningFeeSourceTypeXfde0079c()

  public companion object {
    public fun fromValue(`value`: String): InlinePlatformEarningFeeSourceTypeXfde0079c = when (value) {
      Charge.value -> Charge
      Payout.value -> Payout
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePlatformEarningFeeSourceTypeXfde0079c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePlatformEarningFeeSourceTypeXfde0079c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePlatformEarningFeeSourceTypeXfde0079c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePlatformEarningFeeSourceTypeXfde0079c) {
      encoder.encodeString(value.value)
    }
  }
}
