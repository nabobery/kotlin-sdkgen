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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-opened/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-opened/properties/action
 */
@Serializable(with = InlineWebhookIssuesOpenedActionX740c2638.Serializer::class)
public sealed class InlineWebhookIssuesOpenedActionX740c2638 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `opened`.
   */
  public data object Opened : InlineWebhookIssuesOpenedActionX740c2638() {
    public override val `value`: String = "opened"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesOpenedActionX740c2638()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesOpenedActionX740c2638 = when (value) {
      Opened.value -> Opened
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesOpenedActionX740c2638> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookIssuesOpenedActionX740c2638", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesOpenedActionX740c2638 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesOpenedActionX740c2638) {
      encoder.encodeString(value.value)
    }
  }
}
