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
 * sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponsesToolChoice/anyOf/6/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponsesToolChoice/anyOf/6/properties/type
 */
@Serializable(with = InlineOpenAiResponsesToolChoiceAnyOf7TypeX970ddd74.Serializer::class)
public sealed class InlineOpenAiResponsesToolChoiceAnyOf7TypeX970ddd74 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `apply_patch`.
   */
  public data object ApplyPatch : InlineOpenAiResponsesToolChoiceAnyOf7TypeX970ddd74() {
    public override val `value`: String = "apply_patch"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOpenAiResponsesToolChoiceAnyOf7TypeX970ddd74()

  public companion object {
    public fun fromValue(`value`: String): InlineOpenAiResponsesToolChoiceAnyOf7TypeX970ddd74 = when (value) {
      ApplyPatch.value -> ApplyPatch
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOpenAiResponsesToolChoiceAnyOf7TypeX970ddd74> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineOpenAiResponsesToolChoiceAnyOf7TypeX970ddd74", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOpenAiResponsesToolChoiceAnyOf7TypeX970ddd74 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOpenAiResponsesToolChoiceAnyOf7TypeX970ddd74) {
      encoder.encodeString(value.value)
    }
  }
}
