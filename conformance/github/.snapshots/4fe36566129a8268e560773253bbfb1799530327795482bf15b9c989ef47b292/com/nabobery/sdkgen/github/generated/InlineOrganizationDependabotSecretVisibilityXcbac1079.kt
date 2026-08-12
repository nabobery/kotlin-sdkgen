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
 * Visibility of a secret
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/organization-dependabot-secret/properties/visibility
 */
@Serializable(with = InlineOrganizationDependabotSecretVisibilityXcbac1079.Serializer::class)
public sealed class InlineOrganizationDependabotSecretVisibilityXcbac1079 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineOrganizationDependabotSecretVisibilityXcbac1079() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `private`.
   */
  public data object Private : InlineOrganizationDependabotSecretVisibilityXcbac1079() {
    public override val `value`: String = "private"
  }

  /**
   * Documented value. Wire value: `selected`.
   */
  public data object Selected : InlineOrganizationDependabotSecretVisibilityXcbac1079() {
    public override val `value`: String = "selected"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrganizationDependabotSecretVisibilityXcbac1079()

  public companion object {
    public fun fromValue(`value`: String): InlineOrganizationDependabotSecretVisibilityXcbac1079 = when (value) {
      All.value -> All
      Private.value -> Private
      Selected.value -> Selected
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrganizationDependabotSecretVisibilityXcbac1079> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrganizationDependabotSecretVisibilityXcbac1079", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrganizationDependabotSecretVisibilityXcbac1079 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrganizationDependabotSecretVisibilityXcbac1079) {
      encoder.encodeString(value.value)
    }
  }
}
