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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-synchronize/properties/pull_request/properties/
 * assignees/items/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-synchronize/properties/pull_request/properties/
 * assignees/items/properties/type
 */
@Serializable(with = InlineWebhookPullRequestSynchronizePullRequestAssigneesItemTypeXac2fd168.Serializer::class)
public sealed class InlineWebhookPullRequestSynchronizePullRequestAssigneesItemTypeXac2fd168 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookPullRequestSynchronizePullRequestAssigneesItemTypeXac2fd168() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookPullRequestSynchronizePullRequestAssigneesItemTypeXac2fd168() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookPullRequestSynchronizePullRequestAssigneesItemTypeXac2fd168() {
    public override val `value`: String = "Organization"
  }

  /**
   * Documented value. Wire value: `Mannequin`.
   */
  public data object Mannequin : InlineWebhookPullRequestSynchronizePullRequestAssigneesItemTypeXac2fd168() {
    public override val `value`: String = "Mannequin"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestSynchronizePullRequestAssigneesItemTypeXac2fd168()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestSynchronizePullRequestAssigneesItemTypeXac2fd168 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      Mannequin.value -> Mannequin
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestSynchronizePullRequestAssigneesItemTypeXac2fd168> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestSynchronizePullRequestAssigneesItemTypeXac2fd168", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestSynchronizePullRequestAssigneesItemTypeXac2fd168 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestSynchronizePullRequestAssigneesItemTypeXac2fd168) {
      encoder.encodeString(value.value)
    }
  }
}
