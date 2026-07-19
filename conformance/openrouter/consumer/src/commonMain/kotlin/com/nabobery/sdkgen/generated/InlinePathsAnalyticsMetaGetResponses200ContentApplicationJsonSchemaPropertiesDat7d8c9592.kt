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
 * Operator identifier used in filter definitions
 */
@Serializable(with = InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDat7d8c9592
  .Serializer::class)
public sealed class InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDat7d8c9592 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `eq`.
   */
  public data object Eq : InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDat7d8c9592() {
    public override val `value`: String = "eq"
  }

  /**
   * Documented value. Wire value: `neq`.
   */
  public data object Neq : InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDat7d8c9592() {
    public override val `value`: String = "neq"
  }

  /**
   * Documented value. Wire value: `in`.
   */
  public data object InValue : InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDat7d8c9592() {
    public override val `value`: String = "in"
  }

  /**
   * Documented value. Wire value: `not_in`.
   */
  public data object NotIn : InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDat7d8c9592() {
    public override val `value`: String = "not_in"
  }

  /**
   * Documented value. Wire value: `gt`.
   */
  public data object Gt : InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDat7d8c9592() {
    public override val `value`: String = "gt"
  }

  /**
   * Documented value. Wire value: `gte`.
   */
  public data object Gte : InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDat7d8c9592() {
    public override val `value`: String = "gte"
  }

  /**
   * Documented value. Wire value: `lt`.
   */
  public data object Lt : InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDat7d8c9592() {
    public override val `value`: String = "lt"
  }

  /**
   * Documented value. Wire value: `lte`.
   */
  public data object Lte : InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDat7d8c9592() {
    public override val `value`: String = "lte"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDat7d8c9592()

  public companion object {
    public fun fromValue(`value`: String): InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDat7d8c9592 = when (value) {
      Eq.value -> Eq
      Neq.value -> Neq
      InValue.value -> InValue
      NotIn.value -> NotIn
      Gt.value -> Gt
      Gte.value -> Gte
      Lt.value -> Lt
      Lte.value -> Lte
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDat7d8c9592> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDat7d8c9592", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDat7d8c9592 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDat7d8c9592) {
      encoder.encodeString(value.value)
    }
  }
}
