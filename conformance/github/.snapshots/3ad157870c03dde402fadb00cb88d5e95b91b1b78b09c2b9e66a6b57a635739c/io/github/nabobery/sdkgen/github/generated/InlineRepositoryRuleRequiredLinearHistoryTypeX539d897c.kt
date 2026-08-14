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
 * sdkgen://source/openapi.yaml#/components/schemas/repository-rule-required-linear-history/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-rule-required-linear-history/properties/type
 */
@Serializable(with = InlineRepositoryRuleRequiredLinearHistoryTypeX539d897c.Serializer::class)
public sealed class InlineRepositoryRuleRequiredLinearHistoryTypeX539d897c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `required_linear_history`.
   */
  public data object RequiredLinearHistory : InlineRepositoryRuleRequiredLinearHistoryTypeX539d897c() {
    public override val `value`: String = "required_linear_history"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineRepositoryRuleRequiredLinearHistoryTypeX539d897c()

  public companion object {
    public fun fromValue(`value`: String): InlineRepositoryRuleRequiredLinearHistoryTypeX539d897c = when (value) {
      RequiredLinearHistory.value -> RequiredLinearHistory
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineRepositoryRuleRequiredLinearHistoryTypeX539d897c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineRepositoryRuleRequiredLinearHistoryTypeX539d897c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRepositoryRuleRequiredLinearHistoryTypeX539d897c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryRuleRequiredLinearHistoryTypeX539d897c) {
      encoder.encodeString(value.value)
    }
  }
}
