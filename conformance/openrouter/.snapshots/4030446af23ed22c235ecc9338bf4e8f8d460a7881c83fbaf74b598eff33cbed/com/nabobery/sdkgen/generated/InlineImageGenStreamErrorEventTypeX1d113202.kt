package com.nabobery.sdkgen.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * The event type
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ImageGenStreamErrorEvent/properties/type
 */
@Serializable(with = InlineImageGenStreamErrorEventTypeX1d113202.Serializer::class)
public sealed class InlineImageGenStreamErrorEventTypeX1d113202 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `error`.
   */
  public data object Error : InlineImageGenStreamErrorEventTypeX1d113202() {
    public override val `value`: String = "error"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineImageGenStreamErrorEventTypeX1d113202()

  public companion object {
    public fun fromValue(`value`: String): InlineImageGenStreamErrorEventTypeX1d113202 = when (value) {
      Error.value -> Error
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineImageGenStreamErrorEventTypeX1d113202> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineImageGenStreamErrorEventTypeX1d113202", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineImageGenStreamErrorEventTypeX1d113202 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineImageGenStreamErrorEventTypeX1d113202) {
      encoder.encodeString(value.value)
    }
  }
}
