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
 * sdkgen://source/openapi.yaml#/components/schemas/repository-rule-required-status-checks/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-rule-required-status-checks/properties/type
 */
@Serializable(with = InlineRepositoryRuleRequiredStatusChecksTypeX789a4b9d.Serializer::class)
public sealed class InlineRepositoryRuleRequiredStatusChecksTypeX789a4b9d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `required_status_checks`.
   */
  public data object RequiredStatusChecks : InlineRepositoryRuleRequiredStatusChecksTypeX789a4b9d() {
    public override val `value`: String = "required_status_checks"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineRepositoryRuleRequiredStatusChecksTypeX789a4b9d()

  public companion object {
    public fun fromValue(`value`: String): InlineRepositoryRuleRequiredStatusChecksTypeX789a4b9d = when (value) {
      RequiredStatusChecks.value -> RequiredStatusChecks
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineRepositoryRuleRequiredStatusChecksTypeX789a4b9d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineRepositoryRuleRequiredStatusChecksTypeX789a4b9d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRepositoryRuleRequiredStatusChecksTypeX789a4b9d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryRuleRequiredStatusChecksTypeX789a4b9d) {
      encoder.encodeString(value.value)
    }
  }
}
