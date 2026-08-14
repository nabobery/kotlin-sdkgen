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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-check-suite-requested/properties/check_suite/properties/app/
 * properties/permissions/properties/repository_projects.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-check-suite-requested/properties/check_suite/properties/app/
 * properties/permissions/properties/repository_projects
 */
@Serializable(with = InlineWebhookCheckSuiteReqdc23CheckSuiteAppRepositoryProjectsX9060e3d1.Serializer::class)
public sealed class InlineWebhookCheckSuiteReqdc23CheckSuiteAppRepositoryProjectsX9060e3d1 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookCheckSuiteReqdc23CheckSuiteAppRepositoryProjectsX9060e3d1() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookCheckSuiteReqdc23CheckSuiteAppRepositoryProjectsX9060e3d1() {
    public override val `value`: String = "write"
  }

  /**
   * Documented value. Wire value: `admin`.
   */
  public data object Admin : InlineWebhookCheckSuiteReqdc23CheckSuiteAppRepositoryProjectsX9060e3d1() {
    public override val `value`: String = "admin"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookCheckSuiteReqdc23CheckSuiteAppRepositoryProjectsX9060e3d1()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookCheckSuiteReqdc23CheckSuiteAppRepositoryProjectsX9060e3d1 = when (value) {
      Read.value -> Read
      Write.value -> Write
      Admin.value -> Admin
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookCheckSuiteReqdc23CheckSuiteAppRepositoryProjectsX9060e3d1> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookCheckSuiteReqdc23CheckSuiteAppRepositoryProjectsX9060e3d1", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookCheckSuiteReqdc23CheckSuiteAppRepositoryProjectsX9060e3d1 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCheckSuiteReqdc23CheckSuiteAppRepositoryProjectsX9060e3d1) {
      encoder.encodeString(value.value)
    }
  }
}
