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
 * Source: sdkgen://source/openapi.json#/components/schemas/file/properties/object
 */
@Serializable(with = InlineFileObjectValueX810b8265.Serializer::class)
public sealed class InlineFileObjectValueX810b8265 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `file`.
   */
  public data object File : InlineFileObjectValueX810b8265() {
    public override val `value`: String = "file"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineFileObjectValueX810b8265()

  public companion object {
    public fun fromValue(`value`: String): InlineFileObjectValueX810b8265 = when (value) {
      File.value -> File
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineFileObjectValueX810b8265> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineFileObjectValueX810b8265", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineFileObjectValueX810b8265 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineFileObjectValueX810b8265) {
      encoder.encodeString(value.value)
    }
  }
}
