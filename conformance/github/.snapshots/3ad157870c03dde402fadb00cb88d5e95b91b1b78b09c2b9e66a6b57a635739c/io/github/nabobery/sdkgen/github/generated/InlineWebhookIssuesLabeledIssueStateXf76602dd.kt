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
 * State of the issue; either 'open' or 'closed'
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-labeled/properties/issue/properties/state
 */
@Serializable(with = InlineWebhookIssuesLabeledIssueStateXf76602dd.Serializer::class)
public sealed class InlineWebhookIssuesLabeledIssueStateXf76602dd {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhookIssuesLabeledIssueStateXf76602dd() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineWebhookIssuesLabeledIssueStateXf76602dd() {
    public override val `value`: String = "closed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesLabeledIssueStateXf76602dd()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesLabeledIssueStateXf76602dd = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesLabeledIssueStateXf76602dd> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssuesLabeledIssueStateXf76602dd", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesLabeledIssueStateXf76602dd = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesLabeledIssueStateXf76602dd) {
      encoder.encodeString(value.value)
    }
  }
}
