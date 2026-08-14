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
 * The severity of the alert.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-updated-assignment/properties/alert/prop
 * erties/rule/properties/severity
 */
@Serializable(with = InlineWebhookCodeScanningAlertUpdatedAssignmentAlertRuleSeverityXca91e63d.Serializer::class)
public sealed class InlineWebhookCodeScanningAlertUpdatedAssignmentAlertRuleSeverityXca91e63d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineWebhookCodeScanningAlertUpdatedAssignmentAlertRuleSeverityXca91e63d() {
    public override val `value`: String = "none"
  }

  /**
   * Documented value. Wire value: `note`.
   */
  public data object Note : InlineWebhookCodeScanningAlertUpdatedAssignmentAlertRuleSeverityXca91e63d() {
    public override val `value`: String = "note"
  }

  /**
   * Documented value. Wire value: `warning`.
   */
  public data object Warning : InlineWebhookCodeScanningAlertUpdatedAssignmentAlertRuleSeverityXca91e63d() {
    public override val `value`: String = "warning"
  }

  /**
   * Documented value. Wire value: `error`.
   */
  public data object Error : InlineWebhookCodeScanningAlertUpdatedAssignmentAlertRuleSeverityXca91e63d() {
    public override val `value`: String = "error"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookCodeScanningAlertUpdatedAssignmentAlertRuleSeverityXca91e63d()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookCodeScanningAlertUpdatedAssignmentAlertRuleSeverityXca91e63d = when (value) {
      None.value -> None
      Note.value -> Note
      Warning.value -> Warning
      Error.value -> Error
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookCodeScanningAlertUpdatedAssignmentAlertRuleSeverityXca91e63d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookCodeScanningAlertUpdatedAssignmentAlertRuleSeverityXca91e63d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookCodeScanningAlertUpdatedAssignmentAlertRuleSeverityXca91e63d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCodeScanningAlertUpdatedAssignmentAlertRuleSeverityXca91e63d) {
      encoder.encodeString(value.value)
    }
  }
}
