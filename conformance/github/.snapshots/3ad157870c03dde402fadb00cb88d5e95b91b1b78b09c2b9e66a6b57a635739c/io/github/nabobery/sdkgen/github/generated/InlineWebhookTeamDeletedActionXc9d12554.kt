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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/webhook-team-deleted/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-team-deleted/properties/action
 */
@Serializable(with = InlineWebhookTeamDeletedActionXc9d12554.Serializer::class)
public sealed class InlineWebhookTeamDeletedActionXc9d12554 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `deleted`.
   */
  public data object Deleted : InlineWebhookTeamDeletedActionXc9d12554() {
    public override val `value`: String = "deleted"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookTeamDeletedActionXc9d12554()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookTeamDeletedActionXc9d12554 = when (value) {
      Deleted.value -> Deleted
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookTeamDeletedActionXc9d12554> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookTeamDeletedActionXc9d12554", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookTeamDeletedActionXc9d12554 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookTeamDeletedActionXc9d12554) {
      encoder.encodeString(value.value)
    }
  }
}
