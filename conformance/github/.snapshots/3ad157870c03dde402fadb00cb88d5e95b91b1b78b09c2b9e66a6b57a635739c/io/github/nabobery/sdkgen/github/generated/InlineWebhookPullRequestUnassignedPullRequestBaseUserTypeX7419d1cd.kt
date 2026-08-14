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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-unassigned/properties/pull_request/properties/b
 * ase/properties/user/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-unassigned/properties/pull_request/properties/b
 * ase/properties/user/properties/type
 */
@Serializable(with = InlineWebhookPullRequestUnassignedPullRequestBaseUserTypeX7419d1cd.Serializer::class)
public sealed class InlineWebhookPullRequestUnassignedPullRequestBaseUserTypeX7419d1cd {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookPullRequestUnassignedPullRequestBaseUserTypeX7419d1cd() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookPullRequestUnassignedPullRequestBaseUserTypeX7419d1cd() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookPullRequestUnassignedPullRequestBaseUserTypeX7419d1cd() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestUnassignedPullRequestBaseUserTypeX7419d1cd()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestUnassignedPullRequestBaseUserTypeX7419d1cd = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestUnassignedPullRequestBaseUserTypeX7419d1cd> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestUnassignedPullRequestBaseUserTypeX7419d1cd", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestUnassignedPullRequestBaseUserTypeX7419d1cd = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestUnassignedPullRequestBaseUserTypeX7419d1cd) {
      encoder.encodeString(value.value)
    }
  }
}
