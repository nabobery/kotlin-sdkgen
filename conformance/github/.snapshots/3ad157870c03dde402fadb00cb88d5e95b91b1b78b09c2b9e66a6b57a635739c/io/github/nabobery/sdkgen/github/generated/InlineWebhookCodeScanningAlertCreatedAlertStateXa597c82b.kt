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
 * State of a code scanning alert. Events for alerts found outside the default branch will return a `null` value until
 * they are dismissed or fixed.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-created/properties/alert/properties/stat
 * e
 */
@Serializable(with = InlineWebhookCodeScanningAlertCreatedAlertStateXa597c82b.Serializer::class)
public sealed class InlineWebhookCodeScanningAlertCreatedAlertStateXa597c82b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhookCodeScanningAlertCreatedAlertStateXa597c82b() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `dismissed`.
   */
  public data object Dismissed : InlineWebhookCodeScanningAlertCreatedAlertStateXa597c82b() {
    public override val `value`: String = "dismissed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookCodeScanningAlertCreatedAlertStateXa597c82b()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookCodeScanningAlertCreatedAlertStateXa597c82b = when (value) {
      Open.value -> Open
      Dismissed.value -> Dismissed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookCodeScanningAlertCreatedAlertStateXa597c82b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookCodeScanningAlertCreatedAlertStateXa597c82b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookCodeScanningAlertCreatedAlertStateXa597c82b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCodeScanningAlertCreatedAlertStateXa597c82b) {
      encoder.encodeString(value.value)
    }
  }
}
