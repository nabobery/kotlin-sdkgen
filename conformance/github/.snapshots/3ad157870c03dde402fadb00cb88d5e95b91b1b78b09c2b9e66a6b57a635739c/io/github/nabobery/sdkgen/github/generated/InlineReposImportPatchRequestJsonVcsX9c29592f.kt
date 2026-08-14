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
 * The type of version control system you are migrating from.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1import/patch/requestBody/content/application~1json/sche
 * ma/properties/vcs
 */
@Serializable(with = InlineReposImportPatchRequestJsonVcsX9c29592f.Serializer::class)
public sealed class InlineReposImportPatchRequestJsonVcsX9c29592f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `subversion`.
   */
  public data object Subversion : InlineReposImportPatchRequestJsonVcsX9c29592f() {
    public override val `value`: String = "subversion"
  }

  /**
   * Documented value. Wire value: `tfvc`.
   */
  public data object Tfvc : InlineReposImportPatchRequestJsonVcsX9c29592f() {
    public override val `value`: String = "tfvc"
  }

  /**
   * Documented value. Wire value: `git`.
   */
  public data object Git : InlineReposImportPatchRequestJsonVcsX9c29592f() {
    public override val `value`: String = "git"
  }

  /**
   * Documented value. Wire value: `mercurial`.
   */
  public data object Mercurial : InlineReposImportPatchRequestJsonVcsX9c29592f() {
    public override val `value`: String = "mercurial"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposImportPatchRequestJsonVcsX9c29592f()

  public companion object {
    public fun fromValue(`value`: String): InlineReposImportPatchRequestJsonVcsX9c29592f = when (value) {
      Subversion.value -> Subversion
      Tfvc.value -> Tfvc
      Git.value -> Git
      Mercurial.value -> Mercurial
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineReposImportPatchRequestJsonVcsX9c29592f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineReposImportPatchRequestJsonVcsX9c29592f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposImportPatchRequestJsonVcsX9c29592f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposImportPatchRequestJsonVcsX9c29592f) {
      encoder.encodeString(value.value)
    }
  }
}
