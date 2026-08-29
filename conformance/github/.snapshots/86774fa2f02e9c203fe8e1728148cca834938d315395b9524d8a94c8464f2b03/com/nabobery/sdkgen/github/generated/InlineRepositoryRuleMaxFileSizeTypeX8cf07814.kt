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
 * sdkgen://source/openapi.yaml#/components/schemas/repository-rule-max-file-size/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-rule-max-file-size/properties/type
 */
@Serializable(with = InlineRepositoryRuleMaxFileSizeTypeX8cf07814.Serializer::class)
public sealed class InlineRepositoryRuleMaxFileSizeTypeX8cf07814 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `max_file_size`.
   */
  public data object MaxFileSize : InlineRepositoryRuleMaxFileSizeTypeX8cf07814() {
    public override val `value`: String = "max_file_size"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineRepositoryRuleMaxFileSizeTypeX8cf07814()

  public companion object {
    public fun fromValue(`value`: String): InlineRepositoryRuleMaxFileSizeTypeX8cf07814 = when (value) {
      MaxFileSize.value -> MaxFileSize
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineRepositoryRuleMaxFileSizeTypeX8cf07814> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineRepositoryRuleMaxFileSizeTypeX8cf07814", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRepositoryRuleMaxFileSizeTypeX8cf07814 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryRuleMaxFileSizeTypeX8cf07814) {
      encoder.encodeString(value.value)
    }
  }
}
