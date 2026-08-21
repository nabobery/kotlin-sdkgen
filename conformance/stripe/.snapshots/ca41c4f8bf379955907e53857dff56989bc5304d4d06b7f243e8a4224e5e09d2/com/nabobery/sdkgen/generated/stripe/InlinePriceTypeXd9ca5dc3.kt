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
 * One of `one_time` or `recurring` depending on whether the price is for a one-time purchase or a recurring
 * (subscription) purchase.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/price/properties/type
 */
@Serializable(with = InlinePriceTypeXd9ca5dc3.Serializer::class)
public sealed class InlinePriceTypeXd9ca5dc3 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `one_time`.
   */
  public data object OneTime : InlinePriceTypeXd9ca5dc3() {
    public override val `value`: String = "one_time"
  }

  /**
   * Documented value. Wire value: `recurring`.
   */
  public data object Recurring : InlinePriceTypeXd9ca5dc3() {
    public override val `value`: String = "recurring"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePriceTypeXd9ca5dc3()

  public companion object {
    public fun fromValue(`value`: String): InlinePriceTypeXd9ca5dc3 = when (value) {
      OneTime.value -> OneTime
      Recurring.value -> Recurring
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePriceTypeXd9ca5dc3> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePriceTypeXd9ca5dc3", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePriceTypeXd9ca5dc3 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePriceTypeXd9ca5dc3) {
      encoder.encodeString(value.value)
    }
  }
}
