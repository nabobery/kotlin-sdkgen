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
 * The type of the object we're tagging. Normally this is a `commit` but it can also be a `tree` or a `blob`.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1git~1tags/post/requestBody/content/application~1json/sc
 * hema/properties/type
 */
@Serializable(with = InlineReposGitTagsPostRequestJsonTypeXc183d8c6.Serializer::class)
public sealed class InlineReposGitTagsPostRequestJsonTypeXc183d8c6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `commit`.
   */
  public data object Commit : InlineReposGitTagsPostRequestJsonTypeXc183d8c6() {
    public override val `value`: String = "commit"
  }

  /**
   * Documented value. Wire value: `tree`.
   */
  public data object Tree : InlineReposGitTagsPostRequestJsonTypeXc183d8c6() {
    public override val `value`: String = "tree"
  }

  /**
   * Documented value. Wire value: `blob`.
   */
  public data object Blob : InlineReposGitTagsPostRequestJsonTypeXc183d8c6() {
    public override val `value`: String = "blob"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposGitTagsPostRequestJsonTypeXc183d8c6()

  public companion object {
    public fun fromValue(`value`: String): InlineReposGitTagsPostRequestJsonTypeXc183d8c6 = when (value) {
      Commit.value -> Commit
      Tree.value -> Tree
      Blob.value -> Blob
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineReposGitTagsPostRequestJsonTypeXc183d8c6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineReposGitTagsPostRequestJsonTypeXc183d8c6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposGitTagsPostRequestJsonTypeXc183d8c6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposGitTagsPostRequestJsonTypeXc183d8c6) {
      encoder.encodeString(value.value)
    }
  }
}
