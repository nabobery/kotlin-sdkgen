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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-secret-scanning-alert-validated/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-secret-scanning-alert-validated/properties/action
 */
@Serializable(with = InlineWebhookSecretScanningAlertValidatedActionXc1ed4b22.Serializer::class)
public sealed class InlineWebhookSecretScanningAlertValidatedActionXc1ed4b22 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `validated`.
   */
  public data object Validated : InlineWebhookSecretScanningAlertValidatedActionXc1ed4b22() {
    public override val `value`: String = "validated"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookSecretScanningAlertValidatedActionXc1ed4b22()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookSecretScanningAlertValidatedActionXc1ed4b22 = when (value) {
      Validated.value -> Validated
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookSecretScanningAlertValidatedActionXc1ed4b22> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookSecretScanningAlertValidatedActionXc1ed4b22", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookSecretScanningAlertValidatedActionXc1ed4b22 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookSecretScanningAlertValidatedActionXc1ed4b22) {
      encoder.encodeString(value.value)
    }
  }
}
