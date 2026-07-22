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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/webhooks_alert/properties/state.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_alert/properties/state
 */
@Serializable(with = InlineWebhooksAlertStateX86a55694.Serializer::class)
public sealed class InlineWebhooksAlertStateX86a55694 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `auto_dismissed`.
   */
  public data object AutoDismissed : InlineWebhooksAlertStateX86a55694() {
    public override val `value`: String = "auto_dismissed"
  }

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhooksAlertStateX86a55694() {
    public override val `value`: String = "open"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksAlertStateX86a55694()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksAlertStateX86a55694 = when (value) {
      AutoDismissed.value -> AutoDismissed
      Open.value -> Open
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhooksAlertStateX86a55694> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhooksAlertStateX86a55694", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksAlertStateX86a55694 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksAlertStateX86a55694) {
      encoder.encodeString(value.value)
    }
  }
}
