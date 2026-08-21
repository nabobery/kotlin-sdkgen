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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-branch-protection-rule-edited/properties/changes/properties/
 * required_status_checks_enforcement_level/properties/from.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-branch-protection-rule-edited/properties/changes/properties/
 * required_status_checks_enforcement_level/properties/from
 */
@Serializable(with = InlineWebhookBranchProtectfdbdChangesRequiredStatusChecks8722FromXfb894477.Serializer::class)
public sealed class InlineWebhookBranchProtectfdbdChangesRequiredStatusChecks8722FromXfb894477 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `off`.
   */
  public data object Off : InlineWebhookBranchProtectfdbdChangesRequiredStatusChecks8722FromXfb894477() {
    public override val `value`: String = "off"
  }

  /**
   * Documented value. Wire value: `non_admins`.
   */
  public data object NonAdmins : InlineWebhookBranchProtectfdbdChangesRequiredStatusChecks8722FromXfb894477() {
    public override val `value`: String = "non_admins"
  }

  /**
   * Documented value. Wire value: `everyone`.
   */
  public data object Everyone : InlineWebhookBranchProtectfdbdChangesRequiredStatusChecks8722FromXfb894477() {
    public override val `value`: String = "everyone"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookBranchProtectfdbdChangesRequiredStatusChecks8722FromXfb894477()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookBranchProtectfdbdChangesRequiredStatusChecks8722FromXfb894477 = when (value) {
      Off.value -> Off
      NonAdmins.value -> NonAdmins
      Everyone.value -> Everyone
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookBranchProtectfdbdChangesRequiredStatusChecks8722FromXfb894477> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookBranchProtectfdbdChangesRequiredStatusChecks8722FromXfb894477", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookBranchProtectfdbdChangesRequiredStatusChecks8722FromXfb894477 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookBranchProtectfdbdChangesRequiredStatusChecks8722FromXfb894477) {
      encoder.encodeString(value.value)
    }
  }
}
