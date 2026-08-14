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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ChatToolChoice/anyOf/2.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatToolChoice/anyOf/2
 */
@Serializable(with = InlineChatToolChoiceAnyOf3X0afd7cdf.Serializer::class)
public sealed class InlineChatToolChoiceAnyOf3X0afd7cdf {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `required`.
   */
  public data object Required : InlineChatToolChoiceAnyOf3X0afd7cdf() {
    public override val `value`: String = "required"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineChatToolChoiceAnyOf3X0afd7cdf()

  public companion object {
    public fun fromValue(`value`: String): InlineChatToolChoiceAnyOf3X0afd7cdf = when (value) {
      Required.value -> Required
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineChatToolChoiceAnyOf3X0afd7cdf> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineChatToolChoiceAnyOf3X0afd7cdf", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineChatToolChoiceAnyOf3X0afd7cdf = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineChatToolChoiceAnyOf3X0afd7cdf) {
      encoder.encodeString(value.value)
    }
  }
}
