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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-repository-ruleset-created/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-repository-ruleset-created/properties/action
 */
@Serializable(with = InlineWebhookRepositoryRulesetCreatedActionXd06dfacf.Serializer::class)
public sealed class InlineWebhookRepositoryRulesetCreatedActionXd06dfacf {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `created`.
   */
  public data object Created : InlineWebhookRepositoryRulesetCreatedActionXd06dfacf() {
    public override val `value`: String = "created"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookRepositoryRulesetCreatedActionXd06dfacf()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookRepositoryRulesetCreatedActionXd06dfacf = when (value) {
      Created.value -> Created
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookRepositoryRulesetCreatedActionXd06dfacf> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookRepositoryRulesetCreatedActionXd06dfacf", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookRepositoryRulesetCreatedActionXd06dfacf = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookRepositoryRulesetCreatedActionXd06dfacf) {
      encoder.encodeString(value.value)
    }
  }
}
