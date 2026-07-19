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
 */
@Serializable(with = InlineComponentsSchemasImageGenStreamErrorEventPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasImageGenStreamErrorEventPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `error`.
   */
  public data object Error : InlineComponentsSchemasImageGenStreamErrorEventPropertiesType() {
    public override val `value`: String = "error"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasImageGenStreamErrorEventPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasImageGenStreamErrorEventPropertiesType =
      when (value) {
      Error.value -> Error
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasImageGenStreamErrorEventPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasImageGenStreamErrorEventPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasImageGenStreamErrorEventPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasImageGenStreamErrorEventPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
