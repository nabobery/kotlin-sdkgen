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
 * The role granted to the collaborator
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/copilot-space-collaborator/anyOf/0/allOf/1/properties/role
 */
@Serializable(with = InlineCopilotSpaceCollaboratorAnyOf1AllOf2RoleXcf063803.Serializer::class)
public sealed class InlineCopilotSpaceCollaboratorAnyOf1AllOf2RoleXcf063803 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `reader`.
   */
  public data object Reader : InlineCopilotSpaceCollaboratorAnyOf1AllOf2RoleXcf063803() {
    public override val `value`: String = "reader"
  }

  /**
   * Documented value. Wire value: `writer`.
   */
  public data object Writer : InlineCopilotSpaceCollaboratorAnyOf1AllOf2RoleXcf063803() {
    public override val `value`: String = "writer"
  }

  /**
   * Documented value. Wire value: `admin`.
   */
  public data object Admin : InlineCopilotSpaceCollaboratorAnyOf1AllOf2RoleXcf063803() {
    public override val `value`: String = "admin"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCopilotSpaceCollaboratorAnyOf1AllOf2RoleXcf063803()

  public companion object {
    public fun fromValue(`value`: String): InlineCopilotSpaceCollaboratorAnyOf1AllOf2RoleXcf063803 = when (value) {
      Reader.value -> Reader
      Writer.value -> Writer
      Admin.value -> Admin
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCopilotSpaceCollaboratorAnyOf1AllOf2RoleXcf063803> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineCopilotSpaceCollaboratorAnyOf1AllOf2RoleXcf063803", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCopilotSpaceCollaboratorAnyOf1AllOf2RoleXcf063803 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCopilotSpaceCollaboratorAnyOf1AllOf2RoleXcf063803) {
      encoder.encodeString(value.value)
    }
  }
}
