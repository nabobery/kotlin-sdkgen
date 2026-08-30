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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponsesSearchCompleted/properties/type
 */
@Serializable(with = InlineOpenAiResponsesSearchCompletedTypeXbbabb05c.Serializer::class)
public sealed class InlineOpenAiResponsesSearchCompletedTypeXbbabb05c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.web_search_call.completed`.
   */
  public data object ResponseWebSearchCallCompleted : InlineOpenAiResponsesSearchCompletedTypeXbbabb05c() {
    public override val `value`: String = "response.web_search_call.completed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOpenAiResponsesSearchCompletedTypeXbbabb05c()

  public companion object {
    public fun fromValue(`value`: String): InlineOpenAiResponsesSearchCompletedTypeXbbabb05c = when (value) {
      ResponseWebSearchCallCompleted.value -> ResponseWebSearchCallCompleted
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOpenAiResponsesSearchCompletedTypeXbbabb05c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineOpenAiResponsesSearchCompletedTypeXbbabb05c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOpenAiResponsesSearchCompletedTypeXbbabb05c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOpenAiResponsesSearchCompletedTypeXbbabb05c) {
      encoder.encodeString(value.value)
    }
  }
}
