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
 * The originating VCS type. Without this parameter, the import job will take additional time to detect the VCS type
 * before beginning the import. This detection step will be reflected in the response.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1import/put/requestBody/content/application~1json/schema
 * /properties/vcs
 */
@Serializable(with = InlineReposImportPutRequestJsonVcsX6204abb5.Serializer::class)
public sealed class InlineReposImportPutRequestJsonVcsX6204abb5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `subversion`.
   */
  public data object Subversion : InlineReposImportPutRequestJsonVcsX6204abb5() {
    public override val `value`: String = "subversion"
  }

  /**
   * Documented value. Wire value: `git`.
   */
  public data object Git : InlineReposImportPutRequestJsonVcsX6204abb5() {
    public override val `value`: String = "git"
  }

  /**
   * Documented value. Wire value: `mercurial`.
   */
  public data object Mercurial : InlineReposImportPutRequestJsonVcsX6204abb5() {
    public override val `value`: String = "mercurial"
  }

  /**
   * Documented value. Wire value: `tfvc`.
   */
  public data object Tfvc : InlineReposImportPutRequestJsonVcsX6204abb5() {
    public override val `value`: String = "tfvc"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposImportPutRequestJsonVcsX6204abb5()

  public companion object {
    public fun fromValue(`value`: String): InlineReposImportPutRequestJsonVcsX6204abb5 = when (value) {
      Subversion.value -> Subversion
      Git.value -> Git
      Mercurial.value -> Mercurial
      Tfvc.value -> Tfvc
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineReposImportPutRequestJsonVcsX6204abb5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineReposImportPutRequestJsonVcsX6204abb5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposImportPutRequestJsonVcsX6204abb5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposImportPutRequestJsonVcsX6204abb5) {
      encoder.encodeString(value.value)
    }
  }
}
