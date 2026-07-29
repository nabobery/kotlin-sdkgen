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
 * Which type of organization repositories have access to the private registry.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/org-private-registry-configuration/properties/visibility
 */
@Serializable(with = InlineOrgPrivateRegistryConfigurationVisibilityX5e00651e.Serializer::class)
public sealed class InlineOrgPrivateRegistryConfigurationVisibilityX5e00651e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineOrgPrivateRegistryConfigurationVisibilityX5e00651e() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `private`.
   */
  public data object Private : InlineOrgPrivateRegistryConfigurationVisibilityX5e00651e() {
    public override val `value`: String = "private"
  }

  /**
   * Documented value. Wire value: `selected`.
   */
  public data object Selected : InlineOrgPrivateRegistryConfigurationVisibilityX5e00651e() {
    public override val `value`: String = "selected"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgPrivateRegistryConfigurationVisibilityX5e00651e()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgPrivateRegistryConfigurationVisibilityX5e00651e = when (value) {
      All.value -> All
      Private.value -> Private
      Selected.value -> Selected
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineOrgPrivateRegistryConfigurationVisibilityX5e00651e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgPrivateRegistryConfigurationVisibilityX5e00651e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgPrivateRegistryConfigurationVisibilityX5e00651e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgPrivateRegistryConfigurationVisibilityX5e00651e) {
      encoder.encodeString(value.value)
    }
  }
}
