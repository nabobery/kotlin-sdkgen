package com.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1releases~1{release_id}/patch/requestBody/content/applic
 * ation~1json/schema/properties/make_latest
 */
@Serializable(with = InlineReposReleasesPatchRequestJsonMakeLatestX8db24d2f.Serializer::class)
public sealed class InlineReposReleasesPatchRequestJsonMakeLatestX8db24d2f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `true`.
   */
  public data object TrueValue : InlineReposReleasesPatchRequestJsonMakeLatestX8db24d2f() {
    public override val `value`: String = "true"
  }

  /**
   * Documented value. Wire value: `false`.
   */
  public data object FalseValue : InlineReposReleasesPatchRequestJsonMakeLatestX8db24d2f() {
    public override val `value`: String = "false"
  }

  /**
   * Documented value. Wire value: `legacy`.
   */
  public data object Legacy : InlineReposReleasesPatchRequestJsonMakeLatestX8db24d2f() {
    public override val `value`: String = "legacy"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposReleasesPatchRequestJsonMakeLatestX8db24d2f()

  public companion object {
    public fun fromValue(`value`: String): InlineReposReleasesPatchRequestJsonMakeLatestX8db24d2f = when (value) {
      TrueValue.value -> TrueValue
      FalseValue.value -> FalseValue
      Legacy.value -> Legacy
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineReposReleasesPatchRequestJsonMakeLatestX8db24d2f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineReposReleasesPatchRequestJsonMakeLatestX8db24d2f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposReleasesPatchRequestJsonMakeLatestX8db24d2f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposReleasesPatchRequestJsonMakeLatestX8db24d2f) {
      encoder.encodeString(value.value)
    }
  }
}
