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
 * The action that was performed.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-assigned/properties/action
 */
@Serializable(with = InlineWebhookIssuesAssignedActionX3957c61a.Serializer::class)
public sealed class InlineWebhookIssuesAssignedActionX3957c61a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `assigned`.
   */
  public data object Assigned : InlineWebhookIssuesAssignedActionX3957c61a() {
    public override val `value`: String = "assigned"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesAssignedActionX3957c61a()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesAssignedActionX3957c61a = when (value) {
      Assigned.value -> Assigned
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesAssignedActionX3957c61a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookIssuesAssignedActionX3957c61a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesAssignedActionX3957c61a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesAssignedActionX3957c61a) {
      encoder.encodeString(value.value)
    }
  }
}
