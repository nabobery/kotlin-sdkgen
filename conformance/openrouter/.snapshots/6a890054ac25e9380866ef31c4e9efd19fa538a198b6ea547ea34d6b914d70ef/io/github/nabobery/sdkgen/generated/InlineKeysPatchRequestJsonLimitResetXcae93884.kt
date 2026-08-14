package io.github.nabobery.sdkgen.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * New limit reset type for the API key (daily, weekly, monthly, or null for no reset). Resets happen automatically at
 * midnight UTC, and weeks are Monday through Sunday.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1keys~1{hash}/patch/requestBody/content/application~1json/schema/properties/limi
 * t_reset
 */
@Serializable(with = InlineKeysPatchRequestJsonLimitResetXcae93884.Serializer::class)
public sealed class InlineKeysPatchRequestJsonLimitResetXcae93884 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `daily`.
   */
  public data object Daily : InlineKeysPatchRequestJsonLimitResetXcae93884() {
    public override val `value`: String = "daily"
  }

  /**
   * Documented value. Wire value: `weekly`.
   */
  public data object Weekly : InlineKeysPatchRequestJsonLimitResetXcae93884() {
    public override val `value`: String = "weekly"
  }

  /**
   * Documented value. Wire value: `monthly`.
   */
  public data object Monthly : InlineKeysPatchRequestJsonLimitResetXcae93884() {
    public override val `value`: String = "monthly"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineKeysPatchRequestJsonLimitResetXcae93884()

  public companion object {
    public fun fromValue(`value`: String): InlineKeysPatchRequestJsonLimitResetXcae93884 = when (value) {
      Daily.value -> Daily
      Weekly.value -> Weekly
      Monthly.value -> Monthly
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineKeysPatchRequestJsonLimitResetXcae93884> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineKeysPatchRequestJsonLimitResetXcae93884", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineKeysPatchRequestJsonLimitResetXcae93884 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineKeysPatchRequestJsonLimitResetXcae93884) {
      encoder.encodeString(value.value)
    }
  }
}
