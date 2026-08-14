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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-installation-new-permissions-accepted/properties/action.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-installation-new-permissions-accepted/properties/action
 */
@Serializable(with = InlineWebhookInstallationNewPermissionsAcceptedActionX829c3f3c.Serializer::class)
public sealed class InlineWebhookInstallationNewPermissionsAcceptedActionX829c3f3c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `new_permissions_accepted`.
   */
  public data object NewPermissionsAccepted : InlineWebhookInstallationNewPermissionsAcceptedActionX829c3f3c() {
    public override val `value`: String = "new_permissions_accepted"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookInstallationNewPermissionsAcceptedActionX829c3f3c()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookInstallationNewPermissionsAcceptedActionX829c3f3c = when (value) {
      NewPermissionsAccepted.value -> NewPermissionsAccepted
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookInstallationNewPermissionsAcceptedActionX829c3f3c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookInstallationNewPermissionsAcceptedActionX829c3f3c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookInstallationNewPermissionsAcceptedActionX829c3f3c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookInstallationNewPermissionsAcceptedActionX829c3f3c) {
      encoder.encodeString(value.value)
    }
  }
}
