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
 * sdkgen://source/openapi.yaml#/components/schemas/repository-rule-file-extension-restriction/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-rule-file-extension-restriction/properties/type
 */
@Serializable(with = InlineRepositoryRuleFileExtensionRestrictionTypeXffa75a22.Serializer::class)
public sealed class InlineRepositoryRuleFileExtensionRestrictionTypeXffa75a22 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `file_extension_restriction`.
   */
  public data object FileExtensionRestriction : InlineRepositoryRuleFileExtensionRestrictionTypeXffa75a22() {
    public override val `value`: String = "file_extension_restriction"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineRepositoryRuleFileExtensionRestrictionTypeXffa75a22()

  public companion object {
    public fun fromValue(`value`: String): InlineRepositoryRuleFileExtensionRestrictionTypeXffa75a22 = when (value) {
      FileExtensionRestriction.value -> FileExtensionRestriction
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineRepositoryRuleFileExtensionRestrictionTypeXffa75a22> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineRepositoryRuleFileExtensionRestrictionTypeXffa75a22", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRepositoryRuleFileExtensionRestrictionTypeXffa75a22 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryRuleFileExtensionRestrictionTypeXffa75a22) {
      encoder.encodeString(value.value)
    }
  }
}
