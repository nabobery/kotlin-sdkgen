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
 * sdkgen://source/openapi.yaml#/components/parameters/dependabot-alert-org-scope-comma-separated-has/schema/oneOf/1/ite
 * ms.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/parameters/dependabot-alert-org-scope-comma-separated-has/schema/oneOf/1/ite
 * ms
 */
@Serializable(with = InlineDependabotAlertOrgScopeCommaSeparatedHasParameterOneOf2ItemX0a0f2a87.Serializer::class)
public sealed class InlineDependabotAlertOrgScopeCommaSeparatedHasParameterOneOf2ItemX0a0f2a87 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `patch`.
   */
  public data object Patch : InlineDependabotAlertOrgScopeCommaSeparatedHasParameterOneOf2ItemX0a0f2a87() {
    public override val `value`: String = "patch"
  }

  /**
   * Documented value. Wire value: `deployment`.
   */
  public data object Deployment : InlineDependabotAlertOrgScopeCommaSeparatedHasParameterOneOf2ItemX0a0f2a87() {
    public override val `value`: String = "deployment"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineDependabotAlertOrgScopeCommaSeparatedHasParameterOneOf2ItemX0a0f2a87()

  public companion object {
    public fun fromValue(`value`: String): InlineDependabotAlertOrgScopeCommaSeparatedHasParameterOneOf2ItemX0a0f2a87 = when (value) {
      Patch.value -> Patch
      Deployment.value -> Deployment
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineDependabotAlertOrgScopeCommaSeparatedHasParameterOneOf2ItemX0a0f2a87> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineDependabotAlertOrgScopeCommaSeparatedHasParameterOneOf2ItemX0a0f2a87", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineDependabotAlertOrgScopeCommaSeparatedHasParameterOneOf2ItemX0a0f2a87 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineDependabotAlertOrgScopeCommaSeparatedHasParameterOneOf2ItemX0a0f2a87) {
      encoder.encodeString(value.value)
    }
  }
}
