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
 * sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponsesSearchCompleted/properties/type.
 */
@Serializable(with = InlineComponentsSchemasOpenAiResponsesSearchCompletedPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasOpenAiResponsesSearchCompletedPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.web_search_call.completed`.
   */
  public data object ResponseWebSearchCallCompleted : InlineComponentsSchemasOpenAiResponsesSearchCompletedPropertiesType() {
    public override val `value`: String = "response.web_search_call.completed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasOpenAiResponsesSearchCompletedPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasOpenAiResponsesSearchCompletedPropertiesType =
      when (value) {
      ResponseWebSearchCallCompleted.value -> ResponseWebSearchCallCompleted
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOpenAiResponsesSearchCompletedPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasOpenAiResponsesSearchCompletedPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOpenAiResponsesSearchCompletedPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasOpenAiResponsesSearchCompletedPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
