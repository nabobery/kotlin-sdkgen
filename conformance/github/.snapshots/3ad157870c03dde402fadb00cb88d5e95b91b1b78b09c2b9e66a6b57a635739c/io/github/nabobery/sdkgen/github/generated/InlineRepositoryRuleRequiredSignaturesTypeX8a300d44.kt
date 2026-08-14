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
 * sdkgen://source/openapi.yaml#/components/schemas/repository-rule-required-signatures/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-rule-required-signatures/properties/type
 */
@Serializable(with = InlineRepositoryRuleRequiredSignaturesTypeX8a300d44.Serializer::class)
public sealed class InlineRepositoryRuleRequiredSignaturesTypeX8a300d44 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `required_signatures`.
   */
  public data object RequiredSignatures : InlineRepositoryRuleRequiredSignaturesTypeX8a300d44() {
    public override val `value`: String = "required_signatures"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineRepositoryRuleRequiredSignaturesTypeX8a300d44()

  public companion object {
    public fun fromValue(`value`: String): InlineRepositoryRuleRequiredSignaturesTypeX8a300d44 = when (value) {
      RequiredSignatures.value -> RequiredSignatures
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineRepositoryRuleRequiredSignaturesTypeX8a300d44> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineRepositoryRuleRequiredSignaturesTypeX8a300d44", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRepositoryRuleRequiredSignaturesTypeX8a300d44 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryRuleRequiredSignaturesTypeX8a300d44) {
      encoder.encodeString(value.value)
    }
  }
}
