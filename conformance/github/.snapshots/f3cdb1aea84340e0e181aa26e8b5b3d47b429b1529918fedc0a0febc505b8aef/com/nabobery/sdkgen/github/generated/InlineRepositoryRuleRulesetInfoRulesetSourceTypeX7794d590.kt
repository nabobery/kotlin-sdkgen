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
 * The type of source for the ruleset that includes this rule.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-rule-ruleset-info/properties/ruleset_source_type
 */
@Serializable(with = InlineRepositoryRuleRulesetInfoRulesetSourceTypeX7794d590.Serializer::class)
public sealed class InlineRepositoryRuleRulesetInfoRulesetSourceTypeX7794d590 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Repository`.
   */
  public data object Repository : InlineRepositoryRuleRulesetInfoRulesetSourceTypeX7794d590() {
    public override val `value`: String = "Repository"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineRepositoryRuleRulesetInfoRulesetSourceTypeX7794d590() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineRepositoryRuleRulesetInfoRulesetSourceTypeX7794d590()

  public companion object {
    public fun fromValue(`value`: String): InlineRepositoryRuleRulesetInfoRulesetSourceTypeX7794d590 = when (value) {
      Repository.value -> Repository
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineRepositoryRuleRulesetInfoRulesetSourceTypeX7794d590> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineRepositoryRuleRulesetInfoRulesetSourceTypeX7794d590", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRepositoryRuleRulesetInfoRulesetSourceTypeX7794d590 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryRuleRulesetInfoRulesetSourceTypeX7794d590) {
      encoder.encodeString(value.value)
    }
  }
}
