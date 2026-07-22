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
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_issue/properties/milestone/properties/state
 */
@Serializable(with = InlineWebhooksIssueMilestoneStateXdc335839.Serializer::class)
public sealed class InlineWebhooksIssueMilestoneStateXdc335839 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhooksIssueMilestoneStateXdc335839() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineWebhooksIssueMilestoneStateXdc335839() {
    public override val `value`: String = "closed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksIssueMilestoneStateXdc335839()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksIssueMilestoneStateXdc335839 = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhooksIssueMilestoneStateXdc335839> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhooksIssueMilestoneStateXdc335839", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksIssueMilestoneStateXdc335839 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksIssueMilestoneStateXdc335839) {
      encoder.encodeString(value.value)
    }
  }
}
