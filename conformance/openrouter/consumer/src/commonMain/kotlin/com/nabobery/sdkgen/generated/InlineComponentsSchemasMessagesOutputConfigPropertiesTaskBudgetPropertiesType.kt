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
 */
@Serializable(with = InlineComponentsSchemasMessagesOutputConfigPropertiesTaskBudgetPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasMessagesOutputConfigPropertiesTaskBudgetPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `tokens`.
   */
  public data object Tokens : InlineComponentsSchemasMessagesOutputConfigPropertiesTaskBudgetPropertiesType() {
    public override val `value`: String = "tokens"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasMessagesOutputConfigPropertiesTaskBudgetPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasMessagesOutputConfigPropertiesTaskBudgetPropertiesType = when (value) {
      Tokens.value -> Tokens
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMessagesOutputConfigPropertiesTaskBudgetPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasMessagesOutputConfigPropertiesTaskBudgetPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMessagesOutputConfigPropertiesTaskBudgetPropertiesType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasMessagesOutputConfigPropertiesTaskBudgetPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
