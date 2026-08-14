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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-project-reopened/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-project-reopened/properties/action
 */
@Serializable(with = InlineWebhookProjectReopenedActionXdec5a338.Serializer::class)
public sealed class InlineWebhookProjectReopenedActionXdec5a338 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `reopened`.
   */
  public data object Reopened : InlineWebhookProjectReopenedActionXdec5a338() {
    public override val `value`: String = "reopened"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookProjectReopenedActionXdec5a338()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookProjectReopenedActionXdec5a338 = when (value) {
      Reopened.value -> Reopened
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookProjectReopenedActionXdec5a338> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookProjectReopenedActionXdec5a338", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookProjectReopenedActionXdec5a338 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookProjectReopenedActionXdec5a338) {
      encoder.encodeString(value.value)
    }
  }
}
