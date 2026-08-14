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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1copilot-spaces~1{space_number}~1collaborators~1{actor_type}~1{acto
 * r_identifier}/put/requestBody/content/application~1json/schema/properties/role
 */
@Serializable(with = InlineOrgsCopilotSpacesCollaboratorsPutRequestJsonRoleX0984186e.Serializer::class)
public sealed class InlineOrgsCopilotSpacesCollaboratorsPutRequestJsonRoleX0984186e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `reader`.
   */
  public data object Reader : InlineOrgsCopilotSpacesCollaboratorsPutRequestJsonRoleX0984186e() {
    public override val `value`: String = "reader"
  }

  /**
   * Documented value. Wire value: `writer`.
   */
  public data object Writer : InlineOrgsCopilotSpacesCollaboratorsPutRequestJsonRoleX0984186e() {
    public override val `value`: String = "writer"
  }

  /**
   * Documented value. Wire value: `admin`.
   */
  public data object Admin : InlineOrgsCopilotSpacesCollaboratorsPutRequestJsonRoleX0984186e() {
    public override val `value`: String = "admin"
  }

  /**
   * Documented value. Wire value: `no_access`.
   */
  public data object NoAccess : InlineOrgsCopilotSpacesCollaboratorsPutRequestJsonRoleX0984186e() {
    public override val `value`: String = "no_access"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsCopilotSpacesCollaboratorsPutRequestJsonRoleX0984186e()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsCopilotSpacesCollaboratorsPutRequestJsonRoleX0984186e = when (value) {
      Reader.value -> Reader
      Writer.value -> Writer
      Admin.value -> Admin
      NoAccess.value -> NoAccess
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrgsCopilotSpacesCollaboratorsPutRequestJsonRoleX0984186e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineOrgsCopilotSpacesCollaboratorsPutRequestJsonRoleX0984186e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsCopilotSpacesCollaboratorsPutRequestJsonRoleX0984186e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCopilotSpacesCollaboratorsPutRequestJsonRoleX0984186e) {
      encoder.encodeString(value.value)
    }
  }
}
