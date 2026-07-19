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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ModerationPlugin/properties/id.
 */
@Serializable(with = InlineComponentsSchemasModerationPluginPropertiesId.Serializer::class)
public sealed class InlineComponentsSchemasModerationPluginPropertiesId {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `moderation`.
   */
  public data object Moderation : InlineComponentsSchemasModerationPluginPropertiesId() {
    public override val `value`: String = "moderation"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasModerationPluginPropertiesId()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasModerationPluginPropertiesId = when (value) {
      Moderation.value -> Moderation
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasModerationPluginPropertiesId> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasModerationPluginPropertiesId",
          PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasModerationPluginPropertiesId = fromValue(decoder
      .decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasModerationPluginPropertiesId) {
      encoder.encodeString(value.value)
    }
  }
}
