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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-dependabot-alert-assignees-changed/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-dependabot-alert-assignees-changed/properties/action
 */
@Serializable(with = InlineWebhookDependabotAlertAssigneesChangedActionX81f85320.Serializer::class)
public sealed class InlineWebhookDependabotAlertAssigneesChangedActionX81f85320 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `assignees_changed`.
   */
  public data object AssigneesChanged : InlineWebhookDependabotAlertAssigneesChangedActionX81f85320() {
    public override val `value`: String = "assignees_changed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookDependabotAlertAssigneesChangedActionX81f85320()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookDependabotAlertAssigneesChangedActionX81f85320 = when (value) {
      AssigneesChanged.value -> AssigneesChanged
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookDependabotAlertAssigneesChangedActionX81f85320> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookDependabotAlertAssigneesChangedActionX81f85320", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookDependabotAlertAssigneesChangedActionX81f85320 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDependabotAlertAssigneesChangedActionX81f85320) {
      encoder.encodeString(value.value)
    }
  }
}
