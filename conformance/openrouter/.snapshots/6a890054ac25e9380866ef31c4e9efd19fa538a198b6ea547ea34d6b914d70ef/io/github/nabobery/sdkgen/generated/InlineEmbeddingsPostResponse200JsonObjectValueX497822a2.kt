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
 * sdkgen://source/openapi.yaml#/paths/~1embeddings/post/responses/200/content/application~1json/schema/properties/objec
 * t.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1embeddings/post/responses/200/content/application~1json/schema/properties/objec
 * t
 */
@Serializable(with = InlineEmbeddingsPostResponse200JsonObjectValueX497822a2.Serializer::class)
public sealed class InlineEmbeddingsPostResponse200JsonObjectValueX497822a2 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `list`.
   */
  public data object List : InlineEmbeddingsPostResponse200JsonObjectValueX497822a2() {
    public override val `value`: String = "list"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineEmbeddingsPostResponse200JsonObjectValueX497822a2()

  public companion object {
    public fun fromValue(`value`: String): InlineEmbeddingsPostResponse200JsonObjectValueX497822a2 = when (value) {
      List.value -> List
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineEmbeddingsPostResponse200JsonObjectValueX497822a2> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineEmbeddingsPostResponse200JsonObjectValueX497822a2", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineEmbeddingsPostResponse200JsonObjectValueX497822a2 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineEmbeddingsPostResponse200JsonObjectValueX497822a2) {
      encoder.encodeString(value.value)
    }
  }
}
