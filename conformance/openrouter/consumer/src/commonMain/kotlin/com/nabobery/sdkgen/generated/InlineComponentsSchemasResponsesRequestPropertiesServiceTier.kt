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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/ResponsesRequest/properties/service_tier.
 */
@Serializable(with = InlineComponentsSchemasResponsesRequestPropertiesServiceTier.Serializer::class)
public sealed class InlineComponentsSchemasResponsesRequestPropertiesServiceTier {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `auto`.
   */
  public data object Auto : InlineComponentsSchemasResponsesRequestPropertiesServiceTier() {
    public override val `value`: String = "auto"
  }

  /**
   * Documented value. Wire value: `default`.
   */
  public data object Default : InlineComponentsSchemasResponsesRequestPropertiesServiceTier() {
    public override val `value`: String = "default"
  }

  /**
   * Documented value. Wire value: `flex`.
   */
  public data object Flex : InlineComponentsSchemasResponsesRequestPropertiesServiceTier() {
    public override val `value`: String = "flex"
  }

  /**
   * Documented value. Wire value: `priority`.
   */
  public data object Priority : InlineComponentsSchemasResponsesRequestPropertiesServiceTier() {
    public override val `value`: String = "priority"
  }

  /**
   * Documented value. Wire value: `scale`.
   */
  public data object Scale : InlineComponentsSchemasResponsesRequestPropertiesServiceTier() {
    public override val `value`: String = "scale"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasResponsesRequestPropertiesServiceTier()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasResponsesRequestPropertiesServiceTier = when (value) {
      Auto.value -> Auto
      Default.value -> Default
      Flex.value -> Flex
      Priority.value -> Priority
      Scale.value -> Scale
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasResponsesRequestPropertiesServiceTier> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasResponsesRequestPropertiesServiceTier", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasResponsesRequestPropertiesServiceTier =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasResponsesRequestPropertiesServiceTier) {
      encoder.encodeString(value.value)
    }
  }
}
