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
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_milestone/properties/state
 */
@Serializable(with = InlineWebhooksMilestoneStateX544a11ad.Serializer::class)
public sealed class InlineWebhooksMilestoneStateX544a11ad {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhooksMilestoneStateX544a11ad() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineWebhooksMilestoneStateX544a11ad() {
    public override val `value`: String = "closed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksMilestoneStateX544a11ad()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksMilestoneStateX544a11ad = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhooksMilestoneStateX544a11ad> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhooksMilestoneStateX544a11ad", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksMilestoneStateX544a11ad = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksMilestoneStateX544a11ad) {
      encoder.encodeString(value.value)
    }
  }
}
