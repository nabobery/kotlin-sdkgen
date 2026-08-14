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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-projects-v2-status-update-edited/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-projects-v2-status-update-edited/properties/action
 */
@Serializable(with = InlineWebhookProjectsV2StatusUpdateEditedActionXee041c77.Serializer::class)
public sealed class InlineWebhookProjectsV2StatusUpdateEditedActionXee041c77 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `edited`.
   */
  public data object Edited : InlineWebhookProjectsV2StatusUpdateEditedActionXee041c77() {
    public override val `value`: String = "edited"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookProjectsV2StatusUpdateEditedActionXee041c77()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookProjectsV2StatusUpdateEditedActionXee041c77 = when (value) {
      Edited.value -> Edited
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookProjectsV2StatusUpdateEditedActionXee041c77> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookProjectsV2StatusUpdateEditedActionXee041c77", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookProjectsV2StatusUpdateEditedActionXee041c77 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookProjectsV2StatusUpdateEditedActionXee041c77) {
      encoder.encodeString(value.value)
    }
  }
}
