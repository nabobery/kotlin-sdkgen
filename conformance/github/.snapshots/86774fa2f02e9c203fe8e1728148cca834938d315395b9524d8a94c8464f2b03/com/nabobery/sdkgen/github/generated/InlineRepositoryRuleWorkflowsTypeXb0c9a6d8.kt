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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/repository-rule-workflows/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-rule-workflows/properties/type
 */
@Serializable(with = InlineRepositoryRuleWorkflowsTypeXb0c9a6d8.Serializer::class)
public sealed class InlineRepositoryRuleWorkflowsTypeXb0c9a6d8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `workflows`.
   */
  public data object Workflows : InlineRepositoryRuleWorkflowsTypeXb0c9a6d8() {
    public override val `value`: String = "workflows"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineRepositoryRuleWorkflowsTypeXb0c9a6d8()

  public companion object {
    public fun fromValue(`value`: String): InlineRepositoryRuleWorkflowsTypeXb0c9a6d8 = when (value) {
      Workflows.value -> Workflows
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineRepositoryRuleWorkflowsTypeXb0c9a6d8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineRepositoryRuleWorkflowsTypeXb0c9a6d8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRepositoryRuleWorkflowsTypeXb0c9a6d8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryRuleWorkflowsTypeXb0c9a6d8) {
      encoder.encodeString(value.value)
    }
  }
}
