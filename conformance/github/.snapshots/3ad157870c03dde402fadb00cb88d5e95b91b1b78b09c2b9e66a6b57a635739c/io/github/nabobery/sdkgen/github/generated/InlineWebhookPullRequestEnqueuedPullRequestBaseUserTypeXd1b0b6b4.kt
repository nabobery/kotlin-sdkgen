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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-enqueued/properties/pull_request/properties/bas
 * e/properties/user/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-enqueued/properties/pull_request/properties/bas
 * e/properties/user/properties/type
 */
@Serializable(with = InlineWebhookPullRequestEnqueuedPullRequestBaseUserTypeXd1b0b6b4.Serializer::class)
public sealed class InlineWebhookPullRequestEnqueuedPullRequestBaseUserTypeXd1b0b6b4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookPullRequestEnqueuedPullRequestBaseUserTypeXd1b0b6b4() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookPullRequestEnqueuedPullRequestBaseUserTypeXd1b0b6b4() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookPullRequestEnqueuedPullRequestBaseUserTypeXd1b0b6b4() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestEnqueuedPullRequestBaseUserTypeXd1b0b6b4()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestEnqueuedPullRequestBaseUserTypeXd1b0b6b4 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestEnqueuedPullRequestBaseUserTypeXd1b0b6b4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestEnqueuedPullRequestBaseUserTypeXd1b0b6b4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestEnqueuedPullRequestBaseUserTypeXd1b0b6b4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestEnqueuedPullRequestBaseUserTypeXd1b0b6b4) {
      encoder.encodeString(value.value)
    }
  }
}
