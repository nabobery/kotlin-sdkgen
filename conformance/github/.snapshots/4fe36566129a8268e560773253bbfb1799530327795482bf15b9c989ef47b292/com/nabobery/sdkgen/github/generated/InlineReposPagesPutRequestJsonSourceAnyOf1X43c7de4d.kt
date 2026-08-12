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
 * Update the source for the repository. Must include the branch name, and may optionally specify the subdirectory
 * `/docs`. Possible values are `"gh-pages"`, `"master"`, and `"master /docs"`.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1pages/put/requestBody/content/application~1json/schema/
 * properties/source/anyOf/0
 */
@Serializable(with = InlineReposPagesPutRequestJsonSourceAnyOf1X43c7de4d.Serializer::class)
public sealed class InlineReposPagesPutRequestJsonSourceAnyOf1X43c7de4d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `gh-pages`.
   */
  public data object GhPages : InlineReposPagesPutRequestJsonSourceAnyOf1X43c7de4d() {
    public override val `value`: String = "gh-pages"
  }

  /**
   * Documented value. Wire value: `master`.
   */
  public data object Master : InlineReposPagesPutRequestJsonSourceAnyOf1X43c7de4d() {
    public override val `value`: String = "master"
  }

  /**
   * Documented value. Wire value: `master /docs`.
   */
  public data object MasterDocs : InlineReposPagesPutRequestJsonSourceAnyOf1X43c7de4d() {
    public override val `value`: String = "master /docs"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposPagesPutRequestJsonSourceAnyOf1X43c7de4d()

  public companion object {
    public fun fromValue(`value`: String): InlineReposPagesPutRequestJsonSourceAnyOf1X43c7de4d = when (value) {
      GhPages.value -> GhPages
      Master.value -> Master
      MasterDocs.value -> MasterDocs
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineReposPagesPutRequestJsonSourceAnyOf1X43c7de4d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineReposPagesPutRequestJsonSourceAnyOf1X43c7de4d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposPagesPutRequestJsonSourceAnyOf1X43c7de4d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposPagesPutRequestJsonSourceAnyOf1X43c7de4d) {
      encoder.encodeString(value.value)
    }
  }
}
