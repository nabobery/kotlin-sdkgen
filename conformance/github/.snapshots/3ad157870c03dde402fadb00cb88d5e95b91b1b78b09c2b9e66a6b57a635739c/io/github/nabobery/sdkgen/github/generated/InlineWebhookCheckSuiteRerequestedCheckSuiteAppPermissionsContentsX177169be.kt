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
 * p/properties/permissions/properties/contents.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-check-suite-rerequested/properties/check_suite/properties/ap
 * p/properties/permissions/properties/contents
 */
@Serializable(with = InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsContentsX177169be.Serializer::class)
public sealed class InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsContentsX177169be {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsContentsX177169be() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsContentsX177169be() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsContentsX177169be()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsContentsX177169be = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsContentsX177169be> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsContentsX177169be", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsContentsX177169be = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsContentsX177169be) {
      encoder.encodeString(value.value)
    }
  }
}
