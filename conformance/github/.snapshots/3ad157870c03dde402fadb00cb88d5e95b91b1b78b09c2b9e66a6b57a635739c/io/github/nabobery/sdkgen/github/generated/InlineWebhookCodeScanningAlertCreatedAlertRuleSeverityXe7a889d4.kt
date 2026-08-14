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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-created/properties/alert/properties/rule
 * /properties/severity
 */
@Serializable(with = InlineWebhookCodeScanningAlertCreatedAlertRuleSeverityXe7a889d4.Serializer::class)
public sealed class InlineWebhookCodeScanningAlertCreatedAlertRuleSeverityXe7a889d4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineWebhookCodeScanningAlertCreatedAlertRuleSeverityXe7a889d4() {
    public override val `value`: String = "none"
  }

  /**
   * Documented value. Wire value: `note`.
   */
  public data object Note : InlineWebhookCodeScanningAlertCreatedAlertRuleSeverityXe7a889d4() {
    public override val `value`: String = "note"
  }

  /**
   * Documented value. Wire value: `warning`.
   */
  public data object Warning : InlineWebhookCodeScanningAlertCreatedAlertRuleSeverityXe7a889d4() {
    public override val `value`: String = "warning"
  }

  /**
   * Documented value. Wire value: `error`.
   */
  public data object Error : InlineWebhookCodeScanningAlertCreatedAlertRuleSeverityXe7a889d4() {
    public override val `value`: String = "error"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookCodeScanningAlertCreatedAlertRuleSeverityXe7a889d4()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookCodeScanningAlertCreatedAlertRuleSeverityXe7a889d4 = when (value) {
      None.value -> None
      Note.value -> Note
      Warning.value -> Warning
      Error.value -> Error
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookCodeScanningAlertCreatedAlertRuleSeverityXe7a889d4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookCodeScanningAlertCreatedAlertRuleSeverityXe7a889d4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookCodeScanningAlertCreatedAlertRuleSeverityXe7a889d4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCodeScanningAlertCreatedAlertRuleSeverityXe7a889d4) {
      encoder.encodeString(value.value)
    }
  }
}
