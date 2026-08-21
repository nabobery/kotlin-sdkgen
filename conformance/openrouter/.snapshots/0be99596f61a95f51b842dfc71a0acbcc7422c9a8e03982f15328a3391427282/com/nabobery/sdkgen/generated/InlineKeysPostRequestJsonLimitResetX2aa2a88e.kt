package com.nabobery.sdkgen.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Type of limit reset for the API key (daily, weekly, monthly, or null for no reset). Resets happen automatically at
 * midnight UTC, and weeks are Monday through Sunday.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1keys/post/requestBody/content/application~1json/schema/properties/limit_reset
 */
@Serializable(with = InlineKeysPostRequestJsonLimitResetX2aa2a88e.Serializer::class)
public sealed class InlineKeysPostRequestJsonLimitResetX2aa2a88e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `daily`.
   */
  public data object Daily : InlineKeysPostRequestJsonLimitResetX2aa2a88e() {
    public override val `value`: String = "daily"
  }

  /**
   * Documented value. Wire value: `weekly`.
   */
  public data object Weekly : InlineKeysPostRequestJsonLimitResetX2aa2a88e() {
    public override val `value`: String = "weekly"
  }

  /**
   * Documented value. Wire value: `monthly`.
   */
  public data object Monthly : InlineKeysPostRequestJsonLimitResetX2aa2a88e() {
    public override val `value`: String = "monthly"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineKeysPostRequestJsonLimitResetX2aa2a88e()

  public companion object {
    public fun fromValue(`value`: String): InlineKeysPostRequestJsonLimitResetX2aa2a88e = when (value) {
      Daily.value -> Daily
      Weekly.value -> Weekly
      Monthly.value -> Monthly
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineKeysPostRequestJsonLimitResetX2aa2a88e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineKeysPostRequestJsonLimitResetX2aa2a88e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineKeysPostRequestJsonLimitResetX2aa2a88e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineKeysPostRequestJsonLimitResetX2aa2a88e) {
      encoder.encodeString(value.value)
    }
  }
}
