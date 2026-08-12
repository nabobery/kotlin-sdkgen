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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-auto-merge-disabled/properties/pull_request/pro
 * perties/state
 */
@Serializable(with = InlineWebhookPullRequestAutoMergeDisabledPullRequestStateXd46f1e19.Serializer::class)
public sealed class InlineWebhookPullRequestAutoMergeDisabledPullRequestStateXd46f1e19 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhookPullRequestAutoMergeDisabledPullRequestStateXd46f1e19() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineWebhookPullRequestAutoMergeDisabledPullRequestStateXd46f1e19() {
    public override val `value`: String = "closed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestAutoMergeDisabledPullRequestStateXd46f1e19()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestAutoMergeDisabledPullRequestStateXd46f1e19 = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestAutoMergeDisabledPullRequestStateXd46f1e19> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestAutoMergeDisabledPullRequestStateXd46f1e19", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestAutoMergeDisabledPullRequestStateXd46f1e19 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestAutoMergeDisabledPullRequestStateXd46f1e19) {
      encoder.encodeString(value.value)
    }
  }
}
