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
 * The role to grant to the collaborator.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1copilot-spaces~1{space_number}~1collaborators/post/requestBody/con
 * tent/application~1json/schema/properties/role
 */
@Serializable(with = InlineOrgsCopilotSpacesCollaboratorsPostRequestJsonRoleXc1698a11.Serializer::class)
public sealed class InlineOrgsCopilotSpacesCollaboratorsPostRequestJsonRoleXc1698a11 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `reader`.
   */
  public data object Reader : InlineOrgsCopilotSpacesCollaboratorsPostRequestJsonRoleXc1698a11() {
    public override val `value`: String = "reader"
  }

  /**
   * Documented value. Wire value: `writer`.
   */
  public data object Writer : InlineOrgsCopilotSpacesCollaboratorsPostRequestJsonRoleXc1698a11() {
    public override val `value`: String = "writer"
  }

  /**
   * Documented value. Wire value: `admin`.
   */
  public data object Admin : InlineOrgsCopilotSpacesCollaboratorsPostRequestJsonRoleXc1698a11() {
    public override val `value`: String = "admin"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsCopilotSpacesCollaboratorsPostRequestJsonRoleXc1698a11()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsCopilotSpacesCollaboratorsPostRequestJsonRoleXc1698a11 = when (value) {
      Reader.value -> Reader
      Writer.value -> Writer
      Admin.value -> Admin
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrgsCopilotSpacesCollaboratorsPostRequestJsonRoleXc1698a11> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineOrgsCopilotSpacesCollaboratorsPostRequestJsonRoleXc1698a11", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsCopilotSpacesCollaboratorsPostRequestJsonRoleXc1698a11 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCopilotSpacesCollaboratorsPostRequestJsonRoleXc1698a11) {
      encoder.encodeString(value.value)
    }
  }
}
