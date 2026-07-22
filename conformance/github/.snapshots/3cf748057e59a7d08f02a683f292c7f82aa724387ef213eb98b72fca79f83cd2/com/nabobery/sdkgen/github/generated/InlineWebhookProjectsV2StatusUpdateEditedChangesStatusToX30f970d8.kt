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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-projects-v2-status-update-edited/properties/changes/properti
 * es/status/properties/to.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-projects-v2-status-update-edited/properties/changes/properti
 * es/status/properties/to
 */
@Serializable(with = InlineWebhookProjectsV2StatusUpdateEditedChangesStatusToX30f970d8.Serializer::class)
public sealed class InlineWebhookProjectsV2StatusUpdateEditedChangesStatusToX30f970d8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `INACTIVE`.
   */
  public data object Inactive : InlineWebhookProjectsV2StatusUpdateEditedChangesStatusToX30f970d8() {
    public override val `value`: String = "INACTIVE"
  }

  /**
   * Documented value. Wire value: `ON_TRACK`.
   */
  public data object OnTrack : InlineWebhookProjectsV2StatusUpdateEditedChangesStatusToX30f970d8() {
    public override val `value`: String = "ON_TRACK"
  }

  /**
   * Documented value. Wire value: `AT_RISK`.
   */
  public data object AtRisk : InlineWebhookProjectsV2StatusUpdateEditedChangesStatusToX30f970d8() {
    public override val `value`: String = "AT_RISK"
  }

  /**
   * Documented value. Wire value: `OFF_TRACK`.
   */
  public data object OffTrack : InlineWebhookProjectsV2StatusUpdateEditedChangesStatusToX30f970d8() {
    public override val `value`: String = "OFF_TRACK"
  }

  /**
   * Documented value. Wire value: `COMPLETE`.
   */
  public data object Complete : InlineWebhookProjectsV2StatusUpdateEditedChangesStatusToX30f970d8() {
    public override val `value`: String = "COMPLETE"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookProjectsV2StatusUpdateEditedChangesStatusToX30f970d8()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookProjectsV2StatusUpdateEditedChangesStatusToX30f970d8 = when (value) {
      Inactive.value -> Inactive
      OnTrack.value -> OnTrack
      AtRisk.value -> AtRisk
      OffTrack.value -> OffTrack
      Complete.value -> Complete
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookProjectsV2StatusUpdateEditedChangesStatusToX30f970d8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookProjectsV2StatusUpdateEditedChangesStatusToX30f970d8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookProjectsV2StatusUpdateEditedChangesStatusToX30f970d8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookProjectsV2StatusUpdateEditedChangesStatusToX30f970d8) {
      encoder.encodeString(value.value)
    }
  }
}
