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
 * Specifies whether this release should be set as the latest release for the repository. Drafts and prereleases cannot
 * be set as latest. Defaults to `true` for newly published releases. `legacy` specifies that the latest release should
 * be determined based on the release creation date and higher semantic version.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1releases/post/requestBody/content/application~1json/sch
 * ema/properties/make_latest
 */
@Serializable(with = InlineReposReleasesPostRequestJsonMakeLatestX6f46747c.Serializer::class)
public sealed class InlineReposReleasesPostRequestJsonMakeLatestX6f46747c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `true`.
   */
  public data object TrueValue : InlineReposReleasesPostRequestJsonMakeLatestX6f46747c() {
    public override val `value`: String = "true"
  }

  /**
   * Documented value. Wire value: `false`.
   */
  public data object FalseValue : InlineReposReleasesPostRequestJsonMakeLatestX6f46747c() {
    public override val `value`: String = "false"
  }

  /**
   * Documented value. Wire value: `legacy`.
   */
  public data object Legacy : InlineReposReleasesPostRequestJsonMakeLatestX6f46747c() {
    public override val `value`: String = "legacy"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposReleasesPostRequestJsonMakeLatestX6f46747c()

  public companion object {
    public fun fromValue(`value`: String): InlineReposReleasesPostRequestJsonMakeLatestX6f46747c = when (value) {
      TrueValue.value -> TrueValue
      FalseValue.value -> FalseValue
      Legacy.value -> Legacy
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineReposReleasesPostRequestJsonMakeLatestX6f46747c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineReposReleasesPostRequestJsonMakeLatestX6f46747c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposReleasesPostRequestJsonMakeLatestX6f46747c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposReleasesPostRequestJsonMakeLatestX6f46747c) {
      encoder.encodeString(value.value)
    }
  }
}
