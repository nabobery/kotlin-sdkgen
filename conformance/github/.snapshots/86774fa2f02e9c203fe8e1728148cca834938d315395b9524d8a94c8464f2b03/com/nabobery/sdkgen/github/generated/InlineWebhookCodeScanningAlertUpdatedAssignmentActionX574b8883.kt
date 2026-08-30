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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-updated-assignment/properties/action.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-updated-assignment/properties/action
 */
@Serializable(with = InlineWebhookCodeScanningAlertUpdatedAssignmentActionX574b8883.Serializer::class)
public sealed class InlineWebhookCodeScanningAlertUpdatedAssignmentActionX574b8883 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `updated_assignment`.
   */
  public data object UpdatedAssignment : InlineWebhookCodeScanningAlertUpdatedAssignmentActionX574b8883() {
    public override val `value`: String = "updated_assignment"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookCodeScanningAlertUpdatedAssignmentActionX574b8883()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookCodeScanningAlertUpdatedAssignmentActionX574b8883 = when (value) {
      UpdatedAssignment.value -> UpdatedAssignment
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookCodeScanningAlertUpdatedAssignmentActionX574b8883> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookCodeScanningAlertUpdatedAssignmentActionX574b8883", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookCodeScanningAlertUpdatedAssignmentActionX574b8883 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCodeScanningAlertUpdatedAssignmentActionX574b8883) {
      encoder.encodeString(value.value)
    }
  }
}
