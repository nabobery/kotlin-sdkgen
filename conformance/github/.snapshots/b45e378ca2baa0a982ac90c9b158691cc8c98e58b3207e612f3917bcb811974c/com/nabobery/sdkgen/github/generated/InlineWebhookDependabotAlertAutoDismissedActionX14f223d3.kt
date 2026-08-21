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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-dependabot-alert-auto-dismissed/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-dependabot-alert-auto-dismissed/properties/action
 */
@Serializable(with = InlineWebhookDependabotAlertAutoDismissedActionX14f223d3.Serializer::class)
public sealed class InlineWebhookDependabotAlertAutoDismissedActionX14f223d3 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `auto_dismissed`.
   */
  public data object AutoDismissed : InlineWebhookDependabotAlertAutoDismissedActionX14f223d3() {
    public override val `value`: String = "auto_dismissed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookDependabotAlertAutoDismissedActionX14f223d3()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookDependabotAlertAutoDismissedActionX14f223d3 = when (value) {
      AutoDismissed.value -> AutoDismissed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookDependabotAlertAutoDismissedActionX14f223d3> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookDependabotAlertAutoDismissedActionX14f223d3", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookDependabotAlertAutoDismissedActionX14f223d3 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDependabotAlertAutoDismissedActionX14f223d3) {
      encoder.encodeString(value.value)
    }
  }
}
