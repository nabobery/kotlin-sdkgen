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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-status/properties/commit/properties/committer/properties/typ
 * e.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-status/properties/commit/properties/committer/properties/typ
 * e
 */
@Serializable(with = InlineWebhookStatusCommitCommitterTypeX08f2b451.Serializer::class)
public sealed class InlineWebhookStatusCommitCommitterTypeX08f2b451 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookStatusCommitCommitterTypeX08f2b451() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookStatusCommitCommitterTypeX08f2b451() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookStatusCommitCommitterTypeX08f2b451() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookStatusCommitCommitterTypeX08f2b451()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookStatusCommitCommitterTypeX08f2b451 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookStatusCommitCommitterTypeX08f2b451> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookStatusCommitCommitterTypeX08f2b451", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookStatusCommitCommitterTypeX08f2b451 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookStatusCommitCommitterTypeX08f2b451) {
      encoder.encodeString(value.value)
    }
  }
}
