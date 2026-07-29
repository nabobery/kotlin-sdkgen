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
 * lock_branch_enforcement_level/properties/from.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-branch-protection-rule-edited/properties/changes/properties/
 * lock_branch_enforcement_level/properties/from
 */
@Serializable(with = InlineWebhookBranchProtectfdbdChangesLockBranchEnforcemen8626FromX151d390d.Serializer::class)
public sealed class InlineWebhookBranchProtectfdbdChangesLockBranchEnforcemen8626FromX151d390d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `off`.
   */
  public data object Off : InlineWebhookBranchProtectfdbdChangesLockBranchEnforcemen8626FromX151d390d() {
    public override val `value`: String = "off"
  }

  /**
   * Documented value. Wire value: `non_admins`.
   */
  public data object NonAdmins : InlineWebhookBranchProtectfdbdChangesLockBranchEnforcemen8626FromX151d390d() {
    public override val `value`: String = "non_admins"
  }

  /**
   * Documented value. Wire value: `everyone`.
   */
  public data object Everyone : InlineWebhookBranchProtectfdbdChangesLockBranchEnforcemen8626FromX151d390d() {
    public override val `value`: String = "everyone"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookBranchProtectfdbdChangesLockBranchEnforcemen8626FromX151d390d()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookBranchProtectfdbdChangesLockBranchEnforcemen8626FromX151d390d = when (value) {
      Off.value -> Off
      NonAdmins.value -> NonAdmins
      Everyone.value -> Everyone
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookBranchProtectfdbdChangesLockBranchEnforcemen8626FromX151d390d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookBranchProtectfdbdChangesLockBranchEnforcemen8626FromX151d390d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookBranchProtectfdbdChangesLockBranchEnforcemen8626FromX151d390d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookBranchProtectfdbdChangesLockBranchEnforcemen8626FromX151d390d) {
      encoder.encodeString(value.value)
    }
  }
}
