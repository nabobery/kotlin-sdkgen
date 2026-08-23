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
 * The source of the repository property. Defaults to 'custom' if not specified.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/repository-ruleset-conditions-repository-property-spec/properties/so
 * urce
 */
@Serializable(with = InlineRepositoryRulesetConditionsRepositoryPropertySpecSourceX2adce340.Serializer::class)
public sealed class InlineRepositoryRulesetConditionsRepositoryPropertySpecSourceX2adce340 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `custom`.
   */
  public data object Custom : InlineRepositoryRulesetConditionsRepositoryPropertySpecSourceX2adce340() {
    public override val `value`: String = "custom"
  }

  /**
   * Documented value. Wire value: `system`.
   */
  public data object System : InlineRepositoryRulesetConditionsRepositoryPropertySpecSourceX2adce340() {
    public override val `value`: String = "system"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineRepositoryRulesetConditionsRepositoryPropertySpecSourceX2adce340()

  public companion object {
    public fun fromValue(`value`: String): InlineRepositoryRulesetConditionsRepositoryPropertySpecSourceX2adce340 = when (value) {
      Custom.value -> Custom
      System.value -> System
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineRepositoryRulesetConditionsRepositoryPropertySpecSourceX2adce340> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineRepositoryRulesetConditionsRepositoryPropertySpecSourceX2adce340", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRepositoryRulesetConditionsRepositoryPropertySpecSourceX2adce340 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryRulesetConditionsRepositoryPropertySpecSourceX2adce340) {
      encoder.encodeString(value.value)
    }
  }
}
