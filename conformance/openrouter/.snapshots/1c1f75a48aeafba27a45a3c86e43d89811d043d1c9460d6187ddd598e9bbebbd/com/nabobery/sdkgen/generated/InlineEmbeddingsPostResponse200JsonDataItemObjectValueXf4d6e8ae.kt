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
 * sdkgen://source/openapi.yaml#/paths/~1embeddings/post/responses/200/content/application~1json/schema/properties/data/
 * items/properties/object.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1embeddings/post/responses/200/content/application~1json/schema/properties/data/
 * items/properties/object
 */
@Serializable(with = InlineEmbeddingsPostResponse200JsonDataItemObjectValueXf4d6e8ae.Serializer::class)
public sealed class InlineEmbeddingsPostResponse200JsonDataItemObjectValueXf4d6e8ae {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `embedding`.
   */
  public data object Embedding : InlineEmbeddingsPostResponse200JsonDataItemObjectValueXf4d6e8ae() {
    public override val `value`: String = "embedding"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineEmbeddingsPostResponse200JsonDataItemObjectValueXf4d6e8ae()

  public companion object {
    public fun fromValue(`value`: String): InlineEmbeddingsPostResponse200JsonDataItemObjectValueXf4d6e8ae = when (value) {
      Embedding.value -> Embedding
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineEmbeddingsPostResponse200JsonDataItemObjectValueXf4d6e8ae> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineEmbeddingsPostResponse200JsonDataItemObjectValueXf4d6e8ae", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineEmbeddingsPostResponse200JsonDataItemObjectValueXf4d6e8ae = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineEmbeddingsPostResponse200JsonDataItemObjectValueXf4d6e8ae) {
      encoder.encodeString(value.value)
    }
  }
}
