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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-secret-scanning-alert-publicly-leaked/properties/action.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-secret-scanning-alert-publicly-leaked/properties/action
 */
@Serializable(with = InlineWebhookSecretScanningAlertPubliclyLeakedActionX469d6487.Serializer::class)
public sealed class InlineWebhookSecretScanningAlertPubliclyLeakedActionX469d6487 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `publicly_leaked`.
   */
  public data object PubliclyLeaked : InlineWebhookSecretScanningAlertPubliclyLeakedActionX469d6487() {
    public override val `value`: String = "publicly_leaked"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookSecretScanningAlertPubliclyLeakedActionX469d6487()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookSecretScanningAlertPubliclyLeakedActionX469d6487 = when (value) {
      PubliclyLeaked.value -> PubliclyLeaked
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookSecretScanningAlertPubliclyLeakedActionX469d6487> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookSecretScanningAlertPubliclyLeakedActionX469d6487", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookSecretScanningAlertPubliclyLeakedActionX469d6487 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookSecretScanningAlertPubliclyLeakedActionX469d6487) {
      encoder.encodeString(value.value)
    }
  }
}
