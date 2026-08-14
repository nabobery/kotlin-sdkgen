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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-appeared-in-branch/properties/alert/prop
 * erties/state
 */
@Serializable(with = InlineWebhookCodeScanningAlertAppearedInBranchAlertStateXfd30945c.Serializer::class)
public sealed class InlineWebhookCodeScanningAlertAppearedInBranchAlertStateXfd30945c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhookCodeScanningAlertAppearedInBranchAlertStateXfd30945c() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `dismissed`.
   */
  public data object Dismissed : InlineWebhookCodeScanningAlertAppearedInBranchAlertStateXfd30945c() {
    public override val `value`: String = "dismissed"
  }

  /**
   * Documented value. Wire value: `fixed`.
   */
  public data object Fixed : InlineWebhookCodeScanningAlertAppearedInBranchAlertStateXfd30945c() {
    public override val `value`: String = "fixed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookCodeScanningAlertAppearedInBranchAlertStateXfd30945c()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookCodeScanningAlertAppearedInBranchAlertStateXfd30945c = when (value) {
      Open.value -> Open
      Dismissed.value -> Dismissed
      Fixed.value -> Fixed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookCodeScanningAlertAppearedInBranchAlertStateXfd30945c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookCodeScanningAlertAppearedInBranchAlertStateXfd30945c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookCodeScanningAlertAppearedInBranchAlertStateXfd30945c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCodeScanningAlertAppearedInBranchAlertStateXfd30945c) {
      encoder.encodeString(value.value)
    }
  }
}
