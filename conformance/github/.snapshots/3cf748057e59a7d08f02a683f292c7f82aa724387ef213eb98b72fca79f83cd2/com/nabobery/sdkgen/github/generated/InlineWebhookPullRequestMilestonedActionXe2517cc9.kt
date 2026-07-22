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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-milestoned/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-milestoned/properties/action
 */
@Serializable(with = InlineWebhookPullRequestMilestonedActionXe2517cc9.Serializer::class)
public sealed class InlineWebhookPullRequestMilestonedActionXe2517cc9 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `milestoned`.
   */
  public data object Milestoned : InlineWebhookPullRequestMilestonedActionXe2517cc9() {
    public override val `value`: String = "milestoned"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestMilestonedActionXe2517cc9()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestMilestonedActionXe2517cc9 = when (value) {
      Milestoned.value -> Milestoned
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestMilestonedActionXe2517cc9> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestMilestonedActionXe2517cc9", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestMilestonedActionXe2517cc9 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestMilestonedActionXe2517cc9) {
      encoder.encodeString(value.value)
    }
  }
}
