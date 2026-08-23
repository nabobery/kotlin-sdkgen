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
 * Source: sdkgen://source/openapi.json#/components/schemas/transfer/properties/object
 */
@Serializable(with = InlineTransferObjectValueX7e0e795d.Serializer::class)
public sealed class InlineTransferObjectValueX7e0e795d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `transfer`.
   */
  public data object Transfer : InlineTransferObjectValueX7e0e795d() {
    public override val `value`: String = "transfer"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTransferObjectValueX7e0e795d()

  public companion object {
    public fun fromValue(`value`: String): InlineTransferObjectValueX7e0e795d = when (value) {
      Transfer.value -> Transfer
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineTransferObjectValueX7e0e795d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineTransferObjectValueX7e0e795d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTransferObjectValueX7e0e795d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTransferObjectValueX7e0e795d) {
      encoder.encodeString(value.value)
    }
  }
}
