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
 * The service tier to use for processing this request.
 */
@Serializable(with = InlineComponentsSchemasChatRequestPropertiesServiceTier.Serializer::class)
public sealed class InlineComponentsSchemasChatRequestPropertiesServiceTier {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `auto`.
   */
  public data object Auto : InlineComponentsSchemasChatRequestPropertiesServiceTier() {
    public override val `value`: String = "auto"
  }

  /**
   * Documented value. Wire value: `default`.
   */
  public data object Default : InlineComponentsSchemasChatRequestPropertiesServiceTier() {
    public override val `value`: String = "default"
  }

  /**
   * Documented value. Wire value: `flex`.
   */
  public data object Flex : InlineComponentsSchemasChatRequestPropertiesServiceTier() {
    public override val `value`: String = "flex"
  }

  /**
   * Documented value. Wire value: `priority`.
   */
  public data object Priority : InlineComponentsSchemasChatRequestPropertiesServiceTier() {
    public override val `value`: String = "priority"
  }

  /**
   * Documented value. Wire value: `scale`.
   */
  public data object Scale : InlineComponentsSchemasChatRequestPropertiesServiceTier() {
    public override val `value`: String = "scale"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasChatRequestPropertiesServiceTier()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasChatRequestPropertiesServiceTier = when (value) {
      Auto.value -> Auto
      Default.value -> Default
      Flex.value -> Flex
      Priority.value -> Priority
      Scale.value -> Scale
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasChatRequestPropertiesServiceTier> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasChatRequestPropertiesServiceTier", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasChatRequestPropertiesServiceTier =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasChatRequestPropertiesServiceTier) {
      encoder.encodeString(value.value)
    }
  }
}
