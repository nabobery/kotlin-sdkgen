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
 * Reason for the cancellation of this order.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/climate.order/properties/cancellation_reason
 */
@Serializable(with = InlineClimateOrderCancellationReasonXb8eb996f.Serializer::class)
public sealed class InlineClimateOrderCancellationReasonXb8eb996f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `expired`.
   */
  public data object Expired : InlineClimateOrderCancellationReasonXb8eb996f() {
    public override val `value`: String = "expired"
  }

  /**
   * Documented value. Wire value: `product_unavailable`.
   */
  public data object ProductUnavailable : InlineClimateOrderCancellationReasonXb8eb996f() {
    public override val `value`: String = "product_unavailable"
  }

  /**
   * Documented value. Wire value: `requested`.
   */
  public data object Requested : InlineClimateOrderCancellationReasonXb8eb996f() {
    public override val `value`: String = "requested"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineClimateOrderCancellationReasonXb8eb996f()

  public companion object {
    public fun fromValue(`value`: String): InlineClimateOrderCancellationReasonXb8eb996f = when (value) {
      Expired.value -> Expired
      ProductUnavailable.value -> ProductUnavailable
      Requested.value -> Requested
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineClimateOrderCancellationReasonXb8eb996f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineClimateOrderCancellationReasonXb8eb996f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineClimateOrderCancellationReasonXb8eb996f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineClimateOrderCancellationReasonXb8eb996f) {
      encoder.encodeString(value.value)
    }
  }
}
