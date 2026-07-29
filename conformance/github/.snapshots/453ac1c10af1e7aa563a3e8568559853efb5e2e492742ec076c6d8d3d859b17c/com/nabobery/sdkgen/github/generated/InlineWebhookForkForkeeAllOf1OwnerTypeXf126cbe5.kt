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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-fork/properties/forkee/allOf/0/properties/owner/properties/t
 * ype.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-fork/properties/forkee/allOf/0/properties/owner/properties/t
 * ype
 */
@Serializable(with = InlineWebhookForkForkeeAllOf1OwnerTypeXf126cbe5.Serializer::class)
public sealed class InlineWebhookForkForkeeAllOf1OwnerTypeXf126cbe5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookForkForkeeAllOf1OwnerTypeXf126cbe5() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookForkForkeeAllOf1OwnerTypeXf126cbe5() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookForkForkeeAllOf1OwnerTypeXf126cbe5() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookForkForkeeAllOf1OwnerTypeXf126cbe5()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookForkForkeeAllOf1OwnerTypeXf126cbe5 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookForkForkeeAllOf1OwnerTypeXf126cbe5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookForkForkeeAllOf1OwnerTypeXf126cbe5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookForkForkeeAllOf1OwnerTypeXf126cbe5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookForkForkeeAllOf1OwnerTypeXf126cbe5) {
      encoder.encodeString(value.value)
    }
  }
}
