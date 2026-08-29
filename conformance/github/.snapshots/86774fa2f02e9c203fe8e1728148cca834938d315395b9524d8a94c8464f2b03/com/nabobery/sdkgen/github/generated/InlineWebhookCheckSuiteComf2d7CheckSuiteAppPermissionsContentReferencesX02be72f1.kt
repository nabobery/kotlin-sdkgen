package com.nabobery.sdkgen.github.generated

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
 * properties/permissions/properties/content_references.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-check-suite-completed/properties/check_suite/properties/app/
 * properties/permissions/properties/content_references
 */
@Serializable(with = InlineWebhookCheckSuiteComf2d7CheckSuiteAppPermissionsContentReferencesX02be72f1.Serializer::class)
public sealed class InlineWebhookCheckSuiteComf2d7CheckSuiteAppPermissionsContentReferencesX02be72f1 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookCheckSuiteComf2d7CheckSuiteAppPermissionsContentReferencesX02be72f1() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookCheckSuiteComf2d7CheckSuiteAppPermissionsContentReferencesX02be72f1() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookCheckSuiteComf2d7CheckSuiteAppPermissionsContentReferencesX02be72f1()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookCheckSuiteComf2d7CheckSuiteAppPermissionsContentReferencesX02be72f1 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookCheckSuiteComf2d7CheckSuiteAppPermissionsContentReferencesX02be72f1> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookCheckSuiteComf2d7CheckSuiteAppPermissionsContentReferencesX02be72f1", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookCheckSuiteComf2d7CheckSuiteAppPermissionsContentReferencesX02be72f1 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCheckSuiteComf2d7CheckSuiteAppPermissionsContentReferencesX02be72f1) {
      encoder.encodeString(value.value)
    }
  }
}
