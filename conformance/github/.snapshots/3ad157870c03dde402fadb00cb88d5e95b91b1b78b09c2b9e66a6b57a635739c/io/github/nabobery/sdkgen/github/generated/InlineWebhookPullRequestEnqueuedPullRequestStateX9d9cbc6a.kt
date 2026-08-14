package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-enqueued/properties/pull_request/properties/sta
 * te
 */
@Serializable(with = InlineWebhookPullRequestEnqueuedPullRequestStateX9d9cbc6a.Serializer::class)
public sealed class InlineWebhookPullRequestEnqueuedPullRequestStateX9d9cbc6a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhookPullRequestEnqueuedPullRequestStateX9d9cbc6a() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineWebhookPullRequestEnqueuedPullRequestStateX9d9cbc6a() {
    public override val `value`: String = "closed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestEnqueuedPullRequestStateX9d9cbc6a()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestEnqueuedPullRequestStateX9d9cbc6a = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestEnqueuedPullRequestStateX9d9cbc6a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestEnqueuedPullRequestStateX9d9cbc6a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestEnqueuedPullRequestStateX9d9cbc6a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestEnqueuedPullRequestStateX9d9cbc6a) {
      encoder.encodeString(value.value)
    }
  }
}
