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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-dependabot-alert-dismissed/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-dependabot-alert-dismissed/properties/action
 */
@Serializable(with = InlineWebhookDependabotAlertDismissedActionX8cdb0180.Serializer::class)
public sealed class InlineWebhookDependabotAlertDismissedActionX8cdb0180 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `dismissed`.
   */
  public data object Dismissed : InlineWebhookDependabotAlertDismissedActionX8cdb0180() {
    public override val `value`: String = "dismissed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookDependabotAlertDismissedActionX8cdb0180()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookDependabotAlertDismissedActionX8cdb0180 = when (value) {
      Dismissed.value -> Dismissed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookDependabotAlertDismissedActionX8cdb0180> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookDependabotAlertDismissedActionX8cdb0180", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookDependabotAlertDismissedActionX8cdb0180 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDependabotAlertDismissedActionX8cdb0180) {
      encoder.encodeString(value.value)
    }
  }
}
