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
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_rule/properties/merge_queue_enforcement_level.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_rule/properties/merge_queue_enforcement_level
 */
@Serializable(with = InlineWebhooksRuleMergeQueueEnforcementLevelX1982c05f.Serializer::class)
public sealed class InlineWebhooksRuleMergeQueueEnforcementLevelX1982c05f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `off`.
   */
  public data object Off : InlineWebhooksRuleMergeQueueEnforcementLevelX1982c05f() {
    public override val `value`: String = "off"
  }

  /**
   * Documented value. Wire value: `non_admins`.
   */
  public data object NonAdmins : InlineWebhooksRuleMergeQueueEnforcementLevelX1982c05f() {
    public override val `value`: String = "non_admins"
  }

  /**
   * Documented value. Wire value: `everyone`.
   */
  public data object Everyone : InlineWebhooksRuleMergeQueueEnforcementLevelX1982c05f() {
    public override val `value`: String = "everyone"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksRuleMergeQueueEnforcementLevelX1982c05f()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksRuleMergeQueueEnforcementLevelX1982c05f = when (value) {
      Off.value -> Off
      NonAdmins.value -> NonAdmins
      Everyone.value -> Everyone
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhooksRuleMergeQueueEnforcementLevelX1982c05f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhooksRuleMergeQueueEnforcementLevelX1982c05f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksRuleMergeQueueEnforcementLevelX1982c05f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksRuleMergeQueueEnforcementLevelX1982c05f) {
      encoder.encodeString(value.value)
    }
  }
}
