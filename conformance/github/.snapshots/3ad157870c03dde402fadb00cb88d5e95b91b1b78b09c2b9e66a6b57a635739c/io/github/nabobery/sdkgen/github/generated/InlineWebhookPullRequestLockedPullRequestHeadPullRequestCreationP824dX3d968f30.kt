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
 * The policy controlling who can create pull requests: all or collaborators_only.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-locked/properties/pull_request/properties/head/
 * properties/repo/properties/pull_request_creation_policy
 */
@Serializable(with = InlineWebhookPullRequestLockedPullRequestHeadPullRequestCreationP824dX3d968f30.Serializer::class)
public sealed class InlineWebhookPullRequestLockedPullRequestHeadPullRequestCreationP824dX3d968f30 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineWebhookPullRequestLockedPullRequestHeadPullRequestCreationP824dX3d968f30() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `collaborators_only`.
   */
  public data object CollaboratorsOnly : InlineWebhookPullRequestLockedPullRequestHeadPullRequestCreationP824dX3d968f30() {
    public override val `value`: String = "collaborators_only"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestLockedPullRequestHeadPullRequestCreationP824dX3d968f30()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestLockedPullRequestHeadPullRequestCreationP824dX3d968f30 = when (value) {
      All.value -> All
      CollaboratorsOnly.value -> CollaboratorsOnly
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestLockedPullRequestHeadPullRequestCreationP824dX3d968f30> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestLockedPullRequestHeadPullRequestCreationP824dX3d968f30", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestLockedPullRequestHeadPullRequestCreationP824dX3d968f30 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestLockedPullRequestHeadPullRequestCreationP824dX3d968f30) {
      encoder.encodeString(value.value)
    }
  }
}
