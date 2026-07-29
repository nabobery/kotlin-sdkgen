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
 * The enforcement level of the branch lock setting. `off` means the branch is not locked, `non_admins` means the branch
 * is read-only for non_admins, and `everyone` means the branch is read-only for everyone.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_rule/properties/lock_branch_enforcement_level
 */
@Serializable(with = InlineWebhooksRuleLockBranchEnforcementLevelX3c9f0e75.Serializer::class)
public sealed class InlineWebhooksRuleLockBranchEnforcementLevelX3c9f0e75 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `off`.
   */
  public data object Off : InlineWebhooksRuleLockBranchEnforcementLevelX3c9f0e75() {
    public override val `value`: String = "off"
  }

  /**
   * Documented value. Wire value: `non_admins`.
   */
  public data object NonAdmins : InlineWebhooksRuleLockBranchEnforcementLevelX3c9f0e75() {
    public override val `value`: String = "non_admins"
  }

  /**
   * Documented value. Wire value: `everyone`.
   */
  public data object Everyone : InlineWebhooksRuleLockBranchEnforcementLevelX3c9f0e75() {
    public override val `value`: String = "everyone"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksRuleLockBranchEnforcementLevelX3c9f0e75()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksRuleLockBranchEnforcementLevelX3c9f0e75 = when (value) {
      Off.value -> Off
      NonAdmins.value -> NonAdmins
      Everyone.value -> Everyone
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhooksRuleLockBranchEnforcementLevelX3c9f0e75> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhooksRuleLockBranchEnforcementLevelX3c9f0e75", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksRuleLockBranchEnforcementLevelX3c9f0e75 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksRuleLockBranchEnforcementLevelX3c9f0e75) {
      encoder.encodeString(value.value)
    }
  }
}
