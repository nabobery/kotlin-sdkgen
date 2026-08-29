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
 * sdkgen://source/openapi.yaml#/components/schemas/repository-rule-file-path-restriction/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-rule-file-path-restriction/properties/type
 */
@Serializable(with = InlineRepositoryRuleFilePathRestrictionTypeX1e0bac95.Serializer::class)
public sealed class InlineRepositoryRuleFilePathRestrictionTypeX1e0bac95 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `file_path_restriction`.
   */
  public data object FilePathRestriction : InlineRepositoryRuleFilePathRestrictionTypeX1e0bac95() {
    public override val `value`: String = "file_path_restriction"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineRepositoryRuleFilePathRestrictionTypeX1e0bac95()

  public companion object {
    public fun fromValue(`value`: String): InlineRepositoryRuleFilePathRestrictionTypeX1e0bac95 = when (value) {
      FilePathRestriction.value -> FilePathRestriction
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineRepositoryRuleFilePathRestrictionTypeX1e0bac95> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineRepositoryRuleFilePathRestrictionTypeX1e0bac95", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRepositoryRuleFilePathRestrictionTypeX1e0bac95 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryRuleFilePathRestrictionTypeX1e0bac95) {
      encoder.encodeString(value.value)
    }
  }
}
