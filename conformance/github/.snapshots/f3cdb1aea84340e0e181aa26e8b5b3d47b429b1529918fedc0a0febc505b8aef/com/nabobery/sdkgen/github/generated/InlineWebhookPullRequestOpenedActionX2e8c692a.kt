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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-opened/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-opened/properties/action
 */
@Serializable(with = InlineWebhookPullRequestOpenedActionX2e8c692a.Serializer::class)
public sealed class InlineWebhookPullRequestOpenedActionX2e8c692a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `opened`.
   */
  public data object Opened : InlineWebhookPullRequestOpenedActionX2e8c692a() {
    public override val `value`: String = "opened"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestOpenedActionX2e8c692a()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestOpenedActionX2e8c692a = when (value) {
      Opened.value -> Opened
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestOpenedActionX2e8c692a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestOpenedActionX2e8c692a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestOpenedActionX2e8c692a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestOpenedActionX2e8c692a) {
      encoder.encodeString(value.value)
    }
  }
}
