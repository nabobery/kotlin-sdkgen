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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-closed-by-user/properties/alert/properti
 * es/most_recent_instance/properties/state
 */
@Serializable(with = InlineWebhookCodeScanningAlertClosedByUserAlertMostRecentInstanceStateX506b2d4d.Serializer::class)
public sealed class InlineWebhookCodeScanningAlertClosedByUserAlertMostRecentInstanceStateX506b2d4d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhookCodeScanningAlertClosedByUserAlertMostRecentInstanceStateX506b2d4d() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `dismissed`.
   */
  public data object Dismissed : InlineWebhookCodeScanningAlertClosedByUserAlertMostRecentInstanceStateX506b2d4d() {
    public override val `value`: String = "dismissed"
  }

  /**
   * Documented value. Wire value: `fixed`.
   */
  public data object Fixed : InlineWebhookCodeScanningAlertClosedByUserAlertMostRecentInstanceStateX506b2d4d() {
    public override val `value`: String = "fixed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookCodeScanningAlertClosedByUserAlertMostRecentInstanceStateX506b2d4d()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookCodeScanningAlertClosedByUserAlertMostRecentInstanceStateX506b2d4d = when (value) {
      Open.value -> Open
      Dismissed.value -> Dismissed
      Fixed.value -> Fixed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookCodeScanningAlertClosedByUserAlertMostRecentInstanceStateX506b2d4d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookCodeScanningAlertClosedByUserAlertMostRecentInstanceStateX506b2d4d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookCodeScanningAlertClosedByUserAlertMostRecentInstanceStateX506b2d4d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCodeScanningAlertClosedByUserAlertMostRecentInstanceStateX506b2d4d) {
      encoder.encodeString(value.value)
    }
  }
}
