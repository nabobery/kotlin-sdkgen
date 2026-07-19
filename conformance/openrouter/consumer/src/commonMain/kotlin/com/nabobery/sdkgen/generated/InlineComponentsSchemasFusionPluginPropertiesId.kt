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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/FusionPlugin/properties/id.
 */
@Serializable(with = InlineComponentsSchemasFusionPluginPropertiesId.Serializer::class)
public sealed class InlineComponentsSchemasFusionPluginPropertiesId {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `fusion`.
   */
  public data object Fusion : InlineComponentsSchemasFusionPluginPropertiesId() {
    public override val `value`: String = "fusion"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasFusionPluginPropertiesId()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasFusionPluginPropertiesId = when (value) {
      Fusion.value -> Fusion
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasFusionPluginPropertiesId> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasFusionPluginPropertiesId",
          PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasFusionPluginPropertiesId = fromValue(decoder
      .decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasFusionPluginPropertiesId) {
      encoder.encodeString(value.value)
    }
  }
}
