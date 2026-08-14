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
 * The new role to grant to the collaborator. Use `no_access` to remove the collaborator.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1users~1{username}~1copilot-spaces~1{space_number}~1collaborators~1{actor_type}~
 * 1{actor_identifier}/put/requestBody/content/application~1json/schema/properties/role
 */
@Serializable(with = InlineUsersCopilotSpacesCollaboratorsPutRequestJsonRoleXa230d089.Serializer::class)
public sealed class InlineUsersCopilotSpacesCollaboratorsPutRequestJsonRoleXa230d089 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `reader`.
   */
  public data object Reader : InlineUsersCopilotSpacesCollaboratorsPutRequestJsonRoleXa230d089() {
    public override val `value`: String = "reader"
  }

  /**
   * Documented value. Wire value: `writer`.
   */
  public data object Writer : InlineUsersCopilotSpacesCollaboratorsPutRequestJsonRoleXa230d089() {
    public override val `value`: String = "writer"
  }

  /**
   * Documented value. Wire value: `admin`.
   */
  public data object Admin : InlineUsersCopilotSpacesCollaboratorsPutRequestJsonRoleXa230d089() {
    public override val `value`: String = "admin"
  }

  /**
   * Documented value. Wire value: `no_access`.
   */
  public data object NoAccess : InlineUsersCopilotSpacesCollaboratorsPutRequestJsonRoleXa230d089() {
    public override val `value`: String = "no_access"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineUsersCopilotSpacesCollaboratorsPutRequestJsonRoleXa230d089()

  public companion object {
    public fun fromValue(`value`: String): InlineUsersCopilotSpacesCollaboratorsPutRequestJsonRoleXa230d089 = when (value) {
      Reader.value -> Reader
      Writer.value -> Writer
      Admin.value -> Admin
      NoAccess.value -> NoAccess
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineUsersCopilotSpacesCollaboratorsPutRequestJsonRoleXa230d089> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineUsersCopilotSpacesCollaboratorsPutRequestJsonRoleXa230d089", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineUsersCopilotSpacesCollaboratorsPutRequestJsonRoleXa230d089 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineUsersCopilotSpacesCollaboratorsPutRequestJsonRoleXa230d089) {
      encoder.encodeString(value.value)
    }
  }
}
