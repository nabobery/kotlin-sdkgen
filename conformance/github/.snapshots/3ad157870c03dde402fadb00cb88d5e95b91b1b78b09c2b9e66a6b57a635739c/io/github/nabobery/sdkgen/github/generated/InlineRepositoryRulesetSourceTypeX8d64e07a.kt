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
 * The type of the source of the ruleset
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-ruleset/properties/source_type
 */
@Serializable(with = InlineRepositoryRulesetSourceTypeX8d64e07a.Serializer::class)
public sealed class InlineRepositoryRulesetSourceTypeX8d64e07a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Repository`.
   */
  public data object Repository : InlineRepositoryRulesetSourceTypeX8d64e07a() {
    public override val `value`: String = "Repository"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineRepositoryRulesetSourceTypeX8d64e07a() {
    public override val `value`: String = "Organization"
  }

  /**
   * Documented value. Wire value: `Enterprise`.
   */
  public data object Enterprise : InlineRepositoryRulesetSourceTypeX8d64e07a() {
    public override val `value`: String = "Enterprise"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineRepositoryRulesetSourceTypeX8d64e07a()

  public companion object {
    public fun fromValue(`value`: String): InlineRepositoryRulesetSourceTypeX8d64e07a = when (value) {
      Repository.value -> Repository
      Organization.value -> Organization
      Enterprise.value -> Enterprise
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineRepositoryRulesetSourceTypeX8d64e07a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineRepositoryRulesetSourceTypeX8d64e07a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRepositoryRulesetSourceTypeX8d64e07a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryRulesetSourceTypeX8d64e07a) {
      encoder.encodeString(value.value)
    }
  }
}
