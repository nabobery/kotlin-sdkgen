package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of `inclusive`, `exclusive`,
 * or `unspecified`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/shipping_rate/properties/tax_behavior
 */
@Serializable(with = InlineShippingRateTaxBehaviorX98ec2e75.Serializer::class)
public sealed class InlineShippingRateTaxBehaviorX98ec2e75 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `exclusive`.
   */
  public data object Exclusive : InlineShippingRateTaxBehaviorX98ec2e75() {
    public override val `value`: String = "exclusive"
  }

  /**
   * Documented value. Wire value: `inclusive`.
   */
  public data object Inclusive : InlineShippingRateTaxBehaviorX98ec2e75() {
    public override val `value`: String = "inclusive"
  }

  /**
   * Documented value. Wire value: `unspecified`.
   */
  public data object Unspecified : InlineShippingRateTaxBehaviorX98ec2e75() {
    public override val `value`: String = "unspecified"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineShippingRateTaxBehaviorX98ec2e75()

  public companion object {
    public fun fromValue(`value`: String): InlineShippingRateTaxBehaviorX98ec2e75 = when (value) {
      Exclusive.value -> Exclusive
      Inclusive.value -> Inclusive
      Unspecified.value -> Unspecified
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineShippingRateTaxBehaviorX98ec2e75> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineShippingRateTaxBehaviorX98ec2e75", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineShippingRateTaxBehaviorX98ec2e75 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineShippingRateTaxBehaviorX98ec2e75) {
      encoder.encodeString(value.value)
    }
  }
}
