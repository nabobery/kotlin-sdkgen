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
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-deleted/properties/issue/properties/state
 */
@Serializable(with = InlineWebhookIssuesDeletedIssueStateXa6dfb9f3.Serializer::class)
public sealed class InlineWebhookIssuesDeletedIssueStateXa6dfb9f3 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhookIssuesDeletedIssueStateXa6dfb9f3() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineWebhookIssuesDeletedIssueStateXa6dfb9f3() {
    public override val `value`: String = "closed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesDeletedIssueStateXa6dfb9f3()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesDeletedIssueStateXa6dfb9f3 = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesDeletedIssueStateXa6dfb9f3> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssuesDeletedIssueStateXa6dfb9f3", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesDeletedIssueStateXa6dfb9f3 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesDeletedIssueStateXa6dfb9f3) {
      encoder.encodeString(value.value)
    }
  }
}
