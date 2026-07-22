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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-dequeued/properties/pull_request/properties/bas
 * e/properties/repo/properties/pull_request_creation_policy
 */
@Serializable(with = InlineWebhookPullRequestDea21dPullRequestBasePullRequestCreationP824dXfd49f90f.Serializer::class)
public sealed class InlineWebhookPullRequestDea21dPullRequestBasePullRequestCreationP824dXfd49f90f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineWebhookPullRequestDea21dPullRequestBasePullRequestCreationP824dXfd49f90f() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `collaborators_only`.
   */
  public data object CollaboratorsOnly : InlineWebhookPullRequestDea21dPullRequestBasePullRequestCreationP824dXfd49f90f() {
    public override val `value`: String = "collaborators_only"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestDea21dPullRequestBasePullRequestCreationP824dXfd49f90f()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestDea21dPullRequestBasePullRequestCreationP824dXfd49f90f = when (value) {
      All.value -> All
      CollaboratorsOnly.value -> CollaboratorsOnly
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestDea21dPullRequestBasePullRequestCreationP824dXfd49f90f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestDea21dPullRequestBasePullRequestCreationP824dXfd49f90f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestDea21dPullRequestBasePullRequestCreationP824dXfd49f90f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestDea21dPullRequestBasePullRequestCreationP824dXfd49f90f) {
      encoder.encodeString(value.value)
    }
  }
}
