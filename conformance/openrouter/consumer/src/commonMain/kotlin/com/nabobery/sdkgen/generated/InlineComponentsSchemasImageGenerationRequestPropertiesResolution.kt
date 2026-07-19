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
 * Normalized resolution tier of the generated image. Concrete pixel dimensions are derived per-provider.
 */
@Serializable(with = InlineComponentsSchemasImageGenerationRequestPropertiesResolution.Serializer::class)
public sealed class InlineComponentsSchemasImageGenerationRequestPropertiesResolution {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `512`.
   */
  public data object _512 : InlineComponentsSchemasImageGenerationRequestPropertiesResolution() {
    public override val `value`: String = "512"
  }

  /**
   * Documented value. Wire value: `1K`.
   */
  public data object _1K : InlineComponentsSchemasImageGenerationRequestPropertiesResolution() {
    public override val `value`: String = "1K"
  }

  /**
   * Documented value. Wire value: `2K`.
   */
  public data object _2K : InlineComponentsSchemasImageGenerationRequestPropertiesResolution() {
    public override val `value`: String = "2K"
  }

  /**
   * Documented value. Wire value: `4K`.
   */
  public data object _4K : InlineComponentsSchemasImageGenerationRequestPropertiesResolution() {
    public override val `value`: String = "4K"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasImageGenerationRequestPropertiesResolution()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasImageGenerationRequestPropertiesResolution =
      when (value) {
      _512.value -> _512
      _1K.value -> _1K
      _2K.value -> _2K
      _4K.value -> _4K
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasImageGenerationRequestPropertiesResolution> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasImageGenerationRequestPropertiesResolution", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasImageGenerationRequestPropertiesResolution =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasImageGenerationRequestPropertiesResolution) {
      encoder.encodeString(value.value)
    }
  }
}
