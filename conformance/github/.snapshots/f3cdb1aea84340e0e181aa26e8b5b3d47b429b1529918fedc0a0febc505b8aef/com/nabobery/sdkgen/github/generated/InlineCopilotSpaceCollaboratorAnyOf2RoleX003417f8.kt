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
 * The role granted to the collaborator
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/copilot-space-collaborator/anyOf/1/properties/role
 */
@Serializable(with = InlineCopilotSpaceCollaboratorAnyOf2RoleX003417f8.Serializer::class)
public sealed class InlineCopilotSpaceCollaboratorAnyOf2RoleX003417f8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `reader`.
   */
  public data object Reader : InlineCopilotSpaceCollaboratorAnyOf2RoleX003417f8() {
    public override val `value`: String = "reader"
  }

  /**
   * Documented value. Wire value: `writer`.
   */
  public data object Writer : InlineCopilotSpaceCollaboratorAnyOf2RoleX003417f8() {
    public override val `value`: String = "writer"
  }

  /**
   * Documented value. Wire value: `admin`.
   */
  public data object Admin : InlineCopilotSpaceCollaboratorAnyOf2RoleX003417f8() {
    public override val `value`: String = "admin"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCopilotSpaceCollaboratorAnyOf2RoleX003417f8()

  public companion object {
    public fun fromValue(`value`: String): InlineCopilotSpaceCollaboratorAnyOf2RoleX003417f8 = when (value) {
      Reader.value -> Reader
      Writer.value -> Writer
      Admin.value -> Admin
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCopilotSpaceCollaboratorAnyOf2RoleX003417f8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineCopilotSpaceCollaboratorAnyOf2RoleX003417f8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCopilotSpaceCollaboratorAnyOf2RoleX003417f8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCopilotSpaceCollaboratorAnyOf2RoleX003417f8) {
      encoder.encodeString(value.value)
    }
  }
}
