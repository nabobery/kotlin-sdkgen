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
 * The result of the rule evaluations for rules with the `active` enforcement status.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/rule-suites/items/properties/result
 */
@Serializable(with = InlineRuleSuitesItemResultX08d7aec8.Serializer::class)
public sealed class InlineRuleSuitesItemResultX08d7aec8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `pass`.
   */
  public data object Pass : InlineRuleSuitesItemResultX08d7aec8() {
    public override val `value`: String = "pass"
  }

  /**
   * Documented value. Wire value: `fail`.
   */
  public data object Fail : InlineRuleSuitesItemResultX08d7aec8() {
    public override val `value`: String = "fail"
  }

  /**
   * Documented value. Wire value: `bypass`.
   */
  public data object Bypass : InlineRuleSuitesItemResultX08d7aec8() {
    public override val `value`: String = "bypass"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineRuleSuitesItemResultX08d7aec8()

  public companion object {
    public fun fromValue(`value`: String): InlineRuleSuitesItemResultX08d7aec8 = when (value) {
      Pass.value -> Pass
      Fail.value -> Fail
      Bypass.value -> Bypass
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineRuleSuitesItemResultX08d7aec8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineRuleSuitesItemResultX08d7aec8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRuleSuitesItemResultX08d7aec8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRuleSuitesItemResultX08d7aec8) {
      encoder.encodeString(value.value)
    }
  }
}
