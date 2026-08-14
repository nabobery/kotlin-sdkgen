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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/webhooks_user/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_user/properties/type
 */
@Serializable(with = InlineWebhooksUserTypeX8c61ddb4.Serializer::class)
public sealed class InlineWebhooksUserTypeX8c61ddb4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhooksUserTypeX8c61ddb4() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhooksUserTypeX8c61ddb4() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhooksUserTypeX8c61ddb4() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksUserTypeX8c61ddb4()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksUserTypeX8c61ddb4 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhooksUserTypeX8c61ddb4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhooksUserTypeX8c61ddb4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksUserTypeX8c61ddb4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksUserTypeX8c61ddb4) {
      encoder.encodeString(value.value)
    }
  }
}
