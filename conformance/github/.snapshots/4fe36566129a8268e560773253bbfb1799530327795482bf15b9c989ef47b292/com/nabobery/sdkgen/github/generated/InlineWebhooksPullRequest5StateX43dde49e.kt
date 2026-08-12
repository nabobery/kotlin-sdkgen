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
 * State of this Pull Request. Either `open` or `closed`.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_pull_request_5/properties/state
 */
@Serializable(with = InlineWebhooksPullRequest5StateX43dde49e.Serializer::class)
public sealed class InlineWebhooksPullRequest5StateX43dde49e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhooksPullRequest5StateX43dde49e() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineWebhooksPullRequest5StateX43dde49e() {
    public override val `value`: String = "closed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksPullRequest5StateX43dde49e()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksPullRequest5StateX43dde49e = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhooksPullRequest5StateX43dde49e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhooksPullRequest5StateX43dde49e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksPullRequest5StateX43dde49e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksPullRequest5StateX43dde49e) {
      encoder.encodeString(value.value)
    }
  }
}
