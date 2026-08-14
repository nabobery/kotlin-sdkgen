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
 * p/properties/permissions/properties/repository_projects.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-check-suite-rerequested/properties/check_suite/properties/ap
 * p/properties/permissions/properties/repository_projects
 */
@Serializable(with = InlineWebhookCheckSuiteRera134CheckSuiteAppRepositoryProjectsXa8eea3a8.Serializer::class)
public sealed class InlineWebhookCheckSuiteRera134CheckSuiteAppRepositoryProjectsXa8eea3a8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookCheckSuiteRera134CheckSuiteAppRepositoryProjectsXa8eea3a8() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookCheckSuiteRera134CheckSuiteAppRepositoryProjectsXa8eea3a8() {
    public override val `value`: String = "write"
  }

  /**
   * Documented value. Wire value: `admin`.
   */
  public data object Admin : InlineWebhookCheckSuiteRera134CheckSuiteAppRepositoryProjectsXa8eea3a8() {
    public override val `value`: String = "admin"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookCheckSuiteRera134CheckSuiteAppRepositoryProjectsXa8eea3a8()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookCheckSuiteRera134CheckSuiteAppRepositoryProjectsXa8eea3a8 = when (value) {
      Read.value -> Read
      Write.value -> Write
      Admin.value -> Admin
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookCheckSuiteRera134CheckSuiteAppRepositoryProjectsXa8eea3a8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookCheckSuiteRera134CheckSuiteAppRepositoryProjectsXa8eea3a8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookCheckSuiteRera134CheckSuiteAppRepositoryProjectsXa8eea3a8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCheckSuiteRera134CheckSuiteAppRepositoryProjectsXa8eea3a8) {
      encoder.encodeString(value.value)
    }
  }
}
