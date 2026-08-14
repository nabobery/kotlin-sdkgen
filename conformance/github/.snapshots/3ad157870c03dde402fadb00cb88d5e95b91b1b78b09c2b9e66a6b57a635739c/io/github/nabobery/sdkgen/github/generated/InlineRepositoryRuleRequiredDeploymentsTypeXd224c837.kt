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
 * sdkgen://source/openapi.yaml#/components/schemas/repository-rule-required-deployments/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-rule-required-deployments/properties/type
 */
@Serializable(with = InlineRepositoryRuleRequiredDeploymentsTypeXd224c837.Serializer::class)
public sealed class InlineRepositoryRuleRequiredDeploymentsTypeXd224c837 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `required_deployments`.
   */
  public data object RequiredDeployments : InlineRepositoryRuleRequiredDeploymentsTypeXd224c837() {
    public override val `value`: String = "required_deployments"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineRepositoryRuleRequiredDeploymentsTypeXd224c837()

  public companion object {
    public fun fromValue(`value`: String): InlineRepositoryRuleRequiredDeploymentsTypeXd224c837 = when (value) {
      RequiredDeployments.value -> RequiredDeployments
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineRepositoryRuleRequiredDeploymentsTypeXd224c837> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineRepositoryRuleRequiredDeploymentsTypeXd224c837", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRepositoryRuleRequiredDeploymentsTypeXd224c837 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryRuleRequiredDeploymentsTypeXd224c837) {
      encoder.encodeString(value.value)
    }
  }
}
