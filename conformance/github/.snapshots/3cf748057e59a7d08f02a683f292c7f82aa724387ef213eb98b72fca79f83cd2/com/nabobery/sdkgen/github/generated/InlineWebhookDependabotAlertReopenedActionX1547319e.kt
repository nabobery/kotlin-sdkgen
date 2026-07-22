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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-dependabot-alert-reopened/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-dependabot-alert-reopened/properties/action
 */
@Serializable(with = InlineWebhookDependabotAlertReopenedActionX1547319e.Serializer::class)
public sealed class InlineWebhookDependabotAlertReopenedActionX1547319e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `reopened`.
   */
  public data object Reopened : InlineWebhookDependabotAlertReopenedActionX1547319e() {
    public override val `value`: String = "reopened"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookDependabotAlertReopenedActionX1547319e()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookDependabotAlertReopenedActionX1547319e = when (value) {
      Reopened.value -> Reopened
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookDependabotAlertReopenedActionX1547319e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookDependabotAlertReopenedActionX1547319e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookDependabotAlertReopenedActionX1547319e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDependabotAlertReopenedActionX1547319e) {
      encoder.encodeString(value.value)
    }
  }
}
