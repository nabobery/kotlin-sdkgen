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
 * Resolution of the generated video
 */
@Serializable(with = InlineComponentsSchemasVideoGenerationRequestPropertiesResolution.Serializer::class)
public sealed class InlineComponentsSchemasVideoGenerationRequestPropertiesResolution {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `480p`.
   */
  public data object _480p : InlineComponentsSchemasVideoGenerationRequestPropertiesResolution() {
    public override val `value`: String = "480p"
  }

  /**
   * Documented value. Wire value: `720p`.
   */
  public data object _720p : InlineComponentsSchemasVideoGenerationRequestPropertiesResolution() {
    public override val `value`: String = "720p"
  }

  /**
   * Documented value. Wire value: `1080p`.
   */
  public data object _1080p : InlineComponentsSchemasVideoGenerationRequestPropertiesResolution() {
    public override val `value`: String = "1080p"
  }

  /**
   * Documented value. Wire value: `1K`.
   */
  public data object _1K : InlineComponentsSchemasVideoGenerationRequestPropertiesResolution() {
    public override val `value`: String = "1K"
  }

  /**
   * Documented value. Wire value: `2K`.
   */
  public data object _2K : InlineComponentsSchemasVideoGenerationRequestPropertiesResolution() {
    public override val `value`: String = "2K"
  }

  /**
   * Documented value. Wire value: `4K`.
   */
  public data object _4K : InlineComponentsSchemasVideoGenerationRequestPropertiesResolution() {
    public override val `value`: String = "4K"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasVideoGenerationRequestPropertiesResolution()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasVideoGenerationRequestPropertiesResolution =
      when (value) {
      _480p.value -> _480p
      _720p.value -> _720p
      _1080p.value -> _1080p
      _1K.value -> _1K
      _2K.value -> _2K
      _4K.value -> _4K
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasVideoGenerationRequestPropertiesResolution> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasVideoGenerationRequestPropertiesResolution", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasVideoGenerationRequestPropertiesResolution =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasVideoGenerationRequestPropertiesResolution) {
      encoder.encodeString(value.value)
    }
  }
}
