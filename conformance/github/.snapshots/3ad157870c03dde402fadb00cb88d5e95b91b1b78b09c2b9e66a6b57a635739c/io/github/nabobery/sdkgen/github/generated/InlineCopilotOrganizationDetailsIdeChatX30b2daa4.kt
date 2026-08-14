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
 * The organization policy for allowing or disallowing Copilot Chat in the IDE.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/copilot-organization-details/properties/ide_chat
 */
@Serializable(with = InlineCopilotOrganizationDetailsIdeChatX30b2daa4.Serializer::class)
public sealed class InlineCopilotOrganizationDetailsIdeChatX30b2daa4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `enabled`.
   */
  public data object Enabled : InlineCopilotOrganizationDetailsIdeChatX30b2daa4() {
    public override val `value`: String = "enabled"
  }

  /**
   * Documented value. Wire value: `disabled`.
   */
  public data object Disabled : InlineCopilotOrganizationDetailsIdeChatX30b2daa4() {
    public override val `value`: String = "disabled"
  }

  /**
   * Documented value. Wire value: `unconfigured`.
   */
  public data object Unconfigured : InlineCopilotOrganizationDetailsIdeChatX30b2daa4() {
    public override val `value`: String = "unconfigured"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCopilotOrganizationDetailsIdeChatX30b2daa4()

  public companion object {
    public fun fromValue(`value`: String): InlineCopilotOrganizationDetailsIdeChatX30b2daa4 = when (value) {
      Enabled.value -> Enabled
      Disabled.value -> Disabled
      Unconfigured.value -> Unconfigured
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCopilotOrganizationDetailsIdeChatX30b2daa4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineCopilotOrganizationDetailsIdeChatX30b2daa4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCopilotOrganizationDetailsIdeChatX30b2daa4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCopilotOrganizationDetailsIdeChatX30b2daa4) {
      encoder.encodeString(value.value)
    }
  }
}
