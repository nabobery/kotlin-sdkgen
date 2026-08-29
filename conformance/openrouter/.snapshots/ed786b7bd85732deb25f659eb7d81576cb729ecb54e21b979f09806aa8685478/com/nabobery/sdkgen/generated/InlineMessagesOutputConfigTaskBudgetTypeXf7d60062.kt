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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesOutputConfig/properties/task_budget/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/MessagesOutputConfig/properties/task_budget/properties/type
 */
@Serializable(with = InlineMessagesOutputConfigTaskBudgetTypeXf7d60062.Serializer::class)
public sealed class InlineMessagesOutputConfigTaskBudgetTypeXf7d60062 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `tokens`.
   */
  public data object Tokens : InlineMessagesOutputConfigTaskBudgetTypeXf7d60062() {
    public override val `value`: String = "tokens"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMessagesOutputConfigTaskBudgetTypeXf7d60062()

  public companion object {
    public fun fromValue(`value`: String): InlineMessagesOutputConfigTaskBudgetTypeXf7d60062 = when (value) {
      Tokens.value -> Tokens
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineMessagesOutputConfigTaskBudgetTypeXf7d60062> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineMessagesOutputConfigTaskBudgetTypeXf7d60062", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMessagesOutputConfigTaskBudgetTypeXf7d60062 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMessagesOutputConfigTaskBudgetTypeXf7d60062) {
      encoder.encodeString(value.value)
    }
  }
}
