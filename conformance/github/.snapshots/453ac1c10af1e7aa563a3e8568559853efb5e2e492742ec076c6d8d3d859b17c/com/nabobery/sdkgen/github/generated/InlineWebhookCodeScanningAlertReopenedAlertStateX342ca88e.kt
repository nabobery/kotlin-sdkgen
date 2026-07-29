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
 * State of a code scanning alert. Events for alerts found outside the default branch will return a `null` value until
 * they are dismissed or fixed.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-reopened/properties/alert/properties/sta
 * te
 */
@Serializable(with = InlineWebhookCodeScanningAlertReopenedAlertStateX342ca88e.Serializer::class)
public sealed class InlineWebhookCodeScanningAlertReopenedAlertStateX342ca88e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhookCodeScanningAlertReopenedAlertStateX342ca88e() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `dismissed`.
   */
  public data object Dismissed : InlineWebhookCodeScanningAlertReopenedAlertStateX342ca88e() {
    public override val `value`: String = "dismissed"
  }

  /**
   * Documented value. Wire value: `fixed`.
   */
  public data object Fixed : InlineWebhookCodeScanningAlertReopenedAlertStateX342ca88e() {
    public override val `value`: String = "fixed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookCodeScanningAlertReopenedAlertStateX342ca88e()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookCodeScanningAlertReopenedAlertStateX342ca88e = when (value) {
      Open.value -> Open
      Dismissed.value -> Dismissed
      Fixed.value -> Fixed
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookCodeScanningAlertReopenedAlertStateX342ca88e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookCodeScanningAlertReopenedAlertStateX342ca88e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookCodeScanningAlertReopenedAlertStateX342ca88e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCodeScanningAlertReopenedAlertStateX342ca88e) {
      encoder.encodeString(value.value)
    }
  }
}
