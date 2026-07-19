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
 * sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponsesWebSearchCallInProgress/properties/type.
 */
@Serializable(with = InlineComponentsSchemasOpenAiResponsesWebSearchCallInProgressPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasOpenAiResponsesWebSearchCallInProgressPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.web_search_call.in_progress`.
   */
  public data object ResponseWebSearchCallInProgress : InlineComponentsSchemasOpenAiResponsesWebSearchCallInProgressPropertiesType() {
    public override val `value`: String = "response.web_search_call.in_progress"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasOpenAiResponsesWebSearchCallInProgressPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasOpenAiResponsesWebSearchCallInProgressPropertiesType = when (value) {
      ResponseWebSearchCallInProgress.value -> ResponseWebSearchCallInProgress
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOpenAiResponsesWebSearchCallInProgressPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasOpenAiResponsesWebSearchCallInProgressPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOpenAiResponsesWebSearchCallInProgressPropertiesType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasOpenAiResponsesWebSearchCallInProgressPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
