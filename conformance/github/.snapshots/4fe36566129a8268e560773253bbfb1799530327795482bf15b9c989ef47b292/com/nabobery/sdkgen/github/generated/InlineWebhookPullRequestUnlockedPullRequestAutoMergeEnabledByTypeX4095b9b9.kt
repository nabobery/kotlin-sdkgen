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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-unlocked/properties/pull_request/properties/aut
 * o_merge/properties/enabled_by/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-unlocked/properties/pull_request/properties/aut
 * o_merge/properties/enabled_by/properties/type
 */
@Serializable(with = InlineWebhookPullRequestUnlockedPullRequestAutoMergeEnabledByTypeX4095b9b9.Serializer::class)
public sealed class InlineWebhookPullRequestUnlockedPullRequestAutoMergeEnabledByTypeX4095b9b9 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookPullRequestUnlockedPullRequestAutoMergeEnabledByTypeX4095b9b9() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookPullRequestUnlockedPullRequestAutoMergeEnabledByTypeX4095b9b9() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookPullRequestUnlockedPullRequestAutoMergeEnabledByTypeX4095b9b9() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestUnlockedPullRequestAutoMergeEnabledByTypeX4095b9b9()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestUnlockedPullRequestAutoMergeEnabledByTypeX4095b9b9 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestUnlockedPullRequestAutoMergeEnabledByTypeX4095b9b9> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestUnlockedPullRequestAutoMergeEnabledByTypeX4095b9b9", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestUnlockedPullRequestAutoMergeEnabledByTypeX4095b9b9 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestUnlockedPullRequestAutoMergeEnabledByTypeX4095b9b9) {
      encoder.encodeString(value.value)
    }
  }
}
