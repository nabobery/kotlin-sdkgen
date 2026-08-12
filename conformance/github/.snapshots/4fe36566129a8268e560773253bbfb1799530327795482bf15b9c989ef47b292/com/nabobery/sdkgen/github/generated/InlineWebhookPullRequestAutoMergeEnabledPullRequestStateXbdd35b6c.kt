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
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-auto-merge-enabled/properties/pull_request/prop
 * erties/state
 */
@Serializable(with = InlineWebhookPullRequestAutoMergeEnabledPullRequestStateXbdd35b6c.Serializer::class)
public sealed class InlineWebhookPullRequestAutoMergeEnabledPullRequestStateXbdd35b6c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhookPullRequestAutoMergeEnabledPullRequestStateXbdd35b6c() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineWebhookPullRequestAutoMergeEnabledPullRequestStateXbdd35b6c() {
    public override val `value`: String = "closed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestAutoMergeEnabledPullRequestStateXbdd35b6c()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestAutoMergeEnabledPullRequestStateXbdd35b6c = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestAutoMergeEnabledPullRequestStateXbdd35b6c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestAutoMergeEnabledPullRequestStateXbdd35b6c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestAutoMergeEnabledPullRequestStateXbdd35b6c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestAutoMergeEnabledPullRequestStateXbdd35b6c) {
      encoder.encodeString(value.value)
    }
  }
}
