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
 * nyOf/4/items/properties/content/items/oneOf/1/properties/type.
 */
@Serializable(with = InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputA5138d426
  .Serializer::class)
public sealed class InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputA5138d426 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `image_url`.
   */
  public data object ImageUrl : InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputA5138d426() {
    public override val `value`: String = "image_url"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputA5138d426()

  public companion object {
    public fun fromValue(`value`: String): InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputA5138d426 = when (value) {
      ImageUrl.value -> ImageUrl
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputA5138d426> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputA5138d426", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputA5138d426 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputA5138d426) {
      encoder.encodeString(value.value)
    }
  }
}
