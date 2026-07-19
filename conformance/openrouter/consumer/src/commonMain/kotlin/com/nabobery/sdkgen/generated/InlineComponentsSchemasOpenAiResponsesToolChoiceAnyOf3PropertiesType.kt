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
 * sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponsesToolChoice/anyOf/3/properties/type.
 */
@Serializable(with = InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf3PropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf3PropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `function`.
   */
  public data object Function : InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf3PropertiesType() {
    public override val `value`: String = "function"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf3PropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf3PropertiesType =
      when (value) {
      Function.value -> Function
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf3PropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf3PropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf3PropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf3PropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
