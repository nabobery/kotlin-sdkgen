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
 * String representing the object's type. Objects of the same type share the same value. Always has the value `list`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1country_specs/get/responses/200/content/application~1json/schema/properties
 * /object
 */
@Serializable(with = InlineV1CountrySpecsGetResponse200JsonObjectValueX9449f852.Serializer::class)
public sealed class InlineV1CountrySpecsGetResponse200JsonObjectValueX9449f852 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `list`.
   */
  public data object List : InlineV1CountrySpecsGetResponse200JsonObjectValueX9449f852() {
    public override val `value`: String = "list"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CountrySpecsGetResponse200JsonObjectValueX9449f852()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CountrySpecsGetResponse200JsonObjectValueX9449f852 = when (value) {
      List.value -> List
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1CountrySpecsGetResponse200JsonObjectValueX9449f852> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1CountrySpecsGetResponse200JsonObjectValueX9449f852", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CountrySpecsGetResponse200JsonObjectValueX9449f852 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CountrySpecsGetResponse200JsonObjectValueX9449f852) {
      encoder.encodeString(value.value)
    }
  }
}
