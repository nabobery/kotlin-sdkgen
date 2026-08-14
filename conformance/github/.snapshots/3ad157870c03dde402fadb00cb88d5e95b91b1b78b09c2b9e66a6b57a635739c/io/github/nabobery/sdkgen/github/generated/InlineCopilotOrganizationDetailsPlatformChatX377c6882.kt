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
 * The organization policy for allowing or disallowing Copilot features on GitHub.com.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/copilot-organization-details/properties/platform_chat
 */
@Serializable(with = InlineCopilotOrganizationDetailsPlatformChatX377c6882.Serializer::class)
public sealed class InlineCopilotOrganizationDetailsPlatformChatX377c6882 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `enabled`.
   */
  public data object Enabled : InlineCopilotOrganizationDetailsPlatformChatX377c6882() {
    public override val `value`: String = "enabled"
  }

  /**
   * Documented value. Wire value: `disabled`.
   */
  public data object Disabled : InlineCopilotOrganizationDetailsPlatformChatX377c6882() {
    public override val `value`: String = "disabled"
  }

  /**
   * Documented value. Wire value: `unconfigured`.
   */
  public data object Unconfigured : InlineCopilotOrganizationDetailsPlatformChatX377c6882() {
    public override val `value`: String = "unconfigured"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCopilotOrganizationDetailsPlatformChatX377c6882()

  public companion object {
    public fun fromValue(`value`: String): InlineCopilotOrganizationDetailsPlatformChatX377c6882 = when (value) {
      Enabled.value -> Enabled
      Disabled.value -> Disabled
      Unconfigured.value -> Unconfigured
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCopilotOrganizationDetailsPlatformChatX377c6882> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineCopilotOrganizationDetailsPlatformChatX377c6882", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCopilotOrganizationDetailsPlatformChatX377c6882 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCopilotOrganizationDetailsPlatformChatX377c6882) {
      encoder.encodeString(value.value)
    }
  }
}
