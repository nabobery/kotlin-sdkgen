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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-closed-by-user/properties/alert/properti
 * es/dismissal_approved_by/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-closed-by-user/properties/alert/properti
 * es/dismissal_approved_by/properties/type
 */
@Serializable(with = InlineWebhookCodeScanningAlertClosedByUserAlertDismissalApprovedByTypeX6b1f1ac1.Serializer::class)
public sealed class InlineWebhookCodeScanningAlertClosedByUserAlertDismissalApprovedByTypeX6b1f1ac1 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookCodeScanningAlertClosedByUserAlertDismissalApprovedByTypeX6b1f1ac1() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookCodeScanningAlertClosedByUserAlertDismissalApprovedByTypeX6b1f1ac1() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookCodeScanningAlertClosedByUserAlertDismissalApprovedByTypeX6b1f1ac1() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookCodeScanningAlertClosedByUserAlertDismissalApprovedByTypeX6b1f1ac1()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookCodeScanningAlertClosedByUserAlertDismissalApprovedByTypeX6b1f1ac1 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookCodeScanningAlertClosedByUserAlertDismissalApprovedByTypeX6b1f1ac1> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookCodeScanningAlertClosedByUserAlertDismissalApprovedByTypeX6b1f1ac1", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookCodeScanningAlertClosedByUserAlertDismissalApprovedByTypeX6b1f1ac1 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCodeScanningAlertClosedByUserAlertDismissalApprovedByTypeX6b1f1ac1) {
      encoder.encodeString(value.value)
    }
  }
}
