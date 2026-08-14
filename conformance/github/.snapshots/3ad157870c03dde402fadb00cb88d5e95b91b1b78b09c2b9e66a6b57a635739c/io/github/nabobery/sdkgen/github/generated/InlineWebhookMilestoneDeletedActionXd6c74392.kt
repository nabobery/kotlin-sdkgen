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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-milestone-deleted/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-milestone-deleted/properties/action
 */
@Serializable(with = InlineWebhookMilestoneDeletedActionXd6c74392.Serializer::class)
public sealed class InlineWebhookMilestoneDeletedActionXd6c74392 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `deleted`.
   */
  public data object Deleted : InlineWebhookMilestoneDeletedActionXd6c74392() {
    public override val `value`: String = "deleted"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookMilestoneDeletedActionXd6c74392()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookMilestoneDeletedActionXd6c74392 = when (value) {
      Deleted.value -> Deleted
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookMilestoneDeletedActionXd6c74392> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookMilestoneDeletedActionXd6c74392", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookMilestoneDeletedActionXd6c74392 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookMilestoneDeletedActionXd6c74392) {
      encoder.encodeString(value.value)
    }
  }
}
