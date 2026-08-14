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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-typed/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-typed/properties/action
 */
@Serializable(with = InlineWebhookIssuesTypedActionXd9d5d636.Serializer::class)
public sealed class InlineWebhookIssuesTypedActionXd9d5d636 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `typed`.
   */
  public data object Typed : InlineWebhookIssuesTypedActionXd9d5d636() {
    public override val `value`: String = "typed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesTypedActionXd9d5d636()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesTypedActionXd9d5d636 = when (value) {
      Typed.value -> Typed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesTypedActionXd9d5d636> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssuesTypedActionXd9d5d636", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesTypedActionXd9d5d636 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesTypedActionXd9d5d636) {
      encoder.encodeString(value.value)
    }
  }
}
