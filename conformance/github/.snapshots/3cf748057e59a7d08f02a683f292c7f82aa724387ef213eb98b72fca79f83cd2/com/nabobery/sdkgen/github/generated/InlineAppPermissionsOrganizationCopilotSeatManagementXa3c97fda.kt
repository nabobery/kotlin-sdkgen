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
 * The level of permission to grant the access token for managing access to GitHub Copilot for members of an
 * organization with a Copilot Business subscription. This property is in public preview and is subject to change.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/app-permissions/properties/organization_copilot_seat_management
 */
@Serializable(with = InlineAppPermissionsOrganizationCopilotSeatManagementXa3c97fda.Serializer::class)
public sealed class InlineAppPermissionsOrganizationCopilotSeatManagementXa3c97fda {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineAppPermissionsOrganizationCopilotSeatManagementXa3c97fda() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineAppPermissionsOrganizationCopilotSeatManagementXa3c97fda() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAppPermissionsOrganizationCopilotSeatManagementXa3c97fda()

  public companion object {
    public fun fromValue(`value`: String): InlineAppPermissionsOrganizationCopilotSeatManagementXa3c97fda = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineAppPermissionsOrganizationCopilotSeatManagementXa3c97fda> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineAppPermissionsOrganizationCopilotSeatManagementXa3c97fda", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAppPermissionsOrganizationCopilotSeatManagementXa3c97fda = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAppPermissionsOrganizationCopilotSeatManagementXa3c97fda) {
      encoder.encodeString(value.value)
    }
  }
}
