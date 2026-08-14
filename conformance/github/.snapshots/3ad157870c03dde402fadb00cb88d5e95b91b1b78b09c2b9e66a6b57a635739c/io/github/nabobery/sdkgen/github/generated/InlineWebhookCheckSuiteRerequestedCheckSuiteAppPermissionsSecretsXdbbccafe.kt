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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-check-suite-rerequested/properties/check_suite/properties/ap
 * p/properties/permissions/properties/secrets.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-check-suite-rerequested/properties/check_suite/properties/ap
 * p/properties/permissions/properties/secrets
 */
@Serializable(with = InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsSecretsXdbbccafe.Serializer::class)
public sealed class InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsSecretsXdbbccafe {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsSecretsXdbbccafe() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsSecretsXdbbccafe() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsSecretsXdbbccafe()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsSecretsXdbbccafe = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsSecretsXdbbccafe> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsSecretsXdbbccafe", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsSecretsXdbbccafe = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsSecretsXdbbccafe) {
      encoder.encodeString(value.value)
    }
  }
}
