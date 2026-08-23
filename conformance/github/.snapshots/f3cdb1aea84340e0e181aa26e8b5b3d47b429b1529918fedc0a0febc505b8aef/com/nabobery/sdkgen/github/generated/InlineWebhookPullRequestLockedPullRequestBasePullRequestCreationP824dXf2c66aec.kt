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
 * The policy controlling who can create pull requests: all or collaborators_only.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-locked/properties/pull_request/properties/base/
 * properties/repo/properties/pull_request_creation_policy
 */
@Serializable(with = InlineWebhookPullRequestLockedPullRequestBasePullRequestCreationP824dXf2c66aec.Serializer::class)
public sealed class InlineWebhookPullRequestLockedPullRequestBasePullRequestCreationP824dXf2c66aec {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineWebhookPullRequestLockedPullRequestBasePullRequestCreationP824dXf2c66aec() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `collaborators_only`.
   */
  public data object CollaboratorsOnly : InlineWebhookPullRequestLockedPullRequestBasePullRequestCreationP824dXf2c66aec() {
    public override val `value`: String = "collaborators_only"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestLockedPullRequestBasePullRequestCreationP824dXf2c66aec()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestLockedPullRequestBasePullRequestCreationP824dXf2c66aec = when (value) {
      All.value -> All
      CollaboratorsOnly.value -> CollaboratorsOnly
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestLockedPullRequestBasePullRequestCreationP824dXf2c66aec> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestLockedPullRequestBasePullRequestCreationP824dXf2c66aec", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestLockedPullRequestBasePullRequestCreationP824dXf2c66aec = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestLockedPullRequestBasePullRequestCreationP824dXf2c66aec) {
      encoder.encodeString(value.value)
    }
  }
}
