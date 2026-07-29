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
 * Source: sdkgen://source/openapi.json#/components/schemas/transfer_reversal/properties/object
 */
@Serializable(with = InlineTransferReversalObjectValueX4b5dfdb6.Serializer::class)
public sealed class InlineTransferReversalObjectValueX4b5dfdb6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `transfer_reversal`.
   */
  public data object TransferReversal : InlineTransferReversalObjectValueX4b5dfdb6() {
    public override val `value`: String = "transfer_reversal"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTransferReversalObjectValueX4b5dfdb6()

  public companion object {
    public fun fromValue(`value`: String): InlineTransferReversalObjectValueX4b5dfdb6 = when (value) {
      TransferReversal.value -> TransferReversal
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineTransferReversalObjectValueX4b5dfdb6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineTransferReversalObjectValueX4b5dfdb6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTransferReversalObjectValueX4b5dfdb6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTransferReversalObjectValueX4b5dfdb6) {
      encoder.encodeString(value.value)
    }
  }
}
