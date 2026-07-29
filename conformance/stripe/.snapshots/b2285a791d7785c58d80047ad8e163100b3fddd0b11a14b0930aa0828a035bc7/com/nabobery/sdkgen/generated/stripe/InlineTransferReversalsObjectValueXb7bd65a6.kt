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
 * String representing the object's type. Objects of the same type share the same value. Always has the value `list`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/transfer/properties/reversals/properties/object
 */
@Serializable(with = InlineTransferReversalsObjectValueXb7bd65a6.Serializer::class)
public sealed class InlineTransferReversalsObjectValueXb7bd65a6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `list`.
   */
  public data object List : InlineTransferReversalsObjectValueXb7bd65a6() {
    public override val `value`: String = "list"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTransferReversalsObjectValueXb7bd65a6()

  public companion object {
    public fun fromValue(`value`: String): InlineTransferReversalsObjectValueXb7bd65a6 = when (value) {
      List.value -> List
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineTransferReversalsObjectValueXb7bd65a6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineTransferReversalsObjectValueXb7bd65a6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTransferReversalsObjectValueXb7bd65a6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTransferReversalsObjectValueXb7bd65a6) {
      encoder.encodeString(value.value)
    }
  }
}
