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
 * The format of the output embeddings
 */
@Serializable(with = InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesEncodingFormat
  .Serializer::class)
public sealed class InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesEncodingFormat {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `float`.
   */
  public data object Float : InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesEncodingFormat() {
    public override val `value`: String = "float"
  }

  /**
   * Documented value. Wire value: `base64`.
   */
  public data object Base64 : InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesEncodingFormat() {
    public override val `value`: String = "base64"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesEncodingFormat()

  public companion object {
    public fun fromValue(`value`: String): InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesEncodingFormat = when (value) {
      Float.value -> Float
      Base64.value -> Base64
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesEncodingFormat> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesEncodingFormat", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesEncodingFormat = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesEncodingFormat) {
      encoder.encodeString(value.value)
    }
  }
}
