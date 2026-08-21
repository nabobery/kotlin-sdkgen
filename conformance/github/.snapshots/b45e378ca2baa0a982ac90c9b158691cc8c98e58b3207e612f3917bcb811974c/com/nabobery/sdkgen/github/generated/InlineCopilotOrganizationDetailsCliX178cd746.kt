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
 * The organization policy for allowing or disallowing Copilot CLI.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/copilot-organization-details/properties/cli
 */
@Serializable(with = InlineCopilotOrganizationDetailsCliX178cd746.Serializer::class)
public sealed class InlineCopilotOrganizationDetailsCliX178cd746 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `enabled`.
   */
  public data object Enabled : InlineCopilotOrganizationDetailsCliX178cd746() {
    public override val `value`: String = "enabled"
  }

  /**
   * Documented value. Wire value: `disabled`.
   */
  public data object Disabled : InlineCopilotOrganizationDetailsCliX178cd746() {
    public override val `value`: String = "disabled"
  }

  /**
   * Documented value. Wire value: `unconfigured`.
   */
  public data object Unconfigured : InlineCopilotOrganizationDetailsCliX178cd746() {
    public override val `value`: String = "unconfigured"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCopilotOrganizationDetailsCliX178cd746()

  public companion object {
    public fun fromValue(`value`: String): InlineCopilotOrganizationDetailsCliX178cd746 = when (value) {
      Enabled.value -> Enabled
      Disabled.value -> Disabled
      Unconfigured.value -> Unconfigured
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCopilotOrganizationDetailsCliX178cd746> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineCopilotOrganizationDetailsCliX178cd746", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCopilotOrganizationDetailsCliX178cd746 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCopilotOrganizationDetailsCliX178cd746) {
      encoder.encodeString(value.value)
    }
  }
}
