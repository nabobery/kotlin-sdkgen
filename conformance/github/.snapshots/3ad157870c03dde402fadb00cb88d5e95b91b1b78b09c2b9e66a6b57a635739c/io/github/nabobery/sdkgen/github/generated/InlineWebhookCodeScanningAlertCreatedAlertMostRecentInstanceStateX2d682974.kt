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
 * State of a code scanning alert.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-created/properties/alert/properties/most
 * _recent_instance/properties/state
 */
@Serializable(with = InlineWebhookCodeScanningAlertCreatedAlertMostRecentInstanceStateX2d682974.Serializer::class)
public sealed class InlineWebhookCodeScanningAlertCreatedAlertMostRecentInstanceStateX2d682974 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhookCodeScanningAlertCreatedAlertMostRecentInstanceStateX2d682974() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `dismissed`.
   */
  public data object Dismissed : InlineWebhookCodeScanningAlertCreatedAlertMostRecentInstanceStateX2d682974() {
    public override val `value`: String = "dismissed"
  }

  /**
   * Documented value. Wire value: `fixed`.
   */
  public data object Fixed : InlineWebhookCodeScanningAlertCreatedAlertMostRecentInstanceStateX2d682974() {
    public override val `value`: String = "fixed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookCodeScanningAlertCreatedAlertMostRecentInstanceStateX2d682974()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookCodeScanningAlertCreatedAlertMostRecentInstanceStateX2d682974 = when (value) {
      Open.value -> Open
      Dismissed.value -> Dismissed
      Fixed.value -> Fixed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookCodeScanningAlertCreatedAlertMostRecentInstanceStateX2d682974> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookCodeScanningAlertCreatedAlertMostRecentInstanceStateX2d682974", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookCodeScanningAlertCreatedAlertMostRecentInstanceStateX2d682974 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCodeScanningAlertCreatedAlertMostRecentInstanceStateX2d682974) {
      encoder.encodeString(value.value)
    }
  }
}
