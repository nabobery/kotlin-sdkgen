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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-branch-protection-rule-edited/properties/changes/properties/
 * linear_history_requirement_enforcement_level/properties/from.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-branch-protection-rule-edited/properties/changes/properties/
 * linear_history_requirement_enforcement_level/properties/from
 */
@Serializable(with = InlineWebhookBranchProtectfdbdChangesLinearHistoryRequire0212FromX02f5f9be.Serializer::class)
public sealed class InlineWebhookBranchProtectfdbdChangesLinearHistoryRequire0212FromX02f5f9be {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `off`.
   */
  public data object Off : InlineWebhookBranchProtectfdbdChangesLinearHistoryRequire0212FromX02f5f9be() {
    public override val `value`: String = "off"
  }

  /**
   * Documented value. Wire value: `non_admins`.
   */
  public data object NonAdmins : InlineWebhookBranchProtectfdbdChangesLinearHistoryRequire0212FromX02f5f9be() {
    public override val `value`: String = "non_admins"
  }

  /**
   * Documented value. Wire value: `everyone`.
   */
  public data object Everyone : InlineWebhookBranchProtectfdbdChangesLinearHistoryRequire0212FromX02f5f9be() {
    public override val `value`: String = "everyone"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookBranchProtectfdbdChangesLinearHistoryRequire0212FromX02f5f9be()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookBranchProtectfdbdChangesLinearHistoryRequire0212FromX02f5f9be = when (value) {
      Off.value -> Off
      NonAdmins.value -> NonAdmins
      Everyone.value -> Everyone
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookBranchProtectfdbdChangesLinearHistoryRequire0212FromX02f5f9be> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookBranchProtectfdbdChangesLinearHistoryRequire0212FromX02f5f9be", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookBranchProtectfdbdChangesLinearHistoryRequire0212FromX02f5f9be = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookBranchProtectfdbdChangesLinearHistoryRequire0212FromX02f5f9be) {
      encoder.encodeString(value.value)
    }
  }
}
