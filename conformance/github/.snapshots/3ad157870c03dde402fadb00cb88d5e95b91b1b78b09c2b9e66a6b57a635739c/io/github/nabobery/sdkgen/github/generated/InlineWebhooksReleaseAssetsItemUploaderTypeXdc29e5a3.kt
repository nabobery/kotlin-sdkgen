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
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_release/properties/assets/items/properties/uploader/propert
 * ies/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_release/properties/assets/items/properties/uploader/propert
 * ies/type
 */
@Serializable(with = InlineWebhooksReleaseAssetsItemUploaderTypeXdc29e5a3.Serializer::class)
public sealed class InlineWebhooksReleaseAssetsItemUploaderTypeXdc29e5a3 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhooksReleaseAssetsItemUploaderTypeXdc29e5a3() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhooksReleaseAssetsItemUploaderTypeXdc29e5a3() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhooksReleaseAssetsItemUploaderTypeXdc29e5a3() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksReleaseAssetsItemUploaderTypeXdc29e5a3()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksReleaseAssetsItemUploaderTypeXdc29e5a3 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhooksReleaseAssetsItemUploaderTypeXdc29e5a3> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhooksReleaseAssetsItemUploaderTypeXdc29e5a3", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksReleaseAssetsItemUploaderTypeXdc29e5a3 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksReleaseAssetsItemUploaderTypeXdc29e5a3) {
      encoder.encodeString(value.value)
    }
  }
}
