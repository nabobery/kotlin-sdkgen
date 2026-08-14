package io.github.nabobery.sdkgen.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ContentPartImage/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ContentPartImage/properties/type
 */
@Serializable(with = InlineContentPartImageTypeX4e832055.Serializer::class)
public sealed class InlineContentPartImageTypeX4e832055 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `image_url`.
   */
  public data object ImageUrl : InlineContentPartImageTypeX4e832055() {
    public override val `value`: String = "image_url"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineContentPartImageTypeX4e832055()

  public companion object {
    public fun fromValue(`value`: String): InlineContentPartImageTypeX4e832055 = when (value) {
      ImageUrl.value -> ImageUrl
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineContentPartImageTypeX4e832055> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineContentPartImageTypeX4e832055", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineContentPartImageTypeX4e832055 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineContentPartImageTypeX4e832055) {
      encoder.encodeString(value.value)
    }
  }
}
