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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-check-suite-completed/properties/check_suite/properties/app/
 * properties/permissions/properties/repository_projects.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-check-suite-completed/properties/check_suite/properties/app/
 * properties/permissions/properties/repository_projects
 */
@Serializable(with = InlineWebhookCheckSuiteComf2d7CheckSuiteAppRepositoryProjectsX13737b67.Serializer::class)
public sealed class InlineWebhookCheckSuiteComf2d7CheckSuiteAppRepositoryProjectsX13737b67 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookCheckSuiteComf2d7CheckSuiteAppRepositoryProjectsX13737b67() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookCheckSuiteComf2d7CheckSuiteAppRepositoryProjectsX13737b67() {
    public override val `value`: String = "write"
  }

  /**
   * Documented value. Wire value: `admin`.
   */
  public data object Admin : InlineWebhookCheckSuiteComf2d7CheckSuiteAppRepositoryProjectsX13737b67() {
    public override val `value`: String = "admin"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookCheckSuiteComf2d7CheckSuiteAppRepositoryProjectsX13737b67()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookCheckSuiteComf2d7CheckSuiteAppRepositoryProjectsX13737b67 = when (value) {
      Read.value -> Read
      Write.value -> Write
      Admin.value -> Admin
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookCheckSuiteComf2d7CheckSuiteAppRepositoryProjectsX13737b67> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookCheckSuiteComf2d7CheckSuiteAppRepositoryProjectsX13737b67", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookCheckSuiteComf2d7CheckSuiteAppRepositoryProjectsX13737b67 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCheckSuiteComf2d7CheckSuiteAppRepositoryProjectsX13737b67) {
      encoder.encodeString(value.value)
    }
  }
}
