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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-updated-assignment/properties/alert/prop
 * erties/state
 */
@Serializable(with = InlineWebhookCodeScanningAlertUpdatedAssignmentAlertStateXb66102d0.Serializer::class)
public sealed class InlineWebhookCodeScanningAlertUpdatedAssignmentAlertStateXb66102d0 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhookCodeScanningAlertUpdatedAssignmentAlertStateXb66102d0() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `dismissed`.
   */
  public data object Dismissed : InlineWebhookCodeScanningAlertUpdatedAssignmentAlertStateXb66102d0() {
    public override val `value`: String = "dismissed"
  }

  /**
   * Documented value. Wire value: `fixed`.
   */
  public data object Fixed : InlineWebhookCodeScanningAlertUpdatedAssignmentAlertStateXb66102d0() {
    public override val `value`: String = "fixed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookCodeScanningAlertUpdatedAssignmentAlertStateXb66102d0()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookCodeScanningAlertUpdatedAssignmentAlertStateXb66102d0 = when (value) {
      Open.value -> Open
      Dismissed.value -> Dismissed
      Fixed.value -> Fixed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookCodeScanningAlertUpdatedAssignmentAlertStateXb66102d0> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookCodeScanningAlertUpdatedAssignmentAlertStateXb66102d0", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookCodeScanningAlertUpdatedAssignmentAlertStateXb66102d0 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCodeScanningAlertUpdatedAssignmentAlertStateXb66102d0) {
      encoder.encodeString(value.value)
    }
  }
}
