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
 * sdkgen://source/openapi.yaml#/paths/~1embeddings/post/requestBody/content/application~1json/schema/properties/input/a
 * nyOf/4/items/properties/content/items/oneOf/0/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1embeddings/post/requestBody/content/application~1json/schema/properties/input/a
 * nyOf/4/items/properties/content/items/oneOf/0/properties/type
 */
@Serializable(with = InlineEmbeddingsPostRequestJsonInputAnyOf5ItemContentItemOneOf1TypeXc13ea4d5.Serializer::class)
public sealed class InlineEmbeddingsPostRequestJsonInputAnyOf5ItemContentItemOneOf1TypeXc13ea4d5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `text`.
   */
  public data object Text : InlineEmbeddingsPostRequestJsonInputAnyOf5ItemContentItemOneOf1TypeXc13ea4d5() {
    public override val `value`: String = "text"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineEmbeddingsPostRequestJsonInputAnyOf5ItemContentItemOneOf1TypeXc13ea4d5()

  public companion object {
    public fun fromValue(`value`: String): InlineEmbeddingsPostRequestJsonInputAnyOf5ItemContentItemOneOf1TypeXc13ea4d5 = when (value) {
      Text.value -> Text
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineEmbeddingsPostRequestJsonInputAnyOf5ItemContentItemOneOf1TypeXc13ea4d5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineEmbeddingsPostRequestJsonInputAnyOf5ItemContentItemOneOf1TypeXc13ea4d5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineEmbeddingsPostRequestJsonInputAnyOf5ItemContentItemOneOf1TypeXc13ea4d5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineEmbeddingsPostRequestJsonInputAnyOf5ItemContentItemOneOf1TypeXc13ea4d5) {
      encoder.encodeString(value.value)
    }
  }
}
