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
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_answer/properties/user/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_answer/properties/user/properties/type
 */
@Serializable(with = InlineWebhooksAnswerUserTypeXd9f92cea.Serializer::class)
public sealed class InlineWebhooksAnswerUserTypeXd9f92cea {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhooksAnswerUserTypeXd9f92cea() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhooksAnswerUserTypeXd9f92cea() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhooksAnswerUserTypeXd9f92cea() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksAnswerUserTypeXd9f92cea()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksAnswerUserTypeXd9f92cea = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhooksAnswerUserTypeXd9f92cea> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhooksAnswerUserTypeXd9f92cea", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksAnswerUserTypeXd9f92cea = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksAnswerUserTypeXd9f92cea) {
      encoder.encodeString(value.value)
    }
  }
}
