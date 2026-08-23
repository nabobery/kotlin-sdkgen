package com.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/default_settings/properties/description/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/default_settings/properties/description/anyOf/1
 */
@Serializable(with = InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X59cadb8b.Serializer::class)
public sealed class InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X59cadb8b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X59cadb8b() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X59cadb8b()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X59cadb8b = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X59cadb8b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X59cadb8b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X59cadb8b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X59cadb8b) {
      encoder.encodeString(value.value)
    }
  }
}
