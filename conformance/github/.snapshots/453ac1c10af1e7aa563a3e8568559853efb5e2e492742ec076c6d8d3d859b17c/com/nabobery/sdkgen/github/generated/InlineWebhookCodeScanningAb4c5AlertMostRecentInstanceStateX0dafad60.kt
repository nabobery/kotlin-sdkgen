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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-updated-assignment/properties/alert/prop
 * erties/most_recent_instance/properties/state
 */
@Serializable(with = InlineWebhookCodeScanningAb4c5AlertMostRecentInstanceStateX0dafad60.Serializer::class)
public sealed class InlineWebhookCodeScanningAb4c5AlertMostRecentInstanceStateX0dafad60 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhookCodeScanningAb4c5AlertMostRecentInstanceStateX0dafad60() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `dismissed`.
   */
  public data object Dismissed : InlineWebhookCodeScanningAb4c5AlertMostRecentInstanceStateX0dafad60() {
    public override val `value`: String = "dismissed"
  }

  /**
   * Documented value. Wire value: `fixed`.
   */
  public data object Fixed : InlineWebhookCodeScanningAb4c5AlertMostRecentInstanceStateX0dafad60() {
    public override val `value`: String = "fixed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookCodeScanningAb4c5AlertMostRecentInstanceStateX0dafad60()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookCodeScanningAb4c5AlertMostRecentInstanceStateX0dafad60 = when (value) {
      Open.value -> Open
      Dismissed.value -> Dismissed
      Fixed.value -> Fixed
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookCodeScanningAb4c5AlertMostRecentInstanceStateX0dafad60> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookCodeScanningAb4c5AlertMostRecentInstanceStateX0dafad60", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookCodeScanningAb4c5AlertMostRecentInstanceStateX0dafad60 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCodeScanningAb4c5AlertMostRecentInstanceStateX0dafad60) {
      encoder.encodeString(value.value)
    }
  }
}
