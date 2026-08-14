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
 * String representing the object's type. Objects of the same type share the same value.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury.inbound_transfer/properties/object
 */
@Serializable(with = InlineTreasuryInboundTransferObjectValueX4f5fbcc4.Serializer::class)
public sealed class InlineTreasuryInboundTransferObjectValueX4f5fbcc4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `treasury.inbound_transfer`.
   */
  public data object TreasuryInboundTransfer : InlineTreasuryInboundTransferObjectValueX4f5fbcc4() {
    public override val `value`: String = "treasury.inbound_transfer"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTreasuryInboundTransferObjectValueX4f5fbcc4()

  public companion object {
    public fun fromValue(`value`: String): InlineTreasuryInboundTransferObjectValueX4f5fbcc4 = when (value) {
      TreasuryInboundTransfer.value -> TreasuryInboundTransfer
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineTreasuryInboundTransferObjectValueX4f5fbcc4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineTreasuryInboundTransferObjectValueX4f5fbcc4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTreasuryInboundTransferObjectValueX4f5fbcc4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTreasuryInboundTransferObjectValueX4f5fbcc4) {
      encoder.encodeString(value.value)
    }
  }
}
