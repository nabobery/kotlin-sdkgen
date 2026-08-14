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
 * The process in which the Page will be built. Possible values are `"legacy"` and `"workflow"`.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1pages/post/requestBody/content/application~1json/schema
 * /properties/build_type
 */
@Serializable(with = InlineReposPagesPostRequestJsonBuildTypeX87b12149.Serializer::class)
public sealed class InlineReposPagesPostRequestJsonBuildTypeX87b12149 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `legacy`.
   */
  public data object Legacy : InlineReposPagesPostRequestJsonBuildTypeX87b12149() {
    public override val `value`: String = "legacy"
  }

  /**
   * Documented value. Wire value: `workflow`.
   */
  public data object Workflow : InlineReposPagesPostRequestJsonBuildTypeX87b12149() {
    public override val `value`: String = "workflow"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposPagesPostRequestJsonBuildTypeX87b12149()

  public companion object {
    public fun fromValue(`value`: String): InlineReposPagesPostRequestJsonBuildTypeX87b12149 = when (value) {
      Legacy.value -> Legacy
      Workflow.value -> Workflow
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineReposPagesPostRequestJsonBuildTypeX87b12149> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineReposPagesPostRequestJsonBuildTypeX87b12149", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposPagesPostRequestJsonBuildTypeX87b12149 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposPagesPostRequestJsonBuildTypeX87b12149) {
      encoder.encodeString(value.value)
    }
  }
}
