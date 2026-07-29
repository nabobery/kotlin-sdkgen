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
 * What type of scan was completed
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-secret-scanning-scan-completed/properties/type
 */
@Serializable(with = InlineWebhookSecretScanningScanCompletedTypeXaa8102f3.Serializer::class)
public sealed class InlineWebhookSecretScanningScanCompletedTypeXaa8102f3 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `backfill`.
   */
  public data object Backfill : InlineWebhookSecretScanningScanCompletedTypeXaa8102f3() {
    public override val `value`: String = "backfill"
  }

  /**
   * Documented value. Wire value: `custom-pattern-backfill`.
   */
  public data object CustomPatternBackfill : InlineWebhookSecretScanningScanCompletedTypeXaa8102f3() {
    public override val `value`: String = "custom-pattern-backfill"
  }

  /**
   * Documented value. Wire value: `pattern-version-backfill`.
   */
  public data object PatternVersionBackfill : InlineWebhookSecretScanningScanCompletedTypeXaa8102f3() {
    public override val `value`: String = "pattern-version-backfill"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookSecretScanningScanCompletedTypeXaa8102f3()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookSecretScanningScanCompletedTypeXaa8102f3 = when (value) {
      Backfill.value -> Backfill
      CustomPatternBackfill.value -> CustomPatternBackfill
      PatternVersionBackfill.value -> PatternVersionBackfill
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookSecretScanningScanCompletedTypeXaa8102f3> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookSecretScanningScanCompletedTypeXaa8102f3", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookSecretScanningScanCompletedTypeXaa8102f3 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookSecretScanningScanCompletedTypeXaa8102f3) {
      encoder.encodeString(value.value)
    }
  }
}
