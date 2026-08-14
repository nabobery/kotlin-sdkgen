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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-appeared-in-branch/properties/action.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-appeared-in-branch/properties/action
 */
@Serializable(with = InlineWebhookCodeScanningAlertAppearedInBranchActionX461f4915.Serializer::class)
public sealed class InlineWebhookCodeScanningAlertAppearedInBranchActionX461f4915 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `appeared_in_branch`.
   */
  public data object AppearedInBranch : InlineWebhookCodeScanningAlertAppearedInBranchActionX461f4915() {
    public override val `value`: String = "appeared_in_branch"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookCodeScanningAlertAppearedInBranchActionX461f4915()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookCodeScanningAlertAppearedInBranchActionX461f4915 = when (value) {
      AppearedInBranch.value -> AppearedInBranch
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookCodeScanningAlertAppearedInBranchActionX461f4915> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookCodeScanningAlertAppearedInBranchActionX461f4915", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookCodeScanningAlertAppearedInBranchActionX461f4915 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCodeScanningAlertAppearedInBranchActionX461f4915) {
      encoder.encodeString(value.value)
    }
  }
}
