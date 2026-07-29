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
 * sdkgen://source/openapi.yaml#/components/schemas/repository-rule-max-file-path-length/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-rule-max-file-path-length/properties/type
 */
@Serializable(with = InlineRepositoryRuleMaxFilePathLengthTypeXdba116e9.Serializer::class)
public sealed class InlineRepositoryRuleMaxFilePathLengthTypeXdba116e9 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `max_file_path_length`.
   */
  public data object MaxFilePathLength : InlineRepositoryRuleMaxFilePathLengthTypeXdba116e9() {
    public override val `value`: String = "max_file_path_length"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineRepositoryRuleMaxFilePathLengthTypeXdba116e9()

  public companion object {
    public fun fromValue(`value`: String): InlineRepositoryRuleMaxFilePathLengthTypeXdba116e9 = when (value) {
      MaxFilePathLength.value -> MaxFilePathLength
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineRepositoryRuleMaxFilePathLengthTypeXdba116e9> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineRepositoryRuleMaxFilePathLengthTypeXdba116e9", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRepositoryRuleMaxFilePathLengthTypeXdba116e9 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryRuleMaxFilePathLengthTypeXdba116e9) {
      encoder.encodeString(value.value)
    }
  }
}
