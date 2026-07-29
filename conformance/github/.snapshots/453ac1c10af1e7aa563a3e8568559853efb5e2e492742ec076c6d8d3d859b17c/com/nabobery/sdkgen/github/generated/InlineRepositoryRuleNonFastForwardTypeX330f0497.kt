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
 * sdkgen://source/openapi.yaml#/components/schemas/repository-rule-non-fast-forward/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-rule-non-fast-forward/properties/type
 */
@Serializable(with = InlineRepositoryRuleNonFastForwardTypeX330f0497.Serializer::class)
public sealed class InlineRepositoryRuleNonFastForwardTypeX330f0497 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `non_fast_forward`.
   */
  public data object NonFastForward : InlineRepositoryRuleNonFastForwardTypeX330f0497() {
    public override val `value`: String = "non_fast_forward"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineRepositoryRuleNonFastForwardTypeX330f0497()

  public companion object {
    public fun fromValue(`value`: String): InlineRepositoryRuleNonFastForwardTypeX330f0497 = when (value) {
      NonFastForward.value -> NonFastForward
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineRepositoryRuleNonFastForwardTypeX330f0497> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineRepositoryRuleNonFastForwardTypeX330f0497", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRepositoryRuleNonFastForwardTypeX330f0497 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryRuleNonFastForwardTypeX330f0497) {
      encoder.encodeString(value.value)
    }
  }
}
