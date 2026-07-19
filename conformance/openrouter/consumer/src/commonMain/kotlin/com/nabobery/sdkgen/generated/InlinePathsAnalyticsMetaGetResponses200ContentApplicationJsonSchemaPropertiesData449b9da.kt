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
 * Whether the operator expects a single value or an array
 */
@Serializable(with = InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesData449b9da
  .Serializer::class)
public sealed class InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesData449b9da {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `scalar`.
   */
  public data object Scalar : InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesData449b9da() {
    public override val `value`: String = "scalar"
  }

  /**
   * Documented value. Wire value: `array`.
   */
  public data object Array : InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesData449b9da() {
    public override val `value`: String = "array"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesData449b9da()

  public companion object {
    public fun fromValue(`value`: String): InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesData449b9da = when (value) {
      Scalar.value -> Scalar
      Array.value -> Array
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesData449b9da> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesData449b9da", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesData449b9da = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesData449b9da) {
      encoder.encodeString(value.value)
    }
  }
}
