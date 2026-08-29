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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-milestone-closed/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-milestone-closed/properties/action
 */
@Serializable(with = InlineWebhookMilestoneClosedActionX3f6f6582.Serializer::class)
public sealed class InlineWebhookMilestoneClosedActionX3f6f6582 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineWebhookMilestoneClosedActionX3f6f6582() {
    public override val `value`: String = "closed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookMilestoneClosedActionX3f6f6582()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookMilestoneClosedActionX3f6f6582 = when (value) {
      Closed.value -> Closed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookMilestoneClosedActionX3f6f6582> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookMilestoneClosedActionX3f6f6582", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookMilestoneClosedActionX3f6f6582 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookMilestoneClosedActionX3f6f6582) {
      encoder.encodeString(value.value)
    }
  }
}
