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
 * The state of the milestone.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_milestone_3/properties/state
 */
@Serializable(with = InlineWebhooksMilestone3StateX8a6dd6ff.Serializer::class)
public sealed class InlineWebhooksMilestone3StateX8a6dd6ff {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhooksMilestone3StateX8a6dd6ff() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineWebhooksMilestone3StateX8a6dd6ff() {
    public override val `value`: String = "closed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksMilestone3StateX8a6dd6ff()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksMilestone3StateX8a6dd6ff = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhooksMilestone3StateX8a6dd6ff> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhooksMilestone3StateX8a6dd6ff", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksMilestone3StateX8a6dd6ff = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksMilestone3StateX8a6dd6ff) {
      encoder.encodeString(value.value)
    }
  }
}
