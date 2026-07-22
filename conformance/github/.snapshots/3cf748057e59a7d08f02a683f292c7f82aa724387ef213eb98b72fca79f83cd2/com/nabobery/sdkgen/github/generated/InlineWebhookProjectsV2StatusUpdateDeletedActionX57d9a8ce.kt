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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-projects-v2-status-update-deleted/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-projects-v2-status-update-deleted/properties/action
 */
@Serializable(with = InlineWebhookProjectsV2StatusUpdateDeletedActionX57d9a8ce.Serializer::class)
public sealed class InlineWebhookProjectsV2StatusUpdateDeletedActionX57d9a8ce {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `deleted`.
   */
  public data object Deleted : InlineWebhookProjectsV2StatusUpdateDeletedActionX57d9a8ce() {
    public override val `value`: String = "deleted"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookProjectsV2StatusUpdateDeletedActionX57d9a8ce()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookProjectsV2StatusUpdateDeletedActionX57d9a8ce = when (value) {
      Deleted.value -> Deleted
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookProjectsV2StatusUpdateDeletedActionX57d9a8ce> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookProjectsV2StatusUpdateDeletedActionX57d9a8ce", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookProjectsV2StatusUpdateDeletedActionX57d9a8ce = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookProjectsV2StatusUpdateDeletedActionX57d9a8ce) {
      encoder.encodeString(value.value)
    }
  }
}
