package io.github.nabobery.sdkgen.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Optional credit limit reset interval. When set, the credit limit resets on this interval.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1auth~1keys~1code/post/requestBody/content/application~1json/schema/properties/u
 * sage_limit_type
 */
@Serializable(with = InlineAuthKeysCodePostRequestJsonUsageLimitTypeXa052340d.Serializer::class)
public sealed class InlineAuthKeysCodePostRequestJsonUsageLimitTypeXa052340d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `daily`.
   */
  public data object Daily : InlineAuthKeysCodePostRequestJsonUsageLimitTypeXa052340d() {
    public override val `value`: String = "daily"
  }

  /**
   * Documented value. Wire value: `weekly`.
   */
  public data object Weekly : InlineAuthKeysCodePostRequestJsonUsageLimitTypeXa052340d() {
    public override val `value`: String = "weekly"
  }

  /**
   * Documented value. Wire value: `monthly`.
   */
  public data object Monthly : InlineAuthKeysCodePostRequestJsonUsageLimitTypeXa052340d() {
    public override val `value`: String = "monthly"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAuthKeysCodePostRequestJsonUsageLimitTypeXa052340d()

  public companion object {
    public fun fromValue(`value`: String): InlineAuthKeysCodePostRequestJsonUsageLimitTypeXa052340d = when (value) {
      Daily.value -> Daily
      Weekly.value -> Weekly
      Monthly.value -> Monthly
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAuthKeysCodePostRequestJsonUsageLimitTypeXa052340d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineAuthKeysCodePostRequestJsonUsageLimitTypeXa052340d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAuthKeysCodePostRequestJsonUsageLimitTypeXa052340d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAuthKeysCodePostRequestJsonUsageLimitTypeXa052340d) {
      encoder.encodeString(value.value)
    }
  }
}
