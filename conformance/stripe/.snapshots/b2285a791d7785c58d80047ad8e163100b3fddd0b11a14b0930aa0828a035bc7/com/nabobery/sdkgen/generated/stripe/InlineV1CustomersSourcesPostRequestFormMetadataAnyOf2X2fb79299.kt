package com.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1sources~1{id}/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/metadata/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1sources~1{id}/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/metadata/anyOf/1
 */
@Serializable(with = InlineV1CustomersSourcesPostRequestFormMetadataAnyOf2X2fb79299.Serializer::class)
public sealed class InlineV1CustomersSourcesPostRequestFormMetadataAnyOf2X2fb79299 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1CustomersSourcesPostRequestFormMetadataAnyOf2X2fb79299() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CustomersSourcesPostRequestFormMetadataAnyOf2X2fb79299()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CustomersSourcesPostRequestFormMetadataAnyOf2X2fb79299 = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1CustomersSourcesPostRequestFormMetadataAnyOf2X2fb79299> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1CustomersSourcesPostRequestFormMetadataAnyOf2X2fb79299", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CustomersSourcesPostRequestFormMetadataAnyOf2X2fb79299 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSourcesPostRequestFormMetadataAnyOf2X2fb79299) {
      encoder.encodeString(value.value)
    }
  }
}
