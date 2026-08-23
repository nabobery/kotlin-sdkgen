package com.nabobery.sdkgen.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/BaseMessagesResult/properties/role.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/BaseMessagesResult/properties/role
 */
@Serializable(with = InlineBaseMessagesResultRoleXcc22a0f6.Serializer::class)
public sealed class InlineBaseMessagesResultRoleXcc22a0f6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `assistant`.
   */
  public data object Assistant : InlineBaseMessagesResultRoleXcc22a0f6() {
    public override val `value`: String = "assistant"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineBaseMessagesResultRoleXcc22a0f6()

  public companion object {
    public fun fromValue(`value`: String): InlineBaseMessagesResultRoleXcc22a0f6 = when (value) {
      Assistant.value -> Assistant
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineBaseMessagesResultRoleXcc22a0f6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineBaseMessagesResultRoleXcc22a0f6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineBaseMessagesResultRoleXcc22a0f6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineBaseMessagesResultRoleXcc22a0f6) {
      encoder.encodeString(value.value)
    }
  }
}
