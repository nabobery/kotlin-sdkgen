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
 * sdkgen://source/openapi.yaml#/components/schemas/repository-rule-deletion/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-rule-deletion/properties/type
 */
@Serializable(with = InlineRepositoryRuleDeletionTypeXff5dcc76.Serializer::class)
public sealed class InlineRepositoryRuleDeletionTypeXff5dcc76 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `deletion`.
   */
  public data object Deletion : InlineRepositoryRuleDeletionTypeXff5dcc76() {
    public override val `value`: String = "deletion"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineRepositoryRuleDeletionTypeXff5dcc76()

  public companion object {
    public fun fromValue(`value`: String): InlineRepositoryRuleDeletionTypeXff5dcc76 = when (value) {
      Deletion.value -> Deletion
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineRepositoryRuleDeletionTypeXff5dcc76> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineRepositoryRuleDeletionTypeXff5dcc76", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRepositoryRuleDeletionTypeXff5dcc76 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryRuleDeletionTypeXff5dcc76) {
      encoder.encodeString(value.value)
    }
  }
}
