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
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-unassigned/properties/action
 */
@Serializable(with = InlineWebhookIssuesUnassignedActionXc9f734b4.Serializer::class)
public sealed class InlineWebhookIssuesUnassignedActionXc9f734b4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `unassigned`.
   */
  public data object Unassigned : InlineWebhookIssuesUnassignedActionXc9f734b4() {
    public override val `value`: String = "unassigned"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesUnassignedActionXc9f734b4()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesUnassignedActionXc9f734b4 = when (value) {
      Unassigned.value -> Unassigned
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookIssuesUnassignedActionXc9f734b4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookIssuesUnassignedActionXc9f734b4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesUnassignedActionXc9f734b4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesUnassignedActionXc9f734b4) {
      encoder.encodeString(value.value)
    }
  }
}
