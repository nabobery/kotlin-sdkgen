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
 * Either `blob`, `tree`, or `commit`.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1git~1trees/post/requestBody/content/application~1json/s
 * chema/properties/tree/items/properties/type
 */
@Serializable(with = InlineReposGitTreesPostRequestJsonTreeItemTypeX6b8d9313.Serializer::class)
public sealed class InlineReposGitTreesPostRequestJsonTreeItemTypeX6b8d9313 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `blob`.
   */
  public data object Blob : InlineReposGitTreesPostRequestJsonTreeItemTypeX6b8d9313() {
    public override val `value`: String = "blob"
  }

  /**
   * Documented value. Wire value: `tree`.
   */
  public data object Tree : InlineReposGitTreesPostRequestJsonTreeItemTypeX6b8d9313() {
    public override val `value`: String = "tree"
  }

  /**
   * Documented value. Wire value: `commit`.
   */
  public data object Commit : InlineReposGitTreesPostRequestJsonTreeItemTypeX6b8d9313() {
    public override val `value`: String = "commit"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposGitTreesPostRequestJsonTreeItemTypeX6b8d9313()

  public companion object {
    public fun fromValue(`value`: String): InlineReposGitTreesPostRequestJsonTreeItemTypeX6b8d9313 = when (value) {
      Blob.value -> Blob
      Tree.value -> Tree
      Commit.value -> Commit
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineReposGitTreesPostRequestJsonTreeItemTypeX6b8d9313> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineReposGitTreesPostRequestJsonTreeItemTypeX6b8d9313", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposGitTreesPostRequestJsonTreeItemTypeX6b8d9313 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposGitTreesPostRequestJsonTreeItemTypeX6b8d9313) {
      encoder.encodeString(value.value)
    }
  }
}
