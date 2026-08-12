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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-check-suite-rerequested/properties/check_suite/properties/ap
 * p/properties/permissions/properties/keys.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-check-suite-rerequested/properties/check_suite/properties/ap
 * p/properties/permissions/properties/keys
 */
@Serializable(with = InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsKeysX07de116f.Serializer::class)
public sealed class InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsKeysX07de116f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsKeysX07de116f() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsKeysX07de116f() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsKeysX07de116f()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsKeysX07de116f = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsKeysX07de116f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsKeysX07de116f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsKeysX07de116f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsKeysX07de116f) {
      encoder.encodeString(value.value)
    }
  }
}
