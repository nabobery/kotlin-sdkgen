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
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_project_card/properties/creator/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_project_card/properties/creator/properties/type
 */
@Serializable(with = InlineWebhooksProjectCardCreatorTypeX1ab7bdef.Serializer::class)
public sealed class InlineWebhooksProjectCardCreatorTypeX1ab7bdef {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhooksProjectCardCreatorTypeX1ab7bdef() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhooksProjectCardCreatorTypeX1ab7bdef() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhooksProjectCardCreatorTypeX1ab7bdef() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksProjectCardCreatorTypeX1ab7bdef()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksProjectCardCreatorTypeX1ab7bdef = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhooksProjectCardCreatorTypeX1ab7bdef> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhooksProjectCardCreatorTypeX1ab7bdef", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksProjectCardCreatorTypeX1ab7bdef = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksProjectCardCreatorTypeX1ab7bdef) {
      encoder.encodeString(value.value)
    }
  }
}
