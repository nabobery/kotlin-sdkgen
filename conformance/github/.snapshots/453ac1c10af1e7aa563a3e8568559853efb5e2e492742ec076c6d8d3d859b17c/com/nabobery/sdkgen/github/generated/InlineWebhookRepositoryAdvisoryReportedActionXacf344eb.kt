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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-repository-advisory-reported/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-repository-advisory-reported/properties/action
 */
@Serializable(with = InlineWebhookRepositoryAdvisoryReportedActionXacf344eb.Serializer::class)
public sealed class InlineWebhookRepositoryAdvisoryReportedActionXacf344eb {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `reported`.
   */
  public data object Reported : InlineWebhookRepositoryAdvisoryReportedActionXacf344eb() {
    public override val `value`: String = "reported"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookRepositoryAdvisoryReportedActionXacf344eb()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookRepositoryAdvisoryReportedActionXacf344eb = when (value) {
      Reported.value -> Reported
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookRepositoryAdvisoryReportedActionXacf344eb> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookRepositoryAdvisoryReportedActionXacf344eb", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookRepositoryAdvisoryReportedActionXacf344eb = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookRepositoryAdvisoryReportedActionXacf344eb) {
      encoder.encodeString(value.value)
    }
  }
}
