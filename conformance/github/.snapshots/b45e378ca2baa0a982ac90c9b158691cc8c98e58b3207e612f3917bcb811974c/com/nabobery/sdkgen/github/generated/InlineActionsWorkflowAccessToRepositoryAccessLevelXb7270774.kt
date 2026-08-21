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
 * Defines the level of access that workflows outside of the repository have to actions and reusable workflows within
 * the
 * repository.
 *
 * `none` means the access is only possible from workflows in this repository. `user` level access allows sharing across
 * user owned private repositories only. `organization` level access allows sharing across the organization.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/actions-workflow-access-to-repository/properties/access_level
 */
@Serializable(with = InlineActionsWorkflowAccessToRepositoryAccessLevelXb7270774.Serializer::class)
public sealed class InlineActionsWorkflowAccessToRepositoryAccessLevelXb7270774 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineActionsWorkflowAccessToRepositoryAccessLevelXb7270774() {
    public override val `value`: String = "none"
  }

  /**
   * Documented value. Wire value: `user`.
   */
  public data object User : InlineActionsWorkflowAccessToRepositoryAccessLevelXb7270774() {
    public override val `value`: String = "user"
  }

  /**
   * Documented value. Wire value: `organization`.
   */
  public data object Organization : InlineActionsWorkflowAccessToRepositoryAccessLevelXb7270774() {
    public override val `value`: String = "organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineActionsWorkflowAccessToRepositoryAccessLevelXb7270774()

  public companion object {
    public fun fromValue(`value`: String): InlineActionsWorkflowAccessToRepositoryAccessLevelXb7270774 = when (value) {
      None.value -> None
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineActionsWorkflowAccessToRepositoryAccessLevelXb7270774> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineActionsWorkflowAccessToRepositoryAccessLevelXb7270774", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineActionsWorkflowAccessToRepositoryAccessLevelXb7270774 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineActionsWorkflowAccessToRepositoryAccessLevelXb7270774) {
      encoder.encodeString(value.value)
    }
  }
}
