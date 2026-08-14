package io.github.nabobery.sdkgen.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ChatAssistantMessage/properties/role.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatAssistantMessage/properties/role
 */
@Serializable(with = InlineChatAssistantMessageRoleX885f4543.Serializer::class)
public sealed class InlineChatAssistantMessageRoleX885f4543 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `assistant`.
   */
  public data object Assistant : InlineChatAssistantMessageRoleX885f4543() {
    public override val `value`: String = "assistant"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineChatAssistantMessageRoleX885f4543()

  public companion object {
    public fun fromValue(`value`: String): InlineChatAssistantMessageRoleX885f4543 = when (value) {
      Assistant.value -> Assistant
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineChatAssistantMessageRoleX885f4543> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineChatAssistantMessageRoleX885f4543", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineChatAssistantMessageRoleX885f4543 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineChatAssistantMessageRoleX885f4543) {
      encoder.encodeString(value.value)
    }
  }
}
