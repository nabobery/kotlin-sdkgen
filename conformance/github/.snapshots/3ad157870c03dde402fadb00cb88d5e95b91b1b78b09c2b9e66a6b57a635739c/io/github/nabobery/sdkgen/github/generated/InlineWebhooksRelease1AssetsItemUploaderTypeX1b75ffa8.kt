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
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_release_1/properties/assets/items/properties/uploader/prope
 * rties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_release_1/properties/assets/items/properties/uploader/prope
 * rties/type
 */
@Serializable(with = InlineWebhooksRelease1AssetsItemUploaderTypeX1b75ffa8.Serializer::class)
public sealed class InlineWebhooksRelease1AssetsItemUploaderTypeX1b75ffa8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhooksRelease1AssetsItemUploaderTypeX1b75ffa8() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhooksRelease1AssetsItemUploaderTypeX1b75ffa8() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhooksRelease1AssetsItemUploaderTypeX1b75ffa8() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksRelease1AssetsItemUploaderTypeX1b75ffa8()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksRelease1AssetsItemUploaderTypeX1b75ffa8 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhooksRelease1AssetsItemUploaderTypeX1b75ffa8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhooksRelease1AssetsItemUploaderTypeX1b75ffa8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksRelease1AssetsItemUploaderTypeX1b75ffa8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksRelease1AssetsItemUploaderTypeX1b75ffa8) {
      encoder.encodeString(value.value)
    }
  }
}
