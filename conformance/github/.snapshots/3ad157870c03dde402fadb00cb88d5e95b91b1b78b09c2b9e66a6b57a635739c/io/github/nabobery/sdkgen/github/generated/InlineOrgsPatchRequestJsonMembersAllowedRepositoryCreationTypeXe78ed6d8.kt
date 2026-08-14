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
 * Specifies which types of repositories non-admin organization members can create. `private` is only available to
 * repositories that are part of an organization on GitHub Enterprise Cloud.
 * **Note:** This parameter is closing down and will be removed in the future. Its return value ignores internal
 * repositories. Using this parameter overrides values set in `members_can_create_repositories`. See the parameter
 * deprecation notice in the operation description for details.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}/patch/requestBody/content/application~1json/schema/properties/membe
 * rs_allowed_repository_creation_type
 */
@Serializable(with = InlineOrgsPatchRequestJsonMembersAllowedRepositoryCreationTypeXe78ed6d8.Serializer::class)
public sealed class InlineOrgsPatchRequestJsonMembersAllowedRepositoryCreationTypeXe78ed6d8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineOrgsPatchRequestJsonMembersAllowedRepositoryCreationTypeXe78ed6d8() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `private`.
   */
  public data object Private : InlineOrgsPatchRequestJsonMembersAllowedRepositoryCreationTypeXe78ed6d8() {
    public override val `value`: String = "private"
  }

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineOrgsPatchRequestJsonMembersAllowedRepositoryCreationTypeXe78ed6d8() {
    public override val `value`: String = "none"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsPatchRequestJsonMembersAllowedRepositoryCreationTypeXe78ed6d8()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsPatchRequestJsonMembersAllowedRepositoryCreationTypeXe78ed6d8 = when (value) {
      All.value -> All
      Private.value -> Private
      None.value -> None
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrgsPatchRequestJsonMembersAllowedRepositoryCreationTypeXe78ed6d8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineOrgsPatchRequestJsonMembersAllowedRepositoryCreationTypeXe78ed6d8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsPatchRequestJsonMembersAllowedRepositoryCreationTypeXe78ed6d8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsPatchRequestJsonMembersAllowedRepositoryCreationTypeXe78ed6d8) {
      encoder.encodeString(value.value)
    }
  }
}
