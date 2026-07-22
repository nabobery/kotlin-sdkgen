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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-transferred/properties/changes/properties/new_reposit
 * ory/properties/owner/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-transferred/properties/changes/properties/new_reposit
 * ory/properties/owner/properties/type
 */
@Serializable(with = InlineWebhookIssuesTransferredChangesNewRepositoryOwnerTypeX4547cda5.Serializer::class)
public sealed class InlineWebhookIssuesTransferredChangesNewRepositoryOwnerTypeX4547cda5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookIssuesTransferredChangesNewRepositoryOwnerTypeX4547cda5() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookIssuesTransferredChangesNewRepositoryOwnerTypeX4547cda5() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookIssuesTransferredChangesNewRepositoryOwnerTypeX4547cda5() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesTransferredChangesNewRepositoryOwnerTypeX4547cda5()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesTransferredChangesNewRepositoryOwnerTypeX4547cda5 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookIssuesTransferredChangesNewRepositoryOwnerTypeX4547cda5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookIssuesTransferredChangesNewRepositoryOwnerTypeX4547cda5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesTransferredChangesNewRepositoryOwnerTypeX4547cda5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesTransferredChangesNewRepositoryOwnerTypeX4547cda5) {
      encoder.encodeString(value.value)
    }
  }
}
