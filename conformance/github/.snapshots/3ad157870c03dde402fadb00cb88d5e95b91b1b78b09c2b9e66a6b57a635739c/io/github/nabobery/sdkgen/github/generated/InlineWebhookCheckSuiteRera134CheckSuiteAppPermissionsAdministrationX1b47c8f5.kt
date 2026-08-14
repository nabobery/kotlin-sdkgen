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
 * p/properties/permissions/properties/administration.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-check-suite-rerequested/properties/check_suite/properties/ap
 * p/properties/permissions/properties/administration
 */
@Serializable(with = InlineWebhookCheckSuiteRera134CheckSuiteAppPermissionsAdministrationX1b47c8f5.Serializer::class)
public sealed class InlineWebhookCheckSuiteRera134CheckSuiteAppPermissionsAdministrationX1b47c8f5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookCheckSuiteRera134CheckSuiteAppPermissionsAdministrationX1b47c8f5() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookCheckSuiteRera134CheckSuiteAppPermissionsAdministrationX1b47c8f5() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookCheckSuiteRera134CheckSuiteAppPermissionsAdministrationX1b47c8f5()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookCheckSuiteRera134CheckSuiteAppPermissionsAdministrationX1b47c8f5 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookCheckSuiteRera134CheckSuiteAppPermissionsAdministrationX1b47c8f5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookCheckSuiteRera134CheckSuiteAppPermissionsAdministrationX1b47c8f5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookCheckSuiteRera134CheckSuiteAppPermissionsAdministrationX1b47c8f5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCheckSuiteRera134CheckSuiteAppPermissionsAdministrationX1b47c8f5) {
      encoder.encodeString(value.value)
    }
  }
}
