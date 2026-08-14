package io.github.nabobery.sdkgen.github.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * The repository directory that includes the source files for the Pages site. Allowed paths are `/` or `/docs`.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1pages/put/requestBody/content/application~1json/schema/
 * properties/source/anyOf/1/properties/path
 */
@Serializable(with = InlineReposPagesPutRequestJsonSourceAnyOf2PathX9b6629d7.Serializer::class)
public sealed class InlineReposPagesPutRequestJsonSourceAnyOf2PathX9b6629d7 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `/`.
   */
  public data object Value : InlineReposPagesPutRequestJsonSourceAnyOf2PathX9b6629d7() {
    public override val `value`: String = "/"
  }

  /**
   * Documented value. Wire value: `/docs`.
   */
  public data object Docs : InlineReposPagesPutRequestJsonSourceAnyOf2PathX9b6629d7() {
    public override val `value`: String = "/docs"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposPagesPutRequestJsonSourceAnyOf2PathX9b6629d7()

  public companion object {
    public fun fromValue(`value`: String): InlineReposPagesPutRequestJsonSourceAnyOf2PathX9b6629d7 = when (value) {
      Value.value -> Value
      Docs.value -> Docs
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineReposPagesPutRequestJsonSourceAnyOf2PathX9b6629d7> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineReposPagesPutRequestJsonSourceAnyOf2PathX9b6629d7", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposPagesPutRequestJsonSourceAnyOf2PathX9b6629d7 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposPagesPutRequestJsonSourceAnyOf2PathX9b6629d7) {
      encoder.encodeString(value.value)
    }
  }
}
