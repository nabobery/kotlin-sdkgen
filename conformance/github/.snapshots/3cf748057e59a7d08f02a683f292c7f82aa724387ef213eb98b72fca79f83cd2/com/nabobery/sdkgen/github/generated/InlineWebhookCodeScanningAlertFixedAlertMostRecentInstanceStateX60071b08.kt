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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-fixed/properties/alert/properties/most_r
 * ecent_instance/properties/state
 */
@Serializable(with = InlineWebhookCodeScanningAlertFixedAlertMostRecentInstanceStateX60071b08.Serializer::class)
public sealed class InlineWebhookCodeScanningAlertFixedAlertMostRecentInstanceStateX60071b08 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhookCodeScanningAlertFixedAlertMostRecentInstanceStateX60071b08() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `dismissed`.
   */
  public data object Dismissed : InlineWebhookCodeScanningAlertFixedAlertMostRecentInstanceStateX60071b08() {
    public override val `value`: String = "dismissed"
  }

  /**
   * Documented value. Wire value: `fixed`.
   */
  public data object Fixed : InlineWebhookCodeScanningAlertFixedAlertMostRecentInstanceStateX60071b08() {
    public override val `value`: String = "fixed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookCodeScanningAlertFixedAlertMostRecentInstanceStateX60071b08()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookCodeScanningAlertFixedAlertMostRecentInstanceStateX60071b08 = when (value) {
      Open.value -> Open
      Dismissed.value -> Dismissed
      Fixed.value -> Fixed
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookCodeScanningAlertFixedAlertMostRecentInstanceStateX60071b08> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookCodeScanningAlertFixedAlertMostRecentInstanceStateX60071b08", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookCodeScanningAlertFixedAlertMostRecentInstanceStateX60071b08 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCodeScanningAlertFixedAlertMostRecentInstanceStateX60071b08) {
      encoder.encodeString(value.value)
    }
  }
}
