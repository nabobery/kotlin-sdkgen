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
 * sdkgen://source/openapi.yaml#/components/schemas/repository-rule-code-scanning/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-rule-code-scanning/properties/type
 */
@Serializable(with = InlineRepositoryRuleCodeScanningTypeX47dd9d07.Serializer::class)
public sealed class InlineRepositoryRuleCodeScanningTypeX47dd9d07 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `code_scanning`.
   */
  public data object CodeScanning : InlineRepositoryRuleCodeScanningTypeX47dd9d07() {
    public override val `value`: String = "code_scanning"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineRepositoryRuleCodeScanningTypeX47dd9d07()

  public companion object {
    public fun fromValue(`value`: String): InlineRepositoryRuleCodeScanningTypeX47dd9d07 = when (value) {
      CodeScanning.value -> CodeScanning
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineRepositoryRuleCodeScanningTypeX47dd9d07> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineRepositoryRuleCodeScanningTypeX47dd9d07", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRepositoryRuleCodeScanningTypeX47dd9d07 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryRuleCodeScanningTypeX47dd9d07) {
      encoder.encodeString(value.value)
    }
  }
}
