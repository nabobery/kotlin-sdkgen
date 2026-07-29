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
 * Which users can access codespaces in the organization. `disabled` means that no users can access codespaces in the
 * organization.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1codespaces~1access/put/requestBody/content/application~1json/schem
 * a/properties/visibility
 */
@Serializable(with = InlineOrgsCodespacesAccessPutRequestJsonVisibilityX0cce40ed.Serializer::class)
public sealed class InlineOrgsCodespacesAccessPutRequestJsonVisibilityX0cce40ed {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `disabled`.
   */
  public data object Disabled : InlineOrgsCodespacesAccessPutRequestJsonVisibilityX0cce40ed() {
    public override val `value`: String = "disabled"
  }

  /**
   * Documented value. Wire value: `selected_members`.
   */
  public data object SelectedMembers : InlineOrgsCodespacesAccessPutRequestJsonVisibilityX0cce40ed() {
    public override val `value`: String = "selected_members"
  }

  /**
   * Documented value. Wire value: `all_members`.
   */
  public data object AllMembers : InlineOrgsCodespacesAccessPutRequestJsonVisibilityX0cce40ed() {
    public override val `value`: String = "all_members"
  }

  /**
   * Documented value. Wire value: `all_members_and_outside_collaborators`.
   */
  public data object AllMembersAndOutsideCollaborators : InlineOrgsCodespacesAccessPutRequestJsonVisibilityX0cce40ed() {
    public override val `value`: String = "all_members_and_outside_collaborators"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsCodespacesAccessPutRequestJsonVisibilityX0cce40ed()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsCodespacesAccessPutRequestJsonVisibilityX0cce40ed = when (value) {
      Disabled.value -> Disabled
      SelectedMembers.value -> SelectedMembers
      AllMembers.value -> AllMembers
      AllMembersAndOutsideCollaborators.value -> AllMembersAndOutsideCollaborators
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineOrgsCodespacesAccessPutRequestJsonVisibilityX0cce40ed> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgsCodespacesAccessPutRequestJsonVisibilityX0cce40ed", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsCodespacesAccessPutRequestJsonVisibilityX0cce40ed = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCodespacesAccessPutRequestJsonVisibilityX0cce40ed) {
      encoder.encodeString(value.value)
    }
  }
}
