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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-projects-v2-project-reopened/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-projects-v2-project-reopened/properties/action
 */
@Serializable(with = InlineWebhookProjectsV2ProjectReopenedActionX20e42cc5.Serializer::class)
public sealed class InlineWebhookProjectsV2ProjectReopenedActionX20e42cc5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `reopened`.
   */
  public data object Reopened : InlineWebhookProjectsV2ProjectReopenedActionX20e42cc5() {
    public override val `value`: String = "reopened"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookProjectsV2ProjectReopenedActionX20e42cc5()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookProjectsV2ProjectReopenedActionX20e42cc5 = when (value) {
      Reopened.value -> Reopened
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookProjectsV2ProjectReopenedActionX20e42cc5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookProjectsV2ProjectReopenedActionX20e42cc5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookProjectsV2ProjectReopenedActionX20e42cc5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookProjectsV2ProjectReopenedActionX20e42cc5) {
      encoder.encodeString(value.value)
    }
  }
}
