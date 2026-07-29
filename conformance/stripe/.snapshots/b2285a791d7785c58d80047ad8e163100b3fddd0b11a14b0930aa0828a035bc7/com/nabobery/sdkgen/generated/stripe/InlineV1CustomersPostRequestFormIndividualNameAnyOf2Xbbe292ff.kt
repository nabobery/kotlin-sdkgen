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
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}/post/requestBody/content/application~1x-www-form-urle
 * ncoded/schema/properties/individual_name/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}/post/requestBody/content/application~1x-www-form-urle
 * ncoded/schema/properties/individual_name/anyOf/1
 */
@Serializable(with = InlineV1CustomersPostRequestFormIndividualNameAnyOf2Xbbe292ff.Serializer::class)
public sealed class InlineV1CustomersPostRequestFormIndividualNameAnyOf2Xbbe292ff {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1CustomersPostRequestFormIndividualNameAnyOf2Xbbe292ff() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CustomersPostRequestFormIndividualNameAnyOf2Xbbe292ff()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CustomersPostRequestFormIndividualNameAnyOf2Xbbe292ff = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1CustomersPostRequestFormIndividualNameAnyOf2Xbbe292ff> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1CustomersPostRequestFormIndividualNameAnyOf2Xbbe292ff", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CustomersPostRequestFormIndividualNameAnyOf2Xbbe292ff = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersPostRequestFormIndividualNameAnyOf2Xbbe292ff) {
      encoder.encodeString(value.value)
    }
  }
}
