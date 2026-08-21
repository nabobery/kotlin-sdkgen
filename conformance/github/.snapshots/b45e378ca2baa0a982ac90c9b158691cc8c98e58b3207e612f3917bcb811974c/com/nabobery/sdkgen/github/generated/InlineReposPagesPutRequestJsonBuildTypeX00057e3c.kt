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
 * The process by which the GitHub Pages site will be built. `workflow` means that the site is built by a custom GitHub
 * Actions workflow. `legacy` means that the site is built by GitHub when changes are pushed to a specific branch.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1pages/put/requestBody/content/application~1json/schema/
 * properties/build_type
 */
@Serializable(with = InlineReposPagesPutRequestJsonBuildTypeX00057e3c.Serializer::class)
public sealed class InlineReposPagesPutRequestJsonBuildTypeX00057e3c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `legacy`.
   */
  public data object Legacy : InlineReposPagesPutRequestJsonBuildTypeX00057e3c() {
    public override val `value`: String = "legacy"
  }

  /**
   * Documented value. Wire value: `workflow`.
   */
  public data object Workflow : InlineReposPagesPutRequestJsonBuildTypeX00057e3c() {
    public override val `value`: String = "workflow"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposPagesPutRequestJsonBuildTypeX00057e3c()

  public companion object {
    public fun fromValue(`value`: String): InlineReposPagesPutRequestJsonBuildTypeX00057e3c = when (value) {
      Legacy.value -> Legacy
      Workflow.value -> Workflow
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineReposPagesPutRequestJsonBuildTypeX00057e3c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineReposPagesPutRequestJsonBuildTypeX00057e3c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposPagesPutRequestJsonBuildTypeX00057e3c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposPagesPutRequestJsonBuildTypeX00057e3c) {
      encoder.encodeString(value.value)
    }
  }
}
