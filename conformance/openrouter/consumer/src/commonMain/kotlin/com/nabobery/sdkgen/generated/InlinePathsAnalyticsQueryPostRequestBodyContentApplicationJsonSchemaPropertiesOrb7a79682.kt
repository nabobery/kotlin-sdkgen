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
 * sdkgen://source/openapi.yaml#/paths/~1analytics~1query/post/requestBody/content/application~1json/schema/properties/o
 * rder_by/properties/direction.
 */
@Serializable(with = InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesOrb7a79682
  .Serializer::class)
public sealed class InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesOrb7a79682 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `asc`.
   */
  public data object Asc : InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesOrb7a79682() {
    public override val `value`: String = "asc"
  }

  /**
   * Documented value. Wire value: `desc`.
   */
  public data object Desc : InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesOrb7a79682() {
    public override val `value`: String = "desc"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesOrb7a79682()

  public companion object {
    public fun fromValue(`value`: String): InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesOrb7a79682 = when (value) {
      Asc.value -> Asc
      Desc.value -> Desc
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesOrb7a79682> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesOrb7a79682", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesOrb7a79682 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesOrb7a79682) {
      encoder.encodeString(value.value)
    }
  }
}
