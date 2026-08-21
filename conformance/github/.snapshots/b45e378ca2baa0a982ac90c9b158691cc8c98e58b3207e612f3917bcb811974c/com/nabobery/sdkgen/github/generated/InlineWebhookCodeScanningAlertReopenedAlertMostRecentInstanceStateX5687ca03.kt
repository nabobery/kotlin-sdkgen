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
 * State of a code scanning alert.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-reopened/properties/alert/properties/mos
 * t_recent_instance/properties/state
 */
@Serializable(with = InlineWebhookCodeScanningAlertReopenedAlertMostRecentInstanceStateX5687ca03.Serializer::class)
public sealed class InlineWebhookCodeScanningAlertReopenedAlertMostRecentInstanceStateX5687ca03 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhookCodeScanningAlertReopenedAlertMostRecentInstanceStateX5687ca03() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `dismissed`.
   */
  public data object Dismissed : InlineWebhookCodeScanningAlertReopenedAlertMostRecentInstanceStateX5687ca03() {
    public override val `value`: String = "dismissed"
  }

  /**
   * Documented value. Wire value: `fixed`.
   */
  public data object Fixed : InlineWebhookCodeScanningAlertReopenedAlertMostRecentInstanceStateX5687ca03() {
    public override val `value`: String = "fixed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookCodeScanningAlertReopenedAlertMostRecentInstanceStateX5687ca03()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookCodeScanningAlertReopenedAlertMostRecentInstanceStateX5687ca03 = when (value) {
      Open.value -> Open
      Dismissed.value -> Dismissed
      Fixed.value -> Fixed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookCodeScanningAlertReopenedAlertMostRecentInstanceStateX5687ca03> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookCodeScanningAlertReopenedAlertMostRecentInstanceStateX5687ca03", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookCodeScanningAlertReopenedAlertMostRecentInstanceStateX5687ca03 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCodeScanningAlertReopenedAlertMostRecentInstanceStateX5687ca03) {
      encoder.encodeString(value.value)
    }
  }
}
