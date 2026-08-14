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
 * Default: `/`
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1pages/post/requestBody/content/application~1json/schema
 * /properties/source/properties/path
 */
@Serializable(with = InlineReposPagesPostRequestJsonSourcePathX5fa95bf6.Serializer::class)
public sealed class InlineReposPagesPostRequestJsonSourcePathX5fa95bf6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `/`.
   */
  public data object Value : InlineReposPagesPostRequestJsonSourcePathX5fa95bf6() {
    public override val `value`: String = "/"
  }

  /**
   * Documented value. Wire value: `/docs`.
   */
  public data object Docs : InlineReposPagesPostRequestJsonSourcePathX5fa95bf6() {
    public override val `value`: String = "/docs"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposPagesPostRequestJsonSourcePathX5fa95bf6()

  public companion object {
    public fun fromValue(`value`: String): InlineReposPagesPostRequestJsonSourcePathX5fa95bf6 = when (value) {
      Value.value -> Value
      Docs.value -> Docs
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineReposPagesPostRequestJsonSourcePathX5fa95bf6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineReposPagesPostRequestJsonSourcePathX5fa95bf6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposPagesPostRequestJsonSourcePathX5fa95bf6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposPagesPostRequestJsonSourcePathX5fa95bf6) {
      encoder.encodeString(value.value)
    }
  }
}
