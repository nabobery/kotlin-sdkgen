package io.github.nabobery.sdkgen.generated

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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponsesWebSearchCallInProgress/properties/type
 */
@Serializable(with = InlineOpenAiResponsesWebSearchCallInProgressTypeX435e8287.Serializer::class)
public sealed class InlineOpenAiResponsesWebSearchCallInProgressTypeX435e8287 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.web_search_call.in_progress`.
   */
  public data object ResponseWebSearchCallInProgress : InlineOpenAiResponsesWebSearchCallInProgressTypeX435e8287() {
    public override val `value`: String = "response.web_search_call.in_progress"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOpenAiResponsesWebSearchCallInProgressTypeX435e8287()

  public companion object {
    public fun fromValue(`value`: String): InlineOpenAiResponsesWebSearchCallInProgressTypeX435e8287 = when (value) {
      ResponseWebSearchCallInProgress.value -> ResponseWebSearchCallInProgress
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOpenAiResponsesWebSearchCallInProgressTypeX435e8287> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineOpenAiResponsesWebSearchCallInProgressTypeX435e8287", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOpenAiResponsesWebSearchCallInProgressTypeX435e8287 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOpenAiResponsesWebSearchCallInProgressTypeX435e8287) {
      encoder.encodeString(value.value)
    }
  }
}
