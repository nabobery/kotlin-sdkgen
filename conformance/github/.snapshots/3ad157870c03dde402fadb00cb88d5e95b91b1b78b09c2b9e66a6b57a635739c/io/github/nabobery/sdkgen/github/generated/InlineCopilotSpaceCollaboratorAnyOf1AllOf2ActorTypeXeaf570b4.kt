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
 * The collaborator actor type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/copilot-space-collaborator/anyOf/0/allOf/1/properties/actor_type
 */
@Serializable(with = InlineCopilotSpaceCollaboratorAnyOf1AllOf2ActorTypeXeaf570b4.Serializer::class)
public sealed class InlineCopilotSpaceCollaboratorAnyOf1AllOf2ActorTypeXeaf570b4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineCopilotSpaceCollaboratorAnyOf1AllOf2ActorTypeXeaf570b4() {
    public override val `value`: String = "User"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCopilotSpaceCollaboratorAnyOf1AllOf2ActorTypeXeaf570b4()

  public companion object {
    public fun fromValue(`value`: String): InlineCopilotSpaceCollaboratorAnyOf1AllOf2ActorTypeXeaf570b4 = when (value) {
      User.value -> User
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCopilotSpaceCollaboratorAnyOf1AllOf2ActorTypeXeaf570b4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineCopilotSpaceCollaboratorAnyOf1AllOf2ActorTypeXeaf570b4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCopilotSpaceCollaboratorAnyOf1AllOf2ActorTypeXeaf570b4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCopilotSpaceCollaboratorAnyOf1AllOf2ActorTypeXeaf570b4) {
      encoder.encodeString(value.value)
    }
  }
}
