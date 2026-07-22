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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-appeared-in-branch/properties/alert/prop
 * erties/dismissed_by/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-appeared-in-branch/properties/alert/prop
 * erties/dismissed_by/properties/type
 */
@Serializable(with = InlineWebhookCodeScanningAlertAppearedInBranchAlertDismissedByTypeXa6770840.Serializer::class)
public sealed class InlineWebhookCodeScanningAlertAppearedInBranchAlertDismissedByTypeXa6770840 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookCodeScanningAlertAppearedInBranchAlertDismissedByTypeXa6770840() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookCodeScanningAlertAppearedInBranchAlertDismissedByTypeXa6770840() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookCodeScanningAlertAppearedInBranchAlertDismissedByTypeXa6770840() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookCodeScanningAlertAppearedInBranchAlertDismissedByTypeXa6770840()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookCodeScanningAlertAppearedInBranchAlertDismissedByTypeXa6770840 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookCodeScanningAlertAppearedInBranchAlertDismissedByTypeXa6770840> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookCodeScanningAlertAppearedInBranchAlertDismissedByTypeXa6770840", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookCodeScanningAlertAppearedInBranchAlertDismissedByTypeXa6770840 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCodeScanningAlertAppearedInBranchAlertDismissedByTypeXa6770840) {
      encoder.encodeString(value.value)
    }
  }
}
