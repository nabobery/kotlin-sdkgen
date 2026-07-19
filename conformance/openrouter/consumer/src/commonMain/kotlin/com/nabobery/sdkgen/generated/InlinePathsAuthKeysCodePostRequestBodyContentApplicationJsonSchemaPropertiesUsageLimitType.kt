package com.nabobery.sdkgen.generated

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
 */
@Serializable(with = InlinePathsAuthKeysCodePostRequestBodyContentApplicationJsonSchemaPropertiesUsageLimitType
  .Serializer::class)
public sealed class InlinePathsAuthKeysCodePostRequestBodyContentApplicationJsonSchemaPropertiesUsageLimitType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `daily`.
   */
  public data object Daily : InlinePathsAuthKeysCodePostRequestBodyContentApplicationJsonSchemaPropertiesUsageLimitType() {
    public override val `value`: String = "daily"
  }

  /**
   * Documented value. Wire value: `weekly`.
   */
  public data object Weekly : InlinePathsAuthKeysCodePostRequestBodyContentApplicationJsonSchemaPropertiesUsageLimitType() {
    public override val `value`: String = "weekly"
  }

  /**
   * Documented value. Wire value: `monthly`.
   */
  public data object Monthly : InlinePathsAuthKeysCodePostRequestBodyContentApplicationJsonSchemaPropertiesUsageLimitType() {
    public override val `value`: String = "monthly"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePathsAuthKeysCodePostRequestBodyContentApplicationJsonSchemaPropertiesUsageLimitType()

  public companion object {
    public fun fromValue(`value`: String): InlinePathsAuthKeysCodePostRequestBodyContentApplicationJsonSchemaPropertiesUsageLimitType = when (value) {
      Daily.value -> Daily
      Weekly.value -> Weekly
      Monthly.value -> Monthly
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePathsAuthKeysCodePostRequestBodyContentApplicationJsonSchemaPropertiesUsageLimitType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlinePathsAuthKeysCodePostRequestBodyContentApplicationJsonSchemaPropertiesUsageLimitType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePathsAuthKeysCodePostRequestBodyContentApplicationJsonSchemaPropertiesUsageLimitType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlinePathsAuthKeysCodePostRequestBodyContentApplicationJsonSchemaPropertiesUsageLimitType) {
      encoder.encodeString(value.value)
    }
  }
}
