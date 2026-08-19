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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponsesWebSearchCallSearching/properties/type
 */
@Serializable(with = InlineOpenAiResponsesWebSearchCallSearchingTypeXffe34362.Serializer::class)
public sealed class InlineOpenAiResponsesWebSearchCallSearchingTypeXffe34362 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.web_search_call.searching`.
   */
  public data object ResponseWebSearchCallSearching : InlineOpenAiResponsesWebSearchCallSearchingTypeXffe34362() {
    public override val `value`: String = "response.web_search_call.searching"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOpenAiResponsesWebSearchCallSearchingTypeXffe34362()

  public companion object {
    public fun fromValue(`value`: String): InlineOpenAiResponsesWebSearchCallSearchingTypeXffe34362 = when (value) {
      ResponseWebSearchCallSearching.value -> ResponseWebSearchCallSearching
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOpenAiResponsesWebSearchCallSearchingTypeXffe34362> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineOpenAiResponsesWebSearchCallSearchingTypeXffe34362", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOpenAiResponsesWebSearchCallSearchingTypeXffe34362 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOpenAiResponsesWebSearchCallSearchingTypeXffe34362) {
      encoder.encodeString(value.value)
    }
  }
}
