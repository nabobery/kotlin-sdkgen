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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-secret-scanning-alert-assigned/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-secret-scanning-alert-assigned/properties/action
 */
@Serializable(with = InlineWebhookSecretScanningAlertAssignedActionX056b29b6.Serializer::class)
public sealed class InlineWebhookSecretScanningAlertAssignedActionX056b29b6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `assigned`.
   */
  public data object Assigned : InlineWebhookSecretScanningAlertAssignedActionX056b29b6() {
    public override val `value`: String = "assigned"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookSecretScanningAlertAssignedActionX056b29b6()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookSecretScanningAlertAssignedActionX056b29b6 = when (value) {
      Assigned.value -> Assigned
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookSecretScanningAlertAssignedActionX056b29b6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookSecretScanningAlertAssignedActionX056b29b6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookSecretScanningAlertAssignedActionX056b29b6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookSecretScanningAlertAssignedActionX056b29b6) {
      encoder.encodeString(value.value)
    }
  }
}
