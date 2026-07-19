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
 * sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponsesWebSearchCallSearching/properties/type.
 */
@Serializable(with = InlineComponentsSchemasOpenAiResponsesWebSearchCallSearchingPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasOpenAiResponsesWebSearchCallSearchingPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.web_search_call.searching`.
   */
  public data object ResponseWebSearchCallSearching : InlineComponentsSchemasOpenAiResponsesWebSearchCallSearchingPropertiesType() {
    public override val `value`: String = "response.web_search_call.searching"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasOpenAiResponsesWebSearchCallSearchingPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasOpenAiResponsesWebSearchCallSearchingPropertiesType =
      when (value) {
      ResponseWebSearchCallSearching.value -> ResponseWebSearchCallSearching
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOpenAiResponsesWebSearchCallSearchingPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasOpenAiResponsesWebSearchCallSearchingPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOpenAiResponsesWebSearchCallSearchingPropertiesType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasOpenAiResponsesWebSearchCallSearchingPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
