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
 * Rendering quality. Providers without a quality knob ignore this.
 */
@Serializable(with = InlineComponentsSchemasImageGenerationRequestPropertiesQuality.Serializer::class)
public sealed class InlineComponentsSchemasImageGenerationRequestPropertiesQuality {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `auto`.
   */
  public data object Auto : InlineComponentsSchemasImageGenerationRequestPropertiesQuality() {
    public override val `value`: String = "auto"
  }

  /**
   * Documented value. Wire value: `low`.
   */
  public data object Low : InlineComponentsSchemasImageGenerationRequestPropertiesQuality() {
    public override val `value`: String = "low"
  }

  /**
   * Documented value. Wire value: `medium`.
   */
  public data object Medium : InlineComponentsSchemasImageGenerationRequestPropertiesQuality() {
    public override val `value`: String = "medium"
  }

  /**
   * Documented value. Wire value: `high`.
   */
  public data object High : InlineComponentsSchemasImageGenerationRequestPropertiesQuality() {
    public override val `value`: String = "high"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasImageGenerationRequestPropertiesQuality()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasImageGenerationRequestPropertiesQuality =
      when (value) {
      Auto.value -> Auto
      Low.value -> Low
      Medium.value -> Medium
      High.value -> High
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasImageGenerationRequestPropertiesQuality> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasImageGenerationRequestPropertiesQuality", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasImageGenerationRequestPropertiesQuality =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasImageGenerationRequestPropertiesQuality) {
      encoder.encodeString(value.value)
    }
  }
}
