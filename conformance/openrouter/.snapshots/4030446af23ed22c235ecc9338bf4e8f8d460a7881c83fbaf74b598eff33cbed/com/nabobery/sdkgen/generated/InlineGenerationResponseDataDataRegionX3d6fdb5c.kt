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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/GenerationResponse/properties/data/properties/data_region
 */
@Serializable(with = InlineGenerationResponseDataDataRegionX3d6fdb5c.Serializer::class)
public sealed class InlineGenerationResponseDataDataRegionX3d6fdb5c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `global`.
   */
  public data object Global : InlineGenerationResponseDataDataRegionX3d6fdb5c() {
    public override val `value`: String = "global"
  }

  /**
   * Documented value. Wire value: `europe`.
   */
  public data object Europe : InlineGenerationResponseDataDataRegionX3d6fdb5c() {
    public override val `value`: String = "europe"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineGenerationResponseDataDataRegionX3d6fdb5c()

  public companion object {
    public fun fromValue(`value`: String): InlineGenerationResponseDataDataRegionX3d6fdb5c = when (value) {
      Global.value -> Global
      Europe.value -> Europe
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineGenerationResponseDataDataRegionX3d6fdb5c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineGenerationResponseDataDataRegionX3d6fdb5c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineGenerationResponseDataDataRegionX3d6fdb5c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineGenerationResponseDataDataRegionX3d6fdb5c) {
      encoder.encodeString(value.value)
    }
  }
}
