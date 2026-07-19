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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/FileSearchServerTool/properties/filters/anyOf/0/properties/type.
 */
@Serializable(with = InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0PropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0PropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `eq`.
   */
  public data object Eq : InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0PropertiesType() {
    public override val `value`: String = "eq"
  }

  /**
   * Documented value. Wire value: `ne`.
   */
  public data object Ne : InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0PropertiesType() {
    public override val `value`: String = "ne"
  }

  /**
   * Documented value. Wire value: `gt`.
   */
  public data object Gt : InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0PropertiesType() {
    public override val `value`: String = "gt"
  }

  /**
   * Documented value. Wire value: `gte`.
   */
  public data object Gte : InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0PropertiesType() {
    public override val `value`: String = "gte"
  }

  /**
   * Documented value. Wire value: `lt`.
   */
  public data object Lt : InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0PropertiesType() {
    public override val `value`: String = "lt"
  }

  /**
   * Documented value. Wire value: `lte`.
   */
  public data object Lte : InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0PropertiesType() {
    public override val `value`: String = "lte"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0PropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0PropertiesType = when (value) {
      Eq.value -> Eq
      Ne.value -> Ne
      Gt.value -> Gt
      Gte.value -> Gte
      Lt.value -> Lt
      Lte.value -> Lte
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0PropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0PropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0PropertiesType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0PropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
