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
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1embeddings/post/requestBody/content/application~1json/schema/properties/encodin
 * g_format
 */
@Serializable(with = InlineEmbeddingsPostRequestJsonEncodingFormatXdcac62de.Serializer::class)
public sealed class InlineEmbeddingsPostRequestJsonEncodingFormatXdcac62de {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `float`.
   */
  public data object Float : InlineEmbeddingsPostRequestJsonEncodingFormatXdcac62de() {
    public override val `value`: String = "float"
  }

  /**
   * Documented value. Wire value: `base64`.
   */
  public data object Base64 : InlineEmbeddingsPostRequestJsonEncodingFormatXdcac62de() {
    public override val `value`: String = "base64"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineEmbeddingsPostRequestJsonEncodingFormatXdcac62de()

  public companion object {
    public fun fromValue(`value`: String): InlineEmbeddingsPostRequestJsonEncodingFormatXdcac62de = when (value) {
      Float.value -> Float
      Base64.value -> Base64
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineEmbeddingsPostRequestJsonEncodingFormatXdcac62de> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineEmbeddingsPostRequestJsonEncodingFormatXdcac62de", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineEmbeddingsPostRequestJsonEncodingFormatXdcac62de = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineEmbeddingsPostRequestJsonEncodingFormatXdcac62de) {
      encoder.encodeString(value.value)
    }
  }
}
