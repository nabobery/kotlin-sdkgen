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
 * Which message roles to scan for prompt injection. Only applies to the regex-prompt-injection builtin. Defaults to
 * all_messages.
 */
@Serializable(with = PromptInjectionScanScope.Serializer::class)
public sealed class PromptInjectionScanScope {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `user_only`.
   */
  public data object UserOnly : PromptInjectionScanScope() {
    public override val `value`: String = "user_only"
  }

  /**
   * Documented value. Wire value: `all_messages`.
   */
  public data object AllMessages : PromptInjectionScanScope() {
    public override val `value`: String = "all_messages"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : PromptInjectionScanScope()

  public companion object {
    public fun fromValue(`value`: String): PromptInjectionScanScope = when (value) {
      UserOnly.value -> UserOnly
      AllMessages.value -> AllMessages
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<PromptInjectionScanScope> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.PromptInjectionScanScope", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): PromptInjectionScanScope = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: PromptInjectionScanScope) {
      encoder.encodeString(value.value)
    }
  }
}
