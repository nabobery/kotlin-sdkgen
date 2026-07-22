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
 * The level of permission to grant the access token to view and manage Copilot cloud agent settings for an
 * organization.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/app-permissions/properties/organization_copilot_agent_settings
 */
@Serializable(with = InlineAppPermissionsOrganizationCopilotAgentSettingsX4599f49a.Serializer::class)
public sealed class InlineAppPermissionsOrganizationCopilotAgentSettingsX4599f49a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineAppPermissionsOrganizationCopilotAgentSettingsX4599f49a() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineAppPermissionsOrganizationCopilotAgentSettingsX4599f49a() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAppPermissionsOrganizationCopilotAgentSettingsX4599f49a()

  public companion object {
    public fun fromValue(`value`: String): InlineAppPermissionsOrganizationCopilotAgentSettingsX4599f49a = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineAppPermissionsOrganizationCopilotAgentSettingsX4599f49a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineAppPermissionsOrganizationCopilotAgentSettingsX4599f49a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAppPermissionsOrganizationCopilotAgentSettingsX4599f49a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAppPermissionsOrganizationCopilotAgentSettingsX4599f49a) {
      encoder.encodeString(value.value)
    }
  }
}
