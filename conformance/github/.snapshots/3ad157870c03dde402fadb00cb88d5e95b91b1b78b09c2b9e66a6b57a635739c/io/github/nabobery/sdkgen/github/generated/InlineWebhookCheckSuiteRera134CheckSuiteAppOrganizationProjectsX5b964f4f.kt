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
 * p/properties/permissions/properties/organization_projects.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-check-suite-rerequested/properties/check_suite/properties/ap
 * p/properties/permissions/properties/organization_projects
 */
@Serializable(with = InlineWebhookCheckSuiteRera134CheckSuiteAppOrganizationProjectsX5b964f4f.Serializer::class)
public sealed class InlineWebhookCheckSuiteRera134CheckSuiteAppOrganizationProjectsX5b964f4f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookCheckSuiteRera134CheckSuiteAppOrganizationProjectsX5b964f4f() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookCheckSuiteRera134CheckSuiteAppOrganizationProjectsX5b964f4f() {
    public override val `value`: String = "write"
  }

  /**
   * Documented value. Wire value: `admin`.
   */
  public data object Admin : InlineWebhookCheckSuiteRera134CheckSuiteAppOrganizationProjectsX5b964f4f() {
    public override val `value`: String = "admin"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookCheckSuiteRera134CheckSuiteAppOrganizationProjectsX5b964f4f()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookCheckSuiteRera134CheckSuiteAppOrganizationProjectsX5b964f4f = when (value) {
      Read.value -> Read
      Write.value -> Write
      Admin.value -> Admin
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookCheckSuiteRera134CheckSuiteAppOrganizationProjectsX5b964f4f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookCheckSuiteRera134CheckSuiteAppOrganizationProjectsX5b964f4f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookCheckSuiteRera134CheckSuiteAppOrganizationProjectsX5b964f4f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCheckSuiteRera134CheckSuiteAppOrganizationProjectsX5b964f4f) {
      encoder.encodeString(value.value)
    }
  }
}
