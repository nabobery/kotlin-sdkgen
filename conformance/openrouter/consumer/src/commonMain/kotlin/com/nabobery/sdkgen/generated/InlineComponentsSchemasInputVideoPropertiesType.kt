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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/InputVideo/properties/type.
 */
@Serializable(with = InlineComponentsSchemasInputVideoPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasInputVideoPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `input_video`.
   */
  public data object InputVideo : InlineComponentsSchemasInputVideoPropertiesType() {
    public override val `value`: String = "input_video"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasInputVideoPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasInputVideoPropertiesType = when (value) {
      InputVideo.value -> InputVideo
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasInputVideoPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasInputVideoPropertiesType",
          PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasInputVideoPropertiesType = fromValue(decoder
      .decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasInputVideoPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
