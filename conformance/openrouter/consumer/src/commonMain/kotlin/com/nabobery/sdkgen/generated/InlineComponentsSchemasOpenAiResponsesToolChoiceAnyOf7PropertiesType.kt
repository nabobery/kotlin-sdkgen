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
 * sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponsesToolChoice/anyOf/7/properties/type.
 */
@Serializable(with = InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf7PropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf7PropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `shell`.
   */
  public data object Shell : InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf7PropertiesType() {
    public override val `value`: String = "shell"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf7PropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf7PropertiesType =
      when (value) {
      Shell.value -> Shell
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf7PropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf7PropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf7PropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf7PropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
