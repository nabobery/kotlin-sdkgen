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
 * The file mode; one of `100644` for file (blob), `100755` for executable (blob), `040000` for subdirectory (tree),
 * `160000` for submodule (commit), or `120000` for a blob that specifies the path of a symlink.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1git~1trees/post/requestBody/content/application~1json/s
 * chema/properties/tree/items/properties/mode
 */
@Serializable(with = InlineReposGitTreesPostRequestJsonTreeItemModeX34691a63.Serializer::class)
public sealed class InlineReposGitTreesPostRequestJsonTreeItemModeX34691a63 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `100644`.
   */
  public data object _100644 : InlineReposGitTreesPostRequestJsonTreeItemModeX34691a63() {
    public override val `value`: String = "100644"
  }

  /**
   * Documented value. Wire value: `100755`.
   */
  public data object _100755 : InlineReposGitTreesPostRequestJsonTreeItemModeX34691a63() {
    public override val `value`: String = "100755"
  }

  /**
   * Documented value. Wire value: `040000`.
   */
  public data object _040000 : InlineReposGitTreesPostRequestJsonTreeItemModeX34691a63() {
    public override val `value`: String = "040000"
  }

  /**
   * Documented value. Wire value: `160000`.
   */
  public data object _160000 : InlineReposGitTreesPostRequestJsonTreeItemModeX34691a63() {
    public override val `value`: String = "160000"
  }

  /**
   * Documented value. Wire value: `120000`.
   */
  public data object _120000 : InlineReposGitTreesPostRequestJsonTreeItemModeX34691a63() {
    public override val `value`: String = "120000"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposGitTreesPostRequestJsonTreeItemModeX34691a63()

  public companion object {
    public fun fromValue(`value`: String): InlineReposGitTreesPostRequestJsonTreeItemModeX34691a63 = when (value) {
      _100644.value -> _100644
      _100755.value -> _100755
      _040000.value -> _040000
      _160000.value -> _160000
      _120000.value -> _120000
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineReposGitTreesPostRequestJsonTreeItemModeX34691a63> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineReposGitTreesPostRequestJsonTreeItemModeX34691a63", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposGitTreesPostRequestJsonTreeItemModeX34691a63 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposGitTreesPostRequestJsonTreeItemModeX34691a63) {
      encoder.encodeString(value.value)
    }
  }
}
