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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-appeared-in-branch/properties/alert/prop
 * erties/most_recent_instance/properties/state
 */
@Serializable(with = InlineWebhookCodeScanningA2384AlertMostRecentInstanceStateX4f00b16a.Serializer::class)
public sealed class InlineWebhookCodeScanningA2384AlertMostRecentInstanceStateX4f00b16a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhookCodeScanningA2384AlertMostRecentInstanceStateX4f00b16a() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `dismissed`.
   */
  public data object Dismissed : InlineWebhookCodeScanningA2384AlertMostRecentInstanceStateX4f00b16a() {
    public override val `value`: String = "dismissed"
  }

  /**
   * Documented value. Wire value: `fixed`.
   */
  public data object Fixed : InlineWebhookCodeScanningA2384AlertMostRecentInstanceStateX4f00b16a() {
    public override val `value`: String = "fixed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookCodeScanningA2384AlertMostRecentInstanceStateX4f00b16a()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookCodeScanningA2384AlertMostRecentInstanceStateX4f00b16a = when (value) {
      Open.value -> Open
      Dismissed.value -> Dismissed
      Fixed.value -> Fixed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookCodeScanningA2384AlertMostRecentInstanceStateX4f00b16a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookCodeScanningA2384AlertMostRecentInstanceStateX4f00b16a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookCodeScanningA2384AlertMostRecentInstanceStateX4f00b16a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCodeScanningA2384AlertMostRecentInstanceStateX4f00b16a) {
      encoder.encodeString(value.value)
    }
  }
}
