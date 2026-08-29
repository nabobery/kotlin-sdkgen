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
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury.outbound_transfer/properties/object
 */
@Serializable(with = InlineTreasuryOutboundTransferObjectValueXc6c9301e.Serializer::class)
public sealed class InlineTreasuryOutboundTransferObjectValueXc6c9301e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `treasury.outbound_transfer`.
   */
  public data object TreasuryOutboundTransfer : InlineTreasuryOutboundTransferObjectValueXc6c9301e() {
    public override val `value`: String = "treasury.outbound_transfer"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTreasuryOutboundTransferObjectValueXc6c9301e()

  public companion object {
    public fun fromValue(`value`: String): InlineTreasuryOutboundTransferObjectValueXc6c9301e = when (value) {
      TreasuryOutboundTransfer.value -> TreasuryOutboundTransfer
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineTreasuryOutboundTransferObjectValueXc6c9301e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineTreasuryOutboundTransferObjectValueXc6c9301e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTreasuryOutboundTransferObjectValueXc6c9301e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTreasuryOutboundTransferObjectValueXc6c9301e) {
      encoder.encodeString(value.value)
    }
  }
}
