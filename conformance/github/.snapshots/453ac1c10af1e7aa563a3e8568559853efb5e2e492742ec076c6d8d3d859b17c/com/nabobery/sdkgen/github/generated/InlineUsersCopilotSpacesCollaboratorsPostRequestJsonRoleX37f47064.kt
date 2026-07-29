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
 * The role to grant to the collaborator.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1users~1{username}~1copilot-spaces~1{space_number}~1collaborators/post/requestBo
 * dy/content/application~1json/schema/properties/role
 */
@Serializable(with = InlineUsersCopilotSpacesCollaboratorsPostRequestJsonRoleX37f47064.Serializer::class)
public sealed class InlineUsersCopilotSpacesCollaboratorsPostRequestJsonRoleX37f47064 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `reader`.
   */
  public data object Reader : InlineUsersCopilotSpacesCollaboratorsPostRequestJsonRoleX37f47064() {
    public override val `value`: String = "reader"
  }

  /**
   * Documented value. Wire value: `writer`.
   */
  public data object Writer : InlineUsersCopilotSpacesCollaboratorsPostRequestJsonRoleX37f47064() {
    public override val `value`: String = "writer"
  }

  /**
   * Documented value. Wire value: `admin`.
   */
  public data object Admin : InlineUsersCopilotSpacesCollaboratorsPostRequestJsonRoleX37f47064() {
    public override val `value`: String = "admin"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineUsersCopilotSpacesCollaboratorsPostRequestJsonRoleX37f47064()

  public companion object {
    public fun fromValue(`value`: String): InlineUsersCopilotSpacesCollaboratorsPostRequestJsonRoleX37f47064 = when (value) {
      Reader.value -> Reader
      Writer.value -> Writer
      Admin.value -> Admin
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineUsersCopilotSpacesCollaboratorsPostRequestJsonRoleX37f47064> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineUsersCopilotSpacesCollaboratorsPostRequestJsonRoleX37f47064", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineUsersCopilotSpacesCollaboratorsPostRequestJsonRoleX37f47064 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineUsersCopilotSpacesCollaboratorsPostRequestJsonRoleX37f47064) {
      encoder.encodeString(value.value)
    }
  }
}
