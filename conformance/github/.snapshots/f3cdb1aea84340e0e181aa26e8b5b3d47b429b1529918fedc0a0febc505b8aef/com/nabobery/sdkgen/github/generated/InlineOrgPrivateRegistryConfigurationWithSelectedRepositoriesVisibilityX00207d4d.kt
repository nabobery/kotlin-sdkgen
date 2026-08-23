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
 * Which type of organization repositories have access to the private registry. `selected` means only the repositories
 * specified by `selected_repository_ids` can access the private registry.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/org-private-registry-configuration-with-selected-repositories/proper
 * ties/visibility
 */
@Serializable(with = InlineOrgPrivateRegistryConfigurationWithSelectedRepositoriesVisibilityX00207d4d.Serializer::class)
public sealed class InlineOrgPrivateRegistryConfigurationWithSelectedRepositoriesVisibilityX00207d4d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineOrgPrivateRegistryConfigurationWithSelectedRepositoriesVisibilityX00207d4d() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `private`.
   */
  public data object Private : InlineOrgPrivateRegistryConfigurationWithSelectedRepositoriesVisibilityX00207d4d() {
    public override val `value`: String = "private"
  }

  /**
   * Documented value. Wire value: `selected`.
   */
  public data object Selected : InlineOrgPrivateRegistryConfigurationWithSelectedRepositoriesVisibilityX00207d4d() {
    public override val `value`: String = "selected"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgPrivateRegistryConfigurationWithSelectedRepositoriesVisibilityX00207d4d()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgPrivateRegistryConfigurationWithSelectedRepositoriesVisibilityX00207d4d = when (value) {
      All.value -> All
      Private.value -> Private
      Selected.value -> Selected
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrgPrivateRegistryConfigurationWithSelectedRepositoriesVisibilityX00207d4d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgPrivateRegistryConfigurationWithSelectedRepositoriesVisibilityX00207d4d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgPrivateRegistryConfigurationWithSelectedRepositoriesVisibilityX00207d4d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgPrivateRegistryConfigurationWithSelectedRepositoriesVisibilityX00207d4d) {
      encoder.encodeString(value.value)
    }
  }
}
