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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-merge-group-checks-requested/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-merge-group-checks-requested/properties/action
 */
@Serializable(with = InlineWebhookMergeGroupChecksRequestedActionXd9463cac.Serializer::class)
public sealed class InlineWebhookMergeGroupChecksRequestedActionXd9463cac {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `checks_requested`.
   */
  public data object ChecksRequested : InlineWebhookMergeGroupChecksRequestedActionXd9463cac() {
    public override val `value`: String = "checks_requested"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookMergeGroupChecksRequestedActionXd9463cac()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookMergeGroupChecksRequestedActionXd9463cac = when (value) {
      ChecksRequested.value -> ChecksRequested
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookMergeGroupChecksRequestedActionXd9463cac> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookMergeGroupChecksRequestedActionXd9463cac", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookMergeGroupChecksRequestedActionXd9463cac = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookMergeGroupChecksRequestedActionXd9463cac) {
      encoder.encodeString(value.value)
    }
  }
}
