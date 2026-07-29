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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-transferred/properties/changes/properties/new_reposit
 * ory/properties/pull_request_creation_policy
 */
@Serializable(with = InlineWebhookIssuesTransferredChangesPullRequestCreationP824dXecaa270c.Serializer::class)
public sealed class InlineWebhookIssuesTransferredChangesPullRequestCreationP824dXecaa270c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineWebhookIssuesTransferredChangesPullRequestCreationP824dXecaa270c() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `collaborators_only`.
   */
  public data object CollaboratorsOnly : InlineWebhookIssuesTransferredChangesPullRequestCreationP824dXecaa270c() {
    public override val `value`: String = "collaborators_only"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesTransferredChangesPullRequestCreationP824dXecaa270c()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesTransferredChangesPullRequestCreationP824dXecaa270c = when (value) {
      All.value -> All
      CollaboratorsOnly.value -> CollaboratorsOnly
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookIssuesTransferredChangesPullRequestCreationP824dXecaa270c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookIssuesTransferredChangesPullRequestCreationP824dXecaa270c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesTransferredChangesPullRequestCreationP824dXecaa270c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesTransferredChangesPullRequestCreationP824dXecaa270c) {
      encoder.encodeString(value.value)
    }
  }
}
