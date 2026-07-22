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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-push/properties/repository/properties/visibility.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-push/properties/repository/properties/visibility
 */
@Serializable(with = InlineWebhookPushRepositoryVisibilityX1686edcd.Serializer::class)
public sealed class InlineWebhookPushRepositoryVisibilityX1686edcd {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `public`.
   */
  public data object Public : InlineWebhookPushRepositoryVisibilityX1686edcd() {
    public override val `value`: String = "public"
  }

  /**
   * Documented value. Wire value: `private`.
   */
  public data object Private : InlineWebhookPushRepositoryVisibilityX1686edcd() {
    public override val `value`: String = "private"
  }

  /**
   * Documented value. Wire value: `internal`.
   */
  public data object Internal : InlineWebhookPushRepositoryVisibilityX1686edcd() {
    public override val `value`: String = "internal"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPushRepositoryVisibilityX1686edcd()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPushRepositoryVisibilityX1686edcd = when (value) {
      Public.value -> Public
      Private.value -> Private
      Internal.value -> Internal
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookPushRepositoryVisibilityX1686edcd> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPushRepositoryVisibilityX1686edcd", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPushRepositoryVisibilityX1686edcd = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPushRepositoryVisibilityX1686edcd) {
      encoder.encodeString(value.value)
    }
  }
}
