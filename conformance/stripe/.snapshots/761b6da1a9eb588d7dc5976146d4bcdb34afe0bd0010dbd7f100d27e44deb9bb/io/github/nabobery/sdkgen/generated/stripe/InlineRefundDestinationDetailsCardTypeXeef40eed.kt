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
 * The type of refund. This can be `refund`, `reversal`, or `pending`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/refund_destination_details_card/properties/type
 */
@Serializable(with = InlineRefundDestinationDetailsCardTypeXeef40eed.Serializer::class)
public sealed class InlineRefundDestinationDetailsCardTypeXeef40eed {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineRefundDestinationDetailsCardTypeXeef40eed() {
    public override val `value`: String = "pending"
  }

  /**
   * Documented value. Wire value: `refund`.
   */
  public data object Refund : InlineRefundDestinationDetailsCardTypeXeef40eed() {
    public override val `value`: String = "refund"
  }

  /**
   * Documented value. Wire value: `reversal`.
   */
  public data object Reversal : InlineRefundDestinationDetailsCardTypeXeef40eed() {
    public override val `value`: String = "reversal"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineRefundDestinationDetailsCardTypeXeef40eed()

  public companion object {
    public fun fromValue(`value`: String): InlineRefundDestinationDetailsCardTypeXeef40eed = when (value) {
      Pending.value -> Pending
      Refund.value -> Refund
      Reversal.value -> Reversal
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineRefundDestinationDetailsCardTypeXeef40eed> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineRefundDestinationDetailsCardTypeXeef40eed", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRefundDestinationDetailsCardTypeXeef40eed = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRefundDestinationDetailsCardTypeXeef40eed) {
      encoder.encodeString(value.value)
    }
  }
}
