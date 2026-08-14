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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-check-suite-rerequested/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-check-suite-rerequested/properties/action
 */
@Serializable(with = InlineWebhookCheckSuiteRerequestedActionXd2a42208.Serializer::class)
public sealed class InlineWebhookCheckSuiteRerequestedActionXd2a42208 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `rerequested`.
   */
  public data object Rerequested : InlineWebhookCheckSuiteRerequestedActionXd2a42208() {
    public override val `value`: String = "rerequested"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookCheckSuiteRerequestedActionXd2a42208()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookCheckSuiteRerequestedActionXd2a42208 = when (value) {
      Rerequested.value -> Rerequested
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookCheckSuiteRerequestedActionXd2a42208> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookCheckSuiteRerequestedActionXd2a42208", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookCheckSuiteRerequestedActionXd2a42208 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCheckSuiteRerequestedActionXd2a42208) {
      encoder.encodeString(value.value)
    }
  }
}
