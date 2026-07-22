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
 * State of a code scanning alert.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-reopened-by-user/properties/alert/proper
 * ties/most_recent_instance/properties/state
 */
@Serializable(with = InlineWebhookCodeScanningAea05AlertMostRecentInstanceStateX7bde45a8.Serializer::class)
public sealed class InlineWebhookCodeScanningAea05AlertMostRecentInstanceStateX7bde45a8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhookCodeScanningAea05AlertMostRecentInstanceStateX7bde45a8() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `dismissed`.
   */
  public data object Dismissed : InlineWebhookCodeScanningAea05AlertMostRecentInstanceStateX7bde45a8() {
    public override val `value`: String = "dismissed"
  }

  /**
   * Documented value. Wire value: `fixed`.
   */
  public data object Fixed : InlineWebhookCodeScanningAea05AlertMostRecentInstanceStateX7bde45a8() {
    public override val `value`: String = "fixed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookCodeScanningAea05AlertMostRecentInstanceStateX7bde45a8()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookCodeScanningAea05AlertMostRecentInstanceStateX7bde45a8 = when (value) {
      Open.value -> Open
      Dismissed.value -> Dismissed
      Fixed.value -> Fixed
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookCodeScanningAea05AlertMostRecentInstanceStateX7bde45a8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookCodeScanningAea05AlertMostRecentInstanceStateX7bde45a8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookCodeScanningAea05AlertMostRecentInstanceStateX7bde45a8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCodeScanningAea05AlertMostRecentInstanceStateX7bde45a8) {
      encoder.encodeString(value.value)
    }
  }
}
