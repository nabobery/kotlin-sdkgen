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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-reopened-by-user/properties/action.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-reopened-by-user/properties/action
 */
@Serializable(with = InlineWebhookCodeScanningAlertReopenedByUserActionX4021ed2a.Serializer::class)
public sealed class InlineWebhookCodeScanningAlertReopenedByUserActionX4021ed2a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `reopened_by_user`.
   */
  public data object ReopenedByUser : InlineWebhookCodeScanningAlertReopenedByUserActionX4021ed2a() {
    public override val `value`: String = "reopened_by_user"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookCodeScanningAlertReopenedByUserActionX4021ed2a()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookCodeScanningAlertReopenedByUserActionX4021ed2a = when (value) {
      ReopenedByUser.value -> ReopenedByUser
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookCodeScanningAlertReopenedByUserActionX4021ed2a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookCodeScanningAlertReopenedByUserActionX4021ed2a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookCodeScanningAlertReopenedByUserActionX4021ed2a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCodeScanningAlertReopenedByUserActionX4021ed2a) {
      encoder.encodeString(value.value)
    }
  }
}
