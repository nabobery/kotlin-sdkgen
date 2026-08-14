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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-dependabot-alert-auto-reopened/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-dependabot-alert-auto-reopened/properties/action
 */
@Serializable(with = InlineWebhookDependabotAlertAutoReopenedActionX42df0bb4.Serializer::class)
public sealed class InlineWebhookDependabotAlertAutoReopenedActionX42df0bb4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `auto_reopened`.
   */
  public data object AutoReopened : InlineWebhookDependabotAlertAutoReopenedActionX42df0bb4() {
    public override val `value`: String = "auto_reopened"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookDependabotAlertAutoReopenedActionX42df0bb4()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookDependabotAlertAutoReopenedActionX42df0bb4 = when (value) {
      AutoReopened.value -> AutoReopened
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookDependabotAlertAutoReopenedActionX42df0bb4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookDependabotAlertAutoReopenedActionX42df0bb4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookDependabotAlertAutoReopenedActionX42df0bb4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDependabotAlertAutoReopenedActionX42df0bb4) {
      encoder.encodeString(value.value)
    }
  }
}
