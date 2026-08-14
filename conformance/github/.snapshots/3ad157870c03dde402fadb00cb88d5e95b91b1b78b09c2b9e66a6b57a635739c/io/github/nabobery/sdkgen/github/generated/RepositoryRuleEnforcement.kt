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
 * The enforcement level of the ruleset. `evaluate` allows admins to test rules before enforcing them. Admins can view
 * insights on the Rule Insights page (`evaluate` is only available with GitHub Enterprise).
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-rule-enforcement
 */
@Serializable(with = RepositoryRuleEnforcement.Serializer::class)
public sealed class RepositoryRuleEnforcement {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `disabled`.
   */
  public data object Disabled : RepositoryRuleEnforcement() {
    public override val `value`: String = "disabled"
  }

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : RepositoryRuleEnforcement() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `evaluate`.
   */
  public data object Evaluate : RepositoryRuleEnforcement() {
    public override val `value`: String = "evaluate"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : RepositoryRuleEnforcement()

  public companion object {
    public fun fromValue(`value`: String): RepositoryRuleEnforcement = when (value) {
      Disabled.value -> Disabled
      Active.value -> Active
      Evaluate.value -> Evaluate
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<RepositoryRuleEnforcement> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.RepositoryRuleEnforcement", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): RepositoryRuleEnforcement = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: RepositoryRuleEnforcement) {
      encoder.encodeString(value.value)
    }
  }
}
