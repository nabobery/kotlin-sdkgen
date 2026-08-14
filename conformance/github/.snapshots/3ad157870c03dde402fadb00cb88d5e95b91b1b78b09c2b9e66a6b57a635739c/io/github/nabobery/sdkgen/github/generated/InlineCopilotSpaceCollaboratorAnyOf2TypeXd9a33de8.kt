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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/copilot-space-collaborator/anyOf/1/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/copilot-space-collaborator/anyOf/1/properties/type
 */
@Serializable(with = InlineCopilotSpaceCollaboratorAnyOf2TypeXd9a33de8.Serializer::class)
public sealed class InlineCopilotSpaceCollaboratorAnyOf2TypeXd9a33de8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Team`.
   */
  public data object Team : InlineCopilotSpaceCollaboratorAnyOf2TypeXd9a33de8() {
    public override val `value`: String = "Team"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCopilotSpaceCollaboratorAnyOf2TypeXd9a33de8()

  public companion object {
    public fun fromValue(`value`: String): InlineCopilotSpaceCollaboratorAnyOf2TypeXd9a33de8 = when (value) {
      Team.value -> Team
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCopilotSpaceCollaboratorAnyOf2TypeXd9a33de8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineCopilotSpaceCollaboratorAnyOf2TypeXd9a33de8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCopilotSpaceCollaboratorAnyOf2TypeXd9a33de8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCopilotSpaceCollaboratorAnyOf2TypeXd9a33de8) {
      encoder.encodeString(value.value)
    }
  }
}
