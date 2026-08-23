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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-enqueued/properties/pull_request/properties/use
 * r/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-enqueued/properties/pull_request/properties/use
 * r/properties/type
 */
@Serializable(with = InlineWebhookPullRequestEnqueuedPullRequestUserTypeXbdfb8754.Serializer::class)
public sealed class InlineWebhookPullRequestEnqueuedPullRequestUserTypeXbdfb8754 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookPullRequestEnqueuedPullRequestUserTypeXbdfb8754() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookPullRequestEnqueuedPullRequestUserTypeXbdfb8754() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookPullRequestEnqueuedPullRequestUserTypeXbdfb8754() {
    public override val `value`: String = "Organization"
  }

  /**
   * Documented value. Wire value: `Mannequin`.
   */
  public data object Mannequin : InlineWebhookPullRequestEnqueuedPullRequestUserTypeXbdfb8754() {
    public override val `value`: String = "Mannequin"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestEnqueuedPullRequestUserTypeXbdfb8754()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestEnqueuedPullRequestUserTypeXbdfb8754 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      Mannequin.value -> Mannequin
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestEnqueuedPullRequestUserTypeXbdfb8754> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestEnqueuedPullRequestUserTypeXbdfb8754", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestEnqueuedPullRequestUserTypeXbdfb8754 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestEnqueuedPullRequestUserTypeXbdfb8754) {
      encoder.encodeString(value.value)
    }
  }
}
