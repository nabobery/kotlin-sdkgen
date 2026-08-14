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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-locked/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-locked/properties/action
 */
@Serializable(with = InlineWebhookIssuesLockedActionXed0431b2.Serializer::class)
public sealed class InlineWebhookIssuesLockedActionXed0431b2 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `locked`.
   */
  public data object Locked : InlineWebhookIssuesLockedActionXed0431b2() {
    public override val `value`: String = "locked"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesLockedActionXed0431b2()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesLockedActionXed0431b2 = when (value) {
      Locked.value -> Locked
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesLockedActionXed0431b2> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssuesLockedActionXed0431b2", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesLockedActionXed0431b2 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesLockedActionXed0431b2) {
      encoder.encodeString(value.value)
    }
  }
}
