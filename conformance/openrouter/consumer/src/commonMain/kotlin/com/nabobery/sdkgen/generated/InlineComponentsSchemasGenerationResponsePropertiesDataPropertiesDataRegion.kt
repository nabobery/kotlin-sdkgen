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
 * The data region this generation was routed through. 'europe' for EU-routed requests, 'global' otherwise.
 */
@Serializable(with = InlineComponentsSchemasGenerationResponsePropertiesDataPropertiesDataRegion.Serializer::class)
public sealed class InlineComponentsSchemasGenerationResponsePropertiesDataPropertiesDataRegion {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `global`.
   */
  public data object Global : InlineComponentsSchemasGenerationResponsePropertiesDataPropertiesDataRegion() {
    public override val `value`: String = "global"
  }

  /**
   * Documented value. Wire value: `europe`.
   */
  public data object Europe : InlineComponentsSchemasGenerationResponsePropertiesDataPropertiesDataRegion() {
    public override val `value`: String = "europe"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasGenerationResponsePropertiesDataPropertiesDataRegion()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasGenerationResponsePropertiesDataPropertiesDataRegion = when (value) {
      Global.value -> Global
      Europe.value -> Europe
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasGenerationResponsePropertiesDataPropertiesDataRegion> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasGenerationResponsePropertiesDataPropertiesDataRegion", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasGenerationResponsePropertiesDataPropertiesDataRegion = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasGenerationResponsePropertiesDataPropertiesDataRegion) {
      encoder.encodeString(value.value)
    }
  }
}
