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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-updated-assignment/properties/alert/prop
 * erties/dismissed_by/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-updated-assignment/properties/alert/prop
 * erties/dismissed_by/properties/type
 */
@Serializable(with = InlineWebhookCodeScanningAlertUpdatedAssignmentAlertDismissedByTypeX4fe2b94b.Serializer::class)
public sealed class InlineWebhookCodeScanningAlertUpdatedAssignmentAlertDismissedByTypeX4fe2b94b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookCodeScanningAlertUpdatedAssignmentAlertDismissedByTypeX4fe2b94b() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookCodeScanningAlertUpdatedAssignmentAlertDismissedByTypeX4fe2b94b() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookCodeScanningAlertUpdatedAssignmentAlertDismissedByTypeX4fe2b94b() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookCodeScanningAlertUpdatedAssignmentAlertDismissedByTypeX4fe2b94b()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookCodeScanningAlertUpdatedAssignmentAlertDismissedByTypeX4fe2b94b = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookCodeScanningAlertUpdatedAssignmentAlertDismissedByTypeX4fe2b94b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookCodeScanningAlertUpdatedAssignmentAlertDismissedByTypeX4fe2b94b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookCodeScanningAlertUpdatedAssignmentAlertDismissedByTypeX4fe2b94b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCodeScanningAlertUpdatedAssignmentAlertDismissedByTypeX4fe2b94b) {
      encoder.encodeString(value.value)
    }
  }
}
