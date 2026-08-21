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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/OutputModalityEnum.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputModalityEnum
 */
@Serializable(with = OutputModalityEnum.Serializer::class)
public sealed class OutputModalityEnum {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `text`.
   */
  public data object Text : OutputModalityEnum() {
    public override val `value`: String = "text"
  }

  /**
   * Documented value. Wire value: `image`.
   */
  public data object Image : OutputModalityEnum() {
    public override val `value`: String = "image"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : OutputModalityEnum()

  public companion object {
    public fun fromValue(`value`: String): OutputModalityEnum = when (value) {
      Text.value -> Text
      Image.value -> Image
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<OutputModalityEnum> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.OutputModalityEnum", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): OutputModalityEnum = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: OutputModalityEnum) {
      encoder.encodeString(value.value)
    }
  }
}
