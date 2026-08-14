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
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_issue/properties/state
 */
@Serializable(with = InlineWebhooksIssueStateX81bc32e8.Serializer::class)
public sealed class InlineWebhooksIssueStateX81bc32e8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhooksIssueStateX81bc32e8() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineWebhooksIssueStateX81bc32e8() {
    public override val `value`: String = "closed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksIssueStateX81bc32e8()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksIssueStateX81bc32e8 = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhooksIssueStateX81bc32e8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhooksIssueStateX81bc32e8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksIssueStateX81bc32e8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksIssueStateX81bc32e8) {
      encoder.encodeString(value.value)
    }
  }
}
