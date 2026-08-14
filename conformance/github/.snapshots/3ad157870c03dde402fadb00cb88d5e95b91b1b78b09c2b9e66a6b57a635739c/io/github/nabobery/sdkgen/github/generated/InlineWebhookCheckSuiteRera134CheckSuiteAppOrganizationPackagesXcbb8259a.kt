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
 * p/properties/permissions/properties/organization_packages.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-check-suite-rerequested/properties/check_suite/properties/ap
 * p/properties/permissions/properties/organization_packages
 */
@Serializable(with = InlineWebhookCheckSuiteRera134CheckSuiteAppOrganizationPackagesXcbb8259a.Serializer::class)
public sealed class InlineWebhookCheckSuiteRera134CheckSuiteAppOrganizationPackagesXcbb8259a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookCheckSuiteRera134CheckSuiteAppOrganizationPackagesXcbb8259a() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookCheckSuiteRera134CheckSuiteAppOrganizationPackagesXcbb8259a() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookCheckSuiteRera134CheckSuiteAppOrganizationPackagesXcbb8259a()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookCheckSuiteRera134CheckSuiteAppOrganizationPackagesXcbb8259a = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookCheckSuiteRera134CheckSuiteAppOrganizationPackagesXcbb8259a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookCheckSuiteRera134CheckSuiteAppOrganizationPackagesXcbb8259a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookCheckSuiteRera134CheckSuiteAppOrganizationPackagesXcbb8259a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCheckSuiteRera134CheckSuiteAppOrganizationPackagesXcbb8259a) {
      encoder.encodeString(value.value)
    }
  }
}
